package controlador.ABMInmueble;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

import ar.com.sigein.common.dtos.InmuebleDTO;
import ar.com.sigein.common.dtos.PropietarioDTO;
import ar.com.sigein.common.dtos.TipoDocumentoDTO;

public class ControladorABMInmueble extends SelectorComposer<Window> {
	private static final long serialVersionUID = 1L;

	@Wire
	Intbox numeroDNI;
	// @Wire Button buscarDNI;
	@Wire
	Combobox comboDNI;
	@Wire
	Hlayout muestraPropietario;
	@Wire
	Label nombrePropietario;
	@Wire
	Label apellidoPropietario;
	@Wire
	Listbox todoListbox;

	private PropietarioDTO propietario = null;
	private TipoDocumentoDTO dni = new TipoDocumentoDTO(0, "DNI");

	// Lista de inmueble que tuviese que recibir de la base de datos asociada a
	// un usuario.
	/** Acá va a estar el new de impl */

	private List<InmuebleDTO> inmuebles = new ArrayList<InmuebleDTO>();

	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		String par = Executions.getCurrent().getParameter("dni");

		if (par != null) {
			/*
			 * int numDNI = Integer.parseInt(par); dni = new
			 * TipoDocumentoDTO(numDNI, "DNI"); // Acá tuviese que buscar el
			 * propietario a la base de datos y me devolvería un propietarioDTO.
			 * propietario = new PropietarioDTO(0, "Juan", "Jacob", 3496656308,
			 * "Felicia","Chetaje", "juanpablojacob@hotmail.com", dni)
			 * comboDNI.setValue(dni.getTipoDNI());
			 * numeroDNI.setValue(dni.getNumeroDNI());
			 * muestraPropietario.setVisible(true);
			 * nombrePropietario.setValue("Nombre: "+propietario.getNombre());
			 * apellidoPropietario.setValue(" / Apellido: "+
			 * propietario.getApellido());
			 * 
			 * // Acá tuviese que traer los inmubles de la base de datos.. Los
			 * inicializo yo.. todoListbox.setVisible(true); InmuebleDTO inm1=
			 * new InmuebleDTO("Santa Fe", "Felicia", "Rivadavia", 343, 0, "C");
			 * InmuebleDTO inm2= new InmuebleDTO("Entre Rios", "Paraná",
			 * "Rivadavia", 343, 0, "C"); InmuebleDTO inm3= new
			 * InmuebleDTO("Cordoba", "Cordoba Capital", "Rivadavia", 343, 0,
			 * "C"); inmuebles.add(inm1); inmuebles.add(inm2);
			 * inmuebles.add(inm3); todoListbox.setModel(new
			 * ListModelList<InmuebleDTO>(inmuebles));
			 */
		} else {
			todoListbox.setVisible(false);
			muestraPropietario.setVisible(false);
		}

	}

	@Listen("onClick=#buscarDNI")
	public void buscar() {
		String tipoDNI = comboDNI.getValue();
		int nDNI = numeroDNI.intValue();

		String numero = String.valueOf(nDNI);
		if (numero.length() >= 6) {
			dni.setTipoDoc(tipoDNI);
			dni.setNumero(nDNI);
			// ACÁ MANDARÍA A LA LÓGICA EL DNIDTO

			Executions.sendRedirect("ABMInmueble.zul?dni=" + dni.getNumero());
		} else {
			Clients.showNotification(
					"El número de documento debe superar los 5 números",
					numeroDNI);
		}
	}

	@Listen("onClick=#cargaInmueble")
	public void cargaInmueble() {
		Executions.sendRedirect("AltaInmueble-1.zul?dni=" + dni.getNumero());
	}

	@Listen("onClick=#bajaInmueble")
	public void bajaInmueble() {
		Messagebox.show("Question is pressed. Are you sure?", "Question",
				Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION);

	}

	@Listen("onClick=#modificacionInmueble")
	public void modificacionInmueble() {

	}

	public List<InmuebleDTO> getInmuebles() {
		return inmuebles;
	}

	public void setInmuebles(List<InmuebleDTO> inmuebles) {
		this.inmuebles = inmuebles;
	}

}