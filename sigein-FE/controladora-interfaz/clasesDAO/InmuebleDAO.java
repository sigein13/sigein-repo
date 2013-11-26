package clasesDAO;

import java.util.*;

public class InmuebleDAO extends BaseDAO{

	private int idInmueble;
	private Date fechaAlta;
	private int precioVenta;
	private String foto; //???
	private int frente;
	private int fondo;
	private int dormitorio;
	private int banio;
	private int antiguedad;
	private boolean propiedadHorizontal;
	private boolean garage;
	private boolean patio;
	private boolean pileta;
	private boolean gasNatural;
	private boolean cloacas;
	private boolean aguaCorriente;
	private boolean telefono;
	private boolean lavadero;
	private boolean pavimiento;
	private OrientacionDAO orientacion;
	private TipoInmuebleDAO tipoInmueble;
	private PropietarioDAO propietario;
	private LocalidadDAO localidad;
	private BarrioDAO barrio;
	private EstadoInmuebleDAO estado;
	private DireccionDAO direccion;
	
	public InmuebleDAO(int idInmueble, Date fechaAlta, int precioVenta,
			String foto, int frente, int fondo, int dormitorio, int banio,
			int antiguedad, boolean propiedadHorizontal, boolean garage,
			boolean patio, boolean pileta, boolean gasNatural, boolean cloacas,
			boolean aguaCorriente, boolean telefono, boolean lavadero,
			boolean pavimiento, OrientacionDAO orientacion,
			TipoInmuebleDAO tipoInmueble, PropietarioDAO propietario,
			LocalidadDAO localidad, BarrioDAO barrio, EstadoInmuebleDAO estado,
			DireccionDAO direccion) {
		super();
		this.idInmueble = idInmueble;
		this.fechaAlta = fechaAlta;
		this.precioVenta = precioVenta;
		this.foto = foto;
		this.frente = frente;
		this.fondo = fondo;
		this.dormitorio = dormitorio;
		this.banio = banio;
		this.antiguedad = antiguedad;
		this.propiedadHorizontal = propiedadHorizontal;
		this.garage = garage;
		this.patio = patio;
		this.pileta = pileta;
		this.gasNatural = gasNatural;
		this.cloacas = cloacas;
		this.aguaCorriente = aguaCorriente;
		this.telefono = telefono;
		this.lavadero = lavadero;
		this.pavimiento = pavimiento;
		this.orientacion = orientacion;
		this.tipoInmueble = tipoInmueble;
		this.propietario = propietario;
		this.localidad = localidad;
		this.barrio = barrio;
		this.estado = estado;
		this.direccion = direccion;
	}

	public int getIdInmueble() {
		return idInmueble;
	}

	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getFrente() {
		return frente;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public int getFondo() {
		return fondo;
	}

	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	public int getDormitorio() {
		return dormitorio;
	}

	public void setDormitorio(int dormitorio) {
		this.dormitorio = dormitorio;
	}

	public int getBanio() {
		return banio;
	}

	public void setBanio(int banio) {
		this.banio = banio;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public boolean isPropiedadHorizontal() {
		return propiedadHorizontal;
	}

	public void setPropiedadHorizontal(boolean propiedadHorizontal) {
		this.propiedadHorizontal = propiedadHorizontal;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isPatio() {
		return patio;
	}

	public void setPatio(boolean patio) {
		this.patio = patio;
	}

	public boolean isPileta() {
		return pileta;
	}

	public void setPileta(boolean pileta) {
		this.pileta = pileta;
	}

	public boolean isGasNatural() {
		return gasNatural;
	}

	public void setGasNatural(boolean gasNatural) {
		this.gasNatural = gasNatural;
	}

	public boolean isCloacas() {
		return cloacas;
	}

	public void setCloacas(boolean cloacas) {
		this.cloacas = cloacas;
	}

	public boolean isAguaCorriente() {
		return aguaCorriente;
	}

	public void setAguaCorriente(boolean aguaCorriente) {
		this.aguaCorriente = aguaCorriente;
	}

	public boolean isTelefono() {
		return telefono;
	}

	public void setTelefono(boolean telefono) {
		this.telefono = telefono;
	}

	public boolean isLavadero() {
		return lavadero;
	}

	public void setLavadero(boolean lavadero) {
		this.lavadero = lavadero;
	}

	public boolean isPavimiento() {
		return pavimiento;
	}

	public void setPavimiento(boolean pavimiento) {
		this.pavimiento = pavimiento;
	}

	public OrientacionDAO getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(OrientacionDAO orientacion) {
		this.orientacion = orientacion;
	}

	public TipoInmuebleDAO getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(TipoInmuebleDAO tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public PropietarioDAO getPropietario() {
		return propietario;
	}

	public void setPropietario(PropietarioDAO propietario) {
		this.propietario = propietario;
	}

	public LocalidadDAO getLocalidad() {
		return localidad;
	}

	public void setLocalidad(LocalidadDAO localidad) {
		this.localidad = localidad;
	}

	public BarrioDAO getBarrio() {
		return barrio;
	}

	public void setBarrio(BarrioDAO barrio) {
		this.barrio = barrio;
	}

	public EstadoInmuebleDAO getEstado() {
		return estado;
	}

	public void setEstado(EstadoInmuebleDAO estado) {
		this.estado = estado;
	}

	public DireccionDAO getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionDAO direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
}
