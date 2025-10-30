package com.empresa;

public class SwitchCase 
{

	public static void main(String[] args) 
	{
		String modulo = "Contabilidad";
		
		switch(modulo)
		{
		case "Contabilidad":
			System.out.println("Ingreso al módulo de Contabilad");
			break;
			
		case "Presupuesto":
			System.out.println("Ingreso al módulo de Presupuesto");
			break;
			
		case "Tesorería":
			System.out.println("Ingreso al módulo de Tesorería");
			break;
			
		case "Nómina":
			System.out.println("Ingreso al módulo de Nómina");
			break;
			
		case "Inventarios":
			System.out.println("Ingreso al módulo de Inventarios");
			break;
			
		case "Indycom":
			System.out.println("Ingreso al módulo de Industria y Comercio");
			break;
			
		case "Predial":
			System.out.println("Ingreso al módulo de Predial");
			break;
			
			default:
			System.out.println("Regrese a la página y seleccione un módulo");
						
		}
		

	}

}
