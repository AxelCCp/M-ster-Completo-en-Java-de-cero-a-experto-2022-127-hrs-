package A1_151_ClasesRelacionadas;


import A0_poo.A3_146_Color;
import A0_poo.A4_147_TipoAutomovil;

public class A0_151_Automovil {
	private int id;
	private String fabricante;
	private String modelo;
	private A3_146_Color color = A3_146_Color.GRIS;
	private A1_151_Motor motor;
	private A5_151_Estanque estanque;
	private A2_151_Persona conductor;
	private A3_151_Rueda[]ruedas;
	private A4_147_TipoAutomovil tipo;
	private static A3_146_Color colorPatente = A3_146_Color.NARANJO;
	private static int capacidadEstanqueEstatico = 30;
	private static int ultimoId;
	public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
	public static final Integer VELOCIDAD_MAX_CIUDAD = 60;
	private int indiceRuedas;
	
	
	public void detalle() {
		System.out.println("auto.fabricante : " + this.fabricante);
		System.out.println("auto.modelo : " + this.modelo);
		System.out.println("auto.cilindrada : " + this.motor);
		System.out.println("auto.color : " + this.color);
	}
	
	public String detalle2() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nauto.fabricante : " + this.fabricante);
		sb.append("\nauto.modelo : " + this.modelo);
		sb.append("\nauto.cilindrada : " + this.motor.getCilindrada());
		//sb.append("\nauto.color : " + this.color2.getColor());
		sb.append("\nColorPatente : " + colorPatente);
		sb.append("\nId : " + this.id);
		return sb.toString();
	}
	
	public String detalle3() {
		return "auto.tipo : " + this.getTipo().getDescripcion();
	}
	
	public void detalleRuedas() {
		for(A3_151_Rueda r : this.getRuedas()) {
			System.out.println(r.getFabricante() + " " + r.getAro() + " " + r.getAncho());
		}
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
		return km/(this.estanque.getCapacidad()*porcentajeBensina);
	}
	
	public float calcularConsumo(int km, int porcentajeBensina) {
		return km/(this.estanque.getCapacidad()*(porcentajeBensina/100f));
	}
	
	public static float calcularConsumoEstatico(int km, int porcentajeBensina) {
		return km/(A0_151_Automovil.capacidadEstanqueEstatico*(porcentajeBensina/100f));
	}
	
	public A0_151_Automovil() {
		this.id = ++ultimoId;
		this.ruedas = new A3_151_Rueda[5];
	}
	
	public A0_151_Automovil(String fabricante, String modelo) {
		this();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
	
	public A0_151_Automovil(String fabricante, String modelo, A3_146_Color color) {
		this(fabricante,modelo);
		this.color = color;
	}
	
	public A0_151_Automovil(String fabricante, String modelo, A3_146_Color color, A1_151_Motor motor) {
		this(fabricante,modelo,color);
		this.motor = motor;
	}
	
	public A0_151_Automovil(String fabricante, String modelo, A3_146_Color color, A1_151_Motor motor, A5_151_Estanque estanque) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
		this.estanque = estanque;
	}
	
	public A0_151_Automovil(String fabricante, String modelo, A3_146_Color color, A1_151_Motor motor,
			A5_151_Estanque estanque, A2_151_Persona conductor, A3_151_Rueda[] ruedas) {
		this(fabricante, modelo, color, motor, estanque);
		this.conductor = conductor;
		this.ruedas = ruedas;
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
	public A3_146_Color getColor() {
		return this.color;
	}
	public void setColor(A3_146_Color color) {
		this.color = color;
	}
	public static A3_146_Color getColorPatente() {
		return colorPatente;
	}
	public static void setColorPatente(A3_146_Color colorPatente) {
		A0_151_Automovil.colorPatente = colorPatente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public A4_147_TipoAutomovil getTipo() {
		return tipo;
	}
	public void setTipo(A4_147_TipoAutomovil tipo) {
		this.tipo = tipo;
	}
	public A1_151_Motor getMotor() {
		return motor;
	}
	public void setMotor(A1_151_Motor motor) {
		this.motor = motor;
	}
	public A5_151_Estanque getEstanque() {
		return estanque;
	}
	public void setEstanque(A5_151_Estanque estanque) {
		this.estanque = estanque;
	}
	public A2_151_Persona getConductor() {
		return conductor;
	}
	public void setConductor(A2_151_Persona conductor) {
		this.conductor = conductor;
	}
	public A3_151_Rueda[] getRuedas() {
		return ruedas;
	}
	public void setRuedas(A3_151_Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public void addRueda(A3_151_Rueda rueda) {
		this.ruedas[indiceRuedas++] = rueda; 
	}
	
	
	//SOBREESCRIBIENDO EL MÉTODO EQUALS() PARA Q COMPARE POR EL FABRICANTE Y EL MODELO
	@Override
	public boolean equals(Object obj) {
		A0_151_Automovil a = (A0_151_Automovil) obj;
		return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
	}
	
}
