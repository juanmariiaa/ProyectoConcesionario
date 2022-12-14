package Controlador;

import Modelo.Coche;
import Modelo.Concesionario;
import Utiles.Print;
import Vista.Menus;
import Utiles.Introducir;

/**
 * Clase donde est�n los switch que hace que los men�s vayan acorde a su l�gica
 */
public class Controla {
	
	/**
	 * Metodo que incluye el switch para controlar el menu principal
	 * @param concesionario donde se almacenan los diferentes coches que hay.
	 */
	public static void switchPrincipal(Concesionario concesionario) {
		int op;
		do {
			Menus.muestraMenuPrincipal(concesionario);
			op = Introducir.getInt("");
			switch (op) {
			case 1 -> {
				
				Print.P(concesionario.showCoches());
				break;
			}
			case 2 -> {

				Print.P("�Qu� coche quieres modificar?");
				int indexCoche = Introducir.getInt(concesionario.showCoches())-1;

				Coche coche = concesionario.getCatalogo().get(indexCoche);
				Print.P("Has elegido este coche: \n " + coche);

				editPropiedadCoche(coche);
				break;
			}
			case 3 -> {

				String matricula = Introducir.getString("Matr�cula: ");
				String marca = Introducir.getString("Marca: ");
				int km = Introducir.getInt("Kil�metros: ");
				double precio = Introducir.getDouble("Precio: ");

				Coche newCoche = new Coche(matricula, marca, km, precio);

				concesionario.addCoche(newCoche);
				Print.P("Se ha a�adido su coche nuevo al catalogo del concesionario.");

				Print.P(concesionario.showCoches());
				break;
			}

			case 4 -> {

				Print.P("�Qu� coche quieres borrar?");
				int indexCoche = Introducir.getInt(concesionario.showCoches())-1;

				Coche coche = concesionario.getCatalogo().get(indexCoche);
				Print.P("Est�s seguro que quieres borrar este coche del cat�logo? \n" + coche);

				if (Introducir.getString("Introduce 1 para borrar") != "1") {
					concesionario.removeCoche(indexCoche);
				} else {
					Print.P("Has decidido no borrarlo, se ha mantenido en el cat�logo");
				}
				break;
			}

			case 5 -> {
				Print.P("Has terminado con tu concesionario");
				break;
			}

			default -> {

				Menus.showError();
				break;
			}
			}
		} while (op != 5);
	}

	/**
	 * Metodo que incluye el switch para controlar el menu de edicion de propiedades 
	 * @param C1 el coche escogido para modifiicar sus propiedades
	 */
	public static void editPropiedadCoche(Coche C1) {
		int op;
		do {
			Menus.showMenuPropiedades();

			op = Menus.getMenuPropiedades();

			switch (op) {
			case 1:

				C1.setMatricula(Introducir.getString("Modifica la matr�cula: "));
				Print.P("" + C1);
				Print.P("");
				break;

			case 2:

				C1.setMarca(Introducir.getString("Modifica marca: "));
				Print.P("" + C1);
				Print.P("");
				break;

			case 3:

				C1.setKm(Introducir.getInt("Modifica kilometros: "));
				Print.P("" + C1);
				Print.P("");
				break;

			case 4:

				C1.setPrecio(Introducir.getDouble("Modifica precio: "));
				Print.P("" + C1);
				Print.P("");
				break;
			case 5:
				break;
				
			default:
				
				Menus.showError();
				Print.P("");
				break;
			}
		} while (op != 5);

	}

}
