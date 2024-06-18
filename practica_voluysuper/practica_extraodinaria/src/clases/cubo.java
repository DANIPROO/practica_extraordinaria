package clases;

/**
 * Clase que representa un cubo
 */

public class cubo {

	private int lado;
	
	/**
	 * Constructor que inicializa el lado del cubo a un valor entero positivo
	 * @param lado
	 * @throws IllegalArgumentException Si el lado del cubo es menor o igual que 0
	 */
	
	public cubo(int lado) {
		if(lado <= 0) {
			throw new IllegalArgumentException("El lado del cubo debe ser mayor a 0");
		}
		this.setLado(lado);
	}
	
	/**
	 *Constructor por defecto que crea un cubo de 1 de lado
	 */
	
	public cubo() {
		this.setLado(1);
	}
	
	/**
	 * Calcula y devuelve la superficie del cubo 
	 * @return La superficie del cubo 
	 */
	
	public double Superficie() {
		return 6 * (getLado() * getLado());	
	}
	
	/**
	 * Calcula y devuelve el volumen del cubo
	 * @return El volumen de cubo
	 */
	
	public double Volumen() {
		return getLado() * getLado() * getLado();
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}				
}


