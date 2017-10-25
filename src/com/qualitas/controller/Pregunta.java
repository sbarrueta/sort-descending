package com.qualitas.controller;

import com.qualitas.dao.Marca;

public class Pregunta {
	public static void main(String[] args) {
		String uno ="Ana";
		String dos = "Chana";
		System.out.println(uno.equals(dos));// false
		System.out.println(uno == dos);// false
		String tres ="Ana";
		System.out.println(uno == tres);// true
		System.out.println(uno.equals(tres));// true
		
		Marca marca1 = new Marca("FORD","FD");
		
		Marca marca2 = new Marca("FORD","FD");
		
		System.out.println(marca1 == marca2);
		System.out.println(marca1.equals(marca2));
		
	}
}
