package leetcode;

import java.util.Arrays;

public class Solucion1 {
    /*Dado un array de enteros `nums` y un entero `val`,
    elimina todas las apariciones de `val` en `nums` **en su lugar**
    (sin usar memoria adicional significativa).
     El orden de los elementos puede cambiar.
     Luego, devuelve **el número de elementos en `nums` que no son iguales a `val`**.
     */

    static int removerValor(int[] vector,int valor){
        int k=0; //Puntero para mover valores
        for(int i=0;i<vector.length;i++){
            if(vector[i]!=valor){
                vector[k]=vector[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] vector1 = new int[]{1,2,3,4,5,9,9,9,9};
        int valor=9;

        int k=removerValor(vector1,valor);
        System.out.println("Elementos del array 1: "+ Arrays.toString(Arrays.copyOf(vector1,k)));
        System.out.println("Numeros de elementos del Array 1: "+k);


    }


}
