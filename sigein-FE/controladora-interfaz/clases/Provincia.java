package clases;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Provincia {
	
	private static List<String> provincias= new ArrayList<String>();
	
		
	//Agrego las provincias, quizá haya que traerlos de la BD
		static{
			provincias.add("Santa Fe");
			provincias.add("Buenos Aires");
			provincias.add("Entre Ríos");
	    }
		
		public static final List<String> getProvincia() {
	        return new ArrayList<String>(provincias);
	    }
}


