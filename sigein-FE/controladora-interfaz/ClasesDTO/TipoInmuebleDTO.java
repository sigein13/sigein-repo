package ClasesDTO;

public class TipoInmuebleDTO extends BaseDTO{
	private int idTipoInmueble;
	private String descripcion;
	
	public TipoInmuebleDTO(int idTipoInmueble, String descripcion) {
		super();
		this.idTipoInmueble = idTipoInmueble;
		this.descripcion = descripcion;
	}
	public int getIdTipoInmueble() {
		return idTipoInmueble;
	}
	public void setIdTipoInmueble(int idTipoInmueble) {
		this.idTipoInmueble = idTipoInmueble;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
