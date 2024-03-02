package recursividad;

public class AlgoritmosRecursivos {
    long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    int fibonacci(int n) {
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    int PotenciaRecursiva(int n, int m) {
        if (m == 0)
            return 1;
        else
            return n * PotenciaRecursiva(n, m - 1);
    }

    String ImpresionBinaria(int n) {
        if (n == 0) {
            return "0"; // Caso base, cuando el número es 0, la representación binaria es "0"
        } else {
            return ImpresionBinaria(n / 2) + n % 2; // Concatenamos el valor binario
        }
    }

    String ImpresionHexadecimal(int n) {
        if (n < 16) {
            return Integer.toHexString(n).toUpperCase(); // Caso base, cuando el número es menor a 16, la representación}
            // hexadecimal es el valor del número en hexadecimal
        } else {
            return ImpresionHexadecimal(n / 16) + Integer.toHexString(n % 16).toUpperCase(); // Concatenamos el valor hexadecimal
        }
    }
    int sumaDigitos(int n, int m) {
        if (n < 10 && m < 10) {
            return n + m; //Cuando el número tiene un solo digito, se suma por el mismo
        } else {
            int digito1 = n % 10; 
            int digito2 = m % 10;
            return digito1 + digito2 + sumaDigitos(n / 10, m / 10); //Se suma el digito y lo llamamos recursivamente 
        }
    }
    int productoDigitos(int n, int m) {
        if (n < 10) {
            return n * m; //Cuando el número tiene un solo digito, se multiplica por el mismo
        } else {
            int digito = n % 10;
            return digito * m * productoDigitos(n / 10, m); //Se multiplica el digito y lo llamamos recursivamente
        }
    }
}