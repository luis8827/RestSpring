package com.ludovigh.sig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludovigh.sig.imapper.OrdenMapper;
import com.ludovigh.sig.model.Orden;

@Service
public class OrdenServiceImplement implements OrdenService {

	@Autowired
	private OrdenMapper ordenMapper;

	@Override
	public List<Orden> getAllOrdens() {
		return ordenMapper.getAllOrdenes();
	}

	@Override
	public Orden getOrdenByID(int id) {
		return ordenMapper.getOrdenById(id);
	}

	@Override
	public void insertarOrden(Orden orden) {
		ordenMapper.insertarOrden(orden);
	}

	@Override
	public void updateOrden(Orden orden,int id) {
		ordenMapper.updateOrden(orden, id);
	}
	@Override
	public void deleteOrden(int id) {
		ordenMapper.deleteOrden(id);
	}

}
