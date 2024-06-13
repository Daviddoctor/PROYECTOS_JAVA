//Operadores de relación
public class Relacion {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        var g = a > b;
        System.out.println("g = " + g);
        //a>=b, a<=b 
        if(a%2 == 0){
            System.out.println("Es número par: ");
        }
        else{
            System.out.println("El número es impar: ");
        }
        var edad = 17;
        var adulto = 18;
        if (edad > 18){
            System.out.println("Es adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        //Operadores condicionales (And = Y), (Or = O)
        var c = 10;
        var valorMaximo = 10;
        var valorMinimo = 0;
        
        var resultado = c >= 0 && c <= 10;
        System.out.println("resultado: " + resultado);
        if (!resultado == false){
            System.out.println("Dentro del rango");
        } else{
            System.out.println("Fuera del rango");
        }
        
        var vacaciones = false;
        var diaDescanso = true;
        
        if(vacaciones || diaDescanso){
            System.out.println("Padre asiste al juego con el Hijo. :)");
        } else{
            System.out.println("Padre ocupado. :(");
        }
        //Operadores Ternarios
        var result = (3 > 2) ? "True" : "False";
        System.out.println("El resultado del ternario es: " + result);
        
        //Ejemplo:
        var num = 8;
            // % nos verifica si el numero es par
        var result2 = (num%2 == 0) ? "Número Par" : "Número Impar";
        System.out.println("Resultado 2:" + result2);
    }
}
