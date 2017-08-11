package com.ludovigh.sig.model;

/**
 *
 * @author bug
 */
public class Categoria {
    private int id;
    private int codigo;
    private String nombrecat;

    public Categoria(int id, int codigo, String nombrecat) {
        this.id = id;
        this.codigo = codigo;
        this.nombrecat = nombrecat;
    }

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombrecat() {
        return nombrecat;
    }

    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }
    
    

}
