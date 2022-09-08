package N301;

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

public class Smartphone implements Telefono{
	
	//Attributes
	private String marca;
	private String modelo;
	private int numero;
	
	//Constructor
	public Smartphone() {};
	
	public Smartphone(String marca, String modelo, int numero) {
		this.marca = marca;
		this.modelo = modelo;
		this.numero = numero;
	}
	
	
	//setters/getters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	//Methods

	public void llamar(int numLlamar) {
		//System.out.println("llamando a " + numLlamar);
	}
	
	public void hacerFotos(int resolucion) {
		//System.out.println("Foto realizada en resolucion PPP: " + resolucion);
	}


	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modelo=" + modelo + ", numero=" + numero + "]";
	}
	
	
}
