package Vista;


import Utiles.Print;
import Modelo.Concesionario;
import Utiles.Introducir;

/**
 * En esta clase se encuentran las funciones que imprimen los menus que se muestra al usuario y su control
 */
public class Menus {

	/**
	 * Se muestra el menu principal
	 * @param concesionario
	 */
	
	public static void muestraMenuPrincipal(Concesionario concesionario) {
	    Print.P("");
	    Print.P("CONCESIONARIO \"" + concesionario.getNombre()+ "\". ¿Qué función desea realizar?");
	    Print.P("");
	    Print.P(" **----------------------------------- MENU PRINCIPAL ----------------------------------------** ");
	    Print.P(" |                                                                                             |");
	    Print.P(" |                                                                                             |");
	    Print.P(" |                              [1] PARA VER TODOS LOS COCHES                                  |");
	    Print.P(" |                              [2] PARA MODIFICAR PARAMETROS DE UN COCHE                      | ");
	    Print.P(" |                              [3] PARA AÑADIR UN COCHE MANUALMENTE                           |");
	    Print.P(" |                              [4] PARA BORRAR COCHE                                          | "); 
	    Print.P(" |                              [5] PARA SALIR                                                 | ");
	    Print.P(" |                                                                                             |");
	    Print.P(" |                                                                                             |");
	    Print.P(" **--------------------------------------------------------------------------------------------** ");
	}
	
	/**
	 * Control de el menu principal
	 */
	
	 public static int getMenuPrincipal() {
		    
		    boolean valid = false;
		    int opt = -1;
		    
		    do{ 
		      valid = false;                
		      opt = Introducir.getInt("ELIJA LA FUNCIÓN QUE DESEA REALIZAR ->  ");
		      
		      if(opt < 1 || opt > 5) {   
		        Print.P("Debe insertar un valor valido...");          
		        valid = true;
		      }          
		    }while(valid);
		    
		    return opt;
		  }
	 
	 /**
	  * Se muestra el menu para modificar las propiedades
	  */
	 public static void showMenuPropiedades(){
		    Print.P("");
		    Print.P(" **----------------------------------- MENU PROPIEDADES ---------------------------------------** ");
		    Print.P(" |                                                                                             |");
		    Print.P(" |                                                                                             |");
		    Print.P(" |                                                                                             |");
		    Print.P(" |                              [1] PARA MODIFICAR LA MATRICULA                                | ");
		    Print.P(" |                              [2] PARA MODIFICAR LA MARCA                                    | "); 
		    Print.P(" |                              [3] PARA MODIFICAR LOS KILOMETROS                              | ");
		    Print.P(" |                              [4] PARA MODIFICAR EL PRECIO                                   | ");
		    Print.P(" |                              [5] PARA VOLVER                                                | ");
		    Print.P(" |                                                                                             |");
		    Print.P(" |                                                                                             |");
		    Print.P(" |                                                                                             |");
		    Print.P(" **--------------------------------------------------------------------------------------------** ");

		  }
	 
	 /**
	  * Control del menu ModificarPropiedades 
	  * @return
	  */
	 public static int getMenuPropiedades() {
		    
		    boolean valid = false;
		    int opt = -1;
		    
		    do{
		      valid = false;                
		      opt = Introducir.getInt("ELIJA LA FUNCIÓN QUE DESEA REALIZAR ->  ");      
		      
		      if(opt < 1 || opt > 5) {
		        Print.P("Debe insertar un valor valido...");          
		        valid = true;
		      }          
		    }while(valid);
		    
		    return opt;
		  }
	 
	  public static void showEnd(){
		    
	      Print.P("Nos vemos pronto, gracias por usar el programa.");

	    }
	  
	  /**
	   * Muestra el texto de error
	   */
	  public static void showError(){

	    Print.P("Ha ocurrido un error, pruebe de nuevo. \n");

	  }
			
	 
}
