package automovil;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    enum tipoCom{ GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA { CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV }
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int VelocidadActual = 0;

    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    String getMarca() {
        return marca;
    }

    int getModelo() {
        return modelo;
    }

    int getMotor() {
        return motor;
    }

    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    int getNumeroPuertas() {
        return numeroPuertas;
    }

    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    tipoColor getColor() {
        return color;
    }

    int getVelocidadActual() {
        return VelocidadActual;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    void setColor(tipoColor color) {
        this.color = color;
    }

    void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual = VelocidadActual;
    }

    void acelerar(int incrementoVelocidad){
        if (VelocidadActual + incrementoVelocidad < velocidadMaxima) {
            VelocidadActual = VelocidadActual + incrementoVelocidad;
        } else{
            System.out.println("No se puede incrementar a una velocidadsuperior a la máxima del automóvil.");
        } //pag 81
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
