/**
 *
 * @author carlos riccardo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        //Probar despues que los valores los ingrese el usuario
        int num[]={0,1,2,3,4,5,6,7,8,9,10,15,16,171,18,19,26,37};
        int suma=0;
        //usamos un ciclo for para recorrer el array
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=i){
            suma+=num[i];
            }
        }
        System.out.println("Resultado de la suma del array: "+suma);
    }
    
}
