
import java.util.Scanner;

//Mostrar el mayor de 2 Numeros Ingresados por teclado
public class Mayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Llamado de libreria para poder escribir por consola, en Scanner oprimir alt+enter
        System.out.println("Digite el primer Numero: ");
        int num1 = Integer.parseInt(entrada.nextLine()); //Esto permite ingresar cualquier valor por teclado 
        System.out.println("Digite el segundo Numero");
        int num2 = Integer.parseInt(entrada.nextLine());
        System.out.println("El núero mayor es : ");
        System.out.println(num1>num2 ? num1:num2);
    }
}
