import java.util.Random;
import java.util.Arrays;

public class EjercicioArray6 {
/*
* Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10).
*  A continuación debe mostrar todas las notas, la nota media,
* la nota más alta que ha sacado y la menor.*/

    public static void main(String[] args) {
        Random rand = new Random();
        int menor=Integer.MAX_VALUE;
        int mayor=Integer.MIN_VALUE;
        int suma=0;
        double media=0;
        int notas []=new int[5];
        for (int i = 0; i < 5; i++) {
            do {
                notas[i] = rand.nextInt(10);
            }while (notas[i]<0 || notas[i]>10);
            suma+=notas[i];
            if(notas[i]<menor){
                menor=notas[i];
            }
            if(notas[i]>mayor){
                mayor=notas[i];
            }
        }

        media=suma/notas.length;

        System.out.println("\b\nNota ingresadas: "+Arrays.toString(notas));
        System.out.println("Nota promedio del alumno: "+media);
        System.out.println("Nota mayor del alumno: "+mayor);
        System.out.println("Nota menor del alumno: "+menor);





    }
}
