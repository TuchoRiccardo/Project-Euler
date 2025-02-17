public class Ejercicio9 {
    //Encontar el triplete pitagorico que cumpla con lo siguiente
    //a+b+c=1000
    //Encontrar los valores de a,b,c y multiplicarlos. https://projecteuler.net/problem=9

    public static void main(String[] args) {

                int a, b, c = 0;
                boolean encontrado = false;

                for (a = 1; a < 1000 / 3; a++) {
                    for (b = a + 1; b < 1000 / 2; b++) {
                        c = 1000 - a - b;  // Despejo c

                        if (a * a + b * b == c * c) { // Verificamos la ecuación pitagórica
                            encontrado = true;
                            System.out.println("Triplete encontrado: " + a + ", " + b + ", " + c);
                            System.out.println("Producto: " + (a * b * c));
                            break; // Si cumple la condicion cerramos bucles
                        }
                    }
                    if (encontrado) break;
                }
            }
        }


