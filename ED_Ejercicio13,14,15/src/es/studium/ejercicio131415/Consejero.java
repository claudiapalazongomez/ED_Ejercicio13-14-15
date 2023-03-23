package es.studium.ejercicio131415;

public class Consejero extends Empleado
{
	private int numero_acciones;

	public Consejero()
	{
		super();
		numero_acciones = 0;
	}

	public Consejero(String nombre, String apellidos, String dni, String domicilio, int telefono, String puesto, int numero_acciones)
	{
		super(nombre, apellidos, dni, domicilio, telefono, puesto);
		this.numero_acciones = numero_acciones;
	}

	public int getNumero_acciones()
	{
		return numero_acciones;
	}

	public void setNumero_acciones(int numero_acciones)
	{
		this.numero_acciones = numero_acciones;
	}
	
	
	
	
}
