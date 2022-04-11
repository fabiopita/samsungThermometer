package com.samsung.thermometer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TemperatureEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn( name = "idTemperatureMonitory")
	@ManyToOne
	private TemperatureMonitoryEntity entity;
	
	private Double temperature;
	
	
	public TemperatureEntity() {
	}

	public TemperatureEntity(TemperatureMonitoryEntity entity, Double temperature) {
		this.entity = entity;
		this.temperature = temperature;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TemperatureMonitoryEntity getEntity() {
		return entity;
	}

	public void setEntity(TemperatureMonitoryEntity entity) {
		this.entity = entity;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	
}
