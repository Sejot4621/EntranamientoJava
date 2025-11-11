package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties 
{

	public static void main(String[] args) 
	{
		Properties prop = new Properties();
		
		InputStream readFile = null;
		
		try
		{
			//Se abre el archivo
			readFile = new FileInputStream("config.properties");
			
			//Se cargan las propiedades desde el archivo hacia el objeto prop
			prop.load(readFile);
			
			//Se recuperan y muestran las propiedades especificas por su clave
			System.out.println(prop.getProperty("DBServer"));
			System.out.println(prop.getProperty("DBName"));
			System.out.println(prop.getProperty("DBPass"));
			System.out.println(prop.getProperty("username"));
			
		}
		catch (IOException io)
		{
			//mensaje creado por el programador para exponer la excepción
			System.out.println("Ojo, ponga cuidado: ocurrio un error al leer el archivo");
			io.printStackTrace();
		}
		finally
		{
			if(readFile != null)
			{
				try
				{
					//cierra el flujo de entrada
					readFile.close();
				}
				catch (IOException e)
				{
					//Muestra cualquier error al cerrar el archivo
					e.printStackTrace();
				}
			}
		}
	

	}

}
