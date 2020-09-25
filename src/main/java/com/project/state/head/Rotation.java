package com.project.state.head;

public enum Rotation {
	
	ROTATION_90_NEGATIVE(0,"Rotação para -90º"), ROTATION_45_NEGATIVE(1,"Rotação para -45º"), 
	IN_REST(2,"Em Repouso"),ROTATION_45_POSITIVE(3,"Rotação para 45º"), 
	ROTATION_90_POSITIVE(4,"Rotação para 90º"),ROTATION_135(5,"Rotação para 135º"), 
	ROTATION_180 (6,"Rotação para 180º");
	
	private int id_final;
	private String state_final;
	
	Rotation(int lId, String lState){
		state_final = lState;
		id_final = lId;
	}
	
	public int getID() {
		return id_final;
	}

}
