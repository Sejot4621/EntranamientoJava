package Opps;

public class ClaseDeIngenieria implements Estudiante
{

	public static void main(String[] args) 
	{
		ClaseDeIngenieria ing = new ClaseDeIngenieria();
		ClaseDeMedicina med = new ClaseDeMedicina();
		
		ing.mostrarNombre();
		ing.obtenerGrado();
		ing.obtenerNumeroDeEstudiantes();
		ing.obtenerUniversidad();
		
		System.out.println("*************************");
		
		med.mostrarNombre();
		med.obtenerGrado();
		med.obtenerNumeroDeEstudiantes();
		med.obtenerUniversidad();

	}

	
	public void mostrarNombre() 
	{
		System.out.println("Hola, somos estudiantes de ingeniería");
		
	}

	
	public void obtenerNumeroDeEstudiantes() 
	{
		System.out.println("Somos 50 estudiantes");
		
	}

	
	public void obtenerGrado() 
	{
		System.out.println("Somos de quinto semestre");
		
	}
	
	public void obtenerUniversidad()
	{
		System.out.println("La univerdid es: " + Estudiante.universidad);
	}


	
	public void obtenerNombreInterface() 
	{
		
		
	}

}
