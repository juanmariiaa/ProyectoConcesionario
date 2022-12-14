package Modelo;

import java.util.ArrayList;

/**
 * Objeto concesionario, como propiedad tiene el nombre y el arraylist de coches, que se pueden añadir, borrar o modificar
 *
 */
public class Concesionario {
	private String nombre;
	private ArrayList<Coche> catalogo = new ArrayList<Coche>();
	
	public Concesionario(String nombre) {
		this.nombre = nombre;
		Coche c1 = new Coche("2459 HGP", "Seat Leon", 10000, 15000);
		Coche c2 = new Coche("9548 KTD", "Lamborghini Camaro", 5000, 500000);
		Coche c3 = new Coche("3481 LPX", "Audi A8", 6792, 20000);
		Coche c4 = new Coche("4761 JHJ", "Tesla Model S",0 ,14599 );
		Coche c5 = new Coche("6831 JWJ", "Dacia Duster" , 23254,7500);
		Coche c6 = new Coche("9472 LPJ", "Citroen Berlingo" ,5210 ,12999);
		Coche c7 = new Coche("9472 LPJ", "Chevrolet Aveo", 0, 11999);
		
		this.catalogo.add(c1);
		this.catalogo.add(c2);
		this.catalogo.add(c3);
		this.catalogo.add(c4);
		this.catalogo.add(c5);
		this.catalogo.add(c6);
		this.catalogo.add(c7);
	}
	
	/**
	 * Metodo para añadir coche
	 * @param coche
	 */
	public void addCoche(Coche coche) {
		catalogo.add(coche);
	}
	
	/**
	 * Metodo para borrar coche
	 * @param index
	 */
	public void removeCoche(int index) {
		catalogo.remove(index);
	}
	
	/**
	 * Metodo para mostrar los coches del concesionario
	 * @param index
	 */
	public String showCoches() {
		String retorno = "";
		int index = 1;
		for (Coche coche : this.catalogo) {
			retorno += index + ". " + coche + "\n";
			index++;
		}
		return retorno;
	}
	
	
	public ArrayList<Coche> getCatalogo() {
		return catalogo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
}
