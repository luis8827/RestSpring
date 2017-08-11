package com.ludovigh.sig.model;
import java.sql.Date;

/**
 *
 * @author bug
 */
public class Orden {
     private int id;
    private Date fechaorden;
    private int descuento;
   
    private int id_cliente;
    private int id_empleado;

    public Orden(int id, Date fechaorden, int descuento, int id_cliente, int id_empleado) {
        this.id = id;
        this.fechaorden = fechaorden;
        this.descuento = descuento;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
    }

    public Orden() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(Date fechaorden) {
        this.fechaorden = fechaorden;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    
}
