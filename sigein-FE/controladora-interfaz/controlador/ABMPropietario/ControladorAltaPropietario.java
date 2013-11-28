package controlador.ABMPropietario;

import org.zkoss.zk.ui.Desktop;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.DesktopActivationListener;
import org.zkoss.zul.*;

import ar.com.sigein.common.dtos.DNIDTO;
import ar.com.sigein.common.dtos.PropietarioDTO;

public class ControladorAltaPropietario extends SelectorComposer<Window>{
	private static final long serialVersionUID = 1L;
	
	@Wire Textbox nombrePropitario;
	@Wire Textbox apellidoPropietario;
	@Wire Combobox comboDNI;
	@Wire Intbox numeroDNI;
	@Wire Textbox nombreCalle;
	@Wire Intbox numeroCalle;
	@Wire Combobox comboProvincia;
	@Wire Combobox comboLocalidad;
	@Wire Textbox numeroTelefono;
	@Wire Textbox email;
	
//	wire de nueva localidad
	
	@Wire Button nuevaLocalidad;
	@Wire Textbox localidadNueva;
	
	private PropietarioDTO propietario = null;
	private DNIDTO dni = new DNIDTO(null, 0);
	
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		nuevaLocalidad.setVisible(false);
		localidadNueva.setVisible(false);
	}
	@Listen("onClick=#cargaPropietario")
	public void cargaPropietario(){
		
//		Acá se mandaría a un método de la lógica para cargar el propietario.
	}
	@Listen("onClick=#cargaLocalidad")
	public void cargaLocalidad(){
		nuevaLocalidad.setVisible(true);
		localidadNueva.setVisible(true);
	}
	@Listen("onClick=#nuevaLocalidad")
	public void nuevaLocalidad(){
		String nLocalidad = localidadNueva.getValue();
//		Realizar un método que inserte la localidad nueva!!
//		si se pudo agregar a la BD
		
			comboLocalidad.appendItem(nLocalidad);
			comboLocalidad.setValue(nLocalidad);
//		Sino se pudo agregar
//			Clients.showNotification("No se pudo agregar");
	}
}
