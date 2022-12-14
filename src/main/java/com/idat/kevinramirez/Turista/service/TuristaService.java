package com.idat.kevinramirez.Turista.service;

import java.util.List;

import com.idat.kevinramirez.Turista.dto.TuristaDTO;



public interface TuristaService {

	List<TuristaDTO> listar();

	TuristaDTO obtenerId(Integer id);

	void guardar(TuristaDTO turista);

	void eliminar(Integer id);

	void actualizar(TuristaDTO turista);
	
}
