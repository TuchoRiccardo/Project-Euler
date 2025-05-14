
import java.util.Random;

/**
 *
 * @author carlos riccardo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int a[]=new int [20];
        int b[]=new int[20];
        int c[]=new int[10];
        Random rd=new Random();
        
        //Asignar valores al primer array
        for (int i = 0; i < a.length; i++) {
            a[i]=rd.nextInt(101);
        }
        //asignar valores al segundo array
        for (int i = 0; i < b.length; i++) {
            b[i]=rd.nextInt(101);
        }
        
        //Muestro valores de los array
        System.out.println("Numeros generados para el primer array");
        for(int num:a){
            System.out.print(num+" ");
        }
        System.out.println("");
        System.out.println("Numeros del segundo array");
        for(int numB:b){
            System.out.print(numB+" ");
        }
        System.out.println("");
        //Calculo para el array C
        
        for (int i = 0; i < c.length; i++) {
            c[i]=b[i]*a[i]/2;
        }
        System.out.println("");
        System.out.println("Valores del tercer array");
        for(int numC:c){
            System.out.print(numC+" ");}
    }
}
