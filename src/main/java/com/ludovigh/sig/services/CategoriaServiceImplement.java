package com.ludovigh.sig.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ludovigh.sig.imapper.CategoriaMapper;
import com.ludovigh.sig.model.Categoria;

@Service
public class CategoriaServiceImplement implements CategoriaService {

	@Autowired
	private CategoriaMapper categoriaMapper;

	@Override
	public List<Categoria> getAllCategorias() {
		return categoriaMapper.getAllCategorias();
	}

	@Override
	public Categoria getCategoriaByID(int id) {
		return categoriaMapper.getCategoriaById(id);
	}

	@Override
	public void insertarCategoria(Categoria categoria) {

		categoriaMapper.insertarCategoria(categoria);

	}

	@Override
	public void updateCategoria(Categoria categoria,int id) {
		categoriaMapper.updateCategoria(categoria, id);
	}
	@Override
	public void deleteCategoria(int id) {
		categoriaMapper.deleteCategoria(id);
	}

}
