package A1_151_ClasesRelacionadas;

public class A1_151_Motor {
	
	public A1_151_Motor() {
	}
	public A1_151_Motor(double cilindrada, A4_151_TipoMotor tipo) {
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public A4_151_TipoMotor getTipo() {
		return tipo;
	}
	public void setTipo(A4_151_TipoMotor tipo) {
		this.tipo = tipo;
	}
	private double cilindrada;
	private A4_151_TipoMotor tipo;
	
}
