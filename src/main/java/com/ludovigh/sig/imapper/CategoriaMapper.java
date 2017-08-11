package com.ludovigh.sig.imapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;


import com.ludovigh.sig.model.Categoria;


public interface CategoriaMapper {

	List<Categoria> getAllCategorias();

	Categoria getCategoriaById(@Param("id") int id);

	void insertarCategoria(@Param("categoria") Categoria categoria);

	void updateCategoria(@Param("categoria") Categoria categoria, @Param("id") int id);

	void deleteCategoria(@Param("id") int id);
}
