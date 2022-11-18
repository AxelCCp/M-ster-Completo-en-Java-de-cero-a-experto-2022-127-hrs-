package javamaster.manejo.archivos.main;

import javamaster.manejo.archivos.service.ArchivoService;

public class MainLeerArchivo {
	public static void main(String[] args) {
		
		String nombreArchivo = "C:\\Users\\Fanta\\Documents\\archivo\\java.txt";
		ArchivoService servicio = new ArchivoService();
		System.out.println(servicio.leerArchivo2(nombreArchivo));
	}
}
