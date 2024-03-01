package Coche;
/**
 *
 * @author Fran
 */
public class Coche {

    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor de Coche sin argumentos
     */
    public Coche ()
    {
    	
    }
    /**
     * Constructor de Coche que inicializa todas las propiedades de la clase
     * @param nom
     * @param precio
     * @param stock
     */
    public Coche (String nom, double precio, int stock)
    {
        this.setNombre(nom);
        this.setPrecio(precio);
        this.setStock(stock);
    }
    /**
     * Método para asignar el nombre del coche
     * @param nom es una cadena de texto con el nombre del coche
     * @return void
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Método que me devuelve el nombre del coche
     * @return cadena de texto: nombre del coche
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de coches disponible en cada momento
     * @return número entero (int): stock de los coches disponibles
     */
     public int obtenerStock ()
    {
        return getStock();
    }

     /**
      * Método para comprar coches. Modifica el stock.
      * @param cantidad: número entero (int) de coches que se quieren comprar.
      * @throws Exception si se intenta introducir una cantidad negativa
      */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de coches");
        setStock(getStock() + cantidad);
    }
    /**
     * Método para vender coches. Modifica el stock.
     * @param cantidad: número entero (int) de coches que se quieren vender. 
     * @throws Exception si se intenta introducir una cantidad negativa 
     * @throws Exception si la cantidad que se quiere vender es superior al stock. 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de coches");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes coches para vender");
        setStock(getStock() - cantidad);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
    
}  

