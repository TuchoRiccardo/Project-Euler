
import java.util.Scanner;

public class Ejercicio1 {
    /*Dado un vector A de 10 elementos y un número N a ser leído se pide contar la cantidad de veces 
que aparece dicho número en el vector e imprimir el resultado. */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int numeros[]={2,4,5,7,7,7,20,25,98,98,70,7,55};
        int buscar=0;
        int cont=0;
        
        System.out.println("Por favor ingrese un numero para buscar en el arreglo");
        buscar=sc.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
            if(buscar==numeros[i]){
            cont++;
            continue;
             }else
                System.out.println("No se encuentra el numero en el array");
            break;
            
        }
      System.out.println("Cantidad de veces que el numero se repite en el array: "+cont);
        
                
        
        
        
    }
    
}
