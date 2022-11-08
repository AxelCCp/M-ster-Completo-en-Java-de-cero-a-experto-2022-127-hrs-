package javamaster.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)						//SE VA A USAR LA ANOTACIÓN EN UN MÉTODO
public @interface Init {

	
	
}
