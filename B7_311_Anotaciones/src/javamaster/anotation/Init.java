package javamaster.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)						//SE VA A USAR LA ANOTACI�N EN UN M�TODO
public @interface Init {

	
	
}
