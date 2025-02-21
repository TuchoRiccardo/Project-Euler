import java.util.Scanner;

public class EjercicioArray5 {
    /*
    Crear un vector de 5 elementos de cadenas de caracteres,
    inicializa el vector con datos leídos por el teclado.
    Copia los elementos del vector en otro vector pero en orden inverso,
    y muéstralo por la pantalla.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenas [] = new String[5];
        String [] inverso = new String[5];

        System.out.println("Ingrese 5 palabras, despues de cada una toque enter");
        for (int i = 0; i < 5; i++) {
            cadenas[i] = sc.nextLine();
            inverso[i] = cadenas[i];
        }

        System.out.println("Asegurese de que estan son sus palabras");
        for(String palabra : cadenas) {
            System.out.println(palabra);
        }
        System.out.println("--------------------------------------------");
////            System.out.println("Palabras en orden invertido");
//            for(int i = cadenas.length-1; i >= 0; i--) {
//                inverso[i] = cadenas[i];
//                //System.out.println(cadenas[i]);
//            }
        System.out.println("-------------------------------------------------");
        System.out.println(" cadenas invertida");
        System.out.println("-----------------------------------");
            for (int i =inverso.length-1; i >= 0; i--) {
                System.out.println(inverso[i]);
            }




    }

}
