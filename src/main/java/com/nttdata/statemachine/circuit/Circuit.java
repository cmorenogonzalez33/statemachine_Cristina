package com.nttdata.statemachine.circuit;

enum state{
	OPEN, HALF, CLOSE;
}

public class Circuit {
	private int intentosFallidos;
	private state st = state.CLOSE;
	private int intentosOK;
	private double limiteError;
	private int intentoMax; 
	private int intentoActual;
	
	public Circuit(int intentosFallidos, int intentosOK, double limiteError, int intentoMax, int intentoActual) {
		this.intentoActual = intentoActual;
		this.intentoMax = intentoMax;
		this.intentosFallidos = intentosFallidos;
		this.intentosOK = intentosOK;
		this.limiteError = limiteError;
		
		if (intentosFallidos > (intentosOK + intentosFallidos)*limiteError) {			
			if(intentoActual >= intentoMax) {
				st = state.OPEN;
			}
			
			st = state.HALF;
		}
		
	}
	
	public String getEstado() {
		return st.toString();
	}
}
