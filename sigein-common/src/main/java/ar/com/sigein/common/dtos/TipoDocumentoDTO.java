package ar.com.sigein.common.dtos;

public class TipoDocumentoDTO extends BaseDTO {
	private int numero;
	private String tipoDoc;
	public TipoDocumentoDTO(int numero, String tipoDoc) {
		super();
		this.numero = numero;
		this.tipoDoc = tipoDoc;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	
	
}
