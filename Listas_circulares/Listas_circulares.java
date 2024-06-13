package listas_circulares;

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

public class Listas_circulares {

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
    Nodolista objeto;

    public Lamina() {
        objeto = new Nodolista();
        setLayout(new AdminComponentes());
        objeto = new Nodolista();
        b1 = new JButton("Ingresar Dato");
        b2 = new JButton("Datos a sumar");

        b1.addActionListener(new FuncionBotones());
        b2.addActionListener(new FuncionBotones());

        add(b1);
        add(b2);
    }

    private class FuncionBotones implements ActionListener {// para heredar de clase abstracta se usa implements
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a ingresar"));
                objeto.ingresardato(n);
                JOptionPane.showMessageDialog(null, "Lista: " + objeto.mostrarLista());
            } else if (e.getSource() == b2) {
                JOptionPane.showMessageDialog(null, "La suma de los datos es: " + objeto.sumaDatos());
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
