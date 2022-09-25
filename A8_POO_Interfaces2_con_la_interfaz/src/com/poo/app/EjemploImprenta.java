package com.poo.app;

import com.poo.app.modelo.Curriculo;
import com.poo.app.modelo.Genero;
import com.poo.app.modelo.Hoja;
import com.poo.app.modelo.Imprimible;
import com.poo.app.modelo.Informe;
import com.poo.app.modelo.Libro;
import com.poo.app.modelo.Pagina;

public class EjemploImprenta {
	public static void main(String[] args) {
		Curriculo cv = new Curriculo("jon doe", "ing en sistemas", "resumen laboral");
		cv.addExperiencia("Java");
		cv.addExperiencia("Oracle DBA");
		cv.addExperiencia("Spring Framework");
		cv.addExperiencia("Desarrollador fullstack");
		cv.addExperiencia("angular");
		Informe informe = new Informe("Estudio sobre microservicios", "Martín Fowler", "James");
		imprimir(cv);
		imprimir(informe);
		
		Libro libro = new Libro("YOH","Java", Genero.CIENCIA_FICCION);
		libro.addPagina(new Pagina("Patrón singleton")).addPagina(new Pagina("Patrón conservador")).addPagina(new Pagina("Matrices"));
		//imprimir(libro);
		//----
	}
	public static void imprimir(Imprimible imprimible) {
		System.out.println(imprimible.imprimir());
	}
}
