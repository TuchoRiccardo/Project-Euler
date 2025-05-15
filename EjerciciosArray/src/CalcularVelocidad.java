
import java.util.Scanner;


/**
 *
 * @author carlos riccardo
 */
public class CalcularVelocidad {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos=0;
        int segundos=0;
        double velocidad=0;
        int distancia=1500;
        //double sam=segundos/60;
        
        System.out.println("Ingrese los minutos y segundos del competidor");
        minutos=sc.nextInt();
        segundos=sc.nextInt();
        int tiempoTotalSegundos=minutos*60+segundos;
        //Calcula de la velocidad en metros por segundo
        velocidad=(double)distancia/tiempoTotalSegundos;
        System.out.println("Velocidad de metros por segundo: "+velocidad);
        //Calcula para mostrar la velocidad por Km/h
        double velocidadKm=velocidad*3.6;
        System.out.println("Velocidad del competidor es: "+velocidadKm+" Km/h");
        
        
    }
    
    
    
}
