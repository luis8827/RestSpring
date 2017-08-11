package com.ludovigh.sig.imapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ludovigh.sig.model.Proveedor;
import com.ludovigh.sig.model.Proveedor;


public interface ProveedorMapper {

	List<Proveedor> getAllProveedores();

	Proveedor getProveedorById(@Param("id") int id);

	void insertarProveedor(@Param("proveedor") Proveedor proveedor);

	void updateProveedor(@Param("proveedor") Proveedor proveedor, @Param("id") int id);

	void deleteProveedor(@Param("id") int id);

}
