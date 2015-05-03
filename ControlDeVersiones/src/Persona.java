
import java.util.ArrayList;

/**
 * @author LAURA MARTINEZ PRIEGO 1oDAM
 */
public abstract class Persona
{
	protected String nombre;
	protected String dni;
	protected ArrayList<Asignatura> asignaturas;
	
	
	//constructor
	public Persona(String nombre, String dni)
	{
		this.nombre = nombre;
		this.dni = dni;
		
	}
	
	/*
	 * : Añade una asignatura al ArrayList de asignaturas
	 */
	public void anyadirAsignatura(Asignatura a)
	{
		asignaturas.add(a);
	}
	
	/**
	 * : Método que ordena el ArrayList de asignaturas por nombre.
	 * 	(usad la url de ayuda para ordenar el array con el Comparator)
	 */
	public void ordenarPorAsignatura()
	{
		
	}
	
	
	/**
	 * ): Método que ordena el ArrayList de asignaturas por nota. (usad la url de
	ayuda para ordenar el array con el Comparator)
	 */
	public void ordenarPorNota()
	{
		
	}
	
	/**
	 *  método que te muestra el nombre de la persona, las
	asignaturas que cursa, y la nota de esas asignaturas.
	 */
	public void mostrarListadoAsignaturasNota()
	{
		for (Asignatura a : asignaturas)
		{
			System.out.println(nombre + " || "+ a + " : " + a.getNota()); 
		}
		
	}
	
	/**
	 * : método abstracto a implementar en sus hijos
	 * @return
	 */
	abstract boolean esProfesor();
	
}
