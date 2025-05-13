
import java.util.Scanner;

/**
 *
 * @author carlos riccardo 
 */
public class Ejercicio3 {
/* Dado un vector de 20 elementos calcular el promedio e imprimir los valores que sean mayores que 
el promedio. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[]=new int[20];
        int suma=0;
        double promedio=0.0;
        
        System.out.println("Ingrese 20 numeros al array");
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=sc.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i];
        }
        
        promedio=suma/numeros.length;
        System.out.println("Suma total de todos los numeros ingresados: "+suma);
        System.out.println("Promedio de los numeros ingresados: "+promedio);
        System.out.println("Numeros mayores al promedio: ");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > promedio){
                System.out.println(numeros[i]);}
        }
        
    }

    
}
