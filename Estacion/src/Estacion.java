public class Estacion {
    public static void main(String[] args) {
        var mes = 1;
        var estacion = " desconocida";
        switch (mes) {
            case 1, 2, 12 -> estacion = "invierno";
            case 3, 4, 5 -> estacion = "Primavera";
            case 6, 7, 8 -> estacion = "Verano";
            case 9, 10, 11 -> estacion = "Otoño";
            default -> {
            }
        }
        System.out.println("Estación" + estacion);
    }
}