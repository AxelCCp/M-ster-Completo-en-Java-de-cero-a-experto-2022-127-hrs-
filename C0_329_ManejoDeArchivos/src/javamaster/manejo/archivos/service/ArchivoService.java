package javamaster.manejo.archivos.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoService {
	/*
	public void crearArchivo(String nombre) {
		File archivo = new File(nombre);
		try {
			FileWriter escritor = new FileWriter(archivo);
			BufferedWriter buffer = new BufferedWriter(escritor);
			buffer.append("hola que tal!").append("asjkdhakjshdasjhdlhhhhhhhhhjjjjjjja");
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	
	public void crearArchivo(String nombre) {
		File archivo = new File(nombre);
		try(BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo))) {
			buffer.append("hola que tal!").append("asjkdhakjshdasjhdlhhhhhhhhhjjjjjjja");
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void crearArchivo2(String nombre) {
		File archivo = new File(nombre);
		try(PrintWriter buffer = new PrintWriter(new FileWriter(archivo))) {
			buffer.println("hola que tal!");
			buffer.println("teqruyeuytoiueyrtiuewyriutyeworutyoewy");
			buffer.printf("hasta luego %s", "chipamogli XD");
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String leerArchivo(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(archivo));
			String linea;
			while((linea = reader.readLine()) != null) {
				sb.append(linea).append("\n");
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public String leerArchivo2(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try {
			Scanner s = new Scanner(archivo);
			s.useDelimiter("\n");
			while(s.hasNext()) {
				sb.append(s.next()).append("\n");
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
