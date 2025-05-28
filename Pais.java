/**
 * Clase Pais
 * Representa un país con sus atributos principales.
 * Autor: Yasir Halifi
 * Versión: 1.0
 * Fecha: 25/11/2024
 */


public class Pais {
    private String nombre;
    private int nHabitantes;
    private String idioma;
    private double eGeografica;
    private String continente;
    private boolean pDemocratico;
    private static int numPaises=0;
    public Pais(String n){
        nombre = n;
    }
    public Pais(String n, String i, String c){
        nombre =n;
        idioma=i;
        continente=c;

    }
    public Pais(String n, String i, String c, int h, double g, boolean d){
        nombre =n;
        idioma=i;
        continente=c;
        nHabitantes=h;
        eGeografica=g;
        pDemocratico=d;
    }

    public boolean compruebaHabitantes() {
        if (nHabitantes > 100000){
            return true;
        }
        return false;


    }
    public void setNombre(String n){
        n=nombre;
    }
    public void setnHabitantes(int h) {
        h = nHabitantes;
    }
    public void setIdioma (String i) {
        i = idioma;
    }
    public void seteGeografica(double g) {
        g = eGeografica;
    }
    public void setContinente(String c){
        c=continente;
    }
    public void setpDemocratico(boolean d) {
        d = pDemocratico;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumeroHabitantes() {
        return nHabitantes;
    }
    public String getIdiomaOficial() {
        return idioma;
    }
    public double getExtensionGeografica() {
        return eGeografica;
    }

    public String getContinente() {
        return continente;
    }
    public boolean getpDemocratico() {
        return pDemocratico;
    }

    public void imprimeContinenteyExtensionGeografica(){
        System.out.println("Continente: " +continente);
        System.out.println("Extension geográfica: " +eGeografica);

        numPaises++;
    }

    public void compruebaNombre(){
        continente.contains(nombre);
    }



}

