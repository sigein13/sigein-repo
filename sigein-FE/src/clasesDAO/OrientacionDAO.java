package clasesDAO;

public class OrientacionDAO extends BaseDAO {
	private int orientacion;
	private String descripcion;
	public OrientacionDAO(int orientacion, String descripcion) {
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
