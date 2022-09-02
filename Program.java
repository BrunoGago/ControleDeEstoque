package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

/**
 * Classe que abstrai um estoque de produtos
 * @author Bruno Gago
 * @version 1.0
 */

public class Program {

	public static void main(String[] args) {
		
		//configura��o de "," e "." e implementa��o do Scanner para input de dados
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//entrada dos dados para a class "product"
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		//sa�da da class "product" conforme a fun��o escrita na pr�pria class
		System.out.println(product.toString());
		System.out.println();
		
		//altera��o de estoque, adicionando uma nova quantidade a j� informada anteriormente, utilizando a fun��o "addProducts"
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		//update do valor em estoque
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();

		//altera��o de estoque, removendo uma nova quantidade a j� informada anteriormente, utilizando a fun��o "removeProducts"
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		//sa�da dos dados finais ap�s as atualiza��es de estoque
		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}