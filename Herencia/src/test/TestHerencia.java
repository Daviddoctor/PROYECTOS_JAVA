package test;

import dominio.Cliente;
import dominio.Empleado;
import java.util.Date;

public class TestHerencia {
//    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Juan", 5000.0);
//        System.out.println("empleado1 = " + empleado1);
//    }
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente( 
                new Date(), 
                true, 
                "Carlos",
                'M',
                20,
                "Calle falsa # 1 2 3"
        );
        System.out.println("cliente1 = " + cliente1);
    }
 
}
