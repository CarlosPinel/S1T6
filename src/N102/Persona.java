package N102;

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
 */

public class Persona {
	
	//Attributes
	private String nombre;
	private String apellidos;
	private int edad;
	
	//constructor
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	//setters/getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Methods
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
}
