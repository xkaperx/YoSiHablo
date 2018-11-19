package xkaperx.model;

import java.util.Date;

public class Idioma {
	
	private int id;
	private String titulo;
	private int duracion;
	private String detalle;
	private Date fechaInicio;
	private String estatus="Activa";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Idioma [id=" + id + ", titulo=" + titulo + ", duracion=" + duracion + ", detalle=" + detalle
				+ ", fechaInicio=" + fechaInicio + ", estatus=" + estatus + "]";
	}
	

}
