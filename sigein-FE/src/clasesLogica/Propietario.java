
package clasesLogica;

public class Propietario {
	private int idPropietario;
	private String nombre;
	private String apellido;
	private int telefono;
	private Localidad localidad;
	private Barrio barrio;
	private String correoElectronico;
	private DNI tipoDoc;
	public Propietario(int idPropietario, String nombre, String apellido,
			int telefono, Localidad localidad, Barrio barrio,
			String correoElectronico, DNI tipoDoc) {
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
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	public Barrio getBarrio() {
		return barrio;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public DNI getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(DNI tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
}
