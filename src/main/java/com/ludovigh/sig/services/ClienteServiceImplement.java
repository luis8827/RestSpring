package com.ludovigh.sig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludovigh.sig.imapper.ClienteMapper;
import com.ludovigh.sig.model.Cliente;

@Service
public class ClienteServiceImplement implements ClienteService {

	
	@Autowired
	private ClienteMapper clienteMapper;

	@Override
	public List<Cliente> getAllClientes() {
		return clienteMapper.getAllClientes();
	}

	@Override
	public Cliente getClienteByID(int id) {
		return clienteMapper.getClienteById(id);
	}

	@Override
	public void insertarCliente(Cliente cliente) {

		clienteMapper.insertarCliente(cliente);

	}

	@Override
	public void updateCliente(Cliente cliente,int id) {
		clienteMapper.updateCliente(cliente, id);
	}
	@Override
	public void deleteCliente(int id) {
		clienteMapper.deleteCliente(id);
	}

}
