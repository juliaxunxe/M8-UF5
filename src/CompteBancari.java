/**
 * Classe CompteBancari. Definició de funcions i atributs dels comptes. 
 * @version 1.0
 * @author Júlia
 * 
 */
public class CompteBancari {
    /**
     * Variables de la classe
     * nom = nom de compte 
     * numSecret = pin compte
     * saldoInicial = se li assigna la variable saldo al moment de creació del compte
     * saldo = saldo del comtpe
     */
    private String nom;
    private int numSecret;
    private static float saldoInicial = (float) 100.0;
    private float saldo;

    public CompteBancari(String nom, int numSecret) {
        /**
         * Constructor de la classe requereix nom i numSecret per crear l'objecte
         * @param nom : nom compte que s'instanciarà a l'objecte
         * @param numSecret: pin que s'instanciarà a l'objecte. 
         */
        this.nom = nom;
        this.numSecret = numSecret;
        this.saldo = CompteBancari.saldoInicial;
    }

    /**
     * Mètode per obtenir el nom del compte/objecte i retorna en format String
     * @return Retorna el nom del compte/objecte en format String
     */
    public String getNom() {
        return this.nom;
    }
    /**
     * Mètode per obtenir el pin de la compte/objecte en format int
     * @return retorna el pin de la compte/objecte en format int
     */
    public int getNumSecret() {
        return this.numSecret;
    }
    /**
     * Mètode per obtenir el saldo del compte/objecte en format float
     * @return retorna el saldo del compte/objecte en format float
     */
    public float consultarSaldo() {
        return this.saldo;
    }
    /**
     * Mètode per obtenir el saldo inicial del compte/objecte en format float
     * @return retorna el saldo incial del compte/objecte en format float
     */
    public static float getSaldoInicial() {
        return CompteBancari.saldoInicial;
    }
    /**
     * Mètode per canviar el saldo inicial de la compte/objecte
     * @param saldoIncial nou saldo inicial que s'instanciarà al compte/objecte
     */
    public static void setSaldoInicial(float saldoIncial) {
        CompteBancari.saldoInicial = saldoIncial;
    }
    
    /**
     * Mètode per obtenir les dades instanciades a l'objecte
     * @return retorna les dades en forma de frase
     */
    public String mostrarDades() {
        return ("El propietari es diu: " + this.nom + " amb número secret: "
                + this.numSecret + ". El saldo actual es: " + this.saldo);
    }

    /**
     * Mètode per augmentar el valor del saldo del compte/objecte
     * @param quantitat valor en que es vol augmentar la variable saldo del compte/objecte
     * @return retorna true si l'operació s'ha realtizat correctament o false si no s'ha pogut realtizar
     */
    public boolean ingressar(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo + quantitat;
            resultat = true;
        }
        return resultat;
    }

    /**
     * Mètode per disminuir el valor del saldo del compte/objecte
     * @param quantitat valor en que es vol disminur la variable saldo
     * @return retorna true si l'operació s'ha realtizat correctament o false si no s'ha pogut realtizar
     */
    public boolean extreure(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo - quantitat;
            resultat = true;
        }
        return resultat;
    }
}
