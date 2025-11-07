package strings;

public class StringMethods 
{

	
	public static void main(String[] args) 
	{
		String saludo = "Hola mundo";
		
		
		System.out.println(saludo.charAt(3));
		System.out.println("Longitud: " + saludo.length());
		System.out.println("En mayúsculas: " + saludo.toUpperCase());
		System.out.println("Contiene 'mun'?:" + saludo.contains("mun"));
		System.out.println("Reemplazo: " + saludo.replace("mundo", "Java"));
		System.out.println(saludo.concat(" Bello"));
		System.out.println("Termina en 'Hola'? " + saludo.endsWith("Hola") );

	}

}
