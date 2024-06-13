package javabasico;

/**
 *
 * @author David Doctor
 */
public class Calculadora extends Funciones {
    public int num1;
    public int num2;
    
    public void realizarSuma(){
        int valor = super.suma(num1, num2);
        System.out.println("El valor de la suma es:" + valor);
    }
       
    public void realizarResta(){
        int valor = super.resta(num1, num2);
        System.out.println("El valor de la resta es:" + valor);
    }
      
    public void realizarMultiplicacion(){
        int valor = super.multiplicacion(num1, num2);
        System.out.println("El valor de la multiplicacion es:" + valor);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
