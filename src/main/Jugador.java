package main;

public class Jugador implements Participante{

	private String name;
	private Icono icono;
	
	public Jugador(String name, Icono icono) {
		super();
		this.name = name;
		this.icono = icono;
	}

	@Override
	public void mostarDatos() {
		System.out.println("jugador : " + name);
		icono.mostrarIcono();
	}
	
	
}
