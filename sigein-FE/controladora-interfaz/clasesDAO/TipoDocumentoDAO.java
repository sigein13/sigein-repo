package clasesDAO;

public class TipoDocumentoDAO extends BaseDAO {
	private int numero;
	private String tipoDoc;
	public TipoDocumentoDAO(int numero, String tipoDoc) {
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
