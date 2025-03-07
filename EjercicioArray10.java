import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray10 {
    /*Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros cada uno,
     pida valores para ‘vector1’ y ‘vector2’
    y calcule vector3=vector1+vector2.*/

    static void llenarArrays(Scanner sc,int [] vector, String mensaje){
        System.out.println(mensaje);
        for(int i=0;i<vector.length;i++){
            vector[i]=sc.nextInt();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tamanio=5;
        int [] vector1 = new int[tamanio];
        int [] vector2 = new int[tamanio];
        int [] vector3 = new int[tamanio];
        //int numero=0;

       llenarArrays(sc,vector1,"Llenar Array 1");
       llenarArrays(sc,vector2,"Llenar Array 2");

        System.out.println("Numeros dentro del array 1: "+Arrays.toString(vector1));
        System.out.println("Numeros dentro del array 2: "+Arrays.toString(vector2));

        for (int i = 0; i < vector3.length; i++) {
            vector3[i]=vector1[i]+vector2[i];
        }
        System.out.println("Suma de arrays enteros "+Arrays.toString(vector3));

    }
}
