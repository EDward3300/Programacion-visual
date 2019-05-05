import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public  class Ejecutable extends JFrame implements ActionListener{
	private JLabel titulo;
	private JLabel cantidad;
	private JTextField valor;
	private JLabel iva;
	private JComboBox valorIva;
	private JButton calcular;
	private String selectIva;
	
	public  Ejecutable() {
		super();
		configurarVentana();
		crearComponentes();
	}
	

	private void configurarVentana() {
		this.setTitle("Calcular IVA");
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void crearComponentes() {
		titulo =new JLabel();
		titulo.setText("Calcular IVA");
		titulo.setBounds(85, 5, 200, 30);
		titulo.setFont(new Font("Elephant",0,13));
		this.add(titulo);
		
		cantidad =new JLabel();
		cantidad.setText("Cantidad : ");
		cantidad.setBounds(135, 25, 200, 30);
		cantidad.setFont(new Font("Elephant",0,13));
		this.add(cantidad);
		
		valor=new JTextField();
		valor.setBounds(135, 50, 50, 30);
		this.add(valor);
		
		iva =new JLabel();
		iva.setText("IVA :");
		iva.setBounds(135, 75, 200, 30);
		iva.setFont(new Font("Elephant",0,13));
		this.add(iva);
		
		String [] ivaList =new String [] {"16","8"};
		JComboBox<String> valorIva=new JComboBox<>(ivaList);
		valorIva.setBounds(135,100,50,25);
		valorIva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			selectIva=valorIva.getItemAt(valorIva.getSelectedIndex());
			}
		
		});
		this.add(valorIva);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(125, 130, 95, 30);
		calcular.addActionListener(this);//actionlistenner es un escuchador de enventos que va a detectar una accion
		this.add(calcular);
		
		
	}


	@Override 
	public void actionPerformed(ActionEvent e) {
		double resultado=Integer.parseInt(valor.getText())*(1+(0.01*(Integer.parseInt(selectIva))));
		JOptionPane.showMessageDialog(this, "El resultado es:"+resultado);
	}
	public static void main(String args[]) {
		Ejecutable ventana= new Ejecutable();
		ventana.setVisible(true);	
	}
	
	
}
