package com.darkenrule.app.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Direccion {

	@Id
	@GeneratedValue
	private Integer id;

	@NotNull(message="el campo calle es obligatorio")
	@Column(length=100)
	private String calle;
	
	@NotNull(message="el campo número exterior es obligatorio")
	@Column(length=50)
	private String exterior;
	
	@Column(length=50)
	private String interior;
	
	@NotNull(message="el campo colonia es obligatorio")
	@Column(length=50)
	private String colonia;
	
	@NotNull(message="el campo código postal es obligatorio")
	@Column(length=7)
	private String cp;
	
	@NotNull(message="el campo delegación es obligatorio")
	@Column(length=50)
	private String delegacion;
	
	@NotNull(message="el campo ciudad es obligatorio")
	@Column(length=50)
	private String ciudad;
	
	@NotNull(message="el campo país es obligatorio")
	@Column(length=50)
	private String pais;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getExterior() {
		return exterior;
	}

	public void setExterior(String exterior) {
		this.exterior = exterior;
	}

	public String getInterior() {
		return interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", exterior=" + exterior + ", interior=" + interior
				+ ", colonia=" + colonia + ", cp=" + cp + ", delegacion=" + delegacion + ", ciudad=" + ciudad
				+ ", pais=" + pais + "]";
	}

}
