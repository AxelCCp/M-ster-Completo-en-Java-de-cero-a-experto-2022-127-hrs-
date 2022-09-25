
package com.clasesAbstractas.app.elementos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.clasesAbstractas.app.elementos.select.Opcion;

public class EjemploFormMain {
	public static void main(String[] args) {
		
		InputForm username = new InputForm("username");
		InputForm password = new InputForm("clave","password");
		InputForm email = new InputForm("email","email");
		InputForm edad = new InputForm("edad", "number");
		TextAreaForm experiencia = new TextAreaForm("exp",5,9);
		SelectForm lenguaje = new SelectForm("lenguaje");
		Opcion java = new Opcion("1","java");
		lenguaje.addOpcion(java);
		lenguaje.addOpcion(new Opcion("2","Python"));
		lenguaje.addOpcion(new Opcion("3","JavaScript"));
		lenguaje.addOpcion(new Opcion("4","C#"));
		ElementoForm saludar = new ElementoForm("Saludo") {
			@Override
			public String dibujarHtml() {
				// TODO Auto-generated method stub
				return "<input disabled name='" + this.nombre+"' value=\"" + this.valor + "\">";
			}
		};
		saludar.setValor("Hola que tal... este campo está deshabilitado");
		username.setValor("john doe");
		password.setValor("akdsñfdsa");
		email.setValor("askjhd@jhg");
		edad.setValor("28");
		experiencia.setValor("..... no mucha");
		java.setSelected(true);
		List<ElementoForm>elementos = new ArrayList<ElementoForm>();
		//List<ElementoForm>elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje);
		elementos.add(username);
		elementos.add(password);
		elementos.add(email);
		elementos.add(edad);
		elementos.add(experiencia);
		elementos.add(lenguaje);
		elementos.add(saludar);
		for(ElementoForm e :elementos) {
			System.out.println(e.dibujarHtml());
			System.out.println("<br>");
		}
		/*
		elementos.forEach(e -> {
			System.out.println(e.dibujarHtml());
			System.out.println("<br>");
		});
		*/
	}
}
