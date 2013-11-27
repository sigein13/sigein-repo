package ar.com.sigein.common.dtos;

public class LocalidadDTO extends BaseDTO {
	private int idLocalidad;
	private String nombreLocalidad;
	private ProvinciaDTO provincia;
	
	public LocalidadDTO(int idLocalidad, String nombreLocalidad,
			ProvinciaDTO provincia) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombreLocalidad = nombreLocalidad;
		this.provincia = provincia;
	}
	public int getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	public String getNombreLocalidad() {
		return nombreLocalidad;
	}
	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}
	public ProvinciaDTO getProvincia() {
		return provincia;
	}
	public void setProvincia(ProvinciaDTO provincia) {
		this.provincia = provincia;
	}
	
}
