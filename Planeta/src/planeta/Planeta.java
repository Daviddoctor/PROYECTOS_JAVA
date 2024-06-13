package planeta;

public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;

    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    };

    tipoPlaneta tipo;
    boolean esObservable = false;

    Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol,
            tipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diametro: " + diametro);
        System.out.println("Distancia al sol: " + distanciaSol);
        System.out.println("Tipo: " + tipo);
        System.out.println("Es observable: " + esObservable);
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        float limite = (float) (149597870 * 3.4);
        if (distanciaSol > limite) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, tipoPlaneta.TERRESTRE, true);
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
        System.out.println();
        Planeta p2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, tipoPlaneta.GASEOSO, true);
        p2.imprimir();
        System.out.println("Densidad del planeta = " + p2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());
    }
}
