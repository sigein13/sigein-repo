/**
 * 
 */
package ar.com.sigein.principal;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Image;
import org.zkoss.zul.Menubar;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Vbox;

import ar.com.sigein.base.BaseGenericForwardComposer;

/**
 * @author jpfrancisconi 
 * @version 1.0
 */
public class PrincipalComp extends BaseGenericForwardComposer {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5355485117883054942L;
	public static final String LOGIN_PATH = "/index.zul";
	
	//VARIABLES DE INSTANCIA
	//UsuarioDTO usuarioEnSesion = new UsuarioDTO();
	
	
	//VARIABLES DE ZK ZUL
	private Textbox usuarioLogeadoLabelComp;
	private Textbox fechaLabelComp;
	private Menubar menuPrincipalComp;
	private Image cerrarSesionComp;
		
	// CONSTRUCTOR
	public PrincipalComp() {
	}
	
	/**
	 * Metodo de inicio de ventana, se ejecuta la primera vez que se accede a la ventana 
	 */
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		comp.setAttribute(comp.getId() + "Ctrl", this, true);
		
		
		
		panelbusqueda.setVisible(false);
		//contenedorCentral.appendChild(panelbusqueda);
		contenedorCentral.removeChild(panelbusqueda);
		
		binder = new AnnotateDataBinder(comp);
		binder.loadAll();
	
	}
	
	/* (non-Javadoc)
	 * @see com.tpdisenio.webui.sigehot.base.BaseGenericForwardComposer#validarCampos()
	 */
	protected void validarCampos() {
		// TODO Auto-generated method stub

	}

	public Textbox getUsuarioLogeadoLabelComp() {
		return usuarioLogeadoLabelComp;
	}

	public void setUsuarioLogeadoLabelComp(Textbox usuarioLogeadoLabelComp) {
		this.usuarioLogeadoLabelComp = usuarioLogeadoLabelComp;
	}
	
	public Textbox getFechaLabelComp() {
		return fechaLabelComp;
	}

	public void setFechaLabelComp(Textbox fechaLabelComp) {
		this.fechaLabelComp = fechaLabelComp;
	}

	public Menubar getMenuPrincipalComp() {
		return menuPrincipalComp;
	}

	public void setMenuPrincipalComp(Menubar menuPrincipalComp) {
		this.menuPrincipalComp = menuPrincipalComp;
	}

	public Image getCerrarSesionComp() {
		return cerrarSesionComp;
	}

	public void setCerrarSesionComp(Image cerrarSesionComp) {
		this.cerrarSesionComp = cerrarSesionComp;
	}

	public Vbox getContenedorCentral() {
		return contenedorCentral;
	}

	public void setContenedorCentral(Vbox contenedorCentral) {
		this.contenedorCentral = contenedorCentral;
	}

	@Override
	protected void limpiarComponentes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick$ayuda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick$editar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick$eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick$guardar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick$nuevo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick$btnBusqueda() {
		// TODO Auto-generated method stub
		
	}
}
