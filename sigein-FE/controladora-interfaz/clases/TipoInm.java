package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TipoInm {
	private static List<String> tipoInm = new ArrayList<String>();
	
	
	//Agrego los tipos de DNI, quizá haya que traerlos de la BD
		static{
			tipoInm.add("Local");
			tipoInm.add("Casa");
			tipoInm.add("Departamento");
			tipoInm.add("Terreno");
			tipoInm.add("Quinta");
			tipoInm.add("Galpon");
	    }
		
		public static final List<String> getTipoInm() {
	        return new ArrayList<String>(tipoInm);
	    }
	

}
