package com.ludovigh.sig.model;

/**
 *
 * @author bug
 */
public class Cliente {

	  private int id;
	    private String cedula_ruc;
	    private String nombrecia;
	    private String nombrecontacto;
	    private String direccioncli;
	    private String fax;
	    private String email;
	    private String celular;
	    private String fijo;

	    public Cliente(int id, String cedula_ruc, String nombrecia, String nombrecontacto, String direccioncli, String fax, String email, String celular, String fijo) {
	        this.id = id;
	        this.cedula_ruc = cedula_ruc;
	        this.nombrecia = nombrecia;
	        this.nombrecontacto = nombrecontacto;
	        this.direccioncli = direccioncli;
	        this.fax = fax;
	        this.email = email;
	        this.celular = celular;
	        this.fijo = fijo;
	    }

	    public Cliente() {
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getCedula_ruc() {
	        return cedula_ruc;
	    }

	    public void setCedula_ruc(String cedula_ruc) {
	        this.cedula_ruc = cedula_ruc;
	    }

	    public String getNombrecia() {
	        return nombrecia;
	    }

	    public void setNombrecia(String nombrecia) {
	        this.nombrecia = nombrecia;
	    }

	    public String getNombrecontacto() {
	        return nombrecontacto;
	    }

	    public void setNombrecontacto(String nombrecontacto) {
	        this.nombrecontacto = nombrecontacto;
	    }

	    public String getDireccioncli() {
	        return direccioncli;
	    }

	    public void setDireccioncli(String direccioncli) {
	        this.direccioncli = direccioncli;
	    }

	    public String getFax() {
	        return fax;
	    }

	    public void setFax(String fax) {
	        this.fax = fax;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getCelular() {
	        return celular;
	    }

	    public void setCelular(String celular) {
	        this.celular = celular;
	    }

	    public String getFijo() {
	        return fijo;
	    }

	    public void setFijo(String fijo) {
	        this.fijo = fijo;
	    }


}
