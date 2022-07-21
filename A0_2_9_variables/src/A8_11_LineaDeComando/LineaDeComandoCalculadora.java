package A8_11_LineaDeComando;

public class LineaDeComandoCalculadora {
	
	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("Por favor ingresar una operacion (suma, resta, multi, div... y 2 enteros");
			System.exit(-1);
		}
		
		
		String operacion = args[0];
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		double resultado = 0.00;
		
		switch(operacion) {
		case "suma": 
			resultado = a+b;
			break;
		case "resta":
			resultado = a-b;
			break;
		case "multi":
			resultado = a*b;
			break;
		case "div":
			if(b==0) {
				
				System.out.println("no se puede dividir por zero");
				System.exit(-1);
			}
			resultado = (double)a/b;
			break;
		default:
			resultado = a+b;
		}
		System.out.println("Resultado de la operacion '"+ operacion +"' es: " + resultado);
	}
}
