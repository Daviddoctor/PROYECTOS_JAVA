package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("pedro", 5000.0,false);
        System.out.println("Persona1: " + persona1);
//        System.out.println("Persona : " + persona1.toString());
//      System.out.println("persona: " + persona1.getNombre() + " " + "Sueldo: " + " " + persona1.getSueldo()+ " " + "Eliminado: " + persona1.isEliminado());
//      persona1.setNombre("Juan Carlos");
//      System.out.println("persona1 = " + persona1.getNombre());
    }
}
