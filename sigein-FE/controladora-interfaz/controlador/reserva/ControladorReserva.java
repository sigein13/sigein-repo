package controlador.reserva;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.DesktopActivationListener;
import org.zkoss.zul.*;

import ClasesDTO.*;

public class ControladorReserva extends SelectorComposer<Window>{
	private static final long serialVersionUID = 1L;
	@Wire Listbox listbox1;
	
	
//	Inmueble DTO que tuviese que recibir de la base de datos.
//	private List<InmuebleDTO> inmuebles = new ArrayList<InmuebleDTO>();

	private ListModel<InmuebleDTO> inmuebles = new ListModelList<InmuebleDTO>();
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		
//		Inicializo algunos inmuebleDTO por mi cuenta, haciendo como que los recibí de la base de datos.
		DireccionDTO dir1 = new DireccionDTO("Rivadavia", 343, 4, 2);
		BarrioDTO bar1 = new BarrioDTO(0, "Lalala", dir1);
		OrientacionDTO or1= new OrientacionDTO(1, "Norte");
		InmuebleDTO inm1 = new InmuebleDTO(1, null, 100, "FOTO1", 4, 44, 3, 1, 20, false, true, true, false, false, true, true, true, true, true, or1, null, null, null, bar1, null, null);
		DireccionDTO dir2 = new DireccionDTO("Avda. Freyre", 34553, 4, 2);
		BarrioDTO bar2 = new BarrioDTO(0, "Lelele", dir2);
		OrientacionDTO or2= new OrientacionDTO(1, "Norte");
		InmuebleDTO inm3 = new InmuebleDTO(2, null, 100, "FOTO2", 4, 44, 3, 1, 20, false, true, true, false, false, true, true, true, true, true, or2, null, null, null, bar2, null, null);
		((ListModelList<InmuebleDTO>)inmuebles).add(inm1);
		((ListModelList<InmuebleDTO>)inmuebles).add(inm3);
//		listbox1.setModel(new ListModelList<InmuebleDTO>(inmuebles));
	}
	public ListModel<InmuebleDTO> getInmuebles() {
		return inmuebles;
	}
	public void setInmuebles(ListModel<InmuebleDTO> inmuebles) {
		this.inmuebles = inmuebles;
	}

}
