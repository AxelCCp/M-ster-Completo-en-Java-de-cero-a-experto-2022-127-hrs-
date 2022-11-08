package javamaster.main;

import javamaster.model.Componente;

//PARTES DE UN PC

public class PrincipalRecursividad {
	public static void main(String[] args) {
		Componente pc = new Componente("Gabinete PC ATX");
		Componente poder = new Componente("Fuente poder 700w");
		Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
		Componente cpu = new Componente("Cpu AMD Ryzen 5 2800");
		Componente ventilador = new Componente("Ventilador CPU");
		Componente disipador = new Componente("Disipador");
		Componente tarjetaVideo = new Componente("Nvidia RTX 3080 8GB");
		Componente gpu = new Componente("Nvidia GPU RTX");
		Componente gpuRam1 = new Componente("4GB Ram");
		Componente gpuRam2 = new Componente("4GB Ram");
		Componente gpuVentiladores = new Componente("Ventiladores");
		Componente ram = new Componente("Memoria Ram 32GB");
		Componente ssd = new Componente("Disco ssd 2T");
		
		cpu.addComponente(ventilador).addComponente(disipador);
		tarjetaVideo.addComponente(gpu).addComponente(gpuRam1).addComponente(gpuRam2).addComponente(gpuVentiladores);
		placaMadre.addComponente(cpu).addComponente(tarjetaVideo).addComponente(ram).addComponente(ssd);
		pc.addComponente(poder).addComponente(placaMadre).addComponente(new Componente("Teclado")).addComponente(new Componente("Mouse"));
		
		metodoRecursivo(pc, 0);
	}
	
	
	//MÉTODO RECURSIVO Q RECORRE LOS COMPONENTES
	public static void metodoRecursivo(Componente c, int nivel) {
		System.out.println("\t".repeat(nivel) + c.getNombre());
		if(c.tieneHijos()) {
			for(Componente hijo : c.getHijos()) {
				metodoRecursivo(hijo, nivel+1);
			}
		}
	}
	
	
	
}
