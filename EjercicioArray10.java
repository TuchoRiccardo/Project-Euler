import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray10 {
    /*Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros cada uno,
     pida valores para ‘vector1’ y ‘vector2’
    y calcule vector3=vector1+vector2.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vector1 = new int[5];
        int [] vector2 = new int[5];
        int [] vector3 = new int[5];
        int numero=0;

        System.out.println("Ingrese numeros para el primer array");
        for(int i=0; i<5; i++){
            vector1[i] = sc.nextInt();
        }
        System.out.println("Ingrese numeros para el segundo array");
        for(int i=0; i<5; i++){
            vector2[i] = sc.nextInt();
        }

        System.out.println("Numeros del primer array: "+ Arrays.toString(vector1));
        System.out.println("Numeros del segundo array: "+ Arrays.toString(vector2));

        for (int i=0; i<5; i++){
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println("Numeros del primer array: "+ Arrays.toString(vector3));

    }
}
