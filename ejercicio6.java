public class ejercicio6 {
//====@a@8=6☺=♠16☺♠☺♠1=
//Encontrar la diferencia entre la suma de los cuadrados y el cuadrado de la suma de los primeros 100 numeros naturales


    static int sumaCuadrados(int [] numeros) {
        int suma = 0;
        int exponente=2;
        for(int i=0; i<numeros.length; i++){
            suma+=Math.pow(numeros[i],exponente);
        }
        return suma;
    }

    static int cuadradoSuma(int [] numeros) {
        int suma = 0;
        int resultado=0;
        int exponente=2;
        for(int i=0; i<numeros.length; i++){
            suma+=numeros[i];
        }
        resultado= (int) Math.pow(suma,exponente);

        return resultado;
    }

    public static void main(String[] args) {
        int numeros[]=new int [101];

        for(int i=1; i<numeros.length; i++){
            numeros[i]=i;
        }


        int resultado1=0;
        int resultado2=0;

        resultado1=sumaCuadrados(numeros);
        resultado2=cuadradoSuma(numeros);

        System.out.println(resultado1);
        System.out.println(resultado2);
        int diferencia=resultado1-resultado2;
        System.out.println(diferencia);
    }



}
