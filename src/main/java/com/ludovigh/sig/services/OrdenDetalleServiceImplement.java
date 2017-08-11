package com.ludovigh.sig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludovigh.sig.imapper.OrdenDetalleMapper;
import com.ludovigh.sig.model.OrdenDetalle;

@Service
public class OrdenDetalleServiceImplement implements OrdenDetalleService {

	@Autowired
	private OrdenDetalleMapper ordendetalleMapper;

	@Override
	public List<OrdenDetalle> getAllOrdenDetalles() {
		return ordendetalleMapper.getAllOrdenDetalles();
	}

	@Override
	public OrdenDetalle getOrdenDetalleByID(int id) {
		return ordendetalleMapper.getOrdenDetalleById(id);
	}

	@Override
	public void insertarOrdenDetalle(OrdenDetalle ordendetalle) {

		ordendetalleMapper.insertarOrdenDetalle(ordendetalle);

	}

	@Override
	public void updateOrdenDetalle(OrdenDetalle ordendetalle,int id) {
		ordendetalleMapper.updateOrdenDetalle(ordendetalle, id);
	}
	@Override
	public void deleteOrdenDetalle(int id) {
		ordendetalleMapper.deleteOrdenDetalle(id);
	}

}
