import java.util.Scanner;

public class EjercicioArray1 {
    //Se pide escribir un programa que pida 10 numeros por teclado
    //los almacene en un array
    // y luego mostrar por consola el numero mayor que se encuentra dentro del array, el numero menor y  las posiciones que ocupan

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");
        int numeroPosicionMayor=0;
        int numeroPosicionMenor=0;
        int mayor=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;

        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextInt();

            if(vector[i]>mayor) {
                mayor=vector[i];
                numeroPosicionMayor=i+1;//Teniendo en cuenta que los arrays son base-cero, con esto la posicion es como si contaramos naturalmente.
            }
            if(vector[i]<menor) {
                menor=vector[i];
                numeroPosicionMenor=i+1;
            }
        }

        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("La posicion del numero mayor dentro del array es: "+numeroPosicionMayor+" y la posicion del numero menos dentro del array es: "+numeroPosicionMenor);


    }
}
