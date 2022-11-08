package javamaster.main;

import java.time.LocalDate;
import javamaster.model.Producto;
import javamaster.procesador.JsonSerializador;

//ESTÁ EN LA CLASE JsonSerializador:
//1.-AQUÍ SE PROCESAN LAS ANOTACIONES 
//2.-CON UN FILTRO SE PREGUNTA SI LA ANOTACIÓN ESTÁ PRESENTE.
//3.-SE CONVIERTE EL CAMPO DEL TIEMPO FIELD POR UN STREAM QUE CONTENGA LA ESTRUCTURA JSON.
//4.-SE ARMA EL JSON ESTO.
//5.-SE USA REDUCE PARA REDUCIR TODO EL FLUJO, TODOS LOS CAMPOS, CON UNA UNICA SALIDA CON LA ESTRUCTURA DEL JSON. SE ARMA LA WEA CON LAS LLAVES Y LAS COMAS.
//6.-PARA QUE LOS CAMPOS DE PRODUCTOS, QUE SON PRIVATE, PUEDAN SER ACCESIBLES. ESTO SE PUEDE MEDIANTE REFLEXIÓN.

public class A0_311_Principal {
	public static void main(String[] args) {
		Producto producto = new Producto();
		producto.setFecha(LocalDate.now());
		producto.setNombre("Mesa Roble");
		producto.setPrecio(1000L);
												//1,2,3,4,5,6
		System.out.println("JSON : " + JsonSerializador.convertirJson(producto));
	}
}
