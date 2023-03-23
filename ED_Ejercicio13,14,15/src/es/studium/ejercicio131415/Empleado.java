package es.studium.ejercicio131415;

public class Empleado extends Persona
{
	private String puesto;
	
	public Empleado()
	{
		super();
		puesto = "";
	}

	//Constructor
	public Empleado(String nombre, String apellidos, String dni, String domicilio, int telefono, String puesto)
	{
		super(nombre, apellidos, dni, domicilio, telefono);
		this.puesto = puesto;
	}

	public String getPuesto()
	{
		return puesto;
	}

	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
	}
	
	

}
