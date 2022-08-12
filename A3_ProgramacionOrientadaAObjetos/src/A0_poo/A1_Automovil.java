package A0_poo;

public class A1_Automovil {
	
	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	private int capacidadEstanque = 40;
	private static A3_146_Color colorPatente = A3_146_Color.NARANJO;
	private static int capacidadEstanque2 = 40;
	private int id;
	private static int ultimoId;
	public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
	public static final Integer VELOCIDAD_MAX_CIUDAD = 60;
	
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
		sb.append("\nColorPatente : " + colorPatente);
		sb.append("\nId : " + this.id);
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
	
	public static float calcularConsumoEstatico(int km, int porcentajeBensina) {
		return km/(A1_Automovil.capacidadEstanque2*(porcentajeBensina/100f));
	}
	
	public A1_Automovil() {
		this.id = ++ultimoId;
	}
	
	public A1_Automovil(String fabricante, String modelo) {
		this();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	public A1_Automovil(String fabricante, String modelo, String color) {
		//this.fabricante = fabricante;
		//this.modelo = modelo;
		this(fabricante,modelo);
		this.color = color;
	}
	
	public A1_Automovil(String fabricante, String modelo, String color, double cilindrada) {
		//this.fabricante = fabricante;
		//this.modelo = modelo;
		//this.color = color;
		this(fabricante,modelo,color);
		this.cilindrada = cilindrada;
	}
	
	public A1_Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.cilindrada = cilindrada;
		this.capacidadEstanque = capacidadEstanque;
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
	public static A3_146_Color getColorPatente() {
		return colorPatente;
	}
	public static void setColorPatente(A3_146_Color colorPatente) {
		A1_Automovil.colorPatente = colorPatente;
	}
	public static int getCapacidadEstanque2() {
		return A1_Automovil.capacidadEstanque2;
	}
	public  static void setCapacidadEstanque2(int capacidadEstanque2) {
		A1_Automovil.capacidadEstanque2 = capacidadEstanque2;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//SOBREESCRIBIENDO EL MÉTODO EQUALS() PARA Q COMPARE POR EL FABRICANTE Y EL MODELO
	@Override
	public boolean equals(Object obj) {
		A1_Automovil a = (A1_Automovil) obj;
		return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
	}
	
}
