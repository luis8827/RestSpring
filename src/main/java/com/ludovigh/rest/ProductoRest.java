package com.ludovigh.rest;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ludovigh.sig.DTO.productoDTO;
import com.ludovigh.sig.model.Producto;
import com.ludovigh.sig.services.ClienteService;
import com.ludovigh.sig.services.ProductoService;

@CrossOrigin
@RestController
@RequestMapping("/apirest/producto")
public class ProductoRest {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@Autowired
	private ProductoService productoService;

	// @Autowired
	// private ClienteService clienteService;

	@GetMapping("/")
	public ResponseEntity<?> listarProductos() {
		return new ResponseEntity<List<Map<?, ?>>>(productoService.getListaProductos(), HttpStatus.OK);
	}
	@GetMapping("/lista")
	public ResponseEntity<?> getproducto2() {
		return new ResponseEntity<List<productoDTO>>(productoService.getListaProductos2(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getproducto(@PathVariable int id) {
		return new ResponseEntity<Producto>(productoService.getProductoById(id), HttpStatus.OK);
	}

	
}
