import java.io.*;
/**
 * Classe on es realitzen les operacions d'obtenir per teclat les dades introduides i transformar-les segons el tipus desitjat. 
 * @version 1.0
 * @author Júlia
 */
public class cLlegir
{
/**
 * Mètode que obté el flux de caràcters d'entrada per teclat i retorna en format String
 * @return Retorna les dades introduides per teclar en forma de String 
 */
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  
  /**
   * Mètode que obté el flux de caràcters d'entrada per teclat i retorna en format Short
   * @return Retorna les dades introduides per treclat en format Short
   */
  public static short datoShort()
  {
    try
    {
      return Short.parseShort(dato());
    }
    catch(NumberFormatException e)
    {
      return Short.MIN_VALUE; // valor mas pequeño
    }
  }
  
  /**
   * Mètode que obté el flux de caràcters d'entrada per teclat i retorna en format int
   * @return Retorna les dades introduides per treclat en format int
   */
  public static int datoInt()
  {
    try
    {
      return Integer.parseInt(dato());
    }
    catch(NumberFormatException e)
    {
      return Integer.MIN_VALUE; // valor m�s peque�o
    }
  }
  
    /**
   * Mètode que obté el flux de caràcters d'entrada per teclat i retorna en format long
   * @return Retorna les dades introduides per treclat en format long
   */
  public static long datoLong()
  {
    try
    {
      return Long.parseLong(dato());
    }
    catch(NumberFormatException e)
    {
      return Long.MIN_VALUE; // valor m�s peque�o
    }
  }
  
   /**
   * Mètode que obté el flux de caràcters d'entrada per teclat i retorna en format float
   * @return Retorna les dades introduides per treclat en format float
   */
  public static float datoFloat()
  {
    try
    {
      Float f = new Float(dato());
      return f.floatValue();
    }
    catch(NumberFormatException e)
    {
      return Float.NaN; // No es un N�mero; valor float.
    }
  }
   /**
   * Mètode que obté el flux de caràcters d'entrada per teclat i retorna en format double
   * @return Retorna les dades introduides per treclat en format double
   */
  public static double datoDouble()
  {
    try
    {
      Double d = new Double(dato());
      return d.doubleValue();
    }
    catch(NumberFormatException e)
    {
      return Double.NaN; // No es un N�mero; valor double.
    }
  }
} //cLlegir
