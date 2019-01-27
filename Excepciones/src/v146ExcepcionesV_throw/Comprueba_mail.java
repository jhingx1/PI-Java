package v146ExcepcionesV_throw;
import java.io.EOFException;
import javax.swing.*;
public class Comprueba_mail {
	
	public static void main(String[] args)
	{
		
		String el_mail = JOptionPane.showInputDialog("Introduce mail");
		try{
			examina_mail(el_mail);
		}catch (EOFException e) {
			System.out.println("La direccion de Email no es correcta");
		}
		
		
	}
	//metodo
	static void examina_mail(String mail) throws  EOFException{//EOFException:trabaja con ficheros externos
		
		int arroba = 0;
		boolean punto = false;
		if(mail.length() <= 3)
		{
			//ArrayIndexOutOfBoundsException : error que se genera cuando se accede
			//a una poscion que no esta declarada en el array
			//instanciando la ArrayIndexOutOfBoundsException, clase de tipo error
			//ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
			//lansado la intancia,(lanzando la excepcion)
			throw new EOFException(); //AbstractMethodError();

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
