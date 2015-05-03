/**
 * 
 * @author LAURA MARTINEZ PRIEGO 1oDAM
 *
 */
public class Profesor extends Persona
{

	protected String nombre;
	protected String dni;
	public Profesor( String nombre, String dni)
	{
		super(nombre, dni);
	}

	/**
	 * metodo que indica si es profesor, en este caso sí lo es
	 */
	@Override
	boolean esProfesor()
	{
		return true;
	}
	
	
	
}
