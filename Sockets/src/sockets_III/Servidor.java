package sockets_III;

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	private	JTextArea areatexto;
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		//creando el hilo
		Thread mihilo = new Thread(this);
		mihilo.start();
		
		}

	@Override
	public void run() {
		//System.out.println("Estoy a la escucha");
		try {
			ServerSocket servidor = new ServerSocket(9999);
			
			while(true) {
				Socket misocket = servidor.accept();			
				DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());
				
				String mensaje_texto = flujo_entrada.readUTF();
				areatexto.append("\n" + mensaje_texto);
				
				misocket.close();
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
