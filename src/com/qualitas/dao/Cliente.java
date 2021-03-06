package com.qualitas.dao;


public class Cliente extends Persona{
	private Poliza poliza;
	
	public Cliente( String nombre,
			String direccion,
			Poliza poliza){
		super(nombre, direccion);
		this.poliza=poliza;
	}
	public Poliza getPoliza(){
		return poliza;
	}
	@Override
	public String toString(){
		return "[nombre="+getNombre()
				+", direccion="+getDireccion()
				+" num="+getPoliza().getNumero()+"]";	
	}

}
