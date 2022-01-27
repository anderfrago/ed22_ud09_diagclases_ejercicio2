package org.cuatrovientos.ed;

public class ListaCompra {
	
	Product[] listaProductos;

	public ListaCompra(int num) {
		this.listaProductos = new Product[num];
	}
	
	public boolean add(Product p) {
		// Agregar el producto a la lista
		if(this.listaProductos[this.listaProductos.length-1] == null) {
			// La lista no  está llena
			// Agregar el elemento en la última posición vacía
			for (int i = 0; i < listaProductos.length; i++) {
				if(this.listaProductos[i] == null) {
					// agregar aquí
					this.listaProductos[i] = p;
					return true;
				}
			}	
		} 		
		return false;
	}
	
	public String showAll() {
		// Recorrer lista y mostrar elementos
		String result = "";
		/*
		for (int i = 0; i < listaProductos.length; i++) {
			if(listaProductos[i] != null)
				result += listaProductos[i].toString()+"\n";		
		}
		*/
		
		 for (Product product : listaProductos) {
			if(product != null)
				result += product.toString() + "\n";
		}
		
		return result;
	}
}
