package master.junit.models.entity;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import master.junit.exceptions.DineroInsuficienteException;

class CuentaTest {

	@Test
	//@Disabled  //CON ESTA SE SALTA EL MÉTODO.
	@DisplayName("provando el nombre de la cuenta.")
	void testNombreCuenta() {
		Cuenta cuenta = new Cuenta();
		cuenta.setPersona("Andres");
		String esperado = "Andres";
		String real = cuenta.getPersona();
		Assertions.assertEquals(esperado,real,"En nombre no es el que se esperaba");
		Assertions.assertTrue(real.equals("Andres"));
		Assertions.assertTrue(real.equals("Andres"),"el nombre de la cuenta esperada debe ser ");
		Assertions.assertNotNull(real, "la cuenta no puede ser nula");
		//Assertions.fail();		//ESTO ES PARA FORZAR UN ERROR.
	}
	
	//366
	@Test
	void testSaldoCuenta() {
		Cuenta cuenta = new Cuenta(new BigDecimal("1000.12345"), "Andres");
		Assertions.assertEquals(1000.12345,cuenta.getSaldo().doubleValue());
		Assertions.assertFalse(cuenta.getSaldo().compareTo(new BigDecimal("0")) < 0);
	}
	
	//367
	@Test
	void testReferenciaCuenta() {
		Cuenta cuenta = new Cuenta(new BigDecimal("8900.9997"), "John Doe");
		Cuenta cuenta2 = new Cuenta(new BigDecimal("8900.9997"), "John Doe");
		Assertions.assertNotEquals(cuenta2, cuenta);
		//Assertions.assertEquals(cuenta2, cuenta);
	}
	
	@Test 
	void testDebitoCuenta() {
		Cuenta cuenta = new Cuenta(new BigDecimal("1000.12345"), "Andres");
		cuenta.debito(new BigDecimal(100)); //sacaste de tu cuenta
		Assertions.assertEquals(900, cuenta.getSaldo().intValue());
		Assertions.assertEquals("900.12345", cuenta.getSaldo().toPlainString());
	}

	@Test 
	void testCreditoCuenta() {
		Cuenta cuenta = new Cuenta(new BigDecimal("1000.12345"), "Andres");
		cuenta.credito(new BigDecimal(100)); //se agregó a la cuenta
		Assertions.assertEquals(1100, cuenta.getSaldo().intValue());
		Assertions.assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
	}
	
	@Test
	void testDineroInsuficienteException() {
		Cuenta cuenta = new Cuenta(new BigDecimal("1000.12345"), "Andres");	
		Exception exception = Assertions.assertThrows(DineroInsuficienteException.class, () -> {
			cuenta.debito(new BigDecimal(1500));
		});
		String actual = exception.getMessage();
		String esperado = "dinero insuficiente";
		Assertions.assertEquals(esperado, actual);
	}
	
	@Test
	void testTransferirDineroCuentas() {
		Cuenta cuenta1 = new Cuenta(new BigDecimal("2500"),"John Doe");
		Cuenta cuenta2 = new Cuenta(new BigDecimal("1500.8989"),"Andres");
		Banco banco = new Banco();
		banco.setNombre("Banco Estado");
		banco.transferir(cuenta2, cuenta1, new  BigDecimal(500));
		Assertions.assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
		Assertions.assertEquals("3000", cuenta1.getSaldo().toPlainString());
	}
	
	@Test
	void testRelacionBancoCuentas() {
		Cuenta cuenta1 = new Cuenta(new BigDecimal("2500"),"John Doe");
		Cuenta cuenta2 = new Cuenta(new BigDecimal("1500.8989"),"Andres");
		Banco banco = new Banco();
		banco.addCuenta(cuenta1);
		banco.addCuenta(cuenta2);
		banco.setNombre("Banco Estado");
		banco.transferir(cuenta2, cuenta1, new  BigDecimal(500));
		Assertions.assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
		Assertions.assertEquals("3000", cuenta1.getSaldo().toPlainString());
		//371
		Assertions.assertEquals(2, banco.getCuentas().size());
		Assertions.assertEquals("Banco Estado", cuenta1.getBanco().getNombre());
		Assertions.assertEquals("Andres", banco.getCuentas().stream().filter(c -> c.getPersona().equals("Andres")).findFirst().get().getPersona());
		Assertions.assertTrue(banco.getCuentas().stream().filter(c -> c.getPersona().equals("Andres")).findFirst().isPresent());
		
	}
}

