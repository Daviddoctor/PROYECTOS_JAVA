
import java.util.Scanner;

//Entrada de Datos por teclado en Java
public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int numero1,numero2;
        System.out.println("Digite el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.println("La suma es: " + (numero1 + numero2));
        System.out.println("La resta es: " + (numero1 - numero2));
        System.out.println("La multiplicacion es: " + (numero1 * numero2));
        System.out.println("La división es: " + (numero1 / numero2));
        String nombre = "Juan";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comillas simple: \'" + nombre + "\'");
    }
}
