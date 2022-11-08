package javamaster.procesador;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import javamaster.anotation.Init;
import javamaster.anotation.JsonAtributo;
import javamaster.procesador.exceptions.JsonSerializadorException;

//CLASE 313
//1.- ES STATIC PQ RECIBE UN OBJ Y DEVUELVE UN OBJ DEL TIPO STRING.

//1.-AQUÍ SE PROCESAN LAS ANOTACIONES 
//2.-CON UN FILTRO SE PREGUNTA SI LA ANOTACIÓN ESTÁ PRESENTE.
//3.-SE CONVIERTE EL CAMPO DEL TIEMPO FIELD POR UN STREAM QUE CONTENGA LA ESTRUCTURA JSON.
//4.-SE ARMA EL JSON ESTO.
//5.-SE USA REDUCE PARA REDUCIR TODO EL FLUJO, TODOS LOS CAMPOS, CON UNA UNICA SALIDA CON LA ESTRUCTURA DEL JSON. SE ARMA LA WEA CON LAS LLAVES Y LAS COMAS.
//6.-PARA QUE LOS CAMPOS DE PRODUCTOS, QUE SON PRIVATE, PUEDAN SER ACCESIBLES. ESTO SE PUEDE MEDIANTE REFLEXIÓN.
//7.-ESTA WEA ES PA PONER LA PRIMERA LETRA EN MAYUSCULA.
//8.-SE PASA A UN ARREGLO EL VALOR DEL ATRIBUTO. Collectors.joining(" ") : AL FINAL SE PASA A STRING Y SE UNEN LOS ELEMENTOS DEL ARRAY CON JOINING().
//9.-METODO Q INICIALIZA EL OBJ ANTES DE CONVERTIR A JSON.
public class JsonSerializador {
	
	//9
	public static void inicializarObjeto(Object object) {
		if(Objects.isNull(object)) {
			throw new JsonSerializadorException("El obj a serializar no puede ser null");
		}
		Method[]metodos = object.getClass().getDeclaredMethods();
		Arrays.stream(metodos)
			.filter(m -> m.isAnnotationPresent(Init.class))
			.forEach(m -> {
				m.setAccessible(true);  //PARA ACCEDER AL INIT.
				try {
					m.invoke(object);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					throw new JsonSerializadorException("Error al serializar, no se puede iniciar el objeto. " + e.getMessage());
				} 
			});
	}
	
	
	public static String convertirJson(Object object) {
		
		if(Objects.isNull(object)) {
			throw new JsonSerializadorException("El obj a serializar no puede ser null");
		}
		
		inicializarObjeto(object);
		
		//1
		Field[]atributos = object.getClass().getDeclaredFields();
		
		return Arrays.stream(atributos)
				//2
				.filter(f -> f.isAnnotationPresent(JsonAtributo.class))
				//3
				.map(f -> {
					//6
					f.setAccessible(true);
					String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
							? f.getName()
							: f.getAnnotation(JsonAtributo.class).nombre();
					try {
						//7
						Object valor = f.get(object);
						if(f.getAnnotation(JsonAtributo.class).capitalizar() && valor instanceof String) {
							String nuevoValor = (String)valor;
							//8
							nuevoValor = Arrays.stream(nuevoValor.split(" "))
									.map(palabra -> palabra.substring(0,1).toUpperCase() + palabra.substring(1).toLowerCase()).collect(Collectors.joining(" "));
							//nuevoValor = nuevoValor.substring(0,1).toUpperCase() + nuevoValor.substring(1).toLowerCase();
							f.set(object, nuevoValor);
						}
						//
						return "\"" + nombre + "\":\"" + f.get(object) + "\"";	//4
					}catch(IllegalAccessException e) {
						throw new JsonSerializadorException("Error al serializar a json : " + e.getMessage());
					}
					//5
				}).reduce("{", (a,b) -> {
					if("{".equals(a)) {
						return a + b;
					}
					return a + ", " + b;
				}).concat("}");
	}
}
