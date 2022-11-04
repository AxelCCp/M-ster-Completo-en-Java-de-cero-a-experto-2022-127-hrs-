package javamaster.hilos.main;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//CLASE266
//1.-LA CLASE TIMER PERMITE AGREGAR TAREAS Y PROGRAMARLAS.
//2.-schedule() : METODO PARA AGENDAR TAREAS.
//3.-TIMER TASK : TAREA.
//4.-timer.cancel() : SE TERMINA LA TAREA.
//5.-LAS TAREAS SE REPITEN CADA 5 SEG.

public class A8_267_MainAgendarTareaPeriodica_Timer_TimerTask {
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		
		//1
		Timer timer = new Timer(); 
		//2                    //3
		timer.schedule(new TimerTask() {
			private int contador = 3;
			@Override
			public void run() {
				if(contador > 0) {
					toolkit.beep();
					System.out.println("Tarea periódica en: " + new Date() + " nombre del Thread: " + Thread.currentThread().getName());
					contador--;
				}else {
					System.out.println("Finaliza el tiempo");
					//4
					timer.cancel();
				}
				
			}
			     //5
		}, 5000, 5000);
		
		System.out.println("Agendamos una tarea para 5 segundos más");
	}
}
