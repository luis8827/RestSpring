package com.ludovigh.sig.imapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;


import com.ludovigh.sig.model.Orden;


public interface OrdenMapper {

	List<Orden> getAllOrdenes();

	Orden getOrdenById(@Param("id") int id);

	void insertarOrden(@Param("orden") Orden orden);

	void updateOrden(@Param("orden") Orden orden, @Param("id") int id);

	void deleteOrden(@Param("id") int id);
}
