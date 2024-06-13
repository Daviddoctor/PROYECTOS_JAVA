package listas_circulares;

public class Nodo {
    int info;
    Nodo sig, ant;

    public Nodo(int x) {
        this.info = x;
        ant = sig = null;
    }
}