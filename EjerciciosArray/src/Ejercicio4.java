
/**
 *
 * @author carlos riccardo
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        int numeros[]={10,20,35,55,64,7,8,1,5,98,100};
        int mayor=Integer.MIN_VALUE;
        
        System.out.println("Dado los numeros se muestra el mayor numero del array");
        System.out.println("Todos los numeros del array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
            if(numeros[i]> mayor){
            mayor=numeros[i];
            }
        }
        System.out.println("");
        System.out.println("Numero mas grande dentro del array: "+mayor);
    }
    
}
