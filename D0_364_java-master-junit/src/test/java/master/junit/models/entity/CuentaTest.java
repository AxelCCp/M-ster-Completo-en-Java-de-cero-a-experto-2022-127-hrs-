package master.junit.models.entity;

import java.math.BigDecimal;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import master.junit.exceptions.DineroInsuficienteException;

class CuentaTest {

	Cuenta cuenta;
	
	@BeforeEach //SE EJECUTA ANTES DE CADA MÉTODO.
	void initMetodoTest() {
		System.out.println("iniciando el método");
		//cuenta = new Cuenta(new BigDecimal("1000.12345"), "Andres");				//SE PUEDE REUTILIZAR. QUITA LOS cuenta CON ESTOS MISMOS DATOS EN LOS OTROS METODOS Y REUTILIZA ESTE.
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("finalizando el método de prueba");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Inicializando el test.................");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("...................finalizando el test");
	}
	
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
	
	//PRUBAS CONDICIONALES
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testSoloWindows() {
		System.out.println("testSoloWindows");
	}
	@Test
	@EnabledOnOs(OS.LINUX)
	void testSoloLinux() {
		System.out.println("testSoloLinux");
	}
	@Test
	@EnabledOnOs(OS.MAC)
	void testSoloMac() {
		System.out.println("testSoloMac");
	}
	@Test
	@EnabledOnOs({OS.WINDOWS,OS.MAC})
	void testSoloWindows_y_mac() {
		System.out.println("testSoloWindows_y_mac");
	}
	@Test
	@DisabledOnOs(OS.WINDOWS)
	void testNO_windows() {
		System.out.println("testNO_windows");
	}
	@Test
	@DisabledOnOs(OS.LINUX)
	void testNO_linux() {
		System.out.println("testNO_linux");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void soloJava8() {
		System.out.println("soloJava8");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_12)
	void soloJava12() {
		System.out.println("soloJava12");
	}
	@Test
	@DisabledOnJre(JRE.JAVA_15)
	void noJava15() {
		System.out.println("noJava15");
	}
	
	
	@Test
	void systemProperties() {
		System.out.println("----------------------------------------------------");
		Properties properties = System.getProperties();
		properties.forEach((key,value) -> System.out.println(key + " : " + value));
		System.out.println("----------------------------------------------------");
	}
	
	
	@Test
	@DisabledIfSystemProperty(named = "user.name", matches = ".*32.*") 
	void testSolo64() {
		System.out.println("testSolo64");
	}
	
	
	//CLASE 378 ...
}

