package persona;

/**
 * clase persona
 */
public class Persona {

	
	private String Nombre;
	private int edad;
	private double peso;
	private double altura;
	
	
	/**
	 * constructor persona
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, double peso, double altura) {
		super();
		Nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	/**
	 * getter del nombre
	 * @return el nombre de la persona
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * setter del nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * getter de la edad
	 * @return la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * setter de la edad
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * getter del peso
	 * @return el peso de la persona
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * setter del peso
	 * @param peso
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * getter de la altura
	 * @return la altura de la persona
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * setter de la altura
	 * @param altura
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}


	/**
	 * toString con el nombre, edad, peso y altura de la persona
	 */
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
