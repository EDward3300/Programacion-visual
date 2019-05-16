import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Palabras extends JFrame implements ActionListener{
	private JFrame ventana;
	private JTextField txtPalabra;
	private JLabel lblPalabra;
	private JButton verificar;
	private JLabel palindromo;
	private JLabel longitud;
	private JLabel inversa;
	private JLabel repetida;
public Palabras() {
	super();
	cofigurarVentana();
	componentes();
}

private void componentes() {
	lblPalabra = new JLabel();
	lblPalabra.setText("Palabra :");
	lblPalabra.setBounds(100, 10, 200, 30);
	this.add(lblPalabra);
	
	txtPalabra=new JTextField();
	txtPalabra.setBounds(185, 10,200, 30);
	this.add(txtPalabra);
	
	verificar = new JButton();
	verificar.setText("Verificar");
	verificar.setBounds(200, 45, 100, 30);
	verificar.addActionListener(this);
	this.add(verificar);
	
	palindromo=new JLabel();
	palindromo.setText("Palindromo : ");
	palindromo.setBounds(100, 70, 200, 30);
	this.add(palindromo);
	
	longitud=new JLabel();
	longitud.setText("Longitud : ");
	longitud.setBounds(100, 100, 200, 30);
	this.add(longitud);
	inversa=new JLabel();
	inversa.setText("Inversa : ");
	inversa.setBounds(100, 130, 200, 30);
	this.add(inversa);
	repetida=new JLabel();
	repetida.setText("Repetida : ");
	repetida.setBounds(100, 160, 200, 30);
	this.add(repetida);
	
}

private void cofigurarVentana() {
	this.setSize(500,250);
	this.setLocationRelativeTo(null);
	this.setLayout(null);
	this.setResizable(true);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

@Override 
public void actionPerformed(ActionEvent e) {
	
	String nuevo="";
	for(int x=txtPalabra.getText().length()-1;x>=0;x--)
	nuevo=nuevo+txtPalabra.getText().charAt(x);	
	if (txtPalabra.getText().equals(nuevo))
		palindromo.setText("Palindromo : Si");
	else
		palindromo.setText("Palindromo : No");
	longitud.setText("Longitud : "+Integer.toString(txtPalabra.getText().length()));
	inversa.setText("Inversa : "+nuevo);
	char mayor='x';
	int cantida=0,max=0,aux=0;
	for(int x=0;x<txtPalabra.getText().length()-1;x++) {
		char letra=txtPalabra.getText().charAt(x);
		int contador=0;
		for(int j=0;j<txtPalabra.getText().length()-1;j++) {
			if(letra==txtPalabra.getText().charAt(j))
				contador=contador+1;
		}	
		if(max==0) {
			max=contador;
			mayor=txtPalabra.getText().charAt(x);
		}
		else
			if(contador>max) {
				contador=max;
				mayor=txtPalabra.getText().charAt(x);
			}
	}
	
	repetida.setText("Repetida : "+mayor);
}
public static void main(String args[]) {
Palabras ventana=new Palabras();
ventana.setVisible(true);
}
}