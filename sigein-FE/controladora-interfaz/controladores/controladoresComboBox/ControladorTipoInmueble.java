package controladores.controladoresComboBox;
import clases.*;

import java.util.List;

import org.zkoss.bind.annotation.Init;

public class ControladorTipoInmueble {
	private String tipoInmueble;
	
	
	public List<String> getTiposInmuebles() {
        return TipoInmueble.getTipoInmueble();
    }
	
	@Init
	public void init() {
		setTipoInmueble("L");
    }

	 public void setTipoInmueble(String tipoInmueble) {
	 	this.tipoInmueble = tipoInmueble;
	 }
	 public String getTipoInmueble() {
		return this.tipoInmueble;
	 }
	 
}
