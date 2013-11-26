package ClasesDTO;

public class EstadoInmuebleDTO extends BaseDTO {
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public EstadoInmuebleDTO(String estado) {
		super();
		this.estado = estado;
	}
	

}
