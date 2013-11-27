package ar.com.sigein.common.dtos;

public class OrientacionDTO extends BaseDTO {
	private int orientacion;
	private String descripcion;
	public OrientacionDTO(int orientacion, String descripcion) {
		super();
		this.orientacion = orientacion;
		this.descripcion = descripcion;
	}
	public int getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(int orientacion) {
		this.orientacion = orientacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
