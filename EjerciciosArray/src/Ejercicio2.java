public class Ejercicio2 {
/*Dado un vector de 20 elementos se pide realizar la suma de aquellos elementos que sean mayor o 
igual que 5 y la cantidad de elementos que se han sumado. Imprimir los resultados. */

    public static void main(String[] args) {
        int numeros[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,1,18,19,22};
        int suma=0;
        int cantElementos=0;
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] >= 5){
            suma+=numeros[i];
            cantElementos++;
            }
        }
        System.out.println("Suma de elementos mayores o igual a 5: "+suma);
        System.out.println("Cantidad de elementos sumados: "+cantElementos);
    }
    
}
