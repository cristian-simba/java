package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// Instanciar
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		// Modificar
		auto1.marca = "Chevrolet";
		auto1.anio = 2020;
		auto1.precio = 29490.00;
		
		auto2.marca = "Nissan";
		auto2.anio = 2019;
		auto2.precio = 30400.00;
		
		// Mostrar
		System.out.println("------ Auto 1 -------");
		System.out.println("marca: " + auto1.marca);
		System.out.println("año: " + auto1.anio);
		System.out.println("precio: " + auto1.precio);
		System.out.println("------ Auto 2 -------");
		System.out.println("marca: " + auto2.marca);
		System.out.println("año: " + auto2.anio);
		System.out.println("precio: " + auto2.precio);
	}

}
