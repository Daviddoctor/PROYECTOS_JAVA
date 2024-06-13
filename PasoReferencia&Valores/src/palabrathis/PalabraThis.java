package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Luis", "Suarez");
        System.out.println("persona = " + persona.nombre + " " +  persona.apellido);
    }
}

    class Persona{
        String nombre;
        String apellido;
        Persona(String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
            new Imprimir().imprimir(this);
        };
    }
class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir" + persona);
        System.out.println("Impresion desde el objeto (this) actual" + this);
    }
}