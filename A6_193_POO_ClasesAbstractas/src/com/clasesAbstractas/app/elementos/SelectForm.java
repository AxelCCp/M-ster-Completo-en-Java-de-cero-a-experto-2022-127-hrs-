package com.clasesAbstractas.app.elementos;

import java.util.ArrayList;
import java.util.List;

import com.clasesAbstractas.app.elementos.select.Opcion;

public class SelectForm extends ElementoForm{

	@Override
	public String dibujarHtml() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("<select ");
		sb.append("name='").append(this.nombre)
		.append("'>");
		for(Opcion opcion : this.opciones) {
			sb.append("\n<option value='")
				.append(opcion.getValor())
				.append("'");
			
			if(opcion.isSelected()) {
				sb.append(" selected");
				this.valor = opcion.getValor();
			}
			
			sb.append(">").append(opcion.getNombre()).append("</option>");
		}
		sb.append("</select>");
		return sb.toString();
	}
	
	
	
	public SelectForm(String nombre) {
		super(nombre);
		this.opciones = new ArrayList<Opcion>();
		// TODO Auto-generated constructor stub
	}

	public SelectForm(String nombre, List<Opcion>opciones) {
		super(nombre);
		this.opciones = opciones;
		// TODO Auto-generated constructor stub
	}

	public SelectForm addOpcion(Opcion opcion) {
		this.opciones.add(opcion);
		return this;
	}

	private List<Opcion>opciones;
	
}
