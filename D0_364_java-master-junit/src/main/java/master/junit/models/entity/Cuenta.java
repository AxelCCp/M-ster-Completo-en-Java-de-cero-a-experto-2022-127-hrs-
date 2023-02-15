package master.junit.models.entity;

import java.math.BigDecimal;

import master.junit.exceptions.DineroInsuficienteException;

public class Cuenta {
	
	public Cuenta() {
		
	}

	public Cuenta(BigDecimal saldo, String persona) {
		this.saldo = saldo;
		this.persona = persona;
	}
	
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}	 
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cuenta) {
			return false;
		}
		Cuenta c = (Cuenta)obj;
		if(this.persona == null || this.saldo == null) {
			return false;
		}
		return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
	}
	
	
	public void debito(BigDecimal monto) {
		//SE RESTA
		BigDecimal nuevoSaldo = this.saldo.subtract(monto);
		if(nuevoSaldo.compareTo(BigDecimal.ZERO) < 0) {
			throw new DineroInsuficienteException("dinero insuficiente");
		}	
		this.saldo = nuevoSaldo;
	}
	
	public void credito(BigDecimal monto) {
		//SE SUMA
		this.saldo = this.saldo.add(monto);
	}


	private String persona;
	private BigDecimal saldo;
	private Banco banco;
	
}
