package calculadoraEstandar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadoraestandar extends JFrame implements ActionListener{
	
	// CREANDO EL FORMULARIO
	JPanel base = (JPanel) this.getContentPane();
	
	// CREANDO LA PANTALLA - TEXTFIELD
	TextField pantalla = new TextField();
	
	// CREANDO BOTONES
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnclear = new JButton("Borrar");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnplus = new JButton("+");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnless = new JButton("-");
	JButton btnmultiplication = new JButton("*");
	JButton btn0 = new JButton("0");
	JButton btnresta = new JButton("/");
	JButton btnpunto = new JButton(".");
	JButton btnigual = new JButton("=");
	
	
	
	// CREANDO LA CAJA DEL FORMULARIO
	public Calculadoraestandar() {
	
		// PROPIEDADES DEL FORMULARIO
		base.setLayout(null); //Acomodar manualmente los elementos
		setSize(350,450); // Tamaño del Formulario
		setTitle("Calculadora Estandar"); // Titulo del Formulario
		setVisible(true); // Para que sea visible el Formulario
		setLocationRelativeTo(null); // Centrar el formulario
		this.setResizable(false); // No permitir que se maximice
		
		// PROPIEDADES DE PANTALLA
		pantalla.setBounds(22, 8, 288, 50);// x / y / ancho / alto 
		pantalla.setFont(new Font("tahoma",Font.BOLD,25));
		add(pantalla); // Agregar la pantalla
		
		// PROPIEDADES DE BOTONES
		
		// BOTON 1
		btn1.setBounds(22,83,60,60);
		btn1.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn1);
		
		// BOTON 2
		btn2.setBounds(87,83,60,60);
		btn2.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn2);
				
		// BOTON 3
		btn3.setBounds(152,83,60,60);
		btn3.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn3);
				
		// BOTON Borrar
		btnclear.setBounds(217,83,93,60);
		btnclear.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnclear);
		
		// BOTON 4
		btn4.setBounds(22,148,60,60);
		btn4.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn4);
				
		// BOTON 5
		btn5.setBounds(87,148,60,60);
		btn5.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn5);
						
		// BOTON 6
		btn6.setBounds(152,148,60,60);
		btn6.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn6);
						
		// BOTON PLUS (+)
		btnplus.setBounds(217,148,93,60);
		btnplus.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnplus);
		
		// BOTON 7
		btn7.setBounds(22,213,60,60);
		btn7.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn7);
						
		// BOTON 8
		btn8.setBounds(87,213,60,60);
		btn8.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn8);
								
		// BOTON 9
		btn9.setBounds(152,213,60,60);
		btn9.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn9);
								
		// BOTON PLUS (+)
		btnless.setBounds(217,213,93,60);
		btnless.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnless);
		
		// BOTON Multiplicacion
		btnmultiplication.setBounds(22,278,60,60);
		btnmultiplication.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnmultiplication);
								
		// BOTON 0
		btn0.setBounds(87,278,60,60);
		btn0.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn0);
										
		// BOTON Resta 
		btnresta.setBounds(152,278,60,60);
		btnresta.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnresta);
										
		// BOTON Punto
		btnpunto.setBounds(217,278,93,60);
		btnpunto.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnpunto);
		
		// BOTON Igual
		btnigual.setBounds(22,343,288,60);
		btnigual.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnigual);
				
		
	}

	public static void main(String[] args) {
		
		new Calculadoraestandar(); // Correr el programa de la clase Calculadoraestandar
		
		
		

	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Apéndice de método generado automáticamente
		
	}
	
	

}
