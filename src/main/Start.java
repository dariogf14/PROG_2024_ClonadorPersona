package main;

import persona.*;
import clonador.*;
import java.util.List;

public class Start {

	public static void main(String[] args) {

		ClonadorPersona clonador = new ClonadorPersona("Darío");
        List<Persona> personas = clonador.clonarPersonas();

        System.out.println("Personas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
		
	}

}
