package A0_poo;

import java.awt.Color;

public class A5_148_EjemploAutomovilEnum {
	
	public static void main(String[] args) {
		
		A1_Automovil.setCapacidadEstanque2(45);
		A1_Automovil subaru = new A1_Automovil("Subaru", "Impreza");
		subaru.setCilindrada(2.0);
		//subaru.setColor(A3_146_Color.AZUL);
		subaru.setTipo(A4_147_TipoAutomovil.HATCHBACK);
		
		A4_147_TipoAutomovil tipoSubaru = subaru.getTipo();
		System.out.println("tipo subaru : " + tipoSubaru.getNombre());
		System.out.println("tipo desc. subaru : " + tipoSubaru.getDescripcion());
		
		switch(tipoSubaru) {
			case CONVERTIBLE:
				System.out.println("CONVERTIBLE...");
				break;
			case COUPE: 
				System.out.println("COUPE...");
				break;
			case FURGON:
				System.out.println("FURGON...");
				break;
			case HATCHBACK:
				System.out.println("HATCHBACK...");
				break;
			case PICKUP:
				System.out.println("PICKUP...");
				break;
			case SEDAN:
				System.out.println("SEDAN...");
				break;
			case STATION_WAGON:
				System.out.println("STATION_WAGON...");
				break;
		}
		
		A4_147_TipoAutomovil[]tipos = A4_147_TipoAutomovil.values();
		for(A4_147_TipoAutomovil ta :  tipos) {
			System.out.print(ta + " => " + ta.name() + ", " + ta.getNombre() + " " + ta.getDescripcion() + " " + ta.getNumeroPuertas());
			System.out.println();
		}
	}
}
