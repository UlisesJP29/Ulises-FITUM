import java.awt.*;

import java.awt.event.*;


import java.math.MathContext;

import javax.management.StringValueExp;

import javax.swing.*;

public class conversor extends JFrame implements ActionListener
{
     String temp = "";

    String texto = "";

     double v1, v2, A, B, C, discriminante, resultado1, resultado2;
    double con;
    int opcion;
    JMenuBar contenedor;
    JMenu ver, edicion, ayuda;
    JMenuItem conversor;
    JMenuItem copiar, pegar, historial, ver_ayuda, acerca_de;
    
    JTextField txtValor = new JTextField ();
    
    
    
    JButton btnLibPla = new JButton("libra a Plata");
    
    JButton btnSiclo = new JButton("Siclo a Peso");
    JButton btnDen = new JButton("Denario a Peso");
   
    JButton btnDrac = new JButton("Dracma a Peso");
    //JButton btnBla = new JButton("Blanca a denario ");
    JButton btnTal = new JButton("Talento a peso");
    JButton btnCodo = new JButton("Codo a centimetro");
    JButton btnBra = new JButton("Braza a metros");
    JButton btnEst = new JButton("Estadio a metros");
    JButton btnMil = new JButton("Milla a metros");
    JButton btnCam = new JButton("CAMINO EN DIA REPOSO A METROS");
    JButton btnAl = new JButton("Almud a litros");
    JButton btnMSato = new JButton("medio Sato a litros");
    JButton btnBar = new JButton("Barril a litros");
    JButton btnKor = new JButton("koro a litros");
    JButton btnCant = new JButton("Cantaro a litros");
    
    JButton btnResolver = new JButton("Resolver");
    JLabel lblA= new JLabel("CONVERSIÓN DE ");
    
    
    
    
    
    
    
   public conversor(String nombre)

    {

        super(nombre);

        iniciarControles();

    }
    public void iniciarControles()

