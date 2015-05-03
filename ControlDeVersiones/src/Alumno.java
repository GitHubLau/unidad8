
/**
 * 
 * @author LAURA MARTINEZ PRIEGO 1oDAM
 *
 */
public class Alumno extends Persona
{
	protected String nombre;
	protected String dni;
	
	
	public Alumno( String nombre, String dni)
	{
		super(nombre, dni);
	}

	/**
	 * metodo que indica si es profesor, en este caso no lo es
	 */
	@Override
	boolean esProfesor()
	{
		return false;
	}
}