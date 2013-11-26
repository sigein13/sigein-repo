package clases;

import java.util.ArrayList;
import java.util.List;

public class Barrio {

	private static List<String> barrios= new ArrayList<String>();
	
	
	//Agrego las localidades.. Hay que ver como vamos a hacer el filtrado, para que aparezcan las localidades que están, donde las vamos a cargar y demás.
			static{
				barrios.add("Guadalupe");
				barrios.add("Sur");
				barrios.add("Candioti");
		    }
		
		public static final List<String> getBarrio() {
	        return new ArrayList<String>(barrios);
	    }

}
