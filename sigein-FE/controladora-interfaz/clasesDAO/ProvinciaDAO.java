package clasesDAO;

public class ProvinciaDAO extends BaseDAO {
	private int idProvincia;
	private String nombreProvincia;
	public ProvinciaDAO(int idProvincia, String nombreProvincia) {
		super();
		this.idProvincia = idProvincia;
		this.nombreProvincia = nombreProvincia;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getNombreProvincia() {
		return nombreProvincia;
	}
	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	

}
