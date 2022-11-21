package com.devpredator.practicajsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.practicajsf.entity.Gerente;
import com.devpredator.practicajsf.entity.Restaurante;

/**
 * 
 * @author DMACHACA
 *
 */
public class RestauranteService {

	public List<Restaurante> consultarRestaurantes() {
		List<Restaurante> listRestaurantes = new ArrayList<Restaurante>();
		
		Restaurante restauranteMacDonalds = new Restaurante();
		Restaurante restauranteCeviche = new Restaurante();
		Restaurante restauranteMacarones = new Restaurante();
		Restaurante restauranteHuancane = new Restaurante();
		Restaurante restauranteDelicia = new Restaurante();
		
		Gerente gerenteResMacDonalds = new Gerente();
		Gerente gerenteResCeviche = new Gerente();
		Gerente gerenteResMacarones = new Gerente();
		Gerente gerenteResHuancane = new Gerente();
		Gerente gerenteResDelicia = new Gerente();
		
		gerenteResMacDonalds.setNombre("Charly");
		gerenteResMacDonalds.setPrimerApellido("Ari");
		gerenteResMacDonalds.setSegundoApellido("Perez");
		
		gerenteResCeviche.setNombre("Marcos");
		gerenteResCeviche.setPrimerApellido("Suarez");
		gerenteResCeviche.setSegundoApellido("Quispe");
		
		gerenteResMacarones.setNombre("Juancito");
		gerenteResMacarones.setPrimerApellido("Junior");
		gerenteResMacarones.setSegundoApellido("Sancho");
		
		gerenteResHuancane.setNombre("Densy");
		gerenteResHuancane.setPrimerApellido("Machaca");
		gerenteResHuancane.setSegundoApellido("Chipana");
		
		gerenteResDelicia.setNombre("Gabi");
		gerenteResDelicia.setPrimerApellido("Mamani");
		gerenteResDelicia.setSegundoApellido("Perez");
		
		//
		restauranteMacDonalds.setNombre("MacDonalds");
		restauranteMacDonalds.setDireccion("Direccion 1");
		restauranteMacDonalds.setPais("EEUU");
		restauranteMacDonalds.setGerente(gerenteResMacDonalds);
		
		restauranteCeviche.setNombre("Ceviche");
		restauranteCeviche.setDireccion("Direccion 2");
		restauranteCeviche.setPais("Peru");
		restauranteCeviche.setGerente(gerenteResCeviche);
		
		restauranteMacarones.setNombre("Macarones");
		restauranteMacarones.setDireccion("Direccion 3");
		restauranteMacarones.setPais("Mexico");
		restauranteMacarones.setGerente(gerenteResMacarones);
		
		restauranteHuancane.setNombre("Huancane");
		restauranteHuancane.setDireccion("Direccion 4");
		restauranteHuancane.setPais("Peru");
		restauranteHuancane.setGerente(gerenteResHuancane);
		
		restauranteDelicia.setNombre("Decilia");
		restauranteDelicia.setDireccion("Direccion 5");
		restauranteDelicia.setPais("Peru");
		restauranteDelicia.setGerente(gerenteResDelicia);
		
		listRestaurantes.add(restauranteDelicia);
		listRestaurantes.add(restauranteHuancane);
		listRestaurantes.add(restauranteMacarones);
		listRestaurantes.add(restauranteCeviche);
		listRestaurantes.add(restauranteMacDonalds);
		return listRestaurantes;
	}
}
