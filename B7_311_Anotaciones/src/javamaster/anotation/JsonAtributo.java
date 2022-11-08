package javamaster.anotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//PARA CONVERTIR UN OBJ A JSON

//@Inherited		//PARA  QUE SE APLIQUE A LA CLASE PADRE Y LAS CLASES HIJAS.
@Documented 	//PARA AGREGARLO A LA DOCUMENTACI�N.
@Target(ElementType.FIELD)	//DEFINE SOBRE QU� VA A ACTUAR LA ANOTACION. EN ESTE CASO SOBRE UN CAMPO. UNA VARIABLE.
@Retention(RetentionPolicy.RUNTIME)  //SE APLICA EN TIEMPO DE EJECUCI�N.
public @interface JsonAtributo {

	//SE LE PUEDEN AGREGAR ATRIBUTOS PROPIOS DE ESTA METADATA. LOS ATRIBUTOS SE PONEN COMO SI FUERAN M�TODOS. SE LE PUEDE PONER UN VALOR POR DEFECTO.
	String nombre() default "";
	boolean capitalizar() default false; 
	
}
