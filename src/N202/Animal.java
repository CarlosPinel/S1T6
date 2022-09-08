package N202;

public class Animal {

	//Attributes
	private String nombre;
	private int patas;
	private String clase;
	private String alimentacion;
	
	//constructor
	public Animal(String nombre, int patas, String clase, String alimentacion) {
		this.nombre = nombre;
		this.patas = patas;
		this.clase = clase;
		this.alimentacion = alimentacion;
	}

	//setters/getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	//Methods
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", patas=" + patas + ", clase=" + clase + ", alimentacion=" + alimentacion
				+ "]";
	}
}
