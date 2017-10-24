package com.qualitas.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.Poliza;

public class PolizaService {

	
	public List<Poliza> damePolizas(){
		List<Poliza> lista = new ArrayList<>();// Creo instancia de la lista
		for (int i=0;i<10;i++){
			int valor=(int)(Math.random()*1000000);

			Poliza instancia = new Poliza(valor,
											LocalDate.now(),
											LocalDate.now());
			lista.add(instancia);//Agrego instancia a la lista
			
		}
		return lista;// regresa la lista llena
	}
	
	
}
