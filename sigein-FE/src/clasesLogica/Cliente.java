package clasesLogica;
public class Cliente {
	private int idCliente;
	private String nombreCliente;
	private String correoElectronicoCliente;
	private String apellidoCliente;
	private int telefonoCliente;
	private Preferencias preferenciaCliente;

	public Cliente(int idCliente,String nombreCliente, String correoElectronicoCliente,
			String apellidoCliente, int telefonoCliente, Preferencias preferencia) {
		super();
		this.setIdCliente(idCliente);
		this.nombreCliente = nombreCliente;
		this.correoElectronicoCliente = correoElectronicoCliente;
		this.apellidoCliente = apellidoCliente;
		this.telefonoCliente = telefonoCliente;
		this.preferenciaCliente=preferencia;
	}

	
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getCorreoElectronicoCliente() {
		return correoElectronicoCliente;
	}
	public void setCorreoElectronicoCliente(String correoElectronicoCliente) {
		this.correoElectronicoCliente = correoElectronicoCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public int getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(int telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}



	public Preferencias getPreferenciaCliente() {
		return preferenciaCliente;
	}



	public void setPreferenciaCliente(Preferencias preferenciaCliente) {
		this.preferenciaCliente = preferenciaCliente;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
