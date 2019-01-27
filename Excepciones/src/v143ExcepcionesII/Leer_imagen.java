package v143ExcepcionesII;

import java.awt.*;

import javax.swing.*;

import javax.imageio.*;

import java.io.*;

public class Leer_imagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco=new MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoImagen extends JFrame{
	
	
	public MarcoImagen(){
		
		setTitle("Marco Con Imagen");
		
		setBounds(750,300,300,200);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
	}
	
}

class LaminaConImagen extends JPanel{
	
	
	public LaminaConImagen(){
		
		try{//try : intenta
			//intenta hacer esto
		imagen=ImageIO.read(new File("src/v143ExcepcionesII/bolaa.png"));//aqu� pon tu propia ruta e imagen
		
		}catch(IOException e){ //en el caso contrario
			
			System.out.println("La imagen no se encuentra");
			
		}
	}
	
	
	public void paintComponent(Graphics g) throws NullPointerException{
		
		super.paintComponent(g);
		/*
		if(imagen==null){
			//Dibuje dentro del marco.
			g.drawString("no podemos cargar la imagen", 10, 10);
		}else{
		*/
		try {
			int anchuraImagen=imagen.getWidth(this);
			
			int alturaImagen=imagen.getHeight(this);
			
			g.drawImage(imagen, 0, 0, null);
			
			for(int i=0;i<300;i++){
				
				for(int j=0;j<200;j++){
					
					if(i+j>0){
					
					g.copyArea(0, 0, anchuraImagen, alturaImagen,anchuraImagen*i, alturaImagen*j);
					}
				}
			}
		}catch (NullPointerException e) {
			g.drawString("No se ha podido carga la imagen", 10, 10);
		}
	}						
	//}
	private Image imagen;
}



