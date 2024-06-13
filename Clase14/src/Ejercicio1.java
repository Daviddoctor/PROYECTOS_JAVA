
/**
 *
 * @author David Doctor
 */
public class Ejercicio1 {
    //psvm: Para escribir el metodo main
    public static void main(String[] args) {
        //Declaración de variable entera
        int myVarEnt = 10;
        //soutv: Imprime la ultima variable escrita
        System.out.println("myVarEnt = " + myVarEnt);
        //Declaración de Variable tipo Cadena (String)
        String myVarString = "Hola Mundo!";
        System.out.println("myVarString = " + myVarString);
        //Inferencia de tipos en Java
        var myVarEnt2 = 15;
        System.out.println("myVarEnt2 = " + myVarEnt2);
        var myString2 = "Soy Programador";
        System.out.println("myString2 = " + myString2);
        //Forma correcta de declarar variables
        var myVar = 24; //camelCase
        var _myVar = 23;
        var $myVar = 22;
    }
}
