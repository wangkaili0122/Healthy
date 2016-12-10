package com.example.bean;

public class Bingliinfo {
	private int infoid;
	private float angle;
	private float heartrate;
	private float bloodpressure;
	public Bingliinfo(int infoid, float angle, float heartrate, float bloodpressure) {
		super();
		this.infoid = infoid;
		this.angle = angle;
		this.heartrate = heartrate;
		this.bloodpressure = bloodpressure;
	}
	public Bingliinfo() {
		super();
	}
	public int getInfoid() {
		return infoid;
	}
	public void setInfoid(int infoid) {
		this.infoid = infoid;
	}
	public float getAngle() {
		return angle;
	}
	public void setAngle(float angle) {
		this.angle = angle;
	}
	public float getHeartrate() {
		return heartrate;
	}
	public void setHeartrate(float heartrate) {
		this.heartrate = heartrate;
	}
	public float getBloodpressure() {
		return bloodpressure;
	}
	public void setBloodpressure(float bloodpressure) {
		this.bloodpressure = bloodpressure;
	}
	
	
	
}
