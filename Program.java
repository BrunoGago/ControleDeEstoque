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
		
		//configuração de "," e "." e implementação do Scanner para input de dados
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
		
		//saída da class "product" conforme a função escrita na própria class
		System.out.println(product.toString());
		System.out.println();
		
		//alteração de estoque, adicionando uma nova quantidade a já informada anteriormente, utilizando a função "addProducts"
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		//update do valor em estoque
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();

		//alteração de estoque, removendo uma nova quantidade a já informada anteriormente, utilizando a função "removeProducts"
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		//saída dos dados finais após as atualizações de estoque
		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}