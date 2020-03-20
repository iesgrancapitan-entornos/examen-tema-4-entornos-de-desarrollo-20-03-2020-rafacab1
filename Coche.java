/**
 * 
 * Clase Coche, que hereda de Vehiculo
 * 
 * @author Jaime Rabasco Ronda
 * @version 0.1.0
 *  
 */

/*
 * Refactorización Extrae una superclase Vehículo con los campos 
 * num_serie
 * fabricante 
 * color 
 * y los métodos 
 * getNum_serie(), setNum_serie()
 * getFabricante(), setFabricante() 
 * getColor(), setColor()
 */

enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

public class Coche extends Vehiculo {
	private int cilindrada;
	
	/**
	 * Constructor de Coche
	 * 
	 * @param num_serie
	 * @param cilindrada
	 * @param fabricante
	 * @param color
	 */
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}

	/**
	 * Getter de cilindrada
	 * 
	 * @return
	 */
	public int getCilindrada() {
		return cilindrada;
	}


	/**
	 * Setter de cilindrada
	 * 
	 * @param cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
