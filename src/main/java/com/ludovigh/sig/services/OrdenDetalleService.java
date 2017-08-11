package com.ludovigh.sig.services;

import java.util.List;

import com.ludovigh.sig.model.OrdenDetalle;



public interface OrdenDetalleService {

	List<OrdenDetalle> getAllOrdenDetalles();

	OrdenDetalle getOrdenDetalleByID(int id);

	void insertarOrdenDetalle(OrdenDetalle ordendetalle);

	void updateOrdenDetalle(OrdenDetalle ordendetalle, int id);

	void deleteOrdenDetalle(int id);

}
