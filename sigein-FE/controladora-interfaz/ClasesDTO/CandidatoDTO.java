package ClasesDTO;

import java.util.Date;

/**
 * @author juan
 *
 */
public class CandidatoDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6639590098062612335L;
	
	private Integer idCandidato;
	private Integer nroEmpleado;
	private Integer nroCandidato;
	private String apellido;
	private String nombre;
	private String nroDocumento;
	private String tipoDocumento;
	private Date fechaNacimiento;
	private char genero;
	private String nacionalidad;
	private String email;
	private boolean escolaridad;
	private boolean eliminado;
	private String claveCuestionario;
	
	//CONSTRUCTORES
	public CandidatoDTO(){
		
	}
	
	public CandidatoDTO(Integer idCandidato, Integer nroEmpleado,
			Integer nroCandidato, String apellido, String nombre,
			String nroDocumento, String tipoDocumento, Date fechaNacimiento,
			char genero, String nacionalidad, String email,
			boolean escolaridad, boolean eliminado, String claveCuestionario) {
		super();
		this.idCandidato = idCandidato;
		this.nroEmpleado = nroEmpleado;
		this.nroCandidato = nroCandidato;
		this.apellido = apellido;
		this.nombre = nombre;
		this.nroDocumento = nroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
		this.email = email;
		this.escolaridad = escolaridad;
		this.eliminado = eliminado;
		this.claveCuestionario = claveCuestionario;
	}


	/* Getters and Setters */

	public Integer getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(Integer idCandidato) {
		this.idCandidato = idCandidato;
	}

	public Integer getNroEmpleado() {
		return nroEmpleado;
	}

	public void setNroEmpleado(Integer nroEmpleado) {
		this.nroEmpleado = nroEmpleado;
	}

	public Integer getNroCandidato() {
		return nroCandidato;
	}

	public void setNroCandidato(Integer nroCandidato) {
		this.nroCandidato = nroCandidato;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(boolean escolaridad) {
		this.escolaridad = escolaridad;
	}

	public boolean isEliminado() {
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

	public String getClaveCuestionario() {
		return claveCuestionario;
	}

	public void setClaveCuestionario(String claveCuestionario) {
		this.claveCuestionario = claveCuestionario;
	}	
	
}