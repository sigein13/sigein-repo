package controladores.controladoresComboBox;


import clases.*;

import java.util.List;

import org.zkoss.bind.annotation.Init;

public class ControladorProvincia {
	private String prov;
	
	
	public List<String> getProvincias() {
        return Provincia.getProvincia();
    }
	
	@Init
	public void init() {
		setProvincia("Santa Fe");
    }

	 public void setProvincia(String provincia) {
	 	this.prov = provincia;
	 }
	 public String getProvincia() {
		return this.prov;
	 }
}
