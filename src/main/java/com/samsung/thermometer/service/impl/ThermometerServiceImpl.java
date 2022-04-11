package com.samsung.thermometer.service.impl;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.samsung.thermometer.dto.TemperatureMonitoryDTO;
import com.samsung.thermometer.entity.TemperatureEntity;
import com.samsung.thermometer.entity.TemperatureMonitoryEntity;
import com.samsung.thermometer.enums.ThermometerType;
import com.samsung.thermometer.model.Thermometer;
import com.samsung.thermometer.model.ThermometerFactory;
import com.samsung.thermometer.repository.TemperatureMonitoryRepository;
import com.samsung.thermometer.repository.TemperatureRepository;
import com.samsung.thermometer.service.ThermometerService;

@Service
public class ThermometerServiceImpl implements ThermometerService, Runnable {

	private TemperatureMonitoryRepository tmRepository;
	private TemperatureRepository tRepository;
	private Thermometer thermometer;
	private Queue<Long> queue = new LinkedList<Long>();
	private Thread thread;

	ThermometerServiceImpl(TemperatureMonitoryRepository tmRepository, TemperatureRepository tRepository) {
		this.tmRepository = tmRepository;
		this.tRepository = tRepository;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public Double getTemperature(ThermometerType type) {
		thermometer = ThermometerFactory.getThermometer(type);
		return thermometer.getTemperature();
	}

	@Override
	public Long postTemperatureMonitory(TemperatureMonitoryDTO dto) {
		TemperatureMonitoryEntity entity = new TemperatureMonitoryEntity();
		BeanUtils.copyProperties(dto, entity);
		entity = tmRepository.save(entity);
		queue.add(entity.getIdTemperatureMonitory());		
		return entity.getIdTemperatureMonitory();
	}

	@Override
	public Double monitorTemperature(Long idTemperatureMonitory) {
		Optional<TemperatureMonitoryEntity> OptionalEntity = tmRepository.findById(idTemperatureMonitory);
		if (OptionalEntity.isPresent()) {
			thermometer = ThermometerFactory.getThermometer(OptionalEntity.get().getType());
			Double temperature = thermometer.getTemperature();
			double maxTemp = OptionalEntity.get().getTemperatureMonitory() + OptionalEntity.get().getTemperatureMonitoryRangeTo();
			double minTemp = OptionalEntity.get().getTemperatureMonitory() - OptionalEntity.get().getTemperatureMonitoryRangeFrom();
			
			if (temperature >= minTemp && temperature <= maxTemp) {
				return temperature;
			}
		}

		return null;
	}

	@Override
	public void run() {
		while (true) {
			if (queue.size()>0) {
				long idTemperatureMonitory = queue.poll();
				Double temperature = monitorTemperature(idTemperatureMonitory);
				if (temperature == null) {
					queue.add(idTemperatureMonitory);
				} else {
					Optional<TemperatureMonitoryEntity> entity = tmRepository.findById(idTemperatureMonitory);
					if (entity.isPresent()) {
						tRepository.save(new TemperatureEntity(entity.get(), temperature));
					}
				}
			}
		}
	}

	@Override
	public Double getTemperatureMonitory(Long idTemperatureMonitory) {
		Optional<TemperatureEntity> entity = tRepository.findById(idTemperatureMonitory);
		if (entity.isPresent()) {
			return entity.get().getTemperature();
		} 
		return null;
	}

}
