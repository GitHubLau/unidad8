/**
 * @author LAURA MARTINEZ PRIEGO 1oDAM
 */
public class Asignatura
{

	private String nombreAsignatura;
	private double nota;
	
	
	public Asignatura(String nombreAsignatura)
	{
		this.nombreAsignatura = nombreAsignatura;
	}
	
	//GETTER
	public String getNombre()
	{
		return nombreAsignatura;
	}
	
	public double getNota()
	{
		return nota;
	}
	
	//SETTERS
	public void setNombre( String nombreAsignaturaString)
	{
		this.nombreAsignatura = nombreAsignaturaString;
	}
	
	public void setNota( double nota)
	{
		this.nota = nota;
	}
}

