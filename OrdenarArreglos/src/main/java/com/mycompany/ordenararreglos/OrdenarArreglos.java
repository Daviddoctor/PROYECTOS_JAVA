package com.mycompany.ordenararreglos;

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


public class OrdenarArreglos 
{

    public static void main(String[] args) 
    {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setTitle("Ordenar arreglos");
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
    char origen,destino,auxiliar;
    Ordenamientos objeto;

    public Lamina() {
        objeto = new Ordenamientos();
        setLayout(new AdminComponentes());
        objeto = new Ordenamientos();
        b1 = new JButton("Burbuja");
        b2 = new JButton("Metodo de Insercion");
        b3 = new JButton("Metodo Shell");
        b4 = new JButton("Metodo Quick Sort");//Tarea
        b5 = new JButton("Metodo Merge Sort");//Tarea
        //b6 = new JButton("Mostar Sumar menores");
        
        b1.addActionListener(new FuncionBotones());
        b2.addActionListener(new FuncionBotones());
        b3.addActionListener(new FuncionBotones());
        b4.addActionListener(new FuncionBotones());
        b5.addActionListener(new FuncionBotones());
        //b6.addActionListener(new FuncionBotones());

        add(b1);
        add(b2);
        add(b3);
        //add(b4);
        //add(b5);
        //add(b6);
    }

    private class FuncionBotones implements ActionListener {// para heredar de clase abstracta se usa implements  
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource() == b1) {
                objeto.crearArreglo();    
                String s = objeto.mostarArreglo();
                objeto.burbuja();
                JOptionPane.showMessageDialog(null, "El arreglo desordenado es:\n "+s+"\nArreglo ordenado:\n "+objeto.mostarArreglo());
            }else if(e.getSource() == b2){
                objeto.crearArreglo();
                String s = objeto.mostarArreglo();
                objeto.insercion();
                JOptionPane.showMessageDialog(null, "El arreglo desordenado es:\n "+s+"\nArreglo ordenado:\n "+objeto.mostarArreglo());
            }else if(e.getSource() == b3){
                objeto.crearArreglo();
                String s = objeto.mostarArreglo();
                objeto.shell();
                JOptionPane.showMessageDialog(null, "El arreglo desordenado es:\n "+s+"\nArreglo ordenado:\n "+objeto.mostarArreglo());
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
