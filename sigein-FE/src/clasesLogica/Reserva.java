package clasesLogica;

public class Reserva {
	private int idReserva;
	private int tiempoReserva;
	private int monto;
	private Cliente cliente;
	private Inmueble inmueble;
	
	public Reserva(int idReserva, int tiempoReserva, int monto,
			Cliente cliente, Inmueble inmueble) {
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	
}
