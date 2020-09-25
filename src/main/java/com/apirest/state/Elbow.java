package com.apirest.state;

public enum Elbow {
	IN_REST("Em Repouso"), SLIGHTLY_CONTRACTED("Levemente Contraído"), 
	CONTRACTED("Contraído"), STRONGLY_CONTRACTED("Fortemente Contraído");
	
	private String state_final;
	
	Elbow(String lState){
		state_final = lState;
	}
	
	public String getState() {
		return state_final;
	}

}
