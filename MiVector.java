/**
 * Clase MiVector
 * Gestiona un array de enteros con operaciones básicas.
 * Autor: Yasir Halifi
 * Versión: 1.0
 * Fecha: 25/11/2024
 */

import java.util.Scanner;
public class MiVector {
        private int[] v;
        private int tam;
        public MiVector(){
            tam=3;
            v = new int [tam];
        }
        public boolean arrayVacio(){
            if (tam==0){
                return true;
            }
            return false;
        }
        public void valorArray(){
            System.out.println("Introduce "+tam+"valores:");
            Scanner scanner = new Scanner(System.in);
            for (int i=0; i<tam;i++){
            v[i]= scanner.nextInt();





            }

        }
        public void muestraArray(){
            for (int i=0; i<tam;i++) {
                System.out.println(v[i]);

            }
        }
        public int getTam(){
            return tam;
        }
        public void vaciaArray() {
           do {
               tam--;
           }while (tam!=0);
            }
        }


