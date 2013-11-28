/**
 * 
 */
package ar.com.sigein.base;

import java.lang.reflect.InvocationTargetException;


import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Decimalbox;
import org.zkoss.zul.Div;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Paging;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Toolbarbutton;
import org.zkoss.zul.Vbox;
import org.zkoss.zul.Window;
import org.zkoss.zul.event.PagingEvent;
import org.zkoss.zul.impl.InputElement;

public abstract class BaseGenericForwardComposer extends GenericForwardComposer {

	private static final long serialVersionUID = -5287773260698672939L;
	
	/*constantes de usuario en session*/
	/*protected static final String CERRAR_SESSION = WebMessagesLoader.getMessage("session.close");
	
	protected static final String M_CAMPO_OBLIGATORIO = WebMessagesLoader.getMessage("t.campo.obligatorio");
	protected static final String M_ALMENOS_UNO_OBLIGATORIO = WebMessagesLoader.getMessage("t.almenos.uno.obligatorio");
	protected static final String M_SELECCION_GRILLA = WebMessagesLoader.getMessage("t.grilla.seleccion");
	protected static final String M_ABM_AGREGAR_EXITO = WebMessagesLoader.getMessage("t.agregar.exito");
	protected static final String M_ABM_ELIMINAR_EXITO = WebMessagesLoader.getMessage("t.eliminar.exito");
	protected static final String M_ABM_MODIFICAR_EXITO = WebMessagesLoader.getMessage("t.modificar.exito");
	protected static final String C_ABM_MODIFICAR_EXITO = WebMessagesLoader.getMessage("t.modificar.exito");
	protected static final String C_ELIMINAR_PREGUNTA = WebMessagesLoader.getMessage("t.confirmacion.eliminar");
	protected static final String C_TITULO = WebMessagesLoader.getMessage("t.confirmacion.titulo.ventana");
	protected static final String T_PANEL_ALTA = WebMessagesLoader.getMessage("t.panel.alta.titulo");
	protected static final String T_PANEL_MODIFICACION = WebMessagesLoader.getMessage("t.panel.modificacion.titulo");
	
	//ventana de seguir agregando redistros
	protected static final String SEGUIR_CARGANDO = WebMessagesLoader.getMessage("t.confirmacion.seguir.cargando");
	protected static final String SEGUIR_CARGANDO_TITULO = WebMessagesLoader.getMessage("t.confirmacion.seguir.cargando.titulo");
	
	protected static final String M_ABM_CLAVE_DUPLICADA = WebMessagesLoader.getMessage("db.clave.duplicada");*/

	// protected static final String FORMATO_FECHA =
	// WebMessagesLoader.getMessage("t.formato.fecha");
	protected Page paginaPrincipalId;
	protected String tipoAccion;
	protected static final String ACCION_MODIFICAR = "modificacion";
	protected static final String ACCION_AGREGAR = "agregar";
	protected AnnotateDataBinder binder;
	/* Partes de la pagina */
	protected Vbox contenedorCentral;
	protected Panel panelbusqueda;
	protected Panel paneloperaciones;
	/* Botones de la barra de herramientas */
	protected Toolbarbutton volver;
	protected Toolbarbutton ayuda;
	protected Toolbarbutton nuevo;
	protected Toolbarbutton eliminar;
	protected Toolbarbutton guardar;
	protected Toolbarbutton editar;
	protected Toolbarbutton btnSalir;
	protected Div divBanner;
	
	protected Window mainWindow;
	 
	/* Botones del zul genericos para los ABMs*/
	protected Button btnBusqueda;
	
	protected final String LST_ID = "grilla";
	protected final String PAG_ID = "paginacion";
	protected Paging pag;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.zkoss.zk.ui.util.GenericComposer#doAfterCompose(org.zkoss.zk.ui.Component )
	 */
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		comp.setAttribute(comp.getId() + "Ctrl", this, true);
		
		mainWindow = (Window) comp;
		// panelbusqueda.setVisible(true);
		// contenedorCentral.appendChild(panelbusqueda);
		
