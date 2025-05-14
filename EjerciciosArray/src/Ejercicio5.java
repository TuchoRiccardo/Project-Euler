
/**
 *
 * @author carlos riccardo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int [] numeros={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int suma=0;
        System.out.println("Numeros a sumar en las posiciones pares");
        for (int i = 0; i < numeros.length; i+=2) {
            System.out.println("\n"+numeros[i]);
        }
        
        for (int i = 0; i < numeros.length; i+=2) {
            suma+=numeros[i];
        }
        System.out.println("Suma de todos los numeros en posiciones pares: "+suma);
    }
}
