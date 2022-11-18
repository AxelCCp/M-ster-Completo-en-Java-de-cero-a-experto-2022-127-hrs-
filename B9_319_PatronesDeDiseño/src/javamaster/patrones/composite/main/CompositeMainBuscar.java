package javamaster.patrones.composite.main;

import javamaster.patrones.composite.Archivo;
import javamaster.patrones.composite.Directorio;

public class CompositeMainBuscar {
	public static void main(String[] args) {
		Directorio doc = new Directorio("Documentos");
		Directorio java = new Directorio("Java");
		
		java.addComponente(new Archivo("patron-composite.docx"));
		Directorio stream = new Directorio("Api stream");
		stream.addComponente(new Archivo("stream-map.doc"));
		java.addComponente(stream);
		doc.addComponente(java);
		doc.addComponente(new Archivo("xxxxx.docx"));
		doc.addComponente(new Archivo("asfasfdf.jpg"));
		
		boolean encontrado = doc.buscar("patron-composite.docx");
		System.out.println("Encontrado : " + encontrado);
	}
}
