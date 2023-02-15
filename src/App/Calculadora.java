package App;
/**
 * @author José jiménez
 * @version 1.0
 */
public class Calculadora {
    /*
     *Metodo constructor por defecto
     * */
    public Calculadora(){
    }
    /**
     * Metodo suma
     * @param num1 primer metodo del metodo suma
     * @param num2 segundo nummero del metodo suma
     * @return devuelve el resultado de la suma del primer numero  y del segundo
     */
    public int suma(int num1,int num2){
        return num1+num2;
    }
    /**
     * Metodo resta
     * @param num1 primer numero del metodo resta
     * @param num2 segundo numero del metodo resta
     * @return devuelve el resultado de la resta del primer numero y edl segundo
     */
    public int resta(int num1,int num2){
        return num1-num2;
    }
    /**
     * Metodo multiplica
     * @param num1 primer numero del metodo multiplica
     * @param num2 segundo numero del metodo multiplica
     * @return devuelve el resultado de la multiplicacion del primer numero y del segundo
     */
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    /**
     * @param num1 primer numero del metodo divide
     * @param num2 segundo numero del metodo divide
     * @return devuelve el resultado de la division del primer numero y del segundo
     * @throws ArithmeticException Excepcion para cuando el segundo numero es 0
     */
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }
    private int valor1;
    private int valor2;
}