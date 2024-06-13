package archivoencriptado;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ArchivoEncriptado {

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
    JButton b1;
    Encrypt objeto;

    public Lamina() {
        objeto = new Encrypt();
        setLayout(new AdminComponentes());
        objeto = new Encrypt();
        b1 = new JButton("Encriptar texto");
        

        b1.addActionListener(new FuncionBotones());
        

        add(b1);
    }

    private class FuncionBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b1) {
                objeto.encriptarTexto();
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
