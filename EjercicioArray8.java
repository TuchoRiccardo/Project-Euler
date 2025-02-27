import java.util.Arrays;
import java.util.Random;

public class EjercicioArray8 {
    /*
    * Hacer un programa que inicialice un vector de números con valores aleatorios, y posterior ordene los elementos de menor a mayor.*/


    public static void ordenarArray(int [] array){
        int num=array.length;
        boolean intercambio;

        for(int i=0;i<num-1;i++){
            intercambio=false;
            for(int j=0;j<num-1-i;j++){
                if(array[j]>array[j+1]){
                    int temporal=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temporal;
                    intercambio=true;
                }
            }
            if(!intercambio)break;
        }

    }

    static void imprimirArray(int [] array){
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int [] vector =new int[10];

        for(int i=0;i<10;i++){
            vector[i]=aleatorio.nextInt(100);
        }
        System.out.println("Array antes del ordenamiento");
        imprimirArray(vector);

        ordenarArray(vector);
        System.out.println("Array despues del ordenamiento");
        imprimirArray(vector);


        /*System.out.println("Vector aleatorio"+ Arrays.toString(vector));

        Arrays.sort(vector);

        System.out.println("Sorted Array"+Arrays.toString(vector));*/
    }
}
