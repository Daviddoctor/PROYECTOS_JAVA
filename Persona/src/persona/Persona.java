package persona;

public class Persona {
    String nombre;
    String apellido;
    String numeroDocumentoIdentidad;
    int añoNacimiento;

    Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
    }

    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Numero de documento de identidad: " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + añoNacimiento);
        System.out.println();
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Perez","1053121010",1998);
        Persona p2 = new Persona("Luis","León","1053223344",2001);
        p1.imprimir();
        p2.imprimir();
    }
    
}
