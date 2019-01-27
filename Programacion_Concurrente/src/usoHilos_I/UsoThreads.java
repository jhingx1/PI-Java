package usoHilos_I;
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
		setBounds(600,300,400,350);
		setTitle ("Rebotes");
		lamina=new LaminaPelota();//agregando la lamina de la pelota
		add(lamina, BorderLayout.CENTER);//para que este en el centro
		JPanel laminaBotones=new JPanel();//contruyendo otra lamina, para botones
		ponerBoton(laminaBotones, "Dale!", new ActionListener(){//escucha del evento
			public void actionPerformed(ActionEvent evento){
				comienza_el_juego();  //llama a la funcion al hacer clic en "Dale!"
			}
		});
		ponerBoton(laminaBotones, "Salir", new ActionListener(){////escucha del evento
			public void actionPerformed(ActionEvent evento){
				System.exit(0); //clic en salir
			}
		});
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	//Ponemos botones
	public void ponerBoton(Container c, String titulo, ActionListener oyente){
		JButton boton=new JButton(titulo);
		c.add(boton);
		boton.addActionListener(oyente);
	}
	
	//Añade pelota y la bota 1000 veces
	public void comienza_el_juego (){		
			Pelota pelota=new Pelota();//agregar a la lamina la pelota
			lamina.add(pelota);//agregar a la lamina la pelota
			
			//Paso threads
			
			Runnable r = new PelotaHilos(pelota, lamina);
			//Paso 4
			Thread t = new Thread(r);
			//Paso 5
			t.start();
			
	}
	private LaminaPelota lamina;
}
