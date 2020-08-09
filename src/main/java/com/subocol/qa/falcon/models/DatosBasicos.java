package com.subocol.qa.falcon.models;

import java.util.ArrayList;
import java.util.List;


public class DatosBasicos {

	private String numeroSiniestro;
	private String rutaArchivo;
	private String VIN;
	private String placa;
	private String marca;
	private String linea;
	private String version;
	private String anio;
	private String region;
	private String departamento;
	private String ciudad;
	private String taller;
	private String tipoPintura;

	public static List<DatosBasicos> listaDatosBasicos = new ArrayList<DatosBasicos>();

	public static DatosBasicos traerInformacion(int indice) {
		return listaDatosBasicos.get(indice);
	}
	
	public static void guardarInformacion(DatosBasicos datosBasicos) {
		listaDatosBasicos.add(datosBasicos);
	}

	public String getNumeroSiniestro() {
		return numeroSiniestro;
	}

	public void setNumeroSiniestro(String numeroSiniestro) {
		this.numeroSiniestro = numeroSiniestro;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTaller() {
		return taller;
	}

	public void setTaller(String taller) {
		this.taller = taller;
	}

	public String getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}
	

}
