package clases;
import java.util.ArrayList;
import java.util.List;

public class Localidad {
	
	private static List<String> localidades= new ArrayList<String>();
	
		
	//Agrego las localidades.. Hay que ver como vamos a hacer el filtrado, para que aparezcan las localidades que están, donde las vamos a cargar y demás.
		static{
			localidades.add("Santa Fe");
			localidades.add("Santo Tomé");
			localidades.add("Paraná");
	    }
		
		public static final List<String> getLocalidad() {
	        return new ArrayList<String>(localidades);
	    }
}


