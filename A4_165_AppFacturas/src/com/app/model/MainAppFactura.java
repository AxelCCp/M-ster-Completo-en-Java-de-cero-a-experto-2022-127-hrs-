package com.app.model;

import java.util.Scanner;

public class MainAppFactura {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNif("5555-5");
		cliente.setNombre("MSI");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa la descripción de la factura: ");
		String desc = scan.nextLine();
		Factura factura = new Factura(desc, cliente);
		
		Producto producto;
		String nombre;
		float precio;
		int cantidad;
		
		System.out.println();
		
		for(int i=0;i<5;i++) {
			producto = new Producto();
			System.out.print("Ingrese producto N° " + producto.getCodigo() + ": ");
			nombre = scan.nextLine();
			producto.setNombre(nombre);
			System.out.print("Ingresa el precio: ");
			precio = scan.nextFloat();
			producto.setPrecio(precio);
			System.out.print("Ingresa la cantidad: ");
			cantidad = scan.nextInt();
			ItemFactura item = new ItemFactura(cantidad, producto);
			factura.addItemFactura(item);
			System.out.println();
			scan.nextLine(); //ESTO ES PARA MOVER EL CURSOR Y NO TENER PROBLEMA CON DESCRIPCIONES DE PRODUCTO DE MAS DE UNA PALABRA (168 MIN 10). 
		}
		System.out.println(factura.generarDetalle());
	}
}
