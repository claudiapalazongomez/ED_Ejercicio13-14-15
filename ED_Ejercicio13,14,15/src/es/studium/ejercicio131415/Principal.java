package es.studium.ejercicio131415;

public class Principal
{

	public static void main(String[] args)
	{
		Empleado empleado1 = new Empleado("Eduardo", "Mu�oz Ramirez", "45789231K", "C/Betis, 45", 678123456, "recepcionista"); 
		Empleado empleado2 = new Empleado("Luc�a", "Llanos Mendigo", "67231456R", "C/Men�ndez Pelayo, 2", 782375431, "peluquera");
		
		System.out.println(empleado1.getNombre() + " " + empleado1.getApellidos() + " trabaja como " + empleado1.getPuesto());
		System.out.println("La "+ empleado2.getPuesto() + " con DNI " + empleado2.getDni() + " vive en " + empleado2.getDomicilio());
		
		Consejero consejero1 = new Consejero("Daniel", "L�pez Tango", "89541237G", "C/Alejo Fern�ndez, 16", 654981256, "consejero", 32);
		Consejero consejero2 = new Consejero("Juan Jos�", "J�menez Del R�o", "78125637K", "C/Aire, 7", 623894561, "consejero", 5);
		
		System.out.println(consejero1.getNombre()+ " " + consejero1.getApellidos() + " con dni " + consejero1.getDni() + " vive en " + consejero1.getDomicilio() + ", trabaja como " + consejero1.getPuesto() + " y le pertenece este n�mero de tel�fono: " + consejero1.getTelefono() + ". Adem�s, tiene " + consejero1.getNumero_acciones() + " acciones.");
		System.out.println(consejero2.getNombre()+ " " + consejero2.getApellidos() + " con dni " + consejero2.getDni() + " vive en " + consejero2.getDomicilio() + ", trabaja como " + consejero2.getPuesto() + " y le pertenece este n�mero de tel�fono: " + consejero2.getTelefono() + ". Adem�s, tiene " + consejero2.getNumero_acciones() + " acciones.");
	}

}
