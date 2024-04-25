package clonador;

import persona.*;
import java.util.List;
import java.util.ArrayList;

public class ClonadorPersona {

	
	private String nombre;

	
	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}
	
	
	public List<Persona> clonarPersonas() {
		List<Persona> personas = new ArrayList<Persona>();
	    
		for (int i=0; i<10; i++) {
			try {
				int edad = (int) (Math.random()*PersonaData.EDAD_MAX + PersonaData.EDAD_MIN);
				double peso = (double) (Math.random()*PersonaData.PESO_MAX + PersonaData.PESO_MIN);
				double altura = (double) (Math.random()*PersonaData.ALTURA_MAX + PersonaData.ALTURA_MIN);
				Persona newPersona = new Persona(nombre, edad, peso, altura);
				personas.add(newPersona);
			}
			catch (Exception e){
				System.out.println("Error al crear el clon" + e.getMessage());
			}

		}
		
		return personas;  
	}
	
	
	
	
}
