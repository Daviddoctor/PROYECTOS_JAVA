package gmmundopc;

public class Orden {
    private int id;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.id = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
        this.contadorComputadoras = 0;
    }

    public void agregarComputadora(Computadora computadora) {
        this.computadoras[this.contadorComputadoras] = computadora;
        this.contadorComputadoras++;
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + this.id);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Computadora #" + (i + 1) + ": " + this.computadoras[i]);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    public int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public void setContadorComputadoras(int contadorComputadoras) {
        this.contadorComputadoras = contadorComputadoras;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", computadoras=" + computadoras + ", contadorComputadoras=" + contadorComputadoras + ", contadorOrdenes=" + contadorOrdenes + '}';
    }
}
