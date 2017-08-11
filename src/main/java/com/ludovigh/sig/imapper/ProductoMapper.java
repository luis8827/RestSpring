package com.ludovigh.sig.imapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ludovigh.sig.model.Producto;
import com.ludovigh.sig.DTO.productoDTO;

public interface ProductoMapper {

	List<Producto> getAllProductos();

	Producto getProductoById(@Param("id") int id);
	
	@Select("SELECT  "
			+ "producto.descripcion,"
			+ "producto.preciounit,"
			+ "producto.existencia, "
			+ "producto.id, "
			
			
			+ "categoria.codigo,"
			+ "categoria.nombrecat,"
			+ "proveedor.nombreprov,"
			+ "proveedor.contacto,"
			+ "proveedor.celuprov,"
			+ "proveedor.fijoprov "
			+ "FROM producto "
			+ "INNER JOIN  proveedor ON  producto.id_proveedor =  proveedor.id "
			+ "INNER JOIN  categoria ON  categoria.id =  producto.id_categoria")
	List<Map<?, ?>> getListaProductos();
	
	@Select("SELECT  "
			+ "producto.descripcion,"
			+ "producto.preciounit,"
			+ "producto.existencia, "
			+ "producto.id, "
			+ "categoria.codigo,"
			+ "categoria.nombrecat,"
			+ "proveedor.nombreprov,"
			+ "proveedor.contacto,"
			+ "proveedor.celuprov,"
			+ "proveedor.fijoprov "
			+ "FROM producto "
			+ "INNER JOIN  proveedor ON  producto.id_proveedor =  proveedor.id "
			+ "INNER JOIN  categoria ON  categoria.id =  producto.id_categoria")
	List<productoDTO> getListaProductos2();

}
