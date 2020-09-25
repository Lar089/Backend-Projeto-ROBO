package com.project.state.head;

public enum Slope {
	
	UP("Para Cima"), IN_REST("Em Repouso"), 
	DOWN ("Para Baixo");
	
	private String state_final;
	
	Slope(String lState){
		state_final = lState;
	}
	
	public String getState() {
		return state_final;
	}
	

}
