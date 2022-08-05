package N201;

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
 * Modifica l'exercici anterior de manera que un dels arguments del mètode
 * genèric no sigui genèric.
 */

public class Main {

	public static void main(String[] args) {
		
		String palabra = "ordenador";
		Persona persona = new Persona("Maria", "Perez", 18);
		int numero = 13234;
		
		GenericMethodsN201 gm = new GenericMethodsN201();
		gm.imprimir(numero, persona, palabra);
		gm.imprimir(persona, "hasta la vista baby", "hola");
		gm.imprimir(palabra, persona, "adios");
	}
}
