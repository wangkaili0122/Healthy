package com.example.bean;

import java.util.Date;

public class Data {
	private int id;
	private int pressure;
	private double angle;
	private double temperature;
	private int pulse;
	private int patient_id;
	private Date create_time;
	private int has_read;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public int getPulse() {
		return pulse;
	}
	public void setPulse(int pulse) {
		this.pulse = pulse;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getHas_read() {
		return has_read;
	}
	public void setHas_read(int has_read) {
		this.has_read = has_read;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
}
