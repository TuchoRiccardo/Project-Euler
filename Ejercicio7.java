import java.util.Scanner;

public class Ejercicio7 {
    //Encontrar el numero primo que esta en la posicion 10.001

    static boolean esPrimo(int numero) {
        if(numero <= 1) return false;

        int contador=2;
        boolean primo=true;
        while (primo && contador <= Math.sqrt(numero)) {
            if(numero % contador == 0) primo=false;

            contador++;
        }
        return primo;
    }

    static int encontrarPrimo(int posicion) {
        int contador=0; //Contador para los numeros primos que encontremos
        int numero =1; //Numeros que vamos revisando
        while(contador < posicion) {
            numero++;   //Se va al siguente numero
            if(esPrimo(numero)) {
                contador++; //Siempre que sea primo el contador se incrementa
            }

        }
        return numero;
    }

    public static void main(String[] args) {
        int posicion=10001;
        encontrarPrimo(posicion);
        System.out.println(encontrarPrimo(posicion));


    }

}
