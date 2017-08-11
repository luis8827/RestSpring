package com.ludovigh.sig.imapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;


import com.ludovigh.sig.model.OrdenDetalle;


public interface OrdenDetalleMapper {

	List<OrdenDetalle> getAllOrdenDetalles();

	OrdenDetalle getOrdenDetalleById(@Param("id") int id);

	void insertarOrdenDetalle(@Param("ordendetalle") OrdenDetalle ordendetalle);

	void updateOrdenDetalle(@Param("ordendetalle") OrdenDetalle ordendetalle, @Param("idod") int id);

	void deleteOrdenDetalle(@Param("id") int id);
}
