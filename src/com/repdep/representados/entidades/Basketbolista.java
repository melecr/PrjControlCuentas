package com.repdep.representados.entidades;

import java.math.BigDecimal;

public class Basketbolista {
	private String nombre;
	private String apellido;
	private BigDecimal estatura;
	private BigDecimal peso;
	private String posicion;
	private BigDecimal puntosPorPartido;
	private BigDecimal rebotesPorPartido;
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
	public BigDecimal getEstatura() {
		return estatura;
	}
	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getPeso() {
		return peso;
	}
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public BigDecimal getPuntosPorPartido() {
		return puntosPorPartido;
	}
	public void setPuntosPorPartido(BigDecimal puntosPorPartido) {
		this.puntosPorPartido = puntosPorPartido;
	}
	public BigDecimal getRebotesPorPartido() {
		return rebotesPorPartido;
	}
	public void setRebotesPorPartido(BigDecimal rebotesPorPartido) {
		this.rebotesPorPartido = rebotesPorPartido;
	}
	
	
}
