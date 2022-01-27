package org.cuatrovientos.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner read = new Scanner(System.in);
		System.out.println("Max products in list: ");
		int maxProducts =  Integer.parseInt(read.nextLine());
		
		ListaCompra lista = new ListaCompra(maxProducts);
		
		User u1 = new User(lista);
		
		System.out.println("Product name: ");
		String nameProduct = read.nextLine();
		Product p = new Product(nameProduct);
		u1.getLista().add(p);
	
		System.out.println(lista.showAll());
	}

}
