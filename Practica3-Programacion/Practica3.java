/**
 * Clase Practica3
 * Representa una simulación de evaluación con actividades, prácticas y examen.
 * Versión: 1.0
 * Fecha: 20/11/2024
 * Autor: Yasir Halifi
 */



public class Practica3 {
    private boolean actividades_entregadas; //atributos, indica si las actividades se han entregado
    private double nota_practica;  //atributo, guarta la nota de las practicas
    private double nota_examen;    //atributo , guarda la nota del examen

    public Practica3(){
        nota_practica=6;
        nota_examen=8;
    }
    /* No es necesario añadirle un destructor ya que java
    ya tiene integrado esta tarea y la realiza de forma automatica.
     */


    public void imprimirNotas(){ //metodo, imprime las notas de practica y examen
        System.out.println("La nota de clase es la siguiente: ");
        if(actividades_entregadas){
            System.out.println("Se han entregado las actividades del tema.");
        }
        System.out.println("Nota de prácticas: " + nota_practica);
        System.out.println("Nota de examen: " + nota_examen);
    }

    public double calculoMedia(){ //metodo, calcula y devuelve al main la media entre la nota practica y la nota de examen
        double media;
        media = ((nota_practica*0.6)+(nota_examen*0.4));
        return media;
    }

    public boolean aprobarExamen(){ //metodo, comprueba si el estudiante aprueba y devuelve al main el resultado
        boolean nota_minima = ((nota_practica>=5) && (nota_examen>=5));
        boolean media_aprobada = (calculoMedia()>=5);
        if(nota_minima && media_aprobada){
            return true;
        }
        return false;
    }
}

