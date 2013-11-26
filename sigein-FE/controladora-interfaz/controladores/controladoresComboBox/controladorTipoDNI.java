package controladores.controladoresComboBox;
import clases.*;

import java.util.List;

import org.zkoss.bind.annotation.Init;

public class controladorTipoDNI {
	private String tipoDNI;
	
	
	public List<String> getTiposDNI() {
        return TipoDNI.getTipoDNI();
    }
	
	@Init
	public void init() {
		setTipoDNI("DNI");
    }

	 public void setTipoDNI(String tipoDNI) {
	 	this.tipoDNI = tipoDNI;
	 }
	 public String getTipoDNI() {
		return this.tipoDNI;
	 }
	 
}
