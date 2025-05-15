
import java.util.Scanner;

/**
 *
 * @author carlos Riccardo
 */
public class EjerciPP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=0;
        int b=0;
        int c=0;
        
        System.out.println("Ingrese 3 numeros");
        System.out.println("Numero 1: ");
        a=sc.nextInt();
        System.out.println("Nmero 2: ");
        b=sc.nextInt();
        System.out.println("Numero 3 :");
        c=sc.nextInt();
        
//        if(a+c==b){
//        System.out.println("La suma de a: "+a+" mas la suma de c: "+c+" es igual a b: "+b);
//        }else if(a+b==c){
//            System.out.println("La suma de a: "+a+" mas la suma de b: "+b+" es igual a c: "+c);
//        
//        }else if(b+c==a){
//        System.out.println("La suma de b: "+b+" mas la suma de c: "+c+" es igual a a: "+a);
//        }else
//            System.out.println("Ningun numero ingresado es igual a la suma de alguno de ellos");

//Se ve mejor de esta forma
 if (a + b == c) {
            System.out.printf("%d + %d = %d%n", a, b, c);
        } else if (a + c == b) {
            System.out.printf("%d + %d = %d%n", a, c, b);
        } else if (b + c == a) {
            System.out.printf("%d + %d = %d%n", b, c, a);
        } else {
            System.out.println("Ningún número es igual a la suma de los otros dos.");
        }

    }
            
    
}
