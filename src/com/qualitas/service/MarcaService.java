package com.qualitas.service;

import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.Marca;

public class MarcaService {

	
	public List<Marca> dameMarcas(){
		List<Marca> lista = new ArrayList<>(); 
		
		Marca marca = new Marca("FORD","FD");
		lista.add(marca);
		
		marca = new Marca("NISSAN","NM");
		lista.add(marca);

		marca = new Marca("VOLSKWAGEN","VW");
		lista.add(marca);
		
		return lista;
		
	}
	
	public boolean existeMarca(Marca marca) {
		List<Marca> lista = dameMarcas();
		for (Marca item : lista) {
			if (item.getNombre().equals(marca.getNombre())) {
				return true;
			}
		}
		return false;
	}

	public boolean existeMarcaVersionLista(Marca marca) {
		List<Marca> lista = dameMarcas();
		int posicion = lista.indexOf(marca);
		if (posicion >= 0 ) {
			return true;
		}
		return false;
		
	}	
}
