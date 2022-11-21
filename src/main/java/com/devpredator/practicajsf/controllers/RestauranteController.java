package com.devpredator.practicajsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.practicajsf.entity.Restaurante;
import com.devpredator.practicajsf.services.RestauranteService;

@ManagedBean
//@ViewScoped
public class RestauranteController {
	
	/**
	 * Lista de Restaurante para la tabla
	 */
	private List<Restaurante> listResutantes;
	
	/**
	 * Servicio con los metodos que realizan la logica del negocio de Restaurante
	 */
	private RestauranteService restauranteService = new RestauranteService();

	@PostConstruct
	public void init() {
		this.consultarRestaurantes();
	}
	/**
	 * @return the listResutantes
	 */
	public List<Restaurante> getListResutantes() {
		return listResutantes;
	}

	/**
	 * @param listResutantes the listResutantes to set
	 */
	public void setListResutantes(List<Restaurante> listResutantes) {
		this.listResutantes = listResutantes;
	}
	
	public void consultarRestaurantes() {
		this.listResutantes = this.restauranteService.consultarRestaurantes();
	}
}
