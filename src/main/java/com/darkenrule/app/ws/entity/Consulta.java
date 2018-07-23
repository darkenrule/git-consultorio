package com.darkenrule.app.ws.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Consulta {

	@Id
	@GeneratedValue
	private Integer id;

	private Date start;
	private Date end;
	
	private String title;

	private String observaciones;

	@OneToMany(mappedBy = "consulta")
	private List<Receta> recetas;

	@ManyToOne
	@JoinColumn(name = "expediente_id")
	private Expediente expediente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", start=" + start + ", end=" + end + ", title=" + title + ", observaciones="
				+ observaciones + ", recetas=" + recetas + ", expediente=" + expediente + "]";
	}	
}
