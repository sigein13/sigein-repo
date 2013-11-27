package clasesLogica;



public class Barrio {
	
	private int idBarrio;
	private String nombreBarrio;
	private Direccion direccion;
	public Barrio(int idBarrio, String nombreBarrio, Direccion direccion) {
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
