package operacioneslistas;

public class Lista {
    Nodo lista;

    public Lista() {
        lista = null;
    }

    void ingresarAlInicio(int x) {
        Nodo nuevo = new Nodo(x);
        if (lista == null) {
            lista = nuevo;
        } else {
            nuevo.sig = lista;
            lista = nuevo;
        }
    }

    void ingresarAlFinal(int x) {
        Nodo nuevo = new Nodo(x);
        if (lista == null) {
            lista = nuevo;
        } else {
            Nodo aux = lista;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
    }

    void ingresarOrdenado(int x) {
        Nodo nuevo = new Nodo(x);
        if (lista == null) {
            lista = nuevo;
        } else if (x < lista.info) {
            nuevo.sig = lista;
            lista = nuevo;
        } else {
            Nodo p = lista;
            Nodo q = null;
            while (p != null && p.info < x) {
                q = p;
                p = p.sig;      
            }
            q.sig = nuevo;
            nuevo.sig = p;
        }
    }

    String mostrarLista() {
        String salida = "";
        Nodo temp = lista;
        while (temp != null) {
            salida += temp.info + "  ";
            temp = temp.sig;
        }
        return salida;
    }

    int suma(Nodo p) {
        if (p == null) {
            return 0;
        } else {
            return p.info + suma(p.sig);
        }
    }

    int sumaPares(Nodo p) {
        if (p == null) {
            return 0;
        } else {
            if (p.info % 2 == 0) {
                return p.info + sumaPares(p.sig);
            } else {
                return sumaPares(p.sig);
            }
        }
    }

    int ContarPares(Nodo p) {
        if (p == null) {
            return 0;
        } else {
            if (p.info % 2 == 0) {
                return 1 + ContarPares(p.sig);
            } else {
                return ContarPares(p.sig);
            }
        }
    }

    boolean buscar(Nodo p, int x) {
        if (p == null)
            return false;
        else if (p.info == x)
            return true;
        else
            return buscar(p.sig, x);
    }
    //Se solicite un dato y diga cuantos datos son mayores en la lista al dato ingresado int contarMayores(Nodo p, x)
    //Se sume los datos menores int sumarMenores(Nodo p, x)
}
