package com.qualitas.service;

import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.Marca;

public class MarcaService {

	
	public List<Marca> dameMarcas(){
		
		Marca marca = new Marca("Ford","Fd");
		
		List<Marca> lista = new ArrayList<>(); 
		
		lista.add(marca);
		
		return lista;
		
	}
	
}
