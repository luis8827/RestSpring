package com.ludovigh.sig.services;

import java.util.List;

import com.ludovigh.sig.model.Proveedor;



public interface ProveedorService {

	List<Proveedor> getAllProveedors();

	Proveedor getProveedorByID(int id);

	void insertarProveedor(Proveedor proveedor);

	void updateProveedor(Proveedor proveedor, int id);

	void deleteProveedor(int id);

}
