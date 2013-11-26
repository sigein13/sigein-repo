package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TipoDNI {
	private static List<String> tipoDNI = new ArrayList<String>();
	
	
//Agrego los tipos de DNI, quizá haya que traerlos de la BD
	static{
		tipoDNI.add("DNI");
		tipoDNI.add("LE");
		tipoDNI.add("LC");
    }
	
	public static final List<String> getTipoDNI() {
        return new ArrayList<String>(tipoDNI);
    }
}
