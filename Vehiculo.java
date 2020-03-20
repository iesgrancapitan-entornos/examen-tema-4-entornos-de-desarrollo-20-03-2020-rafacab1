/**
 * Clase Vehiculo para el examen de Entornos de Desarrollo.
 * 
 * @author Rafael Alberto Caballero Osuna
 * @version 0.1.0
 *
 */
public class Vehiculo {

  protected int num_serie;
  protected String fabricante;
  protected Color color;

  /**
   * Constructor de Vehiculo
   */
  public Vehiculo() {
    super();
  }

  /**
   * Getter de color
   * 
   * @return color
   */
  public Color getColor() {
  	return color;
  }

  /**
   * Setter de color
   * 
   * @param color
   */
  public void setColor(Color color) {
  	this.color = color;
  }

  /**
   * Getter num_serie
   * 
   * @return num_serie
   */
  public int getNum_serie() {
  	return num_serie;
  }

  /**
   * Setter de num_serie
   * 
   * @param num_serie
   */
  public void setNum_serie(int num_serie) {
  	this.num_serie = num_serie;
  }

  /**
   * Getter de fabricante
   * 
   * @return fabricante
   */
  public String getFabricante() {
  	return fabricante;
  }

  /**
   * Setter de fabricante
   * 
   * @param fabricante
   */
  public void setFabricante(String fabricante) {
  	this.fabricante = fabricante;
  }

}