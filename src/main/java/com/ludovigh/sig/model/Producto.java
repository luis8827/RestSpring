package com.ludovigh.sig.model;

/**
 *
 * @author bug
 */
public class Producto {

    private int id;
    private int id_proveedor;
    private int id_categoria;
    private String descripcion;
    private double preciounit;
    private int existencia;

    public Producto(int id, int id_proveedor, int id_categoria, String descripcion, double preciounit, int existencia) {
        this.id = id;
        this.id_proveedor = id_proveedor;
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.preciounit = preciounit;
        this.existencia = existencia;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(double preciounit) {
        this.preciounit = preciounit;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    

}
