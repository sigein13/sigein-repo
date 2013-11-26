package clasesDAO;

public class ReservaDAO extends BaseDAO {
	
	private int idReserva;
	private int tiempoReserva;
	private int monto;
	private ClienteDAO cliente;
	private InmuebleDAO inmueble;
	
	public ReservaDAO(int idReserva, int tiempoReserva, int monto,
			ClienteDAO cliente, InmuebleDAO inmueble) {
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

	public ClienteDAO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDAO cliente) {
		this.cliente = cliente;
	}

	public InmuebleDAO getInmueble() {
		return inmueble;
	}

	public void setInmueble(InmuebleDAO inmueble) {
		this.inmueble = inmueble;
	}
	
	
}
