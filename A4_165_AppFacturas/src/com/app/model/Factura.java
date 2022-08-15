package com.app.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	
	
	
	public Factura(String descripcion, Cliente cliente) {
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.items = new ItemFactura[MAX_ITEMS];
		this.folio = ++ultimoFolio;
		this.fecha = new Date();
	}
	public int getFolio() {
		return folio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public ItemFactura[] getItems() {
		return items;
	}
	public void addItemFactura(ItemFactura item) {
		if(indiceItems<Factura.MAX_ITEMS) {
			this.items[indiceItems++] = item;
		}
		
	}

	
	public float calcularTotal() {
		float total = 0.0f;
		for(ItemFactura item : this.items) {
			if(item==null) {
				continue; //PARA SALTARSE ESTA WEA total += item.calcularImporte(); 
			}
			total += item.calcularImporte(); 
		}
		return total;
	}
	
	public String generarDetalle() {
		StringBuilder sb = new StringBuilder("Factura N°: ");
		sb.append(folio)
		.append("\nCliente: ")
		.append(this.cliente.getNombre())
		.append("\t NIF: ")
		.append(cliente.getNif())
		.append("\nDescripción: ")
		.append(this.descripcion)
		.append("\n");
		SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
		sb.append("Fecha Emisión: ").append(df.format(this.fecha)).append("\n")
		.append("\n#\tNombre\t$\tCant.\nTotal\n");
		
		for(ItemFactura item : this.items) {
			if(item == null) {
				continue;
			}
			sb.append(item.getProducto().getCodigo())
			.append("\t")
			.append(item.getProducto().getNombre())
			.append("\t")
			.append(item.getProducto().getPrecio())
			.append("\t")
			.append(item.getCantidad())
			.append("\t")
			.append(item.calcularImporte())
			.append("\n");
		}
		sb.append("\nGranTotal: ").append(calcularTotal());
		return sb.toString();
	}
	
	
	private int folio;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private ItemFactura[]items;
	private int indiceItems;
	public static int MAX_ITEMS = 12;
	private static int ultimoFolio;
}
