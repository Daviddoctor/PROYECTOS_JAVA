
package recursividad;

import javax.swing.JButton; //Clase que me permite realizar botones
import javax.swing.JFrame; //Clase que me permite realizar ventanas
import javax.swing.JOptionPane;
import javax.swing.JPanel; //Clase que me permite realizar paneles en la ventana
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

public class Recursividad {

    public static void main(String[] args) {
        Marco miMarco =  new Marco(); //Objeto que se crea en base a la clase
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("ALGORITMOS RECURSIVOS");
    }
    
}

class Marco extends JFrame {
    public Marco() {
        setBounds(200,200,850,450);
        Lamina miLamina = new Lamina();
        add(miLamina);
        setVisible(true);
    }//Constructor
}

class Lamina extends JPanel {
    JButton b1, b2, b3, b4, b5;
    int n, m;
    AlgoritmosRecursivos objeto;
    public Lamina() {
        setLayout(new AdminComponents());
        objeto = new AlgoritmosRecursivos();
        b1 = new JButton("Factorial");
        b2 = new JButton("Fibonacci");
        b3 = new JButton("Potencia");
        b4 = new JButton("Conversión Binario");

        b1.addActionListener(new GestionEventos());
        b2.addActionListener(new GestionEventos());
        b3.addActionListener(new GestionEventos());
        b4.addActionListener(new GestionEventos());

        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    private class GestionEventos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1) {
                //JOptionPane es el metodo que me permite mostrar mensajes en una ventana
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo")); //Convierte el valor que se introduce en un entero
                JOptionPane.showInternalMessageDialog(null, "El factorial de " + n + " es " + objeto.factorial(n));
            }
            if(e.getSource() == b2) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                JOptionPane.showInternalMessageDialog(null, "El termino " + n + " de la sucesión es " + objeto.fibonacci(n));
            }
            if(e.getSource() == b3) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                //Resolver Potencia
                JOptionPane.showInternalMessageDialog(null, "La potencia de " + n + " elevado a " + m + " es " + objeto.PotenciaRecursiva(n, m));
            }
            if(e.getSource() == b4) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                JOptionPane.showInternalMessageDialog(null, "La impresion Binaria de " + n + " es " + objeto.ImpresionBinaria(n));
            }
        }
    }
}

class AdminComponents implements LayoutManager {
    int x, y = 20;

    @Override
    public void addLayoutComponent(String name, Component comp) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void layoutContainer(Container miContenedor) {
        int d = miContenedor.getWidth();
        x = d/2;
        int contador = 0;
        int n = miContenedor.getComponentCount();
        for (int i = 0; i < n; i++) {
            contador++;
            Component c = miContenedor.getComponent(i);
            c.setBounds(x - 290, y, 170, 40);
            x += 200;
            if (contador % 3 == 0) {
                x = d/2;
                y += 60;
            } 
        }
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        // TODO Auto-generated method stub
        
    }
    
}