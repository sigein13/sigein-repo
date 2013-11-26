package clasesDAO;

public class EstadoInmuebleDAO extends BaseDAO {
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public EstadoInmuebleDAO(String estado) {
		super();
		this.estado = estado;
	}
	

}
