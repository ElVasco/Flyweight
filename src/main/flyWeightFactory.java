package main;

import java.util.HashMap;
import java.util.Map;

//Esta clase se va a encargar de gestionar las partes comunes
//que compartiran diferentes tipos de objetos
public class flyWeightFactory {

	Map<String, Icono> iconos = new HashMap<String, Icono>();
	
	public Participante crearParticipante(String tipo, String name) {
		
		if( !iconos.containsKey(tipo)) {
			iconos.put(tipo, new Icono(tipo));
		}
		if( tipo.equals("jugador")) {
			return new Jugador(name, iconos.get(tipo));
		}else if( tipo.equals("entrenador")) {
			return new Entrenador(name, iconos.get(tipo));
		}
		return null;
	}
}
