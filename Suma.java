package hola;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.text.Format;

public class Suma extends JFrame implements ActionListener{
	private JLabel mensaje;
	private JLabel mensaje2;
	private JButton boton;
	private JTextField caja;
	private JTextField caja2;
	public  Suma() {
		super();
		configurarVentana();
		crearComponentes();
	}
	private void configurarVentana(){
		this.setTitle("Hello Word");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	private void crearComponentes() {
		mensaje =new JLabel();
		mensaje.setText("ingresa valores en los cuadros");
		mensaje.setBounds(85, 5, 200, 30);
		mensaje.setFont(new Font("Elephant",0,13));
		this.add(mensaje);
		
		mensaje2 =new JLabel();
		mensaje2.setText("+");
		mensaje2.setBounds(150, 55, 50, 30);
		mensaje2.setFont(new Font("Elephant",0,22));
		this.add(mensaje2);
		
		boton = new JButton();
		boton.setText("Sumar");
		boton.setBounds(125, 130, 95, 30);
		boton.addActionListener(this);//actionlistenner es un escuchador de enventos que va a detectar una accion
		this.add(boton);
		
		caja =new JTextField();
		caja.setBounds(135, 30, 50, 30);
		this.add(caja);
		
		caja2=new JTextField();
		caja2.setBounds(135, 80, 50, 30);
		this.add(caja2);
		
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		int resultado=Integer.parseInt(caja.getText())+Integer.parseInt(caja2.getText());
		JOptionPane.showMessageDialog(this, "El resultado es:"+resultado);
	}
	public static void main(String args[]) {
		Suma ventana= new Suma();
		ventana.setVisible(true);
		
		
	}
}
