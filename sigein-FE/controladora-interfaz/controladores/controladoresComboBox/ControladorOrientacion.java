package controladores.controladoresComboBox;
import clases.*;

import java.util.List;

import org.zkoss.bind.annotation.Init;

public class ControladorOrientacion {
	private String orientacion;
	
	
	public List<String> getOrientaciones() {
        return Orientacion.getOrientaciones();
    }
	
	@Init
	public void init() {
		setOrientacion("Norte");
    }

	 public void setOrientacion(String orientacion) {
	 	this.orientacion = orientacion;
	 }
	 public String getOrientacion() {
		return this.orientacion;
	 }
	 
}
