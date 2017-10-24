package com.qualitas.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.qualitas.dao.Cliente;
import com.qualitas.dao.Poliza;

public class ClienteService {
	private PolizaService polizaService;
	public ClienteService(PolizaService polizaService) {
		this.polizaService=polizaService;
	}
	
	
	public String[] dameNombresConPrefijo(String prefijo) {
		String[]  setDeNombres = dameNombres();// todos los nombres
		String[] temporal = new String[setDeNombres.length];// Creo un arreglo vacio
		int contador=0;
		for (String nombre : setDeNombres) {
			if (nombre.startsWith(prefijo)) { // filtro elementos
				temporal[contador++] = nombre;
			}
		}
		return temporal;
	}
	
	public String[] dameNombresConSufijo(String sufijo) {
		String[]  setDeNombres = dameNombres();// todos los nombres
		String[] temporal = new String[setDeNombres.length];// Creo un arreglo vacio
		int contador=0;
		for (String nombre : setDeNombres) {
			if (nombre.endsWith(sufijo)) { // filtro elementos
				temporal[contador++] = nombre;
			}
		}
		return temporal;
	}
	
	public void imprimeNombresConPrefijo(String prefijo) {
		Arrays.asList(dameNombres())
			.stream()
			.filter( x -> x.startsWith(prefijo))
			.forEach(System.out::println);
	}
	
	
	public String[] dameNombresOrdenados() {
		String[] temporal =dameNombres(); 
		Arrays.sort(temporal);
		return temporal;
	}
	
	public String[] dameNombres() {
		String[] nombres = {"Victor","Edgar","Griselda","Isora","Eduardo",
				"Gonzalo","Hugo","Irma","Erick","Israel"};
		return nombres;
	}
	
	
	public List<Cliente> dameClientes(){// regresa una lista de clientes
		List<Cliente> lista = new ArrayList<>();// Creo la lista vacia
		String[] nombres = dameNombres();
		List<Poliza> listaCreada=polizaService.damePolizas();
		for (int i = 0 ; i<10 ; i++){
			int valor = (int)(Math.random()*100);
			Cliente instancia = new Cliente(
					nombres[i],
				    "Calle "+valor,
				    listaCreada.get(i));
			lista.add(instancia);// Agrego la instancia a la lista
		}
		return lista;// regreso la lista de clientes
	}
}
