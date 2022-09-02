package entities;

/**
 * Classe que abstrai um estoque de produtos
 * @author Bruno Gago
 * @version 1.0
 */

public class Product {
	
	//declaração dos atributos da class "Products"
	public String name;
	public double price;
	public int quantity;
	
	
	// Declaração de "construtor" para obrigar input de dados
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//declaração do método de soma de estoque
	public double totalValueInStock() {
		return price * quantity;
	}
	
	/**
	 * Adicionar uma quantidade no estoque
	 * @param quantity que será adicionado
	 */	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	/**
	 * Remover uma quantidade no estoque
	 * @param quantity que será removido
	 */	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//declaração do método toString para mostrar os dados inputados
	public String toString() {
		return name + ", $ " + String.format ("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format ("%.2f", totalValueInStock());
	}
}