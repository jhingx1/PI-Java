package serializacion_I;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializando {

	public static void main(String[] args) {
		
		Administrador jefe = new Administrador("Juan",80000,205,12,15);
		
		jefe.setIncetivo(5000);
		
		//Array de tipo empleado con nombre persosal que tiene 3 elemetos
		Empleado[] personal = new Empleado[3];
		
		personal[0] = jefe;
		
		personal[1] =  new Empleado("Ana", 25000, 2008, 10, 1);
		
		personal[2] = new Empleado("Luis", 10000, 2012, 9, 15);

		try{
			
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/JavaSerializable/empleado.txt"));
			//Escribiendo el objeto
			
			escribiendo_fichero.writeObject(personal);
			
			escribiendo_fichero.close();
			
			ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:/JavaSerializable/empleado.txt"));
			//Almacendo en una variable de tipo empledo (que es de tipo array)
			//se tiene que almacenar en una variable de tipo array
			
			Empleado[] personal_recuperado = (Empleado[]) recuperando_fichero.readObject();
			
			recuperando_fichero.close();
			
			for (Empleado e: personal_recuperado)
			{
				System.out.println(e);
			}
			
		}catch(Exception e){
			
		}
		
	}
}
