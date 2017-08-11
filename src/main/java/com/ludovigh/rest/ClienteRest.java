package com.ludovigh.rest;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ludovigh.sig.model.Cliente;
import com.ludovigh.sig.services.ClienteService;

@CrossOrigin
@RestController
@RequestMapping("/apirest/cliente")
public class ClienteRest {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	private ClienteService clienteService;

	
	@PostMapping("/")
	public ResponseEntity<?> addCliente(RequestEntity<Cliente> cliente) {

		logger.info("peticion de listar");
		Cliente clie = cliente.getBody();

		if (clienteService.getClienteByID(clie.getId()) != null) {
			return new ResponseEntity<String>("el cliente con id " + clie.getId() + " ya se encuentra registrado",
					HttpStatus.CONFLICT);

		} else {
			clienteService.insertarCliente(clie);
			return new ResponseEntity<Cliente>(clie, HttpStatus.CREATED);

		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateCliente(RequestEntity<Cliente> clie, @PathVariable int id) {
		logger.info("realizara la actualizacion de un cliente");
		Cliente cliente = clie.getBody();
		if (clienteService.getClienteByID(cliente.getId()) != null) {

			clienteService.updateCliente(cliente, id);
			return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("el sistema no puede encontrar el recurso", HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/")
	public ResponseEntity<?> listarClientes() {
		logger.info("listara");
		return new ResponseEntity<List<Cliente>>(clienteService.getAllClientes(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getCliente(@PathVariable int id) {
		logger.info("obtendra cliente");
		if (clienteService.getClienteByID(id) != null) {
			return new ResponseEntity<Cliente>(clienteService.getClienteByID(id), HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("El cliente no puede ser encontrado", HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		logger.info("eliminara  cliente");
		if (clienteService.getClienteByID(id) != null) {
			clienteService.deleteCliente(id);
			return new ResponseEntity<String>("Eliminara", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("El cliente no puede ser encontrado", HttpStatus.NOT_FOUND);
		}
	}
	


}
