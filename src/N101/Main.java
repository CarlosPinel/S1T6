package N101;

import java.util.ArrayList;

/**
 * Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del
 * mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests
 * objectes i un constructor per a inicialitzar els tres. Comprova que els
 * arguments es poden posar en qualsevol posició en la crida al constructor.
 *
 */

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Juan", "Martinez", 25);
		Persona persona2 = new Persona("Marcos", "Perez", 34);
		Persona persona3 = new Persona("Gustavo", "Gonzalez", 85);

		NoGenericMethods ngm = new NoGenericMethods(persona1, persona2, persona3);
		ArrayList<Persona> listaPersonas = ngm.getListaPersonas();
		for (Persona p : listaPersonas) {
			System.out.println(p.toString());
		}
		
		NoGenericMethods ngm2 = new NoGenericMethods(persona3, persona1, persona2);
		ArrayList<Persona> listaPersonas2 = ngm2.getListaPersonas();
		for (Persona p2 : listaPersonas2) {
			System.out.println(p2.toString());
		}
		
	}

}
