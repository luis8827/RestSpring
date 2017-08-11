package com.ludovigh.sig.DTO;

public class productoDTO {

	// {
	// "descripcion": "SALCHICHAS VIENESAS ",
	// "preciounit": 2.6,
	// "existencia": 200,
	// "id_proveedor": 1,
	// "codigo": 100,
	// "contacto": "MANUEL ANDRADE ",
	// "id_categoria": 1,
	// "fijoprov": "2124456 ",
	// "id": 1,
	// "nombreprov": "DON DIEGO ",
	// "celuprov": "099234567 ",
	// "nombrecat": "CARNICOS "
	// }

	private int id;
	private String descripcion;
	private Double preciounit;
	private int existencia;
//	private int codigo;
	private String contacto;

	private String fijoprov;
	private String nombreprov;
	private String celuprov;
	private String nombrecat;
	public productoDTO(int id, String descripcion, Double preciounit, int existencia, 
//			int codigo, 
			String contacto,
			String fijoprov, String nombreprov, String celuprov, String nombrecat) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.preciounit = preciounit;
		this.existencia = existencia;
//		this.codigo = codigo;
		this.contacto = contacto;
		this.fijoprov = fijoprov;
		this.nombreprov = nombreprov;
		this.celuprov = celuprov;
		this.nombrecat = nombrecat;
	}
	public productoDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPreciounit() {
		return preciounit;
	}
	public void setPreciounit(Double preciounit) {
		this.preciounit = preciounit;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
//	public int getCodigo() {
//		return codigo;
//	}
//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getFijoprov() {
		return fijoprov;
	}
	public void setFijoprov(String fijoprov) {
		this.fijoprov = fijoprov;
	}
	public String getNombreprov() {
		return nombreprov;
	}
	public void setNombreprov(String nombreprov) {
		this.nombreprov = nombreprov;
	}
	public String getCeluprov() {
		return celuprov;
	}
	public void setCeluprov(String celuprov) {
		this.celuprov = celuprov;
	}
	public String getNombrecat() {
		return nombrecat;
	}
	public void setNombrecat(String nombrecat) {
		this.nombrecat = nombrecat;
	}
	
	

}
