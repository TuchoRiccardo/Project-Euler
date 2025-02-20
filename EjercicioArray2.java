import java.util.ArrayList;

import java.util.Random;

public class EjercicioArray2 {
    /* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y los almacene en un array.
    El programa debe crear un nuevo array con los números primos que haya entre esos 20 números.
    Luego debe mostrar los dos arrays.*/


        static boolean esPrimo(int numero) {
            return Ejercicio7.esPrimo(numero);
        }

    public static void main(String[] args) {
        Random rand = new Random();
        int [] numeros = new int[20];
        ArrayList<Integer> primos = new ArrayList<>();
        //int contador=0;

        System.out.println("Se crea el primer array");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }

        for(int num : numeros) {
            if(esPrimo(num)) {
               primos.add(num);
            }
        }
        System.out.println("Numero Generados para el primer array");
        for(int num : numeros) {
            System.out.println(num+" ");
        }
        System.out.println("\nNumeros primos dentro del array anterior");
        for(int num : primos) {
            System.out.println(num+" ");
        }
    }

}
