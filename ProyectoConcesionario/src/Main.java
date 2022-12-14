import Controlador.Controla;
import Modelo.Concesionario;
import Utiles.Introducir;

public class Main {

	public static void main(String[] args) {
		Concesionario concesionario = new Concesionario(Introducir.getString("Dime el nombre de tu concesionario -> "));
		
		Controla.switchPrincipal(concesionario);
	}

}
