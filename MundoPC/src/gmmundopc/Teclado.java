package gmmundopc;

public class Teclado {

    private int id;
    private String nombre;
    private int cantidad;
    private String marca;
    private String modelo;
    private String tipo;
    private String color;
    private String estado;
    private String fecha;

    public Teclado() {
    }

    public Teclado(int id, String nombre, int cantidad, String marca, String modelo, String tipo, String color,
            String estado, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Teclado{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", marca=" + marca
                + ", modelo=" + modelo +
                ", tipo=" + tipo + ", color=" + color + ", estado=" + estado + ", fecha=" + fecha + '}';
    }
}
