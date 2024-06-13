package javabasico;

import java.util.Scanner;

/**
 *
 * @author David Doctor
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba el primer número");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("El valor del primer número es:" + num1);
        
        System.out.println("Escriba el Segundo número");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El valor del Segundo número es:" + num2);
        
        System.out.println("Ingrese la operación que quiere realizar:");
        String operador = scanner.nextLine();
        
        Calculadora cal = new Calculadora();
        cal.setNum1(num1);
        cal.setNum2(num2);
        
        if (operador.equals("+")){
            cal.realizarSuma();
        }else if (operador.equals("-")) {
            cal.realizarResta();
        }else if (operador.equals("*")) {
            cal.realizarMultiplicacion();
        }
    }
    
}
