package controlador.ABMPropietario;

import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.DesktopActivationListener;
import org.zkoss.zul.*;

import ClasesDTO.*;
public class ControladorABMPropietario extends SelectorComposer<Window>{
	private static final long serialVersionUID = 1L;
	
	@Wire Intbox numeroDNI;
//	@Wire Button buscarDNI;
	@Wire Combobox comboDNI;
	@Wire Hlayout muestraPropietario;
	@Wire Label nombrePropietario;
	@Wire Label apellidoPropietario;
	
	
//	Declaración de los wires correspondientes a los campos de modificación.
	@Wire Grid modificarPropietario;
	@Wire Textbox nombrePropitarioMod;
	@Wire Textbox apellidoPropietarioMod;
	@Wire Combobox comboDNIMod;
	@Wire Intbox numeroDNIMod;
	@Wire Textbox nombreCalleMod;
	@Wire Intbox numeroCalleMod;
	@Wire Combobox comboProvinciaMod;
	@Wire Combobox comboLocalidadMod;
	@Wire Textbox numeroTelefonoMod;
	@Wire Textbox emailMod;
	
	private PropietarioDTO propietario = null;
	private DNIDTO dni = new DNIDTO(null, 35452519);
	
	
	public void doAfterCompose(Window comp) throws Exception {
			super.doAfterCompose(comp);
			String par=Executions.getCurrent().getParameter("dni");
			if(par!=null){
				dni = new DNIDTO(comboDNI.getValue(), numeroDNI.intValue());
//				Acá tuviese que buscar el propietario a la base de datos.
				propietario = new PropietarioDTO("juan", "jacob", dni, "calle", 100, "provincia", "localidad", "3496-656308", "juanpablojacob@hotmail.com");
				muestraPropietario.setVisible(true);
				nombrePropietario.setValue("Nombre: "+propietario.getNombre());
				apellidoPropietario.setValue(" / Apellido: "+ propietario.getApellido());
				
				modificarPropietario.setVisible(true);
				nombrePropitarioMod.setValue(propietario.getNombre());
				apellidoPropietarioMod.setValue(propietario.getApellido());
				comboDNIMod.setValue(propietario.getDni().getTipoDNI());
				numeroDNIMod.setValue(propietario.getDni().getNumeroDNI());
				nombreCalleMod.setValue(propietario.getCalle());
				numeroCalleMod.setValue(propietario.getNroCalle());
				comboProvinciaMod.setValue(propietario.getProvincia());
				comboLocalidadMod.setValue(propietario.getLocalidad());
				numeroTelefonoMod.setValue(propietario.getTelefono());
				emailMod.setValue(propietario.getEmail());
				
			}
			else{
				muestraPropietario.setVisible(false);
				modificarPropietario.setVisible(false);
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
//			ACÁ MANDARÍA A LA LÓGICA EL DNIDTO
			System.out.println("tipo: "+ dni.getTipoDNI() + "numero: "+ dni.getNumeroDNI());
			Executions.sendRedirect("ABMPropietario.zul?dni="+dni.getNumeroDNI());
		}
		else{
			Clients.showNotification("El número de documento debe superar los 5 números", numeroDNI);
		}
		
	}
	@Listen("onClick=#btnModificar")
	public void modificarPropietario(){
		PropietarioDTO propietarioNuevo = new PropietarioDTO(nombrePropitarioMod.getValue(), apellidoPropietarioMod.getValue(),
				new DNIDTO(comboDNIMod.getValue(), numeroDNIMod.getValue()),
				nombreCalleMod.getValue(), numeroCalleMod.intValue(), comboProvinciaMod.getValue(),
				comboLocalidadMod.getValue(), numeroTelefonoMod.getValue(), emailMod.getValue());
		//Acá se manda a un método de la lógica el propietarioDTO y se modifica.
		Clients.showNotification("Se modificó correctamente");
		Executions.sendRedirect("ABMPropietario.zul");
	}
	@Listen("onClick=#btnBaja")
	public void bajaPropietario(){
//		Se puede eliminar mandando a un método dni solamente.!!
		Clients.showNotification("Acá está la funcinalidad de dar de baja...");
	}
	
	
}
