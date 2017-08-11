package com.ludovigh.sig.services;

import java.util.List;
import java.util.Map;

import com.ludovigh.sig.DTO.productoDTO;
import com.ludovigh.sig.model.Producto;

public interface ProductoService {
	List<Producto> getAllProductos();

	Producto getProductoById(int idprodu);

	List<Map<?, ?>> getListaProductos();
	
	List<productoDTO> getListaProductos2();
}
