package v147ExcepcionIV_Propias;
import java.io.EOFException;

import javax.swing.*;
public class Comprueba_mail {
	
	public static void main(String[] args)
	{
		String el_mail = JOptionPane.showInputDialog("Introduce mail");
		
		try{
			examina_mail(el_mail); //este es un metodo que llama a una excepcion 
								   //Longitud_mail_erronea y esta excepcion hereda de la clase
								   //exception. o RuntimeException(no necesario try...catch)
		}catch (Exception e) {//EOFException: debe coincidir con la excepcion que le hemos indicado
			System.out.println("La direccion de Email no es correcta");
			e.printStackTrace(); //imprime la pila de llamadas de este error
		}
	}
	
	//metodo
	static void examina_mail(String mail) throws Longitud_mail_erronea {//throws  EOFException //EOFException:trabaja con ficheros externos
		
		int arroba = 0;
		boolean punto = false;
		if(mail.length() <= 3)
		{
			//throw new EOFException(); //AbstractMethodError();
			//throw new Longitud_mail_erronea("El mail es demaciado corto");
			//usando el contructor por defecto
			
			throw new Longitud_mail_erronea("El mail no pude tener menos de tres caracteres");
			
		}else{
			for (int i=0; i< mail.length();i++)
			{
				if(mail.charAt(i) == '@')
				{
					arroba++;
				}
				if(mail.charAt(i) == '.')
				{
					punto = true;
				}
			}
			
			if (arroba == 1 && punto == true)
			{
				System.out.println("Es correcto");
			}
			else{
				System.out.println("No es correcto");
			}
		}
		
			
	}
}

