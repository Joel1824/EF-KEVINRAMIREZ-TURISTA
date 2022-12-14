package com.idat.kevinramirez.Turista.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.kevinramirez.Turista.dto.TuristaDTO;
import com.idat.kevinramirez.Turista.model.Turista;
import com.idat.kevinramirez.Turista.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {
	
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
				
		for (Turista turista : repository.findAll()) {
			dto = new TuristaDTO();
			dto.setNomtu(turista.getNombreTurista());
			dto.setNrotu(turista.getNroCelular());
			dto.setDirtu(turista.getDireccion());
			listadto.add(dto);
		}
		
		return listadto;
	}

	@Override
	public TuristaDTO obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(TuristaDTO turista) {
		// TODO Auto-generated method stub

	}

}
