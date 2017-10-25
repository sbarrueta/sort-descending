package com.qualitas.controller;

import com.qualitas.dao.Marca;
import com.qualitas.service.MarcaService;

public class LanzadorMarca {

	public static void main(String[] args) {
		MarcaService marcaService = new MarcaService();

		Marca marca = new Marca("FORD","FD");
		
		System.out.println(marcaService.existeMarcaVersionLista(marca));
		
		marca = marcaService.dameMarcas().get(2);
		
		System.out.println(marcaService.existeMarcaVersionLista(marca));
		
		
		
		
		

	}

}
