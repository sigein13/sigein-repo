package clasesLogica;

public class DNI {
	private String tipoDNI;
	private int numeroDNI;
	
	
	public DNI(String tipoDNI, int numeroDNI) {
		super();
		this.tipoDNI = tipoDNI;
		this.numeroDNI = numeroDNI;
	}


	public String getTipoDNI() {
		return tipoDNI;
	}


	public void setTipoDNI(String tipoDNI) {
		this.tipoDNI = tipoDNI;
	}


	public int getNumeroDNI() {
		return numeroDNI;
}
	
}
