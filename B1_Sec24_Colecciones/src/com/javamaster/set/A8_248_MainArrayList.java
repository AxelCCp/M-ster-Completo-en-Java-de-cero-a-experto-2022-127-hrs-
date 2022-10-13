package com.javamaster.set;

import java.util.ArrayList;
import java.util.List;

import com.javamaster.set.model.A1_245_Alumno;

public class A8_248_MainArrayList {
	public static void main(String[] args) {
		List<A1_245_Alumno>al= new ArrayList<>();
		System.out.println(al + ", size = " + al.size());
		System.out.println("está vacía = " + al.isEmpty());
		al.add(new A1_245_Alumno("Rey Pilaf",5));
		al.add(new A1_245_Alumno("Freezer", 3));
		al.add(new A1_245_Alumno("Gero", 6));
		al.add(2,new A1_245_Alumno("Rochi", 1));  							//SE DESPLAZA A LA POSICIÓN 2 Y GERO A LA 3
		al.add(new A1_245_Alumno("Ulon", 1)); 
		al.set(1,new A1_245_Alumno("Puar", 1)); 							//SET() NO DESPLAZA... MODIFICA ... PUAR ELIMINA A FREEZER
		al.add(new A1_245_Alumno("Khrilin",5));
		al.add(new A1_245_Alumno("Sr. tortuga",7));
		System.out.println(al + ", size = " + al.size());
		
		al.remove(new A1_245_Alumno("Khrilin",5));							//ELIMINA A Khrilin.... LOS DATOS SE DEBEN PASAR EXACTAMENTE =.
		
		al.remove(0);														//TAMBIÉN ELIMINA POR INDICE.
		
		boolean b = al.contains(new A1_245_Alumno("Sr. tortuga",7));		//VERIFICAR SI UN ELEMENTO ESTÁ EN LA LISTA.
		System.out.println("La lista contiene a Sr. tortuga: " + b);
		
		System.out.println(al + ", size = " + al.size());
		
		System.out.println("CONVERTIR LA LISTA EN UN ARRAY ");
		Object[]a = al.toArray();											//CONVERTIR LA LISTA EN UN ARRAY 
		for(Object x : al) {
			System.out.println(x);
		}
		
	}
}
