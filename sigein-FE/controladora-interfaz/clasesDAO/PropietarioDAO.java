package clasesDAO;

public class PropietarioDAO extends BaseDAO {
	private int idPropietario;
	private String nombre;
	private String apellido;
	private int telefono;
	private LocalidadDAO localidad;
	private BarrioDAO barrio;
	private String correoElectronico;
	private TipoDocumentoDAO tipoDoc;
	public PropietarioDAO(int idPropietario, String nombre, String apellido,
			int telefono, LocalidadDAO localidad, BarrioDAO barrio,
			String correoElectronico, TipoDocumentoDAO tipoDoc) {
		super();
		this.idPropietario = idPropietario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.localidad = localidad;
		this.barrio = barrio;
		this.correoElectronico = correoElectronico;
		this.tipoDoc = tipoDoc;
	}
	public int getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
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
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public TipoDocumentoDAO getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDocumentoDAO tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	
	
}
