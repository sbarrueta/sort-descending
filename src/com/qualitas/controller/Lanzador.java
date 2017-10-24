package com.qualitas.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.stream.Stream;

import com.qualitas.dao.Cliente;
import com.qualitas.dao.Persona;
import com.qualitas.dao.Poliza;
import com.qualitas.service.ClienteService;
import com.qualitas.service.PolizaService;
public class Lanzador{
	
	List<Persona> lista = new ArrayList<>();

	ClienteService clienteService;
	PolizaService polizaService;
	
	public Lanzador(){
		
		
		polizaService = new PolizaService();// creo dependencia
		clienteService = new ClienteService(polizaService);
		// Cuantos son?
		System.out.println(clienteService.dameNombres().length);// son 10
		//List<String> lista = Arrays.asList(clienteService.dameNombresOrdenados());// Paso a lista

		String[] arregloOrdenado = clienteService.dameNombresOrdenados();
		int elementos = arregloOrdenado.length;
		for (int i = elementos -1;i>=0;i--) {
			//System.out.println(arregloOrdenado[i]);
		}
		
		
		// Lista de nombres ordenada con Stream
		//Stream<String> nombres = Stream.of(clienteService.dameNombres());
		//System.out.println("Nombres desde el Stream");
		//nombres
		//	.sorted()
		//	.forEach(System.out::println);
				
		
		 
		//System.out.println(lista);//imprime
		
		
		//Stream<Cliente> stream = clienteService.dameClientes().stream();
		//stream
		//	.skip(3)
		//	.limit(4)
		//	.forEach(System.out::println);
		
		//for (String item : clienteService
			//	.dameNombresConSufijo("a")) {
		//	if (item != null) {
		//		System.out.println(item);
		//	}else {
		//		break;
		//	}
		//}
		clienteService.imprimeNombresConPrefijo("I");
		
	
		
	}
	
	public static void main(String... args){
		new Lanzador();
	}
}
