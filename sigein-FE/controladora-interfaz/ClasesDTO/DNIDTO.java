package ClasesDTO;

public class DNIDTO extends BaseDTO{
	private String tipoDNI;
	private int numeroDNI;
	
	
	public DNIDTO(String tipoDNI, int numeroDNI) {
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


	public void setNumeroDNI(Integer numeroDNI) {
		this.numeroDNI = numeroDNI;
	}
	
	
}
