package clases;

/**
 * Clase que representa un cilindro
 */
public class cilindro {

	private double radio;
    private double altura;
    private static final double PI = 3.14;
    
    /**
     * Constructor que inicializa el radio y la altura del cilindro a valores enteros positivos
     *@param radio Longitud del radio del cilindro que debe ser mayor que cero
     * @param altura Longitud de la altura del cilindro. Debe ser mayor que cero
     * @throws IllegalArgumentException Si el radio o la altura son menores o iguales a cero
     */
    
    public cilindro(int radio, int altura) {
        if (radio <= 0 || altura <= 0) {
            throw new IllegalArgumentException("El radio y la altura del cilindro deben ser mayores que cero.");
            }
        this.radio = radio;
        this.altura = altura;
        }
    
    /**
     * Constructor por defecto que crea un cilindro de 1 de radio y 1 de altura 
     */
    
    public cilindro() {
    	this.radio = 1;
    	this.altura = 1;
    }
    
    /**
     * Calcula y devuelve la superficie del cilindro
     * @return la superficie del cilindro
     */
    
    public double Superficie() {
    	return 2 * PI * radio * radio + 2 * PI * radio * altura;
    }
    
    /**
     * Calcula y devuelve el volumen del cilindro
     * @return el volumen del cilindro
     */
    
    public double Volumen() {
    	return PI * radio * radio * altura;
    }
    
}
