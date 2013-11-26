
package controladores.controladoresComboBox;


import clases.*;

import java.util.List;

import org.zkoss.bind.annotation.Init;

public class ControladorBarrio {
	private String barrio;
	
	
	public List<String> getBarrios() {
        return Barrio.getBarrio();
    }
	
	@Init
	public void init() {
		setBarrio("Guadalupe");
    }

	 public void setBarrio(String barrio) {
	 	this.barrio=barrio;
	 }
	 public String getBarrio() {
		return this.barrio;
	 }
}
