package pasoporreferencia;

import persona.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        //Invocar pkg Persona
        Persona persona1 = new Persona ();
        persona1.nombre = "Pedro";
        System.out.println("persona1 = " + persona1.nombre);
        persona1.apellido = "";
        cambiarValor(persona1);
        System.out.println("persona1 = " + persona1.nombre);
    }
   /* public static void cambiarValor(Persona persona){
        persona.nombre = "Maria";
    }*/
    public static Persona cambiarValor(Persona persona){
        persona.nombre = "Karla";
        return persona;
    }
}
