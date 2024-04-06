package operacioneslistas;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OperacionesListas {

    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("Ordenar arreglos");
    }
}

class Marco extends JFrame {
    public Marco() {
        setBounds(200, 200, 850, 450);
        Lamina miLamina = new Lamina();
        add(miLamina);
        setVisible(true);
    }
}

class Lamina extends JPanel {
    JButton b1, b2, b3, b4, b5, b6, b7;
    int n, x;
    char origen, destino, auxiliar;
    Lista objeto;

    public Lamina() {
        objeto = new Lista();
        setLayout(new AdminComponentes());
        objeto = new Lista();
        b1 = new JButton("Ingresar al inicio");
        b2 = new JButton("Ingresar en orden");
        b3 = new JButton("Mostar Lista");
        b4 = new JButton("Suma de elementos");
        b5 = new JButton("Suma elementos pares");
        b6 = new JButton("Contar Pares");
        b7 = new JButton("Buscar elemento");

        b1.addActionListener(new FuncionBotones());
        b2.addActionListener(new FuncionBotones());
        b3.addActionListener(new FuncionBotones());
        b4.addActionListener(new FuncionBotones());
        b5.addActionListener(new FuncionBotones());
        b6.addActionListener(new FuncionBotones());

        //add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
    }

    private class FuncionBotones implements ActionListener {// para heredar de clase abstracta se usa implements
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b2) {
                x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
                objeto.ingresarOrdenado(x);
                JOptionPane.showMessageDialog(null, "Lista: \n" + objeto.mostrarLista());
            } /*else if (e.getSource() == b2) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
                objeto.ingresarAlFinal(auxiliar);
                JOptionPane.showMessageDialog(null, "Lista: \n" + objeto.mostrarLista());
            } else if (e.getSource() == b3) {
                JOptionPane.showMessageDialog(null, "Lista: \n" + objeto.mostrarLista());
            }*/ else if (e.getSource() == b4) {
                JOptionPane.showMessageDialog(null,
                        "La suma de los elementos de la lista es: " + objeto.suma(objeto.lista));
            } else if (e.getSource() == b5) {
                JOptionPane.showMessageDialog(null,
                        "La suma de los elementos pares de la lista es: " + objeto.sumaPares(objeto.lista));
            } else if (e.getSource() == b6) {
                JOptionPane.showMessageDialog(null, "La lista es \n" + objeto.mostrarLista() +
                        "La cantidad de elementos pares de la lista es: " + objeto.ContarPares(objeto.lista));
            } else if (e.getSource() == b7) {
                x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
                if (objeto.buscar(objeto.lista, x)) {
                    JOptionPane.showMessageDialog(null, "La lista es \n" + objeto.mostrarLista() + "El dato " + x + " se encuentra en la lista");
                } else {
                    JOptionPane.showMessageDialog(null, "La lista es \n" + objeto.mostrarLista() + "El dato " + x + " no se encuentra en la lista");
                }
            }
        }
    }

    class AdminComponentes implements LayoutManager {
        int x, y = 20;

        @Override
        public void addLayoutComponent(String name, Component comp) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from//// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void removeLayoutComponent(Component comp) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from//// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from//// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from//// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void layoutContainer(Container miContenedor) {
            int d = miContenedor.getWidth();
            x = d / 2;
            int contador = 0;
            int n = miContenedor.getComponentCount();
            for (int i = 0; i < n; i++) {
                contador++;
                Component c = miContenedor.getComponent(i);
                c.setBounds(x - 350, y, 200, 40);
                x += 230;
                if (contador % 3 == 0) {
                    x = d / 2;
                    y += 60;
                }
            }
        }

    }
}
