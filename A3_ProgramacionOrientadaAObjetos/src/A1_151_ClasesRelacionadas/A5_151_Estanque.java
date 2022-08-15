package A1_151_ClasesRelacionadas;

public class A5_151_Estanque {
	
	
	//SE DESIGNA UNA CAPACIDAD POR DEFECTO EN 40
	public A5_151_Estanque() {
		this.capacidad = 40;
	}

	public A5_151_Estanque(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	private int capacidad;
}
