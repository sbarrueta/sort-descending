package com.qualitas.dao;

public class Marca {

	private String nombre;
	private String nombreCorto;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public Marca(String nombre, String nombreCorto) {
		super();
		this.nombre = nombre;
		this.nombreCorto = nombreCorto;
	}
	
	public boolean equals(Object parametro) {
		boolean respuesta = false;
		if (parametro instanceof Marca) {
			Marca instancia = (Marca) parametro;
			if (getNombre().equals(instancia.getNombre()) && getNombreCorto().equals(instancia.getNombreCorto())) {
				respuesta = true;
			}
		}
		return respuesta;
	}
	
	
}
