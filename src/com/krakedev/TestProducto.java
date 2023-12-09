package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// Instancia
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		// Modificar
		// Producto A
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Pastilla para el dolor del cuerpo";
		productoA.precio = 0.50;
		productoA.stockActual = 50;
		// Producto B
		productoB.nombre = "Finalin";
		productoB.descripcion = "Pastilla para el dolor de cabeza";
		productoB.precio = 0.75;
		productoB.stockActual = 100;
		// Producto C
		productoC.nombre = "Protector Solar";
		productoC.descripcion = "Crema para proteger la piel";
		productoC.precio = 2.70;
		productoC.stockActual = 20;
		
		// Mostrar
		System.out.println("--- Producto A ---");
		System.out.println("nombre: " + productoA.nombre);
		System.out.println("descripcion: " + productoA.descripcion);
		System.out.println("precio: " + productoA.precio);
		System.out.println("stock Actual: " + productoA.stockActual);
		System.out.println("--- Producto B ---");
		System.out.println("nombre: " + productoB.nombre);
		System.out.println("descripcion: " + productoB.descripcion);
		System.out.println("precio: " + productoB.precio);
		System.out.println("stock Actual: " + productoB.stockActual);
		System.out.println("--- Producto C ---");
		System.out.println("nombre: " + productoC.nombre);
		System.out.println("descripcion: " + productoC.descripcion);
		System.out.println("precio: " + productoC.precio);
		System.out.println("stock Actual: " + productoC.stockActual);
	}

}
