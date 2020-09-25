package com.apirest.model;

public class Head {
	private String rotation;
	private String slope;
	
	public Head() {
		super();
	}

	public Head(String rotation, String slope) {
		super();
		this.rotation = rotation;
		this.slope = slope;
	}

	public String getRotation() {
		return rotation;
	}

	public String getSlope() {
		return slope;
	}

}
