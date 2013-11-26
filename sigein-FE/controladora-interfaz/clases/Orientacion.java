package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Orientacion {
	private static List<String> orientacion = new ArrayList<String>();
	
	
//Agrego los tipos de DNI, quizá haya que traerlos de la BD
	static{
		orientacion.add("Norte");
		orientacion.add("Sur");
		orientacion.add("Este");
		orientacion.add("Oeste");
		orientacion.add("Noreste");
		orientacion.add("Noroeste");
		orientacion.add("Sureste");
		orientacion.add("Suroeste");
    }
	
	public static final List<String> getOrientaciones() {
        return new ArrayList<String>(orientacion);
    }
}
