/**
 * Clase Perro, ¡puede incluso ladrar!
 * 
 * @author Rafael Alberto Caballero Osuna
 * @version 0.1.0
 *
 */
public class Perro {

		private String ladra;

		/** 
		 * Constructor de Perro
		 */
    protected Perro() {
				
	}

  /**
   * Método ladrar, para que Perro ladre
   * 
   */
	void ladrar() {
		ladra = "Guau";
    System.out.println(ladra);
	}

}
