import java.util.Random;

public class EjercicioArray4 {
    /*Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros,
     a continuación lo inicialice con valores aleatorios (del 1 al 10)
     y posteriormente muestre en pantalla cada elemento del vector junto con su cuadrado y su cubo.*/

    public static void main(String[] args) {
        Random rand = new Random();

        int [] array = new int[10];
        int []cuadrado = new int[10];
        int []cubo = new int[10];
        int exponenteCuadrado=2;
        int exponenteCubo=3;
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(11);
        }
        for (int i = 0; i < 10; i++) {

            cuadrado[i]=(int)Math.pow(array[i],exponenteCuadrado);
        }

        for (int i = 0; i < 10; i++) {

            cubo[i]=(int)Math.pow(array[i],exponenteCubo);
        }


        System.out.println("Numero generados");
        System.out.println("Numero Generado | Cuadrado | Cubo");
        System.out.println("==================================");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%10d →%10d → %8d%n", array[i], cuadrado[i], cubo[i]);
        }


    }
}
