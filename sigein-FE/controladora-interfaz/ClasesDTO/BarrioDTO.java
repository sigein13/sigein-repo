package ClasesDTO;

public class BarrioDTO extends BaseDTO{
	
		private int idBarrio;
		private String nombreBarrio;
		private DireccionDTO direccion;
		public BarrioDTO(int idBarrio, String nombreBarrio, DireccionDTO direccion) {
			super();
			this.idBarrio = idBarrio;
			this.nombreBarrio = nombreBarrio;
			this.direccion = direccion;
		}
		public int getIdBarrio() {
			return idBarrio;
		}
		public void setIdBarrio(int idBarrio) {
			this.idBarrio = idBarrio;
		}
		public String getNombreBarrio() {
			return nombreBarrio;
		}
		public void setNombreBarrio(String nombreBarrio) {
			this.nombreBarrio = nombreBarrio;
		}
		public DireccionDTO getDireccion() {
			return direccion;
		}
		public void setDireccion(DireccionDTO direccion) {
			this.direccion = direccion;
		}
		
	}

