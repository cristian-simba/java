package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona(); // Instancia	
		Persona p2 = new Persona();
		// Acceder a los atributos
		System.out.println("nombre: "+p.nombre);
		System.out.println("edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);
		
		p.nombre = "David";
		p.edad = 21;
		p.estatura = 1.79;
		
		System.out.println("-------------------------");
		System.out.println("nombre: "+p.nombre);
		System.out.println("edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);
		
		System.out.println("-------------------------");
		p2.nombre = "Shirley";
		System.out.println("nombre1: "+p.nombre);
		System.out.println("nombre2: " + p2.nombre);
		
	}

}
