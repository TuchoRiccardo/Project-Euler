import java.util.Scanner;

public class Ejercicio5 {
    //What is the smallest positive number that is evenly divisible by all the numbers from
    // 1 to 20??

    private static long calcularMCM(int [] numeros){
        if(numeros == null || numeros.length==0){
            return 0;
        }
        long suma = numeros[0];

        for(int i=1;i<numeros.length;i++){
            suma=calcularMCM(suma,numeros[i]);
        }
        return suma;
    }

    public static long calcularMCM(long a, long b){
        return (a*b)/calcularMCD(a,b);
    }

    private static long calcularMCD(long a, long b){
    while(b !=0){
        long temporal=b;
        b=a%b;
        a=temporal;
    }
    return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        long resultado=calcularMCM(numeros);
        System.out.println(resultado);

    }

}
