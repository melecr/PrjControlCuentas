package com.repdep.representados.entidades;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Futbolista {
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String> equipos;
	private String posicion;
	private BigDecimal ficha;
	private BigDecimal estatura;
	private BigDecimal peso;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<String> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<String> equipos) {
		this.equipos = equipos;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public BigDecimal getFicha() {
		return ficha;
	}
	public void setFicha(BigDecimal ficha) {
		this.ficha = ficha;
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
	
	
	
}
