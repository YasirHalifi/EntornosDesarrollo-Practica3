public class Main {
    public static void main(String[] args) {
        int[] temperaturas = {15, 20, 25, 30}; // Inicialización correcta del array

        double temperaturaMedia = calcularMedia(temperaturas);
        System.out.println("La temperatura media es: " + temperaturaMedia); // Corrección en la impresión

        if (temperaturaMedia > 25) {
            System.out.println("¡Hace calor!");
        } else {
            System.out.println("El clima es agradable.");
        }

        // Acceso seguro al último elemento del array
        System.out.println("Temperatura en la última posición: " + temperaturas[4]);
    }

    public static double calcularMedia(int[] valores) {
        double suma = 0.0;
        for (int i = 0; i < valores.length; i++) { // Cambiado `<=` por `<`
            suma += valores[i];
        }
        return suma / valores.length;
    }
}