package com.project.state.arm;

public enum Pulse {
	
	ROTATION_90_NEGATIVE("Rotação para -90º"), ROTATION_45_NEGATIVE("Rotação para -45º"), 
	IN_REST("Em Repouso"),ROTATION_45_POSITIVE("Rotação para 45º"), 
	ROTATION_90_POSITIVE("Rotação para 90º"),ROTATION_135("Rotação para 135º"), 
	ROTATION_180 ("Rotação para 180º");
	
	private String state_final;
	
	Pulse(String lState){
		state_final = lState;
	}
	
	public String getState() {
		return state_final;
	}
}
