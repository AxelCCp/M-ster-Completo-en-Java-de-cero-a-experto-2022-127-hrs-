package A0_poo;

public class A1_Automovil {
	
	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	private int capacidadEstanque = 40;
	
	public void detalle() {
		System.out.println("auto.fabricante : " + this.fabricante);
		System.out.println("auto.modelo : " + this.modelo);
		System.out.println("auto.cilindrada : " + this.cilindrada);
		System.out.println("auto.color : " + this.color);
	}
	
	public String detalle2() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nauto.fabricante : " + this.fabricante);
		sb.append("\nauto.modelo : " + this.modelo);
		sb.append("\nauto.cilindrada : " + this.cilindrada);
		sb.append("\nauto.color : " + this.color);
		return sb.toString();
	}
	
	public String acelerar(int rpm) {
		return "el auto " + fabricante + " acelerando a " + rpm + " rpm";
	}
	
	public String frenar() {
		return this.fabricante + " " + this.modelo + " frenando";
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;
	}
	
	public float calcularConsumo(int km, float porcentajeBensina) {
		return km/(capacidadEstanque*porcentajeBensina);
	}
	
	public float calcularConsumo(int km, int porcentajeBensina) {
		return km/(capacidadEstanque*(porcentajeBensina/100f));
	}
	
	public A1_Automovil() {
		
	}
	
	public A1_Automovil(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	public String getFabricante(){
		return this.fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCilindrada() {
		return this.cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCapacidadEstanque() {
		return this.capacidadEstanque;
	}
	public  void setCapacidadEstanque(int capacidadEstanque) {
		this.capacidadEstanque = capacidadEstanque;
	}
}
