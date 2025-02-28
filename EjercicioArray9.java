import java.util.Scanner;

public class EjercicioArray9 {
    /*Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes.
     Debes usar un vector.
    Para simplificarlo vamos a suponer que febrero tiene 28 días.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] meses = {
                "Enero-31", "Febrero-28", "Marzo-31", "Abril-30", "Mayo-31", "Junio-30",
                "Julio-31", "Agosto-31", "Septiembre-30", "Octubre-31", "Noviembre-30", "Diciembre-31"
        };
        System.out.println("ingrese un numero correspondiente a un mes");
        int numeroMes=sc.nextInt();
        if(numeroMes >= 0 && numeroMes <= 12){
            String [] datos= meses[numeroMes-1].split("-");
            System.out.println("El mes "+datos[0]+" tiene"+datos[1]);
        }

    }
}
