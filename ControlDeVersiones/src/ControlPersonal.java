import java.util.ArrayList;

/**
 * @author LAURA MARTINEZ PRIEGO 1oDAM
 */
public class ControlPersonal 
{

	private static ArrayList<Persona> personas;
	
	public ControlPersonal()
	{}
	
	/**
	 * Crea asignaturas (mínimo 3), crea profesores (mínimo 3), crea
		alumnos (mínimo 3), añádelas al ArrayList y muestra el listado de los alumnos ordenado por
		nombre, el listado de alumnos por nombre de asignatura, listado de profesores ordenado por
		dni, listado de alumnos ordenado por nota y por último el listado de las notas que le ha
		asignado la universidad a cada profesor, es decir, el listado de profesores ordenado por nota
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Asignatura programacion = new Asignatura("programacion");
			
		Asignatura basesDatos = new Asignatura("bases de datos");
		Asignatura sistemas = new Asignatura("sistemas");
		
		Profesor dProg = new Profesor ("pepe", "123456789");
			anyadirPersonas (dProg);
		Profesor dBD = new Profesor ("carlos", "987654321");
			anyadirPersonas (dBD);
		Profesor dsist = new Profesor ("santi", "123454321");
			anyadirPersonas (dsist);
		
		Alumno alum1 = new Alumno ("claudia", "098765432");
			anyadirPersonas (alum1);
		Alumno alum2 = new Alumno ("pepita", "234567890");
			anyadirPersonas (alum2);
		Alumno alum3 = new Alumno ("claudia", "098767890");
			anyadirPersonas (alum3);
	}
	
	
	/**
	 * : añade la persona al ArrayList
	 * @param p
	 */
	public static void anyadirPersonas(Persona p)
	{
		personas.add(p);
	}
	
	
	/**
	 * : ordena el ArrayList por dni
	 */
	public void ordenarPorDNI()
	{
		
	}
	
	/**
	 * : ordena el ArrayList por nombre
	 */
	public void ordenarPorOrdenAlfabetico()
	{
		
	}
	
	/**
	 * : método para mostrar por pantalla los listados correspondientes
	 */
	public void mostrarListado()
	{
		
	}

}
