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


public class ControladorAltaInmueble1 extends SelectorComposer<Window>{
	@Wire Grid grilla1;
	@Wire Combobox comboProvincia;
	@Wire Combobox comboLocalidad;
	@Wire Textbox nombreCalle;
	@Wire Intbox numeroCalle;
	@Wire Textbox pisoDpto;
	@Wire Textbox dpto;
	@Wire Textbox barrio;
	@Wire Combobox comboInmueble;
	@Wire Combobox comboOrientacion;
	@Wire Intbox superficie;
	@Wire Intbox frente;
	@Wire Intbox fondo;
	@Wire Panel divisor1;
	@Wire Panel divisor2;
	
//	Wires del divisor2
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
	@Wire Grid grilla2;
	
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
//		Acá obtengo el DNI del propietario del inmueble.
//		Con el dni puedo obtener todo lo referido al propietario.
		String par=Executions.getCurrent().getParameter("dni");
		divisor2.setVisible(false);
	}
	@Listen("onClick=#siguiente")
	public void siguiente(){
//		href="/zul/ABMInmueble/AltaInmueble-2.zul";
		String provincia = comboProvincia.getValue();
		String localidad = comboLocalidad.getValue();
		String nCalle= nombreCalle.getValue();
		int numCalle=numeroCalle.getValue();
		String pDpto=pisoDpto.getValue();
		String nDpto= dpto.getValue();
		String barri_dpto = barrio.getValue();
		String inmueble= comboInmueble.getValue();
		String orientacion=comboOrientacion.getValue();
		int sup=superficie.getValue();
		int frente_inm= frente.getValue();
		int fondo_inm=fondo.getValue();
		
//		Valido todo lo que tengo para validar.
//		Instancio un objeto, ver como lo puedo mandar a la otra clase.
//		Executions.sendRedirect("/zul/ABMInmueble/AltaInmueble-2.zul");
		divisor1.setVisible(false);
		divisor2.setVisible(true);
	}
	
	@Listen("onClick=#siguiente")
	public void atras(){
		divisor2.setVisible(false);
		divisor1.setVisible(true);
	}
	
}