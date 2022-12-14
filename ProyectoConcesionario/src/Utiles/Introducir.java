package Utiles;

import java.util.Scanner;
import java.util.InputMismatchException;




/**
 * Clase que contiene metodos para introducir variables y se controla los errores.
 * 
 */
public class Introducir {


  /**
   * Metodo que retorna un entero con un control de errores.
   * 
   * @param text es el parámetro que se imprime antes de que se recoja el entero
   * @return int
   */
  public static int getInt(String text) {
    
    boolean validNum = true;
    Scanner teclado = new Scanner(System.in);
    int num = 0;

    do {   
      try {
        Print.P(text);
        num = teclado.nextInt();

        if (num < 0) {
          validNum = true;
          Print.P("Debe ingresar obligatoriamente un numero valido.");       
        }else{
          validNum = false;
        }

        
      }  catch (InputMismatchException ex) {
        
        teclado.nextLine();
        validNum = true;
        Print.P("Debe ingresar obligatoriamente un numero valido.");
        

      } catch (Exception e) {
        
        teclado.nextLine();
        validNum = true;
        Print.P("Debe ingresar obligatoriamente un numero valido.");

      }
    } while(validNum);
    
    return num;
  }

  /**
   * Metodo que retorna un float con un control de errores.
   * 
   * @param text es el parámetro que se imprime antes de que se recoja el float.
   * @return float
   */
  public static float getFloat(String text) {
    boolean validNum = true;
    Scanner teclado = new Scanner(System.in);
    float num = -1;

    do {   
      try {
        Print.P(text);
        num = teclado.nextFloat();

        if (num < 0) {
          validNum = true;
          Print.P("Debe ingresar obligatoriamente un numero valido.");       
        }else{
          validNum = false;
        }

        
      }  catch (InputMismatchException ex) {
        
        teclado.nextLine();
        validNum = true;
        Print.P("Debe ingresar obligatoriamente un numero valido.");
        

      } catch (Exception e) {
        
        teclado.nextLine();
        validNum = true;
        Print.P("Debe ingresar obligatoriamente un numero valido.");

      }
    } while(validNum);
    
    return num;
  }
  
  /**
   * Metodo que retorna un double con un control de errores.
   * 
   * @param text es el parámetro que se imprime antes de que se recoja el double.
   * @return double
   */
  public static double getDouble(String text) {
    
    boolean validNum = true;
    Scanner teclado = new Scanner(System.in);
    double num = 0;

    do {   
      try {
        Print.P(text);
        num = teclado.nextDouble();

        if (num < 0) {
          validNum = true;
          Print.P("Debe ingresar obligatoriamente un numero valido.");       
        }else{
          validNum = false;
        }

        
      }  catch (InputMismatchException ex) {
        
        teclado.nextLine();
        validNum = true;
        Print.P("Debe ingresar obligatoriamente un numero valido.");
        

      } catch (Exception e) {
        
        teclado.nextLine();
        validNum = true;
        Print.P("Debe ingresar obligatoriamente un numero valido.");

      }
    } while(validNum);
    
    return num;
  }
  
  /**
   * Metodo que retorna un String con un control de errores.
   * 
   * @param text es el parámetro que se imprime antes de que se recoja el double.
   * @return String
   */
  public static String getString(String text){
    Scanner teclado = new Scanner(System.in);
    String value;

    Print.P(text);
    value = teclado.nextLine();

    return value;
  }

}
