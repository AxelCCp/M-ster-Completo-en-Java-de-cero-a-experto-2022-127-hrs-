package A0_poo;

public enum A3_146_Color {
	//ES UNA COLECCIÓN DE VALORES CONSTANTES
	//EL CONTENIDO DE LA CONSTANTE EN EL MISMO QUE SU NOMBRE... EL CONTENIDO DE ROJO ES ROJO.
	/*
	ROJO,
	AMARILLO,
	AZUL,
	BLANCO,
	GRIS,
	NARANJO;
	*/
	
	//OTRA MANERA 
	ROJO("rojo"),
	AMARILLO("amarillo"),
	AZUL("azul"),
	BLANCO("blanco"),
	GRIS("gris"),
	NARANJO("naranjo");

	private final String color;
	
	A3_146_Color(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	//CON ESTE IMPRIME EL VALOR QUE SE LE DIO ENTRE "". SI SE QUITA IMPRIME EL VALOR EN MAYUSCULAS.
	public String toString() {
		return this.color;
	}
}
