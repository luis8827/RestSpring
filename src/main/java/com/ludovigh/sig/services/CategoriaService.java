package com.ludovigh.sig.services;

import java.util.List;

import com.ludovigh.sig.model.Categoria;



public interface CategoriaService {

	List<Categoria> getAllCategorias();

	Categoria getCategoriaByID(int id);

	void insertarCategoria(Categoria categoria);

	void updateCategoria(Categoria categoria, int id);

	void deleteCategoria(int id);

}
