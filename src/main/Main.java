package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Participante> participantes = new ArrayList<Participante>();
		flyWeightFactory factory = new flyWeightFactory();
		
		participantes.add(factory.crearParticipante("jugador", "pepe"));
		participantes.add(factory.crearParticipante("jugador", "ragh"));
		participantes.add(factory.crearParticipante("entrenador", "toto"));
		participantes.add(factory.crearParticipante("jugador", "cheng"));
		
		for (Participante participante : participantes) {
			participante.mostarDatos();
		}
	}
	

}