    {

        //menu ver

        contenedor = new JMenuBar();

        ver = new JMenu ("Ver");

        edicion = new JMenu ("Edicion");

        ayuda = new JMenu ("Ayuda");

       

        //crear los items del menu



        conversor = new JMenuItem("Conversor");

        copiar = new JMenuItem ("Copiar Ctr+c");

        pegar = new JMenuItem ("Pegar Ctr+v");

        

        ver_ayuda= new JMenuItem ("Ver Ayuda");

        acerca_de = new JMenuItem ("Acerca de Calculadora");

       

        //agregar los items al contenedor de la ventana

        this.setJMenuBar (contenedor);

        contenedor.add (ver);

        contenedor.add (edicion);

        contenedor.add (ayuda);

        
        ver.add (conversor);
        

       

        edicion.add (copiar);

        edicion.add (pegar);

        ayuda.add (acerca_de);

        ayuda.add (ver_ayuda);
        //Agregar los objetos (controles) al Panel de la ventana
        txtValor.setVisible(true);
           txtValor.setBounds(150,220,180,35);     
           lblA.setBounds(20,220,100,35);
          btnSiclo.setBounds(20,20,150,30);
          btnDen.setBounds(180,20,150,30);
   
          btnResolver.setBounds(450,220,100,35);
         btnDrac.setBounds(350,20,150,30);
         //btnBla.setBounds(20,200,150,35);
         btnTal.setBounds(20,60,150,30);
         btnCodo.setBounds(180,60,150,30);
         btnBra.setBounds(350,60,150,30);
         btnEst.setBounds(20,100,150,30);
         btnMil.setBounds(180,100,150,30);
         btnCam.setBounds(350,100,300,30);
         btnAl.setBounds(20,140,150,30);
         btnMSato.setBounds(180,140,150,30);
         btnKor.setBounds(350,140,150,30);
         btnCant.setBounds(20,180,150,30);
         
        
        //Agregar los objetos (controles) al Panel de la ventana
        
        this.getContentPane().add(txtValor);
        
        this.getContentPane().add(btnLibPla);
        this.getContentPane().add(btnSiclo);
        this.getContentPane().add(btnDen);
        this.getContentPane().add(btnResolver);
        this.getContentPane().add(btnDrac);
        //this.getContentPane().add(btnBla);
        this.getContentPane().add(btnTal);
        this.getContentPane().add(btnCodo);
        this.getContentPane().add(btnBra);
        this.getContentPane().add(btnEst);
        this.getContentPane().add(btnMil);
        this.getContentPane().add(btnCam);
        this.getContentPane().add(btnAl);
        this.getContentPane().add(btnMSato);
        this.getContentPane().add(btnKor);
        this.getContentPane().add(btnCant);
        
        this.getContentPane().add(lblA);
        
        //Configuración de los botones con su evento respectivo
        
        btnResolver.addActionListener(this);
        btnLibPla.addActionListener(this);
        btnSiclo.addActionListener(this);
        btnDen.addActionListener(this);
        btnDrac.addActionListener(this);
        btnTal.addActionListener(this);
        btnCodo.addActionListener(this);
        btnBra.addActionListener(this);
        btnEst.addActionListener(this);
        btnMil.addActionListener(this);
        btnCam.addActionListener(this);
        btnAl.addActionListener(this);
        btnMSato.addActionListener(this);
        btnKor.addActionListener(this);
        btnCant.addActionListener(this);
        
        //Configuracion de los eventos
        ver_ayuda.addActionListener(this);
        conversor.addActionListener(this);
         //Configuracion del menú con las caracteristicas de la ventana
        this.setBounds(500,100,700,335);
        this.setResizable(isMaximumSizeSet());//desactiva opcion maximiza

        this.getContentPane().setBackground(Color.red);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    
    }
     //Ejecución de la aplicacion
    public static void main (String [] args)
    {
        new conversor ("Resolver ecuaciones cuadraticas");
    }
    //Definicion de los eventos ActionListener (Para cada operacion de la calculadora)
    public void actionPerformed(ActionEvent e)
    {
        double plt = 10.20;
        
       if (e.getSource()==conversor.this.btnLibPla) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 360;
            txtValor.setText("");
            txtValor.setText("$"+String.valueOf(v1*v2*plt));
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnSiclo) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 144;
            txtValor.setText("");
            txtValor.setText("$"+String.valueOf((v1*v2/10)*plt));
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnDen) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 4;
            txtValor.setText("");
            txtValor.setText("$"+String.valueOf(v1*v2*plt));
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnDrac) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 36;
            txtValor.setText("");
            txtValor.setText("$"+String.valueOf((v1*v2/10)*plt));
            v2=0;   
            con=0;
        }
        
        if (e.getSource()==conversor.this.btnTal) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 12600;
            txtValor.setText("");
            txtValor.setText("$"+String.valueOf(v1*v2*plt));
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnCodo) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 45;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+"cm");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnBra) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 18;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2/10)+"m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnEst) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 180;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+"m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnMil) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 1480;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnCam) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 1080;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+"m");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnAl) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 875;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2/100)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnMSato) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 13;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnBar) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 37;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnKor) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 370;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }
        if (e.getSource()==conversor.this.btnCant) {
            v1=Float.parseFloat(txtValor.getText());
            v2 = 40;
            txtValor.setText("");
            txtValor.setText(String.valueOf(v1*v2)+" litros");
            v2=0;   
            con=0;
        }  

        
        
           
       
       if(e.getSource()==conversor)
         {
           txtValor.setVisible(true);
           txtValor.setBounds(150,450,180,35);     
           lblA.setBounds(20,450,100,35);
          btnSiclo.setBounds(20,20,150,30);
          btnDen.setBounds(180,20,150,30);
   
          btnResolver.setBounds(450,220,100,35);
         btnDrac.setBounds(350,20,150,30);
         //btnBla.setBounds(20,200,150,35);
         btnTal.setBounds(20,60,150,30);
         btnCodo.setBounds(180,60,150,30);
         btnBra.setBounds(350,60,150,30);
         btnEst.setBounds(20,100,150,30);
         btnMil.setBounds(180,100,150,30);
         btnCam.setBounds(350,100,150,30);
         btnAl.setBounds(20,140,150,30);
         btnMSato.setBounds(180,140,150,30);
         btnKor.setBounds(350,180,150,30);
         btnCant.setBounds(20,220,150,30);
         }
       }
    }

