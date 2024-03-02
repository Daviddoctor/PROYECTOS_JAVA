package manejo_arreglos;

public class Farreglos {
    int MAX;
    int a[];

    public Farreglos() {
        MAX = 10;
        a = new int[MAX];
    }

    void crearArreglo() {
        for (int i = 0; i < MAX; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }
    }

    String mostrarArreglo() {
        String salida = "";
        for (int i = 0; i < MAX; i++) {
            salida += a[i] + "  ";
        }
        return salida;
    }

    String mostarArregloR(int n) {
        if (n == MAX) {
            return "  ";
        } else {
            return a[n] + "  " + mostarArregloR(n + 1);
        }
    }

    int sumaElementos(int n) {
        if (n < 0) {
            return 0;
        } else {
            return a[n] + sumaElementos(n - 1);
        }
    }

    int buscarElemento(int x, int n) {
        if (n < 0) {
            return -1;
        } else if (x == a[n]) {
            return n + 1;
        } else {
            return buscarElemento(n - 1, x);
        }
    }
    int sumarElementosPares (int n) {
        if (n < 0) {
            return 0;
        } else if (a[n] % 2 == 0) {
            return a[n] + sumarElementosPares(n - 1);
        } else {
            return sumarElementosPares(n - 1);
        }
    }
}