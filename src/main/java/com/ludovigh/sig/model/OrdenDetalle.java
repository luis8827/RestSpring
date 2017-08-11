package com.ludovigh.sig.model;

/**
 *
 * @author bug
 */
public class OrdenDetalle {
    private int id;
    private int cantidad;
    private int id_producto;
    private int id_orden;

    public OrdenDetalle(int id, int cantidad, int id_producto, int id_orden) {
        this.id = id;
        this.cantidad = cantidad;
        this.id_producto = id_producto;
        this.id_orden = id_orden;
    }

    public OrdenDetalle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }
    
}
