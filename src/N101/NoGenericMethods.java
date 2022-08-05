package N101;

import java.util.ArrayList;

/**
 * Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del
 * mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests
 * objectes i un constructor per a inicialitzar els tres. Comprova que els
 * arguments es poden posar en qualsevol posició en la crida al constructor.
 *
 */

public class NoGenericMethods {
	
	//Attributes
	
	Persona persona1;
	Persona persona2;
	Persona persona3;
	ArrayList<Persona> listaPersonas;
	
	//Constructor
	public NoGenericMethods(Persona persona1, Persona persona2, Persona persona3) {
		this.persona1 = persona1;
		this.persona2 = persona2;
		this.persona3 = persona3;
		this.listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
	}
	
	//setters/getters
	public Persona getPersona1() {
		return persona1;
	}

	public void setPersona1(Persona persona1) {
		this.persona1 = persona1;
	}

	public Persona getPersona2() {
		return persona2;
	}

	public void setPersona2(Persona persona2) {
		this.persona2 = persona2;
	}

	public Persona getPersona3() {
		return persona3;
	}

	public void setPersona3(Persona persona3) {
		this.persona3 = persona3;
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	
	//Methdos
	public void almacenar(Persona p) {
		this.listaPersonas.add(p);
	}
	
	public void extraer(Persona p) {
		this.listaPersonas.remove(p);
	}
}
