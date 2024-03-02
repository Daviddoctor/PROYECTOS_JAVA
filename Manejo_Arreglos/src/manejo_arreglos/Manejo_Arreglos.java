package manejo_arreglos;

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

public class Manejo_Arreglos {

    public static void main(String[] args) {
        Marco miMarco =  new Marco(); //Objeto que se crea en base a la clase
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("OPERACIONES CON ARREGLOS");
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
    JButton b1, b2, b3, b4, b5, b6, b7;
    int n, x;
    Farreglos objeto;
    public Lamina() {
        setLayout(new AdminComponents());
        objeto = new Farreglos();
        b1 = new JButton("Mostrar arreglo");
        b2 = new JButton("Mostrar arreglo Recur");
        b3 = new JButton("Suma Elementos");
        b4 = new JButton("Búscar elemento");
        b5 = new JButton("Suma pares");
        b6 = new JButton("Suma de Digitos");
        b7 = new JButton("Producto de Digitos");

        b1.addActionListener(new GestionEventos());
        b2.addActionListener(new GestionEventos());
        b3.addActionListener(new GestionEventos());
        b4.addActionListener(new GestionEventos());
        b5.addActionListener(new GestionEventos());
        b6.addActionListener(new GestionEventos());
        b7.addActionListener(new GestionEventos());

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        /*add(b6);
        add(b7);*/
    }

    private class GestionEventos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1) {
                objeto.crearArreglo();
                JOptionPane.showMessageDialog(null, "El arreglo es: \n" + objeto.mostrarArreglo());
            }
            if(e.getSource() == b2) {
                objeto.mostarArregloR(0);
                JOptionPane.showMessageDialog(null, "El arreglo recursivo es: \n" + objeto.mostarArregloR(0));
            }
            if(e.getSource() == b3) {
                objeto.crearArreglo();
                JOptionPane.showInternalMessageDialog(null, "El arreglo es: " + objeto.mostrarArreglo() + "\n La suma de los elementos del arreglo es: " + objeto.sumaElementos(objeto.MAX - 1));  
            }
            if(e.getSource() == b4) {
                x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar"));
                objeto.crearArreglo();
                JOptionPane.showInternalMessageDialog(null, "El arreglo es: " + objeto.mostrarArreglo() + "\n El número " + x + " se encuentra en la posición " + objeto.buscarElemento(objeto.MAX - 1, x));
            }
            if(e.getSource() == b5) {
                objeto.crearArreglo();
                JOptionPane.showInternalMessageDialog(null, "El arreglo es: " + objeto.mostrarArreglo() + "\n La suma de los elementos pares del arreglo es: " + objeto.sumarElementosPares(objeto.MAX - 1));
            }
            /*if(e.getSource() == b6) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                JOptionPane.showInternalMessageDialog(null, "La suma de los digitos de " + n + " y " + m + " es " + objeto.sumaDigitos(n, m));
            }
            if(e.getSource() == b7) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
                JOptionPane.showInternalMessageDialog(null, "El producto de los digitos de " + n + " y " + m + " es " + objeto.productoDigitos(n, m));
            }*/
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
            c.setBounds(x - 350, y, 200, 40);
            x += 230;
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
