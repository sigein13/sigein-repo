package controladores.controladoresComboBox;


import clases.*;

import java.util.List;

import org.zkoss.bind.annotation.Init;

public class ControladorLocalidad {
	private String localidad;
	
	
	public List<String> getLocalidades() {
        return Localidad.getLocalidad();
    }
	
	@Init
	public void init() {
		setLocalidad("Santa Fe");
    }

	 public void setLocalidad(String localidad) {
	 	this.localidad = localidad;
	 }
	 public String getLocalidad() {
		return this.localidad;
	 }
}
