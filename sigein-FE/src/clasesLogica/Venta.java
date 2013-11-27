package clasesLogica;


public class Venta {
	private int idVenta;
	private int monto;
	private Inmueble inmueble;
	private Cliente cliente;
	
	public Venta(int idVenta, int monto, Inmueble inmueble,
			Cliente cliente) {
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
	public Inmueble getInmueble() {
		return inmueble;
	}
	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
