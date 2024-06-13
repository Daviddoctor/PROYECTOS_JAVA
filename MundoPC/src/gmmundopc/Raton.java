package gmmundopc;

public class Raton {

    private String marca;
    private String modelo;
    private String color;
    private int tamano;
    private String tipo;
    private static int contadorRatones;
    private int idRaton;

    public Raton(String marca, String modelo, String color, int tamano, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.tamano = tamano;
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Raton{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamano=" + tamano
                + ", tipo="
                + tipo + ", idRaton=" + idRaton + '}';
    }
}
