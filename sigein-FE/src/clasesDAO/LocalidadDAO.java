package clasesDAO;

public class LocalidadDAO extends BaseDAO {
	private int idLocalidad;
	private String nombreLocalidad;
	private ProvinciaDAO provincia;
	
	public LocalidadDAO(int idLocalidad, String nombreLocalidad,
			ProvinciaDAO provincia) {
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
	public ProvinciaDAO getProvincia() {
		return provincia;
	}
	public void setProvincia(ProvinciaDAO provincia) {
		this.provincia = provincia;
	}
	
}
