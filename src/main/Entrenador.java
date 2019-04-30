package main;

public class Entrenador implements Participante{

	private String name;
	private Icono icono;
	
	public Entrenador(String name, Icono icono) {
		super();
		this.name = name;
		this.icono = icono;
	}

	@Override
	public void mostarDatos() {
		System.out.println("Entrenador : " + name);
		icono.mostrarIcono();
	}
	
	
}
