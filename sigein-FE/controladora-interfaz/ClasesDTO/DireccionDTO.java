package ClasesDTO;

public class DireccionDTO extends BaseDTO {
	private String nombreCalle;
	private int numeroCalle;
	private int departamento;
	private int piso;
	
	public DireccionDTO(String nombreCalle, int numeroCalle, int departamento,
			int piso) {
		super();
		this.nombreCalle = nombreCalle;
		this.numeroCalle = numeroCalle;
		this.departamento = departamento;
		this.piso = piso;
	}
	public String getNombreCalle() {
		return nombreCalle;
	}
	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	public int getNumeroCalle() {
		return numeroCalle;
	}
	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	public int getDepartamento() {
		return departamento;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	
	

}
