package clasesLogica;

public class Preferencias {
	
	private char tipoInmueble;
	private int dormitorios;
	private String localidad;
	private String provincia;
	private String barrio;
	private int precioDesde;
	private int precioHasta;
	
	public Preferencias(char tipoInmueble, int dormitorios, String localidad,
			String provincia, String barrio, int precioDesde, int precioHasta) {
		super();
		this.tipoInmueble = tipoInmueble;
		this.dormitorios = dormitorios;
		this.localidad = localidad;
		this.provincia = provincia;
		this.barrio = barrio;
		this.precioDesde = precioDesde;
		this.precioHasta = precioHasta;
	}
	public char getTipoInmueble() {
		return tipoInmueble;
	}
	public void setTipoInmueble(char tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}
	public int getDormitorios() {
		return dormitorios;
	}
	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public int getPrecioDesde() {
		return precioDesde;
	}
	public void setPrecioDesde(int precioDesde) {
		this.precioDesde = precioDesde;
	}
	public int getPrecioHasta() {
		return precioHasta;
	}
	public void setPrecioHasta(int precioHasta) {
		this.precioHasta = precioHasta;
	}
	
	
}
