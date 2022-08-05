package N202;

import java.util.ArrayList;

/**
 * Crea una classe anomenada Persona amb els atributs nom, cognom i edat.
 * Després crea una classe anomenada GenericMethods amb un mètode genèric que
 * accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir
 * per pantalla els arguments que ha rebut. Al main() de la classe principal,
 * crida el mètode genèric amb diferents tipus de paràmetres.
 * 
 * Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
 * 
 * D’aquesta manera has comprovat que se li pot passar qualsevol tipus de
 * paràmetre i en qualsevol ordre.
 * 
 * Modifica l'apartat anterior de manera que els arguments del mètode genèric
 * siguin una llista d'arguments de variable indefinida.
 *
 */

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Persona persona1 = new Persona("Juan", "Perez", 30);
		Persona persona2 = new Persona("Maria", "Torres", 80);
		Persona persona3 = new Persona("Yolanda", "Alonso", 20);
		Persona persona4 = new Persona("Cristian", "Gutierrez", 50);
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		
		ArrayList<Animal> animales = new ArrayList<Animal>();
		Animal animal1 = new Animal("perro", 4, "mamifero", "carnivoro facultativo");
		Animal animal2 = new Animal("gato", 4, "mamifero", "carnivoro");
		Animal animal3 = new Animal("gaviota", 2, "oviparo", "carnivoro");
		animales.add(animal1);
		animales.add(animal2);
		animales.add(animal3);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(23);
		numeros.add(54);
		
		GenericMethodsN202 gm = new GenericMethodsN202();
		gm.imprimir(personas);
		gm.imprimir(animales);
		gm.imprimir(numeros);
		
	}
}
