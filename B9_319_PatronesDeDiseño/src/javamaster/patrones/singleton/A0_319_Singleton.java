package javamaster.patrones.singleton;

public class A0_319_Singleton {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			//ESTE ES UN PATR�N CREACIONAL.
			ConexionBDSingleton con = ConexionBDSingleton.getInstancia();
			System.out.println("con = " + con);
		}
		
		
		
	}
}
