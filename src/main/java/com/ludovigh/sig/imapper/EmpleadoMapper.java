package com.ludovigh.sig.imapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ludovigh.sig.model.Empleado;


public interface EmpleadoMapper {

	List<Empleado> getAllEmpleados();

	Empleado getEmpleadoById(@Param("id") int id);

	void insertarEmpleado(@Param("empleado") Empleado empleado);

	void updateEmpleado(@Param("empleado") Empleado empleado, @Param("id") int id);

	void deleteEmpleado(@Param("id") int id);
}
