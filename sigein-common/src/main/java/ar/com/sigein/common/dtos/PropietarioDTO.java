package ar.com.sigein.common.dtos;

public class PropietarioDTO extends BaseDTO {
	private int idPropietario;
	private String nombre;
	private String apellido;
	private int telefono;
	private LocalidadDTO localidad;
	private BarrioDTO barrio;
	private String correoElectronico;
	private TipoDocumentoDTO tipoDoc;
	public PropietarioDTO(int idPropietario, String nombre, String apellido,
			int telefono, LocalidadDTO localidad, BarrioDTO barrio,
			String correoElectronico, TipoDocumentoDTO tipoDoc) {
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
	public LocalidadDTO getLocalidad() {
		return localidad;
	}
	public void setLocalidad(LocalidadDTO localidad) {
		this.localidad = localidad;
	}
	public BarrioDTO getBarrio() {
		return barrio;
	}
	public void setBarrio(BarrioDTO barrio) {
		this.barrio = barrio;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public TipoDocumentoDTO getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDocumentoDTO tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	
	
}
