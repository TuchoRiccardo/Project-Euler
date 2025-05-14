import java.util.Random;
/**
 *
 * @author carlos riccardo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Random rd=new Random();
        int edades[]=new int[50];
        int mayor=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;
        int cantMenores=0,cantPrePubert=0,cantJovenes=0,cantMayor=0;
        
        //Agregamos las edades al array usando el objeto rd
        for (int i = 0; i < edades.length; i++) {
            edades[i]=rd.nextInt(18)+10;//La menor edad es de 10 anios
            if(edades[i]>mayor){//Buscamos al de mayor edad
            mayor=edades[i];
            }
            if(edades[i]<menor){//Buscamos al de menor edad
            menor=edades[i];
            }
        }
        //Buscamos las cantidades de alumnos con las otras edades
        for (int i = 0; i < edades.length; i++) {
            if(edades[i]<=12){
            cantMenores++;
            }else if(edades[i]>= 13 && edades[i]<=16){
            cantPrePubert++;
            }else if(edades[i] >= 17 && edades[i] <=20){
            cantJovenes++;
            }else if(edades[i]>20){
            cantMayor++;
            }
        }
        
        System.out.println("Alumno de mayor edad: "+mayor);
        System.out.println("Alumno de menor edad: "+menor);
        System.out.println("Cantidad de alumnos menores o igual a 12: "+cantMenores);
        System.out.println("Cantidad de alumnos entre 13 y 16 anios: "+cantPrePubert);
        System.out.println("Cantidad de alumnos entre 17 y 20: "+cantJovenes);
        System.out.println("Cantidad de alumnos mayores a 20: "+cantMayor);
    }
    
}
