package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TipoInmueble {
	private static List<String> tipoInmueble = new ArrayList<String>();
	
	
//Agrego los tipos de Inmueble, quizá haya que traerlos de la BD
	static{
		tipoInmueble.add("L");
		tipoInmueble.add("C");
		tipoInmueble.add("D");
		tipoInmueble.add("T");
		tipoInmueble.add("Q");
		tipoInmueble.add("G");
    }
	
	public static final List<String> getTipoInmueble() {
        return new ArrayList<String>(tipoInmueble);
    }
}
