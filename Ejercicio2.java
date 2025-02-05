public class Ejercicio2 {
    //Serie fibonacci, manejar valores hasta el 4 millones y mostar sumatoria
    //APrender a leer, se pedia unicamente los valores
    public static void main(String[] args) {
        int suma=0;
        int ant=1;
        int sig=2;
       while(ant < 4000000){
        if(ant%2==0){
            suma+=ant;
        }
        int aux=ant+sig;
        ant=sig;
        sig=aux;
       }
        System.out.println("Resultado esperado: "+suma);
    }
    
}
