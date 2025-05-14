
import java.util.Random;

/**
 *
 * @author carlos riccardo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Random rn =new Random();
        int numeros[]=new int[20];
        int contador=0;
        int numerosPositivos[];
        
        //asignar valores al array usando el objeto random
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=rn.nextInt(201)-100;//Se asignan valores aleatorios, de esta forma se ingresan numeros positivos hasta 100 y negativos hasta -100
          if(numeros[i]>0){
          contador++;//Si el numero generado es mayor a 0 se incrementa el contador
          }   
        }
        numerosPositivos=new int[contador];//Usando la cantidad de positivos se da el tamaño al array B
        System.out.println("Numeros del primer array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");//Mostramos los numeros generados
        }
        System.out.println("");
        int j=0;//indice para el vector B
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>0){
            numerosPositivos[j]=numeros[i];//Se asignan los numeros positivos al Array B
            j++;
            }
        }
        System.out.println("Numeros positivos del array principal: ");
        for(int numPositivos:numerosPositivos){
            System.out.print(numPositivos+" ");}
            
            
    }
}
