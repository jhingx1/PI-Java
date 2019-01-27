package v40Herrencia;
public class UsoVehiculo {

	public static void main(String[] args) {
		
		Coche miCoche1 = new Coche();
		
		miCoche1.estableColor("Rojo");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		
		miFurgoneta1.estableColor("azul");
		miFurgoneta1.configuraAsientos("si");
		miFurgoneta1.configuraClimatizador("si");
		System.out.println("=====Datos de Coche");
		System.out.println(miCoche1.dimeDatosGenerales() + 
				"\n"+miCoche1.dimeColor());
		System.out.println("=====Datos de Furgoneta");
		System.out.println(miFurgoneta1.dimeDatosGenerales()
				+"\n" +miFurgoneta1.dimeDatosFurgoneta());

	}
}
