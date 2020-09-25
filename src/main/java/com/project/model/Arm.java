package com.project.model;

public class Arm {
	private String elbow = getElbow();
	private String pulse = getPulse();
	
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