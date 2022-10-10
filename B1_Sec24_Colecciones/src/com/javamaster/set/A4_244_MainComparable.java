package com.javamaster.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.javamaster.set.model.A0_244_Alumno;

//CLASE 245
//1.-SE USA EL ORDENAMIENTO QUE SE DEFINIÓ EN LA CLASE A0_244_Alumno EN EL compareTo().
//2.-SE SOBRESCRIBE EL ORDENAMIENTO QUE VIENE DESDE A0_244_Alumno. SE USA NOMBRE PARA COMPARAR.
//3.-SE SOBRESCRIBE EL ORDENAMIENTO QUE VIENE DESDE A0_244_Alumno. SE USA NOTA PARA DAR ORDEN DESCENDENTE Y SE USA LAMBDA.
//CLASE246
//+COMPARETO() APLICA LA REGLA DE UNICIDAD DE LOS REGISTROS
//4.-SE FILTRAN LOS VALORES REPETIDOS SEGÚN EL GET Q SE USE. 
public class A4_244_MainComparable {
	public static void main(String[] args) {
		
		//1
		Set<A0_244_Alumno>sa= new TreeSet<>();
		sa.add(new A0_244_Alumno("Rey Pilaf",5));
		sa.add(new A0_244_Alumno("Freezer", 3));
		sa.add(new A0_244_Alumno("Gero", 6));
		sa.add(new A0_244_Alumno("Rochi", 1));
		System.out.println(sa);
		
		//2
		Set<A0_244_Alumno>sa2= new TreeSet<>(new Comparator<A0_244_Alumno>() {
			@Override
			public int compare(A0_244_Alumno o1, A0_244_Alumno o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
		sa2.add(new A0_244_Alumno("Rey Pilaf",5));
		sa2.add(new A0_244_Alumno("Freezer", 3));
		sa2.add(new A0_244_Alumno("Gero", 6));
		sa2.add(new A0_244_Alumno("Rochi", 1));
		System.out.println(sa2);
		
		//3
		Set<A0_244_Alumno>sa3= new TreeSet<>((a,b)->{
			//3... NO SE PUEDE HACER ESTA WEA PQ INT ES PRIMITIVO .... TIENE Q SER DE REFERENCIA INTEGER.
			//return a.getNota().compareTo(b.getNota());
			
			if(a.getNota() == b.getNota()) return 0;
			if(a.getNota() > b.getNota()) return -1;
			else return 1;
		});
		sa3.add(new A0_244_Alumno("Rey Pilaf",5));
		sa3.add(new A0_244_Alumno("Freezer", 3));
		sa3.add(new A0_244_Alumno("Gero", 6));
		sa3.add(new A0_244_Alumno("Rochi", 1));
		System.out.println(sa3);
		
		//4
		Set<A0_244_Alumno>sa4= new TreeSet<>((a,b)->{
			if(a.getNota() == b.getNota()) return 0;
			if(a.getNota() > b.getNota()) return -1;
			else return 1;
		});
		sa4.add(new A0_244_Alumno("Rey Pilaf",5));
		sa4.add(new A0_244_Alumno("Freezer", 3));
		sa4.add(new A0_244_Alumno("Gero", 6));
		sa4.add(new A0_244_Alumno("Rochi", 1));
		sa4.add(new A0_244_Alumno("Ulon", 1));      //NO APARECE PQ TIENE NOTA 1 IGUAL A ROCHI.
		System.out.println(sa4);
		
		Set<A0_244_Alumno>sa5= new TreeSet<>((a,b)->{
			return a.getNombre().compareTo(b.getNombre());
		});
		sa5.add(new A0_244_Alumno("Rey Pilaf",5));
		sa5.add(new A0_244_Alumno("Freezer", 3));
		sa5.add(new A0_244_Alumno("Gero", 6));
		sa5.add(new A0_244_Alumno("Rochi", 1));
		sa5.add(new A0_244_Alumno("Ulon", 1));      //APARECE PQ SE ESTÁ COMPARANDO POR NOMBRE Y NO ESTÁ REPETIDO SU NOMBRE.
		System.out.println(sa5);
		
		
		
	}
}
