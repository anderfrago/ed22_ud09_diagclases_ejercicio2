package org.cuatrovientos.ed;

public class User {
	
	ListaCompra lista;
	
	public User(ListaCompra l) {
		lista =  l;
	}

	public ListaCompra getLista() {
		return lista;
	}

	public void setLista(ListaCompra lista) {
		this.lista = lista;
	}
	
	

}
