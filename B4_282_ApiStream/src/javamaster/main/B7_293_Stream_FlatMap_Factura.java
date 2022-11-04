package javamaster.main;

import java.util.Arrays;
import java.util.List;

import javamaster.model.Factura;
import javamaster.model.Usuario;

public class B7_293_Stream_FlatMap_Factura {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("John","Doe");
		Usuario u2 = new Usuario("Pepe","Perez");
		
		u1.addFactura(new Factura("Compras tecnología"));
		u1.addFactura(new Factura("Compras muebles"));
		u2.addFactura(new Factura("Compras bicibleta"));
		u2.addFactura(new Factura("Compras notebook"));
		
		List<Usuario>usuarios = Arrays.asList(u1,u2);
		
		/*for(Usuario u : usuarios) {
			for(Factura f : u.getFacturas()) {
				System.out.println(f.getDescripcion());
			}
		}*/
		
		usuarios.stream()
			.flatMap(u -> u.getFacturas().stream()).forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ").concat(f.getUsuario().toString())));
		
	}
	
}
