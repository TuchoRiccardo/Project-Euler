import java.math.BigInteger;

public class Ejercicio4 {
    //Encontrar el numero palindromico mas grande usando una multiplicacion de 3 digitos
    //Numero palindromico es cuando leemos el numero de igual forma de izquierda a derecha como de
    //derecha a izquierda. Ej.→ 9009

    //Hago una funcion que compruebe si los numeros son palindromos
    static boolean esPalindromo(int numero){
        int original=numero;
        int reverso=0;
        while(numero !=0){
            int rem=numero%10;
            reverso=reverso*10+rem;
            numero=numero/10;
        }
        if(reverso==original) return true;
        return false;

    }

    public static void main(String[] args) {
        int resultado=0;
        int actual=0;

        for(int i=100;i<=900;i++){
            for(int j=100;j<=900;j++){
                resultado=i*j;
                if(esPalindromo(resultado)) if(resultado>actual) actual=resultado;
            }
        }
        System.out.println(actual);
        }
    }




