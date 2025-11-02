package com.empresa;

public class Estudiantes 
{
	public Estudiantes()
	{
		System.out.println("Hola, estoy en el constructor");
	}
	
	int numero;
	String nombre;
	
	public Estudiantes(int i, String n)
	{
		numero = i;
		nombre = n;
		
		
	}
	
	public void desplegar()
	{
		System.out.println("Número es: " + numero + " " + "Y nombre es:" + nombre);
	}
	


	public static void main(String[] args) 
	{
		Estudiantes estudiante = new Estudiantes();
		Estudiantes estudiante2 = new Estudiantes(1, "Juan");
		Estudiantes estudiante3 = new Estudiantes(2, "Laura");
		estudiante2.desplegar();
		estudiante3.desplegar();
		
	}

}
