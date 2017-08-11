package com.ludovigh.sig.services;

import java.util.List;

import com.ludovigh.sig.model.Cliente;



public interface ClienteService {

	List<Cliente> getAllClientes();

	Cliente getClienteByID(int id);

	void insertarCliente(Cliente cliente);

	void updateCliente(Cliente cliente, int id);

	void deleteCliente(int id);

}
