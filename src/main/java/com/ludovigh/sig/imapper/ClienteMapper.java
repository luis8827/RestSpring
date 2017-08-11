package com.ludovigh.sig.imapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ludovigh.sig.model.Cliente;


public interface ClienteMapper {

	List<Cliente> getAllClientes();

	Cliente getClienteById(@Param("id") int id);

	void insertarCliente(@Param("cliente") Cliente cliente);

	void updateCliente(@Param("cliente") Cliente cliente, @Param("id") int id);

	void deleteCliente(@Param("id") int id);

}
