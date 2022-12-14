package Modelo;

/**
 * Objeto coche con las propiedades de matricula, marca, kilometros recorridos y el precio de venta.
 *
 */
public class Coche {
	private String matricula;
	private String marca;
	private int km;
	private double precio;
	
	public Coche() {
		this.matricula = "";
		this.marca = "";
		this.km = 0;
		this.precio = 0;
	}
	
	public Coche(String matricula, int km) {
		this.matricula = matricula;
		this.marca = "";
		this.km = km;
		this.precio = 0;
	}
	
	public Coche(String matricula, int km, double precio) {
		this.matricula = matricula;
		this.marca = "";
		this.km = km;
		this.precio = precio;
	}
	
	public Coche(String matricula, String marca, int km, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.km = km;
		this.precio = precio;
	}
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * Control de error para que no se pueda insertar que un coche tenga kilómetros recorridos
	 * @param km
	 * @return
	 */
	public boolean precioKm(int km) {
		boolean correcto=false;
		if(km>0) {
			
		}
		return correcto;
	}
	
	@Override
	public String toString() {
		return this.marca + " con " + this.km + "km -> " + this.precio + " euros";
	}
	
}

