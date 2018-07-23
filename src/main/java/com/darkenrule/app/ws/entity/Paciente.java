package com.darkenrule.app.ws.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "el campo nombre es obligatorio")
	@Column(length = 50)
	private String nombre;

	@NotNull(message = "el campo apellido paterno es obligatorio")
	@Column(length = 50)
	private String paterno;

	@Column(length = 50)
	private String materno;

	@NotNull(message="el campo fecha de nacimiento es obligatorio")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaDeNacimiento;

	@OneToOne
	@JoinColumn(name = "direccion_id")
	@Valid
	private Direccion direccion;

	private String telefono;

	@Email(message = "el campo correo electónico debe contener un correo valido")
	private String email;
	
	private Double peso;

	private Double estatura;
	
	@OneToOne(mappedBy="paciente")
	private Expediente expediente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email + ", peso=" + peso + ", estatura=" + estatura + "]";
	}	

}
