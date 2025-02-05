
public class Ejecicio {
    //Ejercicio para encontrar la sumatorio de los numeros naturales que son multiplos 3 o 5 si encuentran entre los primeros 1000 numeros naturales
    public static void main(String[] args) {
        int suma=0;

        for(int i=0;i<1000;i++){
            if(i%3==0 || i%5==0){
                System.out.println("numeros multiplos de 3 y 5 : "+i);
                suma+=i;
            }
        }
        System.out.println(suma);
    }
    


}