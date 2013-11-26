package controladores.controladoresComboBox;

import clases.*;

import java.util.List;


public class ControladorTipoInm {
	private String tipoInm;
	
	public List<String> getTiposInm() {
        return TipoInm.getTipoInm();
       
    }
	
  
  
	 public void setTipoInm(String tipoInm) {
	 	this.tipoInm = tipoInm;
	 }
	 public String getTipoInm() {
		return this.tipoInm;
	 }
}
