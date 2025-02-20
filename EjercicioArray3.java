import java.util.Random;

public class EjercicioArray3 {
    /*Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben introducir en un array de 4 filas por 5 columnas.
El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
 La suma total debe aparecer en la esquina inferior derecha.*/

    public static void main(String[] args) {
        Random rand = new Random();
        int filas =4;
        int columnas = 5;
        int [][] matriz= new int[filas][columnas];

        int suma=0;
        int sumaTotal=0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(10);
                System.out.print(matriz[i][j]+ "\t");
                suma+=matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("-----------------Suma: "+suma);

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                suma+=matriz[i][j];
            }
            System.out.println(suma+"\t");
            sumaTotal+=suma;
        }
        System.out.println("SumaTotal: "+sumaTotal);
    }

}
