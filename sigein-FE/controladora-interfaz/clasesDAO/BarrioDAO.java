package clasesDAO;

public class BarrioDAO extends BaseDAO{
	private int idBarrio;
	private String nombreBarrio;
	private DireccionDAO direccion;
	public BarrioDAO(int idBarrio, String nombreBarrio, DireccionDAO direccion) {
		super();
		this.idBarrio = idBarrio;
		this.nombreBarrio = nombreBarrio;
		this.direccion = direccion;
	}
	public int getIdBarrio() {
		return idBarrio;
	}
	public void setIdBarrio(int idBarrio) {
		this.idBarrio = idBarrio;
	}
	public String getNombreBarrio() {
		return nombreBarrio;
	}
	public void setNombreBarrio(String nombreBarrio) {
		this.nombreBarrio = nombreBarrio;
	}
	public DireccionDAO getDireccion() {
		return direccion;
	}
	public void setDireccion(DireccionDAO direccion) {
		this.direccion = direccion;
	}
	
}
