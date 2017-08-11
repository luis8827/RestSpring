package com.ludovigh.sig.model;

/**
 *
 * @author bug
 */
public class Proveedor {

    private int id;
    private String nombreprov;
    private String contacto;
    private String celuprov;
    private String fijoprov;

    public Proveedor(int id, String nombreprov, String contacto, String celuprov, String fijoprov) {
        this.id = id;
        this.nombreprov = nombreprov;
        this.contacto = contacto;
        this.celuprov = celuprov;
        this.fijoprov = fijoprov;
    }

    public Proveedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreprov() {
        return nombreprov;
    }

    public void setNombreprov(String nombreprov) {
        this.nombreprov = nombreprov;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCeluprov() {
        return celuprov;
    }

    public void setCeluprov(String celuprov) {
        this.celuprov = celuprov;
    }

    public String getFijoprov() {
        return fijoprov;
    }

    public void setFijoprov(String fijoprov) {
        this.fijoprov = fijoprov;
    }
    
    
}
