package com.ludovigh.sig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludovigh.sig.imapper.ProveedorMapper;
import com.ludovigh.sig.model.Proveedor;

@Service
public class ProveedorServiceImplement implements ProveedorService {

	@Autowired
	private ProveedorMapper proveedorMapper;

	@Override
	public List<Proveedor> getAllProveedors() {
		return proveedorMapper.getAllProveedores();
	}

	@Override
	public Proveedor getProveedorByID(int id) {
		return proveedorMapper.getProveedorById(id);
	}

	@Override
	public void insertarProveedor(Proveedor proveedor) {

		proveedorMapper.insertarProveedor(proveedor);

	}

	@Override
	public void updateProveedor(Proveedor proveedor,int id) {
		proveedorMapper.updateProveedor(proveedor, id);
	}
	@Override
	public void deleteProveedor(int id) {
		proveedorMapper.deleteProveedor(id);
	}

}
