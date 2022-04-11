package com.samsung.thermometer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samsung.thermometer.dto.TemperatureMonitoryDTO;
import com.samsung.thermometer.entity.TemperatureEntity;
import com.samsung.thermometer.enums.ThermometerType;
import com.samsung.thermometer.repository.TemperatureRepository;
import com.samsung.thermometer.service.ThermometerService;

@RestController
public class ThermometerController {
	
	@Autowired
	private ThermometerService service;
	
	TemperatureRepository temperatureRepository;

	ThermometerController(TemperatureRepository temperatureRepository){
	    this.temperatureRepository = temperatureRepository;
	  }
	
	@GetMapping("/getTemperatureType/{idType}")
	public Double getTemperature(@PathVariable int idType) {
		return service.getTemperature(idType==1?ThermometerType.CELSIUS:ThermometerType.FAHRENHEIT);
	}
	
	@PostMapping("/postTemperatureMonitory")
	public Long postTemperatureMonitory(@RequestBody TemperatureMonitoryDTO dto) {
		return service.postTemperatureMonitory(dto);
	}
	
	@GetMapping("/getTemperature/{id}")
	public Double getTemperatureMonitory(@PathVariable Long id) {
		return service.getTemperatureMonitory(id);
	}
	

	@GetMapping("/getTemperatureAll")
	public List<TemperatureEntity> getTemperatureAll() {
		return temperatureRepository.findAll();
	}
}
