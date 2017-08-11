package com.ludovigh.sig.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludovigh.sig.DTO.productoDTO;
import com.ludovigh.sig.imapper.ProductoMapper;
import com.ludovigh.sig.model.Producto;

@Service
public class ProductoServiceImplement implements ProductoService {

	@Autowired
	private ProductoMapper productoMapper;

	@Override
	public Producto getProductoById(int id) {
		// TODO Auto-generated method stub
		return productoMapper.getProductoById(id);
	}

	@Override
	public List<Producto> getAllProductos() {
		return productoMapper.getAllProductos();
	}

	@Override
	public List<Map<?, ?>> getListaProductos() {
		// TODO Auto-generated method stub
		return productoMapper.getListaProductos();
	}
	
//	productoDTO getListaProductos2();
	@Override
	public List<productoDTO> getListaProductos2() {
		// TODO Auto-generated method stub
		return productoMapper.getListaProductos2();
	}
}
