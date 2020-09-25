package com.apirest.model;

public class Arm {
	private String elbow;
	private String pulse;
	
	public Arm() {
		super();
	}

	public Arm(String elbow, String pulse) {
		super();
		this.elbow = elbow;
		this.pulse = pulse;
	}

	public String getElbow() {
		return elbow;
	}

	public String getPulse() {
		return pulse;
	}
	
	
}