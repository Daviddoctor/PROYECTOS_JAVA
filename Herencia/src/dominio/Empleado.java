package dominio;

//Hijo de la clase principal por eso la palabra clave extends.
public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Constructor
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }
    //Metodos Getter and Setter
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodo toString, recargado
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado = ").append(idEmpleado);
        sb.append(", sueldo = ").append(sueldo);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }    
}
