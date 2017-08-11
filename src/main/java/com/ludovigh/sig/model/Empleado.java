package com.ludovigh.sig.model;
import java.sql.Date;

/**
 *
 * @author bug
 */
public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private int reporta_a;
    private int extencion;

    public Empleado(int id, String nombre, String apellido, Date fecha_nac, int reporta_a, int extencion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.reporta_a = reporta_a;
        this.extencion = extencion;
    }

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getReporta_a() {
        return reporta_a;
    }

    public void setReporta_a(int reporta_a) {
        this.reporta_a = reporta_a;
    }

    public int getExtencion() {
        return extencion;
    }

    public void setExtencion(int extencion) {
        this.extencion = extencion;
    }

    
}
