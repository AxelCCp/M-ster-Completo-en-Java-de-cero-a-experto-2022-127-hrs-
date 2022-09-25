package com.poo.app.clasesGenericas;

public class MainGenericos {
	public static void main(String[] args) {
		CamionConObject transporteCaballos = new CamionConObject(5);
		transporteCaballos.add(new Animal("Burro","Burro"));
		transporteCaballos.add(new Animal("Regalo","Caballo"));
		transporteCaballos.add(new Animal("Porky","Chancho"));
		transporteCaballos.add(new Animal("quien sabe","Buey"));
		transporteCaballos.add(new Animal("nosé","Ratón"));
		
		for(Object o : transporteCaballos) {
			Animal a = (Animal) o;
			System.out.println(a.getNombre() + " " + a.getTipo());
		}
		
		System.out.println("");
		
		CamionConGenerico<Maquinaria>transporteMaquinaria = new CamionConGenerico<>(3);
		transporteMaquinaria.add(new Maquinaria("Bulldozer"));
		transporteMaquinaria.add(new Maquinaria("Retro"));
		transporteMaquinaria.add(new Maquinaria("Tractor"));
		
		for(Maquinaria m : transporteMaquinaria) {
			System.out.println(m.getTipo());
		}
		
		System.out.println("");
		
		CamionConGenerico<Automovil>transporteAutos = new CamionConGenerico<>(4);
		transporteAutos.add(new Automovil("Hammer"));
		transporteAutos.add(new Automovil("Chevrolet"));
		transporteAutos.add(new Automovil("Lambo"));
		transporteAutos.add(new Automovil("Nissan"));
		imprimeCamion(transporteAutos);
	}
	
	public static <T> void imprimeCamion(CamionConGenerico<T> camion){
		for(T a : camion) {
			if(a instanceof Automovil) {
				System.out.println(((Automovil)a).getMarca());
			}
		}
	}
	
}
