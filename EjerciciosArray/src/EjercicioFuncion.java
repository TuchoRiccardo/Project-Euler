
/**
 *
 * @author carlos riccardo
 */
public class EjercicioFuncion {
    
    static int verificarExponente(int exp,int num2){
    int resul=0;
    if(exp<=0){
        System.out.println("No se puede hacer la operacion por exponente negativo");
    }else
        resul=(int) Math.pow(num2,exp);
    
    return resul;
    
    }
    public static void main(String[] args) {
//        int exponente=2;
//        int base=5;
//        System.out.println(verificarExponente(exponente,base));

int exponente=3;
int base=5;
int resultado=0;
        for (int i = 1; i <=exponente; i++) {
            resultado=base;
            base*=resultado;
        }
       
        System.out.println(resultado);
    }
            
}
