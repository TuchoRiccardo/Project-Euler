import java.math.*;
public class Ejercicio3 {
    //Se necesita encontrar el factor primo mas largo del numero 600851475143
    //que es un factor primo?  Los factores primos de un número son aquellos números primos que
    //, multiplicados entre sí, dan como resultado el número original. 
    //Para encontrar los factores primos de un número, se puede seguir un proceso de división.

    private static BigInteger encontrarFactorPrimo(BigInteger numero){
        BigInteger  mayorFactorPrimo = BigInteger.ZERO;
        BigInteger dos = BigInteger.valueOf(2);
        
        //Vamos a dividir por 2 el numero hasta que no sea divisible
        while(numero.mod(dos).equals(BigInteger.ZERO)){
            mayorFactorPrimo=dos;
            numero=numero.divide(dos);

        }
        //Despues se divide por numeros impares entre 3
        for(BigInteger i=BigInteger.valueOf(3);
        i.multiply(i).compareTo(numero)<=0;i=i.add(BigInteger.TWO)){
            while(numero.mod(i).equals(BigInteger.ZERO)){
                mayorFactorPrimo=i;
                numero=numero.divide(i);
            }
        }
        if(numero.compareTo(BigInteger.TWO)>0){
            mayorFactorPrimo=numero;
        }
        return mayorFactorPrimo;
    }
    public static void main(String[] args) {
        
        BigInteger numero= new BigInteger("600851475143");
        BigInteger factorPrimo=encontrarFactorPrimo(numero);
         System.out.println("Espero que de devuelva el factor primo mas largo posible para el numero ingresado: "+factorPrimo);
         //Funciona

    }
    
}
/*public class Euler {
    public static void main(String[] args) {
        largestPrime(600851475143L);
    }

    private static void largestPrime(long n) {
        long currDivisor = 2L;
        long largestPossible = (long) Math.sqrt(n);
        while (n > 1) {
            if (n % currDivisor == 0) {
                n = n / currDivisor;
            } else if (currDivisor > largestPossible) {
                break;
            } else if (currDivisor >= 3) {
                currDivisor += 2;
            } else {
                currDivisor += 1;
            }
        }
        System.out.println(currDivisor);
    }
} */
