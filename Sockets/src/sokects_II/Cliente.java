package sokects_II;

import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
		
		nick = new JTextField(5);
		add(nick);
	
		JLabel texto=new JLabel("-CHAT-");
		
		add(texto);
		
		ip = new JTextField(8); //longuitud de 8
		add(ip);
		
		//Construir area de texto
		campochat = new JTextArea(12,20); //colocando en el area.
		
		//Agregamos el text area a la lamina
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento = new EnviaTexto();
		miboton.addActionListener(mievento);
		
		add(miboton);	
		
	}
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//System.out.println(campo1.getText());
			
			try {
				Socket misoket = new Socket("127.0.0.1", 9999);
				
				DataOutputStream flujo_salida = new DataOutputStream(misoket.getOutputStream());
				
				flujo_salida.writeUTF(campo1.getText());
				
				flujo_salida.close();
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			
		}		
	}
	private JTextField campo1,nick,ip;
	private JTextArea campochat;
	private JButton miboton;
	
}