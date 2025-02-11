import java.math.BigInteger;

public class Ejercicio4 {
    //Encontrar el numero palindromico mas grande usando una multiplicacion de 3 digitos
    //Numero palindromico es cuando leemos el numero de igual forma de izquierda a derecha como de
    //derecha a izquierda. Ej.→ 9009

    //Hago una funcion que compruebe si los numeros son palindromos

    private static boolean numeroPalindromo(int numero){
        int numeroOriginal = numero;
        int numeroReves=0;

        while(numeroOriginal>0){
            int ultimoDigito = numeroOriginal % 10;
            numeroReves=(numeroReves*10)+ultimoDigito;//Revisar logica del numeroReves
            numero/=10;

    }
        return numero==numeroReves;
    }

    public static void main(String[] args) {
        //declaro variables
        System.out.println("mostrar mensaje por consola");
        int palindromoMasGrande=0;
        int factor1=0;
        int factor2=0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) { // Comenzar j desde i para evitar duplicados
                int producto = i * j;

                if (producto > palindromoMasGrande & numeroPalindromo(producto)) {
                    palindromoMasGrande = producto;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        if(palindromoMasGrande >0){
            System.out.println("El palindromo mas grande de 3 digitos es → "+palindromoMasGrande);
            System.out.println("La combiancion de numeros es "+factor1+" y "+factor2);
        }else
            System.out.println("No se encontraron palindromos");








        }
    }




