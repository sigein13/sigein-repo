package controlador.ABMInmueble;


import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.DesktopActivationListener;
import org.zkoss.zk.ui.util.Template;
import org.zkoss.zul.*;

import ClasesDTO.*;
public class ControladorABMInmueble extends SelectorComposer<Window>{
	private static final long serialVersionUID = 1L;
	
	@Wire Intbox numeroDNI;
//	@Wire Button buscarDNI;
	@Wire Combobox comboDNI;
	@Wire Hlayout muestraPropietario;
	@Wire Label nombrePropietario;
	@Wire Label apellidoPropietario;
	@Wire Listbox todoListbox;
	
	private PropietarioDTO propietario = null;
	private DNIDTO dni = new DNIDTO(null, 35452519);
	
	
//	Lista de inmueble que tuviese que recibir de la base de datos asociada a un usuario.
	/** Ac� va a estar el new de impl*/
	
	
	private List<InmuebleDTO> inmuebles = new ArrayList<InmuebleDTO>();
	
	
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		String par=Executions.getCurrent().getParameter("dni");
		
		if(par!=null){
			int numDNI = Integer.parseInt(par);
			dni = new DNIDTO(comboDNI.getValue(), numDNI);
//			Ac� tuviese que buscar el propietario a la base de datos y me devolver�a un propietarioDTO.
			propietario = new PropietarioDTO("juan", "jacob", dni, "calle", 100, "provincia", "localidad", "3496-656308", "juanpablojacob@hotmail.com");
			comboDNI.setValue(dni.getTipoDNI());
			numeroDNI.setValue(dni.getNumeroDNI());
			muestraPropietario.setVisible(true);
			nombrePropietario.setValue("Nombre: "+propietario.getNombre());
			apellidoPropietario.setValue(" / Apellido: "+ propietario.getApellido());
			
//			Ac� tuviese que traer los inmubles de la base de datos.. Los inicializo yo..
			todoListbox.setVisible(true);
			InmuebleDTO inm1= new InmuebleDTO("Santa Fe", "Felicia", "Rivadavia", 343, 0, "C");
			InmuebleDTO inm2= new InmuebleDTO("Entre Rios", "Paran�", "Rivadavia", 343, 0, "C");
			InmuebleDTO inm3= new InmuebleDTO("Cordoba", "Cordoba Capital", "Rivadavia", 343, 0, "C");
			inmuebles.add(inm1);
			inmuebles.add(inm2);
			inmuebles.add(inm3);
			todoListbox.setModel(new ListModelList<InmuebleDTO>(inmuebles));
			
			
		}
		else{
			todoListbox.setVisible(false);
			muestraPropietario.setVisible(false);
		}
		
	}
	@Listen("onClick=#buscarDNI")
	public void buscar(){
		String tipoDNI=comboDNI.getValue();
		int nDNI= numeroDNI.intValue();
		
		String numero= String.valueOf(nDNI);
		if(numero.length()>=6){
			dni.setTipoDNI(tipoDNI);
			dni.setNumeroDNI(nDNI);
//			AC� MANDAR�A A LA L�GICA EL DNIDTO
			System.out.println("tipo: "+ dni.getTipoDNI() + "numero: "+ dni.getNumeroDNI());
			Executions.sendRedirect("ABMInmueble.zul?dni="+dni.getNumeroDNI());
		}
		else{
			Clients.showNotification("El n�mero de documento debe superar los 5 n�meros", numeroDNI);
		}
	}
	@Listen("onClick=#cargaInmueble")
	public void cargaInmueble(){
		Executions.sendRedirect("AltaInmueble-1.zul?dni="+dni.getNumeroDNI());
	}
	@Listen("onClick=#bajaInmueble")
	public void bajaInmueble(){
		Messagebox.show("Question is pressed. Are you sure?", "Question", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION);
		
		
	}
	@Listen("onClick=#modificacionInmueble")
	public void modificacionInmueble(){
		
	}
	
	public List<InmuebleDTO> getInmuebles() {
		return inmuebles;
	}
	public void setInmuebles(List<InmuebleDTO> inmuebles) {
		this.inmuebles = inmuebles;
	}
	
}