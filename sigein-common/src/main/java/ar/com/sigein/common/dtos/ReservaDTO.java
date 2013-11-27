package ar.com.sigein.common.dtos;

public class ReservaDTO extends BaseDTO {
	
	private int idReserva;
	private int tiempoReserva;
	private int monto;
	private ClienteDTO cliente;
	private InmuebleDTO inmueble;
	
	public ReservaDTO(int idReserva, int tiempoReserva, int monto,
			ClienteDTO cliente, InmuebleDTO inmueble) {
		super();
		this.idReserva = idReserva;
		this.tiempoReserva = tiempoReserva;
		this.monto = monto;
		this.cliente = cliente;
		this.inmueble = inmueble;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getTiempoReserva() {
		return tiempoReserva;
	}

	public void setTiempoReserva(int tiempoReserva) {
		this.tiempoReserva = tiempoReserva;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public InmuebleDTO getInmueble() {
		return inmueble;
	}

	public void setInmueble(InmuebleDTO inmueble) {
		this.inmueble = inmueble;
	}
	
	
}
