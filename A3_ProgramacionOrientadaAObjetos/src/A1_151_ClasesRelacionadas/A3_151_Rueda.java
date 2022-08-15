package A1_151_ClasesRelacionadas;

public class A3_151_Rueda {
	
	public A3_151_Rueda(String fabricante, int aro, double ancho) {
		this.fabricante = fabricante;
		this.aro = aro;
		this.ancho = ancho;
	}
	public String getFabricante() {
		return fabricante;
	}
	public int getAro() {
		return aro;
	}
	public double getAncho() {
		return ancho;
	}
	private String fabricante;
	private int aro;
	private double ancho;
}
