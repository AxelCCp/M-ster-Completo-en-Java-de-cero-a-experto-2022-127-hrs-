package javamaster.manejo.archivos.main;

import javamaster.manejo.archivos.service.ArchivoService;

public class MainCrearArchivo {
	public static void main(String[] args) {
		String nombreArchivo = "C:\\Users\\Fanta\\Documents\\archivo\\java.txt";
		
		ArchivoService servicio = new ArchivoService();
		servicio.crearArchivo2(nombreArchivo);
		
		
	}
}
