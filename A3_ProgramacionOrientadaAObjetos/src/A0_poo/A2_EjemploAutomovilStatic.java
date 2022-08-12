package A0_poo;

public class A2_EjemploAutomovilStatic {
	public static void main(String[] args) {
		
		A1_Automovil auto1 = new A1_Automovil("suzuki", "xxxx", "verde", 3.0);
		A1_Automovil.setColorPatente(A3_146_Color.AMARILLO);
		
		System.out.println(auto1.detalle2());
		
		System.out.println();
		System.out.println(A1_Automovil.calcularConsumoEstatico(20, 40));
		
		A1_Automovil.setCapacidadEstanque2(500);
		System.out.println(A1_Automovil.calcularConsumoEstatico(20, 40));
		
		
		System.out.println();
		
		A1_Automovil auto3 = new A1_Automovil("suzuki", "qqqqq", "verde", 3.0);
		A1_Automovil auto4 = new A1_Automovil("suzuki", "aaaaa", "verde", 3.0);
		A1_Automovil auto5 = new A1_Automovil("suzuki", "sssss", "verde", 3.0);
		
		System.out.println(auto3.detalle2());
		System.out.println();
		System.out.println(auto4.detalle2());
		System.out.println();
		System.out.println(auto5.detalle2());
		
		System.out.println(A1_Automovil.VELOCIDAD_MAX_CARRETERA);
		
		 
	}
}
