package com.ludovigh.sig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludovigh.sig.imapper.EmpleadoMapper;
import com.ludovigh.sig.model.Empleado;

@Service
public class EmpleadoServiceImplement implements EmpleadoService {

	@Autowired
	private EmpleadoMapper empleadoMapper;

	@Override
	public List<Empleado> getAllEmpleados() {
		return empleadoMapper.getAllEmpleados();
	}

	@Override
	public Empleado getEmpleadoByID(int id) {
		return empleadoMapper.getEmpleadoById(id);
	}

	@Override
	public void insertarEmpleado(Empleado empleado) {

		empleadoMapper.insertarEmpleado(empleado);

	}

	@Override
	public void updateEmpleado(Empleado empleado,int id) {
		empleadoMapper.updateEmpleado(empleado, id);
	}
	@Override
	public void deleteEmpleado(int id) {
		empleadoMapper.deleteEmpleado(id);
	}

}
