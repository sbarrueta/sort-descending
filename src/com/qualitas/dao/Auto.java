package com.qualitas.dao;

public class Auto {
	
	private String color;
	private int modelo;
	private String serie;
	
	private Marca marca;
	
	public Marca getMarca() {
		return marca;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public Auto(Marca marca) {
		super();
		this.marca = marca;
	}
}
