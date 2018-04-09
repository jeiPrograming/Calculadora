package calculadoraEstandar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

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
	JButton btndividir = new JButton("/");
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
		add(btn1); // Agrega el boton al formulario 
		btn1.addActionListener(this); // Espera a que el boton haga un evento y lo captura
		
		// BOTON 2
		btn2.setBounds(87,83,60,60);
		btn2.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn2); // Agrega el boton al formulario 
		btn2.addActionListener(this); // Espera a que el boton haga un evento y lo captura
				
		// BOTON 3
		btn3.setBounds(152,83,60,60);
		btn3.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn3); // Agrega el boton al formulario 
		btn3.addActionListener(this); // Espera a que el boton haga un evento y lo captura
				
		// BOTON Borrar
		btnclear.setBounds(217,83,93,60);
		btnclear.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnclear); // Agrega el boton al formulario 
		btnclear.addActionListener(this);
		
		// BOTON 4
		btn4.setBounds(22,148,60,60);
		btn4.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn4); // Agrega el boton al formulario 
		btn4.addActionListener(this); // Espera a que el boton haga un evento y lo captura 
				
		// BOTON 5
		btn5.setBounds(87,148,60,60);
		btn5.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn5); // Agrega el boton al formulario 
		btn5.addActionListener(this); // Espera a que el boton haga un evento y lo captura
						
		// BOTON 6
		btn6.setBounds(152,148,60,60);
		btn6.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn6); // Agrega el boton al formulario 
		btn6.addActionListener(this); // Espera a que el boton haga un evento y lo captura
						
		// BOTON PLUS (+)
		btnplus.setBounds(217,148,93,60);
		btnplus.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnplus); // Agrega el boton al formulario 
		btnplus.addActionListener(this); // Espera a que el boton haga un evento y lo captura
		
		// BOTON 7
		btn7.setBounds(22,213,60,60);
		btn7.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn7); // Agrega el boton al formulario 
		btn7.addActionListener(this); // Espera a que el boton haga un evento y lo captura
						
		// BOTON 8
		btn8.setBounds(87,213,60,60);
		btn8.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn8); // Agrega el boton al formulario 
		btn8.addActionListener(this); // Espera a que el boton haga un evento y lo captura
								
		// BOTON 9
		btn9.setBounds(152,213,60,60);
		btn9.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn9); // Agrega el boton al formulario 
		btn9.addActionListener(this); // Espera a que el boton haga un evento y lo captura
								
		// BOTON RESTA (-)
		btnless.setBounds(217,213,93,60);
		btnless.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnless); // Agrega el boton al formulario 
		btnless.addActionListener(this); // Espera a que el boton haga un evento y lo captura
		
		// BOTON Multiplicacion
		btnmultiplication.setBounds(22,278,60,60);
		btnmultiplication.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnmultiplication); // Agrega el boton al formulario 
		btnigual.addActionListener(this); // Espera a que el boton haga un evento y lo captura
								
		// BOTON 0
		btn0.setBounds(87,278,60,60);
		btn0.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btn0); // Agrega el boton al formulario 
		btn0.addActionListener(this); // Espera a que el boton haga un evento y lo captura
										
		// BOTON Resta 
		btndividir.setBounds(152,278,60,60);
		btndividir.setFont(new Font("tahoma",Font.BOLD,20)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btndividir); // Agrega el boton al formulario 
		btndividir.addActionListener(this); // Espera a que el boton haga un evento y lo captura
										
		// BOTON Punto
		btnpunto.setBounds(217,278,93,60);
		btnpunto.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnpunto); // Agrega el boton al formulario 
		btnpunto.addActionListener(this); // Espera a que el boton haga un evento y lo captura
		
		// BOTON Igual
		btnigual.setBounds(22,343,288,60);
		btnigual.setFont(new Font("tahoma",Font.BOLD,18)); // Tipo de fuente / estilo de fuente / tamaño de fuente
		add(btnigual); // Agrega el boton al formulario 
		btnigual.addActionListener(this); // Espera a que el boton haga un evento y lo captura
	
		
	}

	public static void main(String[] args) {
	
		
		new Calculadoraestandar(); // Correr el programa de la clase Calculadoraestandar
			

	}

	public void actionPerformed(ActionEvent e) {
		
		// ACCION EN LOS BOTONES
		
		// UNO (1)
		if(e.getSource() == btn1) { // Verifica si preciones el boton 1
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("1"); // Agregale el 1
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"1"); // Toma el valor que tenga la pantalla y concatenalo con el valor 1
			}	
		}
		
		// DOS (2)
		if(e.getSource() == btn2) { // Verifica si preciones el boton 2
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("2"); // Agregale el 2
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"2"); // Toma el valor que tenga la pantalla y concatenalo con el valor 2
			}	
		}
		
		// TRES (3)
		if(e.getSource() == btn3) { // Verifica si preciones el boton 3
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("3"); // Agregale el 3
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"3"); // Toma el valor que tenga la pantalla y concatenalo con el valor 3
			}	
		}
		
		
		// CUATRO (4)
		if(e.getSource() == btn4) { // Verifica si preciones el boton 4
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("4"); // Agregale el 4
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"4"); // Toma el valor que tenga la pantalla y concatenalo con el valor 4
			}	
		}
		
		// CINCO (5)
		if(e.getSource() == btn5) { // Verifica si preciones el boton 5
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("5"); // Agregale el 5
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"5"); // Toma el valor que tenga la pantalla y concatenalo con el valor 5
			}	
		}
		
		// SEIS
		if(e.getSource() == btn6) { // Verifica si preciones el boton 6
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("6"); // Agregale el 6
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"6"); // Toma el valor que tenga la pantalla y concatenalo con el valor 6
			}	
		}
		
		// SIETE (7)
		if(e.getSource() == btn7) { // Verifica si preciones el boton 7
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("7"); // Agregale el 7
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"7"); // Toma el valor que tenga la pantalla y concatenalo con el valor 7
			}	
		}
		
		// OCHO (8)
		if(e.getSource() == btn8) { // Verifica si preciones el boton 8
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("8"); // Agregale el 8
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"8"); // Toma el valor que tenga la pantalla y concatenalo con el valor 8
			}	
		}
		
		// NUEVE (9)
		if(e.getSource() == btn9) { // Verifica si preciones el boton 9
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("9"); // Agregale el 9
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"9"); // Toma el valor que tenga la pantalla y concatenalo con el valor 9
			}	
		}
		
		// CERO
		if(e.getSource() == btn0) { // Verifica si preciones el boton 0
			if(pantalla.getText() == "") { // Si la pantalla esta vacia agregale lo siguiente
				pantalla.setText("0"); // Agregale el 0
			}else { // Sino esta vacio agrega lo siguiente
				pantalla.setText(pantalla.getText() +"0"); // Toma el valor que tenga la pantalla y concatenalo con el valor 0
			}	
		}
		
		// PUNTO
		byte valor_caracter = 0; // Almacena en la variable valor_caracter el valor 0 
		byte valor_caracter2 = 0; // De seguro se borre
		byte add_coma = 0; // Almacena en la variable add_coma el valor 0
		if(e.getSource() == btnpunto) { // Verifica si precione el boton ,
			
			for (int a = 0; a < pantalla.getText().length(); a++) { // Entra a un bucle para buscar si existe algun sigo como (+,-,*,/)
				char dividir_string = pantalla.getText().charAt(a); // Separame los caracteres en un array y almacenalo en la variable dividir_string
				
				
				if(dividir_string == '+' || dividir_string == '-' || dividir_string == '*' || dividir_string == '/') { // Mira a ver si existe algunos de estos caracteres si existe entra a la siguiente condicion
					
					// Cuando entre a esta condicion a+1 va a tener un valor almacenado
					String segunda_parte = pantalla.getText().substring(a+1, pantalla.getText().length()); // Almacename en la variable segunda_parte la parte desde la cadena a+1 hasta la ultima cadena 

					//eC Significa encontrarCadena
					for (int eC = 0; eC < segunda_parte.length(); eC++) { // Entra en un bucle para buscar si la segunda parte de la cadena contiene una coma
						
						char buscar_caracter = segunda_parte.charAt(eC); // Almacena en la variable buscar_caracter un array de la variable segunda_parte
						
						if(buscar_caracter == ',') { // Si bucar_caracter es igual a coma entra en la condicion
							add_coma = 1; // Agrega en la variable add_coma el valor de 1
							break; // Termina la condicion
						}					
						valor_caracter++; // Mientras el bucle se va repitiendo ve sumandole un 1 a la variable valor_caracter
	
					}
					
					if(valor_caracter == segunda_parte.length()) { // Si valor_caracer es igual a el ultimo valor de la segunda parte entra a la condicion
						
						if(add_coma == 0) {
							char caracter_punto = pantalla.getText().charAt(pantalla.getText().length()-1); // Busca el ultimo valor que tenga la cadena string 
							
							if(caracter_punto != '+' && caracter_punto != '-' && caracter_punto != '/' && caracter_punto != '*' && caracter_punto != ',') { // Mira que el ultimo valor no sea ninguno de estos caracteres (+ • - • / • * • ,)
		
								pantalla.setText(pantalla.getText() +","); // Toma el valor que tenga la pantalla y concatenalo con el valor ,
								
							}
						}
						
					}
	
				}else{
	
					
					
					if(pantalla.getText().length() != 0) { // Si la pantalla no esta vacia agregale lo siguiente
					int encontrarCadena = pantalla.getText().indexOf(",");//Buscar si existe una , en la pantalla
					if(!(encontrarCadena != -1)) { // Si el resultado no es distion de -1 la cadena no existe y ejecuta el siguiente codigo
				
							
							char caracter_punto = pantalla.getText().charAt(pantalla.getText().length()-1); // Busca el ultimo valor que tenga la cadena string 
							
							if(caracter_punto != '+' && caracter_punto != '-' && caracter_punto != '/' && caracter_punto != '*' && caracter_punto != ',') { // Mira que el ultimo valor no sea ninguno de estos caracteres (+ • - • / • * • ,)
								pantalla.setText(pantalla.getText() +","); // Toma el valor que tenga la pantalla y concatenalo con el valor ,
								int encontrarCadena2 = pantalla.getText().indexOf(",");//Buscar si existe una , en la pantalla
								
								//eC Significa encontrarCadena
								for (int eC = 0; eC < pantalla.getText().length(); eC++) {
									char buscarCaracter = pantalla.getText().charAt(eC);
									if(buscarCaracter == ',') {
										valor_caracter2++;
										if(valor_caracter2 == 2) {
											
											break;
										}
									}
								}
													
								/*System.out.println("hay "+valorCaracter+" puntos");*/
							}
							
						
						
					}
				}
	
					
					
					
					
					
					
					
					
					
					
				}
			}	
			
			
		}
		
		// SUMA
		if(e.getSource() == btnplus) { // Verifica si preciones el boton +
			if(pantalla.getText().length() != 0) { // Si la pantalla no esta vacia agregale lo siguiente
				int encontrarCadena = pantalla.getText().indexOf("+");//Buscar si existe una , en la pantalla
				if(!(encontrarCadena != -1)) { // Si el resultado no es distion de -1 la cadena no existe y ejecuta el siguiente codigo
					char caracter_punto = pantalla.getText().charAt(pantalla.getText().length()-1); // Busca el ultimo valor que tenga la cadena string 
					if(caracter_punto != '+' && caracter_punto != '-' && caracter_punto != '/' && caracter_punto != '*' && caracter_punto != ',') { // Mira que el ultimo valor no sea ninguno de estos caracteres (+ • - • / • * • ,)
						pantalla.setText(pantalla.getText() +"+"); // Toma el valor que tenga la pantalla y concatenalo con el valor +
					}
				}
			}
		}
		
		
		// RESTA
		if(e.getSource() == btnless) { // Verifica si preciones el boton -
			if(pantalla.getText().length() != 0) { // Si la pantalla no esta vacia agregale lo siguiente
				int encontrarCadena = pantalla.getText().indexOf("-");//Buscar si existe una , en la pantalla
				if(!(encontrarCadena != -1)) { // Si el resultado no es distion de -1 la cadena no existe y ejecuta el siguiente codigo
					char caracter_punto = pantalla.getText().charAt(pantalla.getText().length()-1); // Busca el ultimo valor que tenga la cadena string 
					if(caracter_punto != '+' && caracter_punto != '-' && caracter_punto != '/' && caracter_punto != '*' && caracter_punto != ',') { // Mira que el ultimo valor no sea ninguno de estos caracteres (+ • - • / • * • ,)
						pantalla.setText(pantalla.getText() +"-"); // Toma el valor que tenga la pantalla y concatenalo con el valor -
					}
				}
			}
		}
		
		// MULTIPLICACION
		if(e.getSource() == btnmultiplication) { // Verifica si preciones el boton *
			if(pantalla.getText().length() != 0) { // Si la pantalla no esta vacia agregale lo siguiente
				int encontrarCadena = pantalla.getText().indexOf("*");//Buscar si existe una , en la pantalla
				if(!(encontrarCadena != -1)) { // Si el resultado no es distion de -1 la cadena no existe y ejecuta el siguiente codigo
					char caracter_punto = pantalla.getText().charAt(pantalla.getText().length()-1); // Busca el ultimo valor que tenga la cadena string 
					if(caracter_punto != '+' && caracter_punto != '-' && caracter_punto != '/' && caracter_punto != '*' && caracter_punto != ',') { // Mira que el ultimo valor no sea ninguno de estos caracteres (+ • - • / • * • ,)
						pantalla.setText(pantalla.getText() +"*"); // Toma el valor que tenga la pantalla y concatenalo con el valor *
					}
				}
			}
		}
		
		// DIVICION
		if(e.getSource() == btndividir) { // Verifica si preciones el boton /
			if(pantalla.getText().length() != 0) { // Si la pantalla no esta vacia agregale lo siguiente
				int encontrarCadena = pantalla.getText().indexOf("/");//Buscar si existe una , en la pantalla
				if(!(encontrarCadena != -1)) { // Si el resultado no es distion de -1 la cadena no existe y ejecuta el siguiente codigo
					char caracter_punto = pantalla.getText().charAt(pantalla.getText().length()-1); // Busca el ultimo valor que tenga la cadena string 
					if(caracter_punto != '+' && caracter_punto != '-' && caracter_punto != '/' && caracter_punto != '*' && caracter_punto != ',') { // Mira que el ultimo valor no sea ninguno de estos caracteres (+ • - • / • * • ,)
						pantalla.setText(pantalla.getText() +"/"); // Toma el valor que tenga la pantalla y concatenalo con el valor /
					}
				}
			}
		}
		
		
		// BORRAR 		
		if(e.getSource() == btnclear) { // Verifica si preciones el boton borrar
			if(pantalla.getText().length() != 0) { // Si la pantalla no esta vacia agregale lo siguiente
				
				pantalla.setText(""); // Borra lo que tenga la pantalla
				
			}
		}

		if(e.getSource() == btnigual) { // Verifica si preciones el boton ,
			
			if(pantalla.getText().length() != 0) { // Si la pantalla no esta vacia agregale lo siguiente
				
				String cadena = pantalla.getText(); // Guarda en la variable cadena los datos tomados de la pantalla 
				for(int i=0; i < pantalla.getText().length(); i++) { // Crea con la cantidad de valor de tenga la cadena 
					
					char caracter = cadena.charAt(i); // Ve almacenando en la variable caracter los caracteres de la cadena
					if(caracter == '+') { // Si en un momento la variable caracte lleva a ser igual a + ejecuta el siguiente codigo
				
						String primera_parte = cadena.substring(0,i); // Tomame los numeros del 0 hasta antes del +
						String segunda_parte = cadena.substring(i+1,cadena.length()); // Tomame los numeros despues del 0 hasta el final
						
						int encontrarCadenaPunto = primera_parte.indexOf(","); // Guarda en la variable encontrarCadenaPunto -1 si no existe la coma en la cadena y diferente a -1 si existe
						
						
						if(encontrarCadenaPunto == -1) { // Si encontrarCadenaPunto es igual a -1 la variable primera_parte no contiene punto y la segunda si
							
							encontrarCadenaPunto = segunda_parte.indexOf(","); //Guarda en la variable encontrarCadena -1 i				
							
							if(encontrarCadenaPunto == -1) {
								encontrarCadenaPunto = -1;
								System.out.println("Ninguno contienen punto");								
							}else {
								System.out.println("Ahora encontrar cadena puneto es la segunda parte "+encontrarCadenaPunto);
								segunda_parte = segunda_parte.replace(',','.');
							}
							
						}else{
							encontrarCadenaPunto = segunda_parte.indexOf(",");
							if(encontrarCadenaPunto != -1) {
								System.out.println("las dos cadenas tienen punto "+encontrarCadenaPunto);
							}
							primera_parte = primera_parte.replace(',','.');
							System.out.println("cadena puneto es la primera parte "+encontrarCadenaPunto);
						}
						
					/*	double sumar1 = Double.parseDouble(primera_parte);
						double sumar2 = Double.parseDouble(segunda_parte);
						double  resultado = sumar1 + sumar2;*/
						
						System.out.println(encontrarCadenaPunto);
						
					/*	String convertir_resultado = String.valueOf(resultado);*/

						/*if(encontrarCadenaPunto != -1 ) {// Si el resultado  es distinto de -1 la cadena existe y ejecuta el siguiente codigo
							pantalla.setText("Si hay punto");
							primera_parte = primera_parte.replace(',','.');
							segunda_parte = segunda_parte.replace(',','.');
							
							for(int a=0; a < convertir_resultado.length(); a++) { 
								char caracter_a = convertir_resultado.charAt(a);
								System.out.println(caracter_a);
								if(caracter_a == '.'){
									String quit_decimales = convertir_resultado.substring(a+1,convertir_resultado.length());
									double quit_decimar_double = Double.parseDouble(quit_decimales);
									if(quit_decimar_double < 0.01) {
										pantalla.setText(convertir_resultado.substring(0,a));
									}else {
										pantalla.setText(convertir_resultado);
									}
								}
								
							
							}
							
						}else {
							pantalla.setText("No hay punto");
						}*/
							
						
					}	
				
						
			}
					
			}
		}
		
		
		
		
		
	}
	
	

}
