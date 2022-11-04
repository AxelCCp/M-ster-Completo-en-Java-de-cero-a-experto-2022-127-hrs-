package javamaster.hilos.main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//CLASE266
//1.-LA CLASE TIMER PERMITE AGREGAR TAREAS Y PROGRAMARLAS.
//2.-schedule() : METODO PARA AGENDAR TAREAS.
//3.-TIMER TASK : TAREA.
//4.-timer.cancel() : SE TERMINA LA TAREA.

public class A7_266_MainAgendarTarea_Timer_TimerTask {
	public static void main(String[] args) {
		//1
		Timer timer = new Timer(); 
		//2                    //3
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("Tarea realizada en: " + new Date() + " nombre del Thread: " + Thread.currentThread().getName());

				System.out.println("Finaliza el tiempo");
				//4
				timer.cancel();
			}
			
		}, 5000);
		
		System.out.println("Agendamos una tarea para 5 segundos más");
	}
}
