package com.ludovigh.sig.services;

import java.util.List;

import com.ludovigh.sig.model.Orden;



public interface OrdenService {

	List<Orden> getAllOrdens();

	Orden getOrdenByID(int id);

	void insertarOrden(Orden orden);

	void updateOrden(Orden orden, int id);

	void deleteOrden(int id);

}
