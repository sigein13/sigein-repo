package ClasesDTO;

public class PropietarioDTO {
	private String nombre;
	private String apellido;
	private DNIDTO dni;
	private String Calle;
	private int nroCalle;
	private String provincia;
	private String localidad;
	private String telefono;
	private String email;
	public PropietarioDTO(String nombre, String apellido, DNIDTO dni,
			String calle, int nroCalle, String provincia, String localidad,
			String telefono, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		Calle = calle;
		this.nroCalle = nroCalle;
		this.provincia = provincia;
		this.localidad = localidad;
		this.telefono = telefono;
		this.email = email;
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
	public DNIDTO getDni() {
		return dni;
	}
	public void setDni(DNIDTO dni) {
		this.dni = dni;
	}
	public String getCalle() {
		return Calle;
	}
	public void setCalle(String calle) {
		Calle = calle;
	}
	public int getNroCalle() {
		return nroCalle;
	}
	public void setNroCalle(int nroCalle) {
		this.nroCalle = nroCalle;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
