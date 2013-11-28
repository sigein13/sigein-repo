package controlador.ABMInmueble;

import org.zkoss.zk.ui.Desktop;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.DesktopActivationListener;
import org.zkoss.zul.*;

import clases.Localidad;


public class ControladorAltaInmueble2 extends SelectorComposer<Window>{
	@Wire Radio radio1;
	@Wire Radio radio2;
	@Wire Intbox antiguedad;
	@Wire Intbox dormitorios;
	@Wire Intbox banios;
	@Wire Checkbox checkGarage;
	@Wire Checkbox checkAgua;
	@Wire Checkbox checkPatio;
	@Wire Checkbox checkPavimento;
	@Wire Checkbox checkPiscina;
	@Wire Checkbox checkGas;
	@Wire Checkbox checkCloaca;
	@Wire Checkbox checkAguaCaliente;
	@Wire Checkbox checkTelefono;
	@Wire Checkbox checkLavadero;
	@Wire Textbox observaciones;
	
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
	}
	@Listen("onClick=#guardar")
	public void siguiente(){
		
	}
}