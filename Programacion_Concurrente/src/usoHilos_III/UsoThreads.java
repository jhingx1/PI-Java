package usoHilos_III;
import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoRebote();//instancia un marco
		//decirle que se cierre al pulsar en la x
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//hacer visible el marco
		marco.setVisible(true);

	}

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------
class Pelota{
	//Animacion de la pelota y cuando se encuentre con un limite
	//la pelota revote.
	private static final int TAMX=15;
	private static final int TAMY=15;
	private double x=0;
	private double y=0;
	private double dx=1;
	private double dy=1;
	
	// Mueve la pelota invirtiendo posición si choca con límites
	public void mueve_pelota(Rectangle2D limites){//parametro de tipo Rectangle2D 
		//En este metodo recibe como parametro las dimenciones de la lamina(largo y ancho)
		x+=dx; //ingrementar la coordenada x
		y+=dy; //ingrementar la coordenada y
		//getMinX() de tipo Rectangle2D
		if(x<limites.getMinX()){//getMinX : Para detectar los limites minimo(del marco)
			x=limites.getMinX();
			dx=-dx;
		}
		if(x + TAMX>=limites.getMaxX()){
			x=limites.getMaxX() - TAMX;//getMaxX : Para detectar los limites maximo(del marco)
			dx=-dx;//cuando nos encontramos con los limites, hay que invertir las coordenadas
		}
		if(y<limites.getMinY()){
			y=limites.getMinY();
			dy=-dy;
		}
		if(y + TAMY>=limites.getMaxY()){
			y=limites.getMaxY()-TAMY;
			dy=-dy;
		}
	}
	//Forma de la pelota en su posición inicial
	public Ellipse2D getShape(){
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
	}	
}

// Lámina que dibuja las pelotas----------------------------------------------------------------------
class LaminaPelota extends JPanel{
	//Añadimos pelota a la lámina
	public void add(Pelota b){
		pelotas.add(b);
	}
	//pintar las pelotas
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		for(Pelota b: pelotas){
			g2.fill(b.getShape());
		}
	}
	//para poder pintar varias pelotas
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con lámina y botones------------------------------------------------------------------------------
class MarcoRebote extends JFrame{
	public MarcoRebote(){
		setBounds(600,300,600,350);
		setTitle ("Rebotes");
		lamina=new LaminaPelota();//agregando la lamina de la pelota
		add(lamina, BorderLayout.CENTER);//para que este en el centro
		JPanel laminaBotones=new JPanel();//contruyendo otra lamina, para botones
		
		//creando botones1
		
		arranca1 = new JButton("Hilo1");
		arranca1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evento) {
				
				comienza_el_juego(evento);
				
			}
		});
		
		//acregando a la lamina el boton1
		
		laminaBotones.add(arranca1);
		
		//--------------Boton2
		
		arranca2 = new JButton("Hilo2");
		arranca2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evento) {
				
				comienza_el_juego(evento);
				
			}
		});
		
		//acregando a la lamina el boton2
		
		laminaBotones.add(arranca2);
		
		
		//----------boton3
		
		arranca3 = new JButton("Hilo3");
		arranca3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evento) {
				
				comienza_el_juego(evento);
				
			}
		});
		
		//acregando a la lamina el boton2
		
		laminaBotones.add(arranca3);
		
		//----------deterner1
		
				detener1 = new JButton("Detener1");
				detener1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent evento) {
						
						detener(evento);
						
					}
				});
				
				//acregando a la lamina el boton2
				
				laminaBotones.add(detener1);
		
		//----------deterner2
				
				detener2 = new JButton("Detener2");
				detener2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent evento) {
						
						detener(evento);
						
					}
				});
				
				//acregando a la lamina el boton2
				
				laminaBotones.add(detener2);	
		
		//----------deterner3
				
				detener3 = new JButton("Detener3");
				detener3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent evento) {
						
						detener(evento);
						
					}
				});
				
				//acregando a la lamina el boton2
				
				laminaBotones.add(detener3);	
		
	//---------------------------------------
		
		add(laminaBotones, BorderLayout.SOUTH);
		
	}
	
	//Añade pelota y la bota 1000 veces
	public void comienza_el_juego (ActionEvent e){//es el metodo que ejecuta todo
			Pelota pelota=new Pelota();//agregar a la lamina la pelota
			lamina.add(pelota);//agregar a la lamina la pelota
			
			//Paso threads
			
			Runnable r = new PelotaHilos(pelota, lamina);
			//Paso 4
			//Thread t = new Thread(r);
			
			//en el caso de que sea verda, nos dise que hemos pulsado en ese boton
			if(e.getSource().equals(arranca1))
			{
				t1 = new Thread(r);
				t1.start(); 
			}else if(e.getSource().equals(arranca2))
			{
				t2 = new Thread(r);
				t2.start(); 
			}else if(e.getSource().equals(arranca3))
			{
				t3 = new Thread(r);
				t3.start(); 
			}

	}
	
	public void detener(ActionEvent e)
	{
		if(e.getSource().equals(detener1))
		{
			t1.interrupt();
		}else if (e.getSource().equals(detener2)){
			t2.interrupt();
		}else if (e.getSource().equals(detener3)){
			t3.interrupt();
		}

	}
	//creando lo diferentes hilos
	Thread t1,t2,t3;
	JButton arranca1,arranca2,arranca3,detener1,detener2,detener3;
	
	private LaminaPelota lamina;
}
