package programaarreglos;

public class OperacionesArreglos {
    int MAX;
    int a[];

    // constructor
    public OperacionesArreglos() {
        MAX = 10;
        a = new int[MAX];
    }

    void crearArreglo() {
        for (int i = 0; i < MAX; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
    }

    // Para llamar este método se debe enviar como parametro 0
    String mostrarArregloR(int n) {
        if (n >= MAX) {
            return "";
        } else {
            return a[n] + " " + mostrarArregloR(n + 1);
        }
    }

    String mostrarArregloNR() {
        String salida = "";
        for (int i = 0; i < MAX; i++) {
            salida += a[i] + " ";
        }
        return salida;
    }

    int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return a[n] + suma(n - 1);
        }
    }

    int sumaPares(int n) {
        if (n < 0)
            return 0;
        else if (a[n] % 2 == 0)
            return a[n] + sumaPares(n - 1);
        else
            return sumaPares(n - 1);
    }

    int contarMayores(int n, int x) {
        if (n < 0)
            return 0;
        else if (a[n] > x)
            return 1 + contarMayores(n - 1, x);
        else
            return contarMayores(n - 1, x);
    }

    // Suma de numeros menores a un cierto valor
    int sumaMenores(int n, int x) {
        if (n < 0)
            return 0;
        else if (a[n] < x)
            return a[n] + sumaMenores(n - 1, x);
        else
            return sumaMenores(n - 1, x);
    }
}
