import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray7 {
    /*
    * Programa que declare un vector de diez elementos enteros y pida números para
    * rellenarlo hasta que se llene el vector o se introduzca un número negativo.
    * Entonces se debe imprimir el vector (sólo los elementos introducidos).
    * */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int [] numeros=new int[10];
        int contador=0;
        System.out.println("Hola bienvenido");
        System.out.println("ingrese 10 numeros");

        while(contador<numeros.length){
            numero=sc.nextInt();

            if(numero < 0){
                break;
            }
            numeros[contador]=numero;
            contador++;
            if(contador==numeros.length){
                System.out.println(Arrays.toString(numeros));
            }
        }


        System.out.println("Numeros dentro del array: "+ Arrays.toString(numeros));

    }
}