		binder = new AnnotateDataBinder(comp);

	}

	/**
	 * @param habilitar
	 */
	protected void habilitarBotones(boolean habilitar) {
		volver.setVisible(!habilitar);
		nuevo.setVisible(habilitar);
		eliminar.setVisible(habilitar);
		guardar.setVisible(!habilitar);
	}
	
	/**
	 * 
	 */
	public abstract void onClick$btnBusqueda(); 
		// metodo que deberá ser redefinido en las superclases
	
	
	/**
	 * 
	 */
	public void onClick$volver() {
		limpiarComponentes();
		//habilitarBotones(true);
		paneloperaciones.detach();
		paneloperaciones.setVisible(false);
		// panelbusqueda.setVisible(true);
		// contenedorCentral.appendChild(panelbusqueda);
		binder.loadAll();
	}

	@SuppressWarnings("unchecked")
	protected void validarCamposObligatorios(String[] campos) {
		InputElement inputElement = (InputElement) mainWindow.getFellow(campos[0]);
		inputElement.setFocus(true);
		for (int i = 0; i < campos.length; i++) {
			Component component = mainWindow.getFellow(campos[i]);
			Class componentClass = component.getClass();
			try {
				String nombreMetodoInvocar = null;
				if (component instanceof Textbox || component instanceof Decimalbox || component instanceof Intbox
						|| component instanceof Datebox) {
					nombreMetodoInvocar = "getValue";
				}
				if (component instanceof Combobox) {
					nombreMetodoInvocar = "getSelectedItem()";
				}
				Method getValueMethod = componentClass.getMethod(nombreMetodoInvocar, null);
				Object objectValue = getValueMethod.invoke(component, null);
				if (objectValue == null || objectValue.equals("")) {
					throw new WrongValueException(component, "CAMPO OBLIGATORIO");
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected void limpiarCampos() {

		Collection<Component> components = mainWindow.getFellows();

		for (Component component : components) {

			Class componentClass = component.getClass();
			String nombreMetodoInvocar = "setValue";
			Method setValueMethod = null;
			Object value = null;

			try {
				if (component instanceof Textbox) {
					Class[] parameter = { String.class };
					setValueMethod = componentClass.getMethod(nombreMetodoInvocar, parameter);
					setValueMethod.invoke(component, value);
				}
				if (component instanceof Decimalbox) {
					Class[] parameter = { BigDecimal.class };
					setValueMethod = componentClass.getMethod(nombreMetodoInvocar, parameter);
					setValueMethod.invoke(component, value);
				}
				if (component instanceof Intbox) {
					Class[] parameter = { Integer.class };
					setValueMethod = componentClass.getMethod(nombreMetodoInvocar, parameter);
					setValueMethod.invoke(component, value);
				}
				if (component instanceof Datebox) {
					Class[] parameter = { Date.class };
					setValueMethod = componentClass.getMethod(nombreMetodoInvocar, parameter);
					setValueMethod.invoke(component, value);
				}

			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}

	protected void crearPaginacion() {
		pag = (Paging) mainWindow.getFellow(PAG_ID);
		final int PAGE_SIZE = pag.getPageSize();
		redraw(0, PAGE_SIZE);
		pag.addEventListener("onPaging", new EventListener() {
			public void onEvent(Event event) {
				PagingEvent pe = (PagingEvent) event;
				int pgno = pe.getActivePage();
				int ofs = pgno * PAGE_SIZE;
				redraw(ofs, PAGE_SIZE);
			}
		});
	}

	/**
	 * Metodo en donde se debe inplementar la consulta con paginación
	 * 
	 */
	public void redraw(int firstResult, int maxResults) {
	};

	/**
	 * Habilita el fomulario para ingresar los dato de un nuevo registro
	 */
	public abstract void onClick$nuevo();

	/**
	 * Hace efectiva la acción de agregar un nuevo registro o modificarlo
	 */
	public abstract void onClick$guardar();

	/**
	 * Hace efectiva la acción de eliminar registro
	 */
	public abstract void onClick$editar();

	/**
	 * Habilita el fomulario para ingresar los dato de un nuevo registro
	 */
	public abstract void onClick$eliminar();

	/**
	 * Muestra la ayuda
	 */
	public abstract void onClick$ayuda();

	/**
	 * Implementa la validaciones pertinentes
	 */
	protected abstract void validarCampos();

	/**
	 * Limpia los componentes y los devuelve a un estado inicial
	 */
	protected abstract void limpiarComponentes();

	public String getTipoAccion() {
		return tipoAccion;
	}

	public void setTipoAccion(String tipoAccion) {
		this.tipoAccion = tipoAccion;
	}

	public AnnotateDataBinder getBinder() {
		return binder;
	}

	public void setBinder(AnnotateDataBinder binder) {
		this.binder = binder;
	}

	public Vbox getContenedorCentral() {
		return contenedorCentral;
	}

	public void setContenedorCentral(Vbox contenedorCentral) {
		this.contenedorCentral = contenedorCentral;
	}

	public Panel getPanelbusqueda() {
		return panelbusqueda;
	}

	public void setPanelbusqueda(Panel panelbusqueda) {
		this.panelbusqueda = panelbusqueda;
	}

	public Panel getPaneloperaciones() {
		return paneloperaciones;
	}

	public void setPaneloperaciones(Panel paneloperaciones) {
		this.paneloperaciones = paneloperaciones;
	}

	public Toolbarbutton getVolver() {
		return volver;
	}

	public void setVolver(Toolbarbutton volver) {
		this.volver = volver;
	}

	public Toolbarbutton getAyuda() {
		return ayuda;
	}

	public void setAyuda(Toolbarbutton ayuda) {
		this.ayuda = ayuda;
	}

	public Toolbarbutton getNuevo() {
		return nuevo;
	}

	public void setNuevo(Toolbarbutton nuevo) {
		this.nuevo = nuevo;
	}

	public Toolbarbutton getEliminar() {
		return eliminar;
	}

	public void setEliminar(Toolbarbutton eliminar) {
		this.eliminar = eliminar;
	}

	public Toolbarbutton getGuardar() {
		return guardar;
	}

	public void setGuardar(Toolbarbutton guardar) {
		this.guardar = guardar;
	}

	public Toolbarbutton getEditar() {
		return editar;
	}

	public void setEditar(Toolbarbutton editar) {
		this.editar = editar;
	}

	public Window getMainWindow() {
		return mainWindow;
	}

	public void setMainWindow(Window mainWindow) {
		this.mainWindow = mainWindow;
	}

	public Paging getPag() {
		return pag;
	}

	public void setPag(Paging pag) {
		this.pag = pag;
	}

	public Button getBtnBusqueda() {
		return btnBusqueda;
	}

	public void setBtnBusqueda(Button btnBusqueda) {
		this.btnBusqueda = btnBusqueda;
	}

	public Toolbarbutton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(Toolbarbutton btnSalir) {
		this.btnSalir = btnSalir;
	}
	
	public Div getDivBanner() {
		return divBanner;
	}

	public void setDivBanner(Div divBanner) {
		this.divBanner = divBanner;
	}

	public Page getPaginaPrincipalId() {
		return paginaPrincipalId;
	}

	public void setPaginaPrincipalId(Page paginaPrincipalId) {
		this.paginaPrincipalId = paginaPrincipalId;
	}
}
