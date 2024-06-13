package listas_circulares;

import java.util.Scanner;

public class Nodolista {
    Nodo lista;

    public Nodolista() {
        lista = null;
    }

    void ingresardato(int x) {
        Nodo nuevo = new Nodo(x);
        if (lista == null) {
            lista = nuevo;
            nuevo.sig = lista;
            nuevo.ant = lista;
        } else if (x < lista.info) {
            nuevo.sig = lista;
            nuevo.ant = lista.ant;
            lista.ant.sig = nuevo;
            lista.ant = nuevo;
            lista = nuevo;
        } else {
            Nodo p = lista.sig;
            while (p != lista && x > p.info) {
                p = p.sig;
                nuevo.sig = p;
                nuevo.ant = p.ant;
                p.ant.sig = nuevo;
                p.ant = nuevo;
            }
        }
    }

    String mostrarLista() {
        String salida = "";
        Nodo p = lista;
        if (lista != null) {
            do {
                salida = salida + p.info + " ";
                p = p.sig;
            } while (p != lista);
        }
        return salida;
    }

    int sumaDatos() {
        int suma = 0;
        if (!(lista == null)) {
            suma += lista.info;
            Nodo p = lista.sig;
            while (p != lista) {
                suma += p.info;
                p = p.sig;
            }
        }
        return suma;
    }
    void retirarDato(int x) {
        if(lista != null) {
            if (x == lista.info) {
                lista.sig.ant = lista.ant;
                lista.ant.sig = lista.sig;
                lista = lista.sig;
            } else {
                Nodo p = lista.sig;
                while (p != lista && x > p.info) {
                    p = p.sig;
                }
                if (p != lista) {
                    p.sig.ant = p.ant;
                    p.ant.sig = p.sig;
                }
            }
        }
    }
}