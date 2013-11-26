package clasesDAO;

public class VentaDAO extends BaseDAO {
	private int idVenta;
	private int monto;
	private InmuebleDAO inmueble;
	private ClienteDAO cliente;
	
	public VentaDAO(int idVenta, int monto, InmuebleDAO inmueble,
			ClienteDAO cliente) {
		super();
		this.idVenta = idVenta;
		this.monto = monto;
		this.inmueble = inmueble;
		this.cliente = cliente;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public InmuebleDAO getInmueble() {
		return inmueble;
	}
	public void setInmueble(InmuebleDAO inmueble) {
		this.inmueble = inmueble;
	}
	public ClienteDAO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDAO cliente) {
		this.cliente = cliente;
	}
	
	
}
