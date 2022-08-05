package N301;

import java.util.Scanner;

/**
 * Per fer aquest exercici necessites una interfície anomenada Telefon i tres
 * classes: Smartphone, Generica i la Principal.
 * 
 * La interfície Telefon ha de tenir un mètode anomenat trucar(). La classe
 * Smartphone ha d’implementar Telefon, i a més del mètode trucar(), també ha de
 * tenir el mètode ferFotos().
 * 
 * La classe Generica ha de tenir dos mètodes genèrics, el primer ha de rebre un
 * tipus d’argument limitat per la interfície Telefon i el segon ha de rebre un
 * argument limitat per la classe Smartphone. Des d’aquests dos mètodes crida
 * els mètodes pertinents de Telefon i Smartphone. En el main() de la classe
 * Principal, passa un objecte de la classe Smartphone als dos mètodes genèrics
 * de la classe Generica.
 * 
 * El mètode limitat per la interfície Telefon, de la classe Generica, pot
 * cridar al mètode ferFotos()?
 *
 */

public class Generic {
	
	static Scanner entrada = new Scanner(System.in);
	
	//Methods
	public static <T extends Telefono> String llamarGeneric(T t) {
		String mensaje = "";
		System.out.println("a que numero quieres llamar?");
		int numero = 0;
		numero = entrada.nextInt();
		entrada.nextLine();
		t.llamar(numero);
		// t. ... Desde este metodo limitado por Telefono no puedo llamar al metodo hacerfotos de la clase Smartphone.
		mensaje = t.toString() + " está llamando a " + numero;
		return mensaje;
	}
	
	public static <S extends Smartphone> String hacerFotosGeneric(S s) {
		String mensaje = "";
		int opcion = 0;
		int resolucion = 0;
		System.out.println("Elige la resolución a la que hacer la foto: \n"
				+ "1. 72 ppp. \n"
				+ "2. 300 ppp. \n"
				+ "3. 600 ppp. \n");
		opcion = entrada.nextInt();
		entrada.nextLine();
		switch(opcion) {
		case 1:
			resolucion = 72;			
			break;
		case 2:
			resolucion = 300;
			break;
		case 3:
			resolucion = 600;
			break;
		}
		s.hacerFotos(resolucion);
		//s.llamar(659675453);  desde este metodo limitado a Samartphone si puedo llamar al metodo llamar de la interficie Telefono.
		mensaje = s.toString() + " ha realizado la foto a una resolucion de " + resolucion + " ppp.";
		return mensaje;
	}
}
