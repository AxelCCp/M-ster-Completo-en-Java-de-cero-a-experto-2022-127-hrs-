package A1_151_ClasesRelacionadas;

import A0_poo.A3_146_Color;
import A0_poo.A4_147_TipoAutomovil;

public class Z_Main {
	public static void main(String[] args) {
		A0_151_Automovil subaru = new  A0_151_Automovil("Subaru","Impreza");
		subaru.setMotor(new A1_151_Motor(2.0,A4_151_TipoMotor.DIESEL));
		subaru.setEstanque(new A5_151_Estanque());
		subaru.setColor(A3_146_Color.AZUL);
		subaru.setTipo(A4_147_TipoAutomovil.HATCHBACK);
		A2_151_Persona conductorSubaru = new A2_151_Persona("Luci", "Martínez");
		subaru.setConductor(conductorSubaru);
		
		A3_151_Rueda[]ruedasSub = new A3_151_Rueda[5];
		for(int i=0;i<ruedasSub.length;i++) {
			//ruedasSub[i] = new A3_151_Rueda("Yokohama", 16, 7.5);
			subaru.addRueda(new A3_151_Rueda("Yokohama", 16, 7.5));
		}
		//subaru.setRuedas(ruedasSub);
		
		/*
		A0_151_Automovil mazda = new A0_151_Automovil("Mazda","BT-50",A3_146_Color.ROJO, new A1_151_Motor(3.0, A4_151_TipoMotor.BENCINA), new A5_151_Estanque(45));
		A2_151_Persona conductorMazda = new A2_151_Persona("Juan","CaballoLoco");
		mazda.setConductor(conductorMazda);
		*/
		
		A0_151_Automovil mazda = new  A0_151_Automovil("Mazda","rrrrr");
		mazda.setMotor(new A1_151_Motor(2.0,A4_151_TipoMotor.DIESEL));
		mazda.setEstanque(new A5_151_Estanque());
		mazda.setColor(A3_146_Color.AZUL);
		mazda.setTipo(A4_147_TipoAutomovil.HATCHBACK);
		A2_151_Persona conductorMazda = new A2_151_Persona("Luci", "bbbbbbb");
		mazda.setConductor(conductorMazda);
		
		A3_151_Rueda[]ruedasMaz = new A3_151_Rueda[5];
		for(int i=0;i<ruedasMaz.length;i++) {
			//ruedasMaz[i] = new A3_151_Rueda("Michelin", 18, 10.5);
			mazda.addRueda(new A3_151_Rueda("Michelin", 18, 10.5));
		}		
		//mazda.setRuedas(ruedasMaz);
		
		
		System.out.println(subaru.detalle2());	
		subaru.detalleRuedas();
		System.out.println();
		System.out.println(mazda.detalle2());
		mazda.detalleRuedas();
		
	}
}
