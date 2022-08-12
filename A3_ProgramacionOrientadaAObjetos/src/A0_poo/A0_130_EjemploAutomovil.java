package A0_poo;

public class A0_130_EjemploAutomovil {
	public static void main(String[] args) {
		A1_Automovil auto = new A1_Automovil();
		auto.setFabricante("subaru");
		auto.setModelo("Impreza");
		auto.setCilindrada(2.0); 
		auto.setColor("Blanco"); 
		System.out.println("auto.fabricante : " + auto.getFabricante());
		System.out.println("auto.modelo : " + auto.getModelo());
		System.out.println("auto.cilindrada : " + auto.getCilindrada());
		System.out.println("auto.color : " + auto.getColor());
		System.out.println();
		
		A1_Automovil mazda = new A1_Automovil();
		mazda.setFabricante("mazda");
		mazda.setModelo("bt50"); 
		mazda.setCilindrada(3.0);
		mazda.setColor("gris"); 
		mazda.detalle();
		System.out.println();
		System.out.println(mazda.detalle2());
		System.out.println();
		System.out.println(mazda.acelerar(3000));
		System.out.println(mazda.frenar());
		
		System.out.println();
		System.out.println(mazda.acelerarFrenar(5000));
		System.out.println();
		System.out.println("Kilómetros x litro : " + mazda.calcularConsumo(300, 0.75f));
		System.out.println();
		System.out.println("Kilómetros x litro : " + mazda.calcularConsumo(300, 75));
		System.out.println();
		A1_Automovil honda = new A1_Automovil("Honda","fhfssdsd");
		System.out.println(honda.getFabricante());
		System.out.println(honda.getModelo());
		
		
		A1_Automovil suzuki = new A1_Automovil("suzuki", "xxxx", "verde", 3.0);
		System.out.println(suzuki.detalle2());
		
		A1_Automovil suzuki2 = new A1_Automovil("suzuki", "xxxx", "verde", 3.0);
		System.out.println("Polimorfismo .... tambn se pueden modificar métodos de clases de java");
		System.out.println("Son iguales? " + (suzuki==suzuki2));
		System.out.println("Son iguales? " + suzuki.equals(suzuki2));
		
		
		
	}

	
}
