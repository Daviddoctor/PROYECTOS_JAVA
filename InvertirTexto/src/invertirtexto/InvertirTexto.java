
package invertirtexto;

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


public class InvertirTexto 
{

    public static void main(String[] args) 
    {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("Listas Restringidas (PILAS y COLAS)");
    }
}

class Marco extends JFrame
{
  public Marco(){
      setBounds(200,200,850,450);
      Lamina miLamina = new Lamina();
      add(miLamina);
      setVisible(true);
  }    
}

class Lamina extends JPanel {
    JButton b1, b2, b3, b4, b5, b6;
    int n,x;
    String s;// para el ejercicio
    char origen,destino,auxiliar,c;
    Pila objeto1;

    public Lamina() {
        objeto1 = new Pila();        
        setLayout(new AdminComponentes());
        b1 = new JButton("Invertir palabra usando una pila");
        b2 = new JButton("Retirar dato de pila");
        b3 = new JButton("Palimdromo?");
//        b4 = new JButton("Retirar dato de cola");
//        b5 = new JButton("Invertir Palabra");
//        b6 = new JButton("Palindrome");
        
        b1.addActionListener(new FuncionBotones());
        b2.addActionListener(new FuncionBotones());
        b3.addActionListener(new FuncionBotones());
//        b4.addActionListener(new FuncionBotones());
//        b5.addActionListener(new FuncionBotones());
//        b6.addActionListener(new FuncionBotones());

        add(b1);
        add(b2);
        add(b3);
//        add(b4);
//        add(b5);
//        add(b6);
    }

    private class FuncionBotones implements ActionListener {// para heredar de clase abstracta se usa implements  
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource() == b1) {
                s = JOptionPane.showInputDialog("Ingresar un String: ");
                for (int i = 0; i < s.length(); i++) {
                    c = s.charAt(i);
                    objeto1.inDato(c);
                }               
                JOptionPane.showMessageDialog(null, "La pila es:\n "+objeto1.mostrarPila());
            }else if(e.getSource() == b2){
                objeto1.retirarValor();
                JOptionPane.showMessageDialog(null, "La pila es:\n "+objeto1.mostrarPila());
            }else if(e.getSource() == b3){
                objeto1.palindromo(s);
                JOptionPane.showMessageDialog(null, "La palabra es palundromo?\n "+objeto1.mostrarPila()+" "+objeto1.palindromo(s));
            }
        }    
}

class AdminComponentes implements LayoutManager
{
    int x,y=20;
    
    @Override
    public void addLayoutComponent(String name, Component comp) 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeLayoutComponent(Component comp) 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void layoutContainer(Container miContenedor) 
    {
        int d=miContenedor.getWidth();
        x=d/2;
        int contador=0;
        int n=miContenedor.getComponentCount();
        for(int i=0;i<n;i++)
        {
            contador++;
            Component c = miContenedor.getComponent(i);
            c.setBounds(x-350, y, 200, 40);
            x+=230;
            if(contador%3 == 0)
            {
                x=d/2;
                y+=60;
            }
        }
    }
    
}
}


