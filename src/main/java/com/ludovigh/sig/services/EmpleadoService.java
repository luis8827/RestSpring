package com.ludovigh.sig.services;

import java.util.List;

import com.ludovigh.sig.model.Empleado;



public interface EmpleadoService {

	List<Empleado> getAllEmpleados();

	Empleado getEmpleadoByID(int id);

	void insertarEmpleado(Empleado Empleado);

	void updateEmpleado(Empleado Empleado, int id);

	void deleteEmpleado(int id);

}
