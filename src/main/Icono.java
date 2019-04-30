package main;

public class Icono {
	private byte[] imagen;
	private String tipo;
	
	public Icono(String tipo) {
		System.out.println("Cargando de una ruta un archivo de imagen");
		System.out.println("proceso cargante que ocupa memoria");
		this.tipo = tipo;
	}
	
	public void mostrarIcono() {
		System.out.println("mostrando incono: " + tipo);
	}
	
	
}
