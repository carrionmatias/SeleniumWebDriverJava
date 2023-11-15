package Metodosutiles;

import org.testng.Reporter;

public class Utiles {
	
		public static void reportes (String mensaje) {
			Reporter.log(mensaje);
			System.out.println(mensaje);
		}
		public static void ThreadSleep2seg() {
	        // Esperar un breve momento para que aparezcan las sugerencias de autocompletar
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}
		public static void threadSleep3seg() {
	        // Esperar un breve momento para que aparezcan las sugerencias de autocompletar
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}
		public static void threadSleep5seg() {
	        // Esperar un breve momento para que aparezcan las sugerencias de autocompletar
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}

	}


