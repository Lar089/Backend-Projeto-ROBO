package com.project.model;

public class Head {
	private String rotation = getRotation();
	private String slope = getSlope();
	
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
