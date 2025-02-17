public class Ejercicio10 {
    //Find the sum of all the primes below two million.
    //https://projecteuler.net/problem=10

    //Funcion para encontrar numeros primos
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

    public static void main(String[] args) {
        int numero=0;
        long suma=0;
        for(numero=0; numero<2000000; numero++) {
            if(esPrimo(numero)) {
                suma+=numero;
            }
        }
        System.out.println("Suma de todos los numeros primos por debajo de los 2 millones: "+suma);

    }
}
