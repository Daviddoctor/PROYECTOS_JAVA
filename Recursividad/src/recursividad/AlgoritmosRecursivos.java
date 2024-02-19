package recursividad;

public class AlgoritmosRecursivos {
    long factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
    int fibonacci (int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
    int PotenciaRecursiva (int n, int m) {
        if (m == 0) return 1;
        else return n * PotenciaRecursiva(n, m - 1);
    }
    int ImpresionDescendente (int n) {
        if (n == 0) return 0;
        else {
            System.out.println(n);
            return ImpresionDescendente(n - 1);
        }
    }
}
