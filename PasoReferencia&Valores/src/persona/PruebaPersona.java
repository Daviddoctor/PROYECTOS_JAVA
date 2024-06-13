package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();  //Constructor persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
    }
}
