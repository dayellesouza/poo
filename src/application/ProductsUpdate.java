package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductUpdate;

public class ProductsUpdate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		ProductUpdate product = new ProductUpdate(name, price);
		
		product.setName("Computer");
		System.out.println("UPDATE NAME: " + product.getName());
		product.setPrice(1200.00);
		System.out.printf("UPDATE PRICE: %.2f%n" , product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
