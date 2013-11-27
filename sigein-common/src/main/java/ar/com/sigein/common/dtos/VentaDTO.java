package ar.com.sigein.common.dtos;

public class VentaDTO extends BaseDTO {
	private int idVenta;
	private int monto;
	private InmuebleDTO inmueble;
	private ClienteDTO cliente;
	
	public VentaDTO(int idVenta, int monto, InmuebleDTO inmueble,
			ClienteDTO cliente) {
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
	public InmuebleDTO getInmueble() {
		return inmueble;
	}
	public void setInmueble(InmuebleDTO inmueble) {
		this.inmueble = inmueble;
	}
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	
	
}
