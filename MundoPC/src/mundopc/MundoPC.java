package mundopc;

import gmmundopc.*;

public class MundoPC {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado(0, "bluetooth", 0, "HP", null, null, null, null, null);
        Raton ratonHP = new Raton("bluetooth", "HP", null, 0, null);
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado(0, "bluetooth", 0, "Gamer", null, null, null, null, null);
        Raton ratonGamer = new Raton("bluetooth", "Gamer", null, 0, null);
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
}
