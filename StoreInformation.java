package project1;

import java.util.*;
import java.util.Map.Entry;

public class StoreInformation {
	
	private Scanner sc;
	private Map<Integer, Product> mapOfProducts; // Map storing list of products
	private List<Item> listOfItems;
	
	private List<User> listOfUsers;
	private User currentUser;
	
	public StoreInformation() {
		sc = new Scanner(System.in);
		mapOfProducts = new HashMap<>();
		listOfItems = new ArrayList<>();
		
		listOfUsers = new ArrayList<>();
		
	}
	
	public void insertProductDetails() {
		System.out.println("How many products do you want to add?");
		int numOfProducts = sc.nextInt();
		
		for(int i = 0; i < numOfProducts; i++) {
			Product prod = new Product();
			
			System.out.println("Enter id of product:");
			prod.setProductId(sc.nextInt());
			
			System.out.println("Enter name of product:");
			prod.setProductName(sc.next());
			
			System.out.println("Enter selling price of product:");
			prod.setSellingPrice(sc.nextDouble());
			
			System.out.println("Enter available quantity:");
			prod.setAvailableQuantity(sc.nextInt());
		}
	}
	
	public void displayProductDetails() {
		Set<Map.Entry<Integer, Product>> productDetails = mapOfProducts.entrySet();
		System.out.println("These are the products available: ");
		
		for(Entry<Integer, Product> productDetail : productDetails) {
			Product product = productDetail.getValue();
			
			System.out.println("Product ID: " + product.getProductId());
			System.out.println("Name: " + product.getProductName());
			System.out.println("Selling price: " + product.getSellingPrice());
			System.out.println("Quantity: " + product.getAvailableQuantity());
		}
	}
	
	public void searchProductById() {
		// search product by id
		System.out.println("Enter ID of product you want to search: ");
		int productId = sc.nextInt();
		
		for(Entry<Integer, Product> productDetail : mapOfProducts.entrySet()) {
			Product product = productDetail.getValue();
			if(product.getProductId() == productId) {
				System.out.println("Product details: ");
				System.out.println("ID: " + product.getProductId());
				System.out.println("Name: " + product.getProductName());
				System.out.println("Price: " + product.getSellingPrice());
				System.out.println("Quantity: " + product.getAvailableQuantity());
			}
		}
	}
	
	public void searchProductByName() {
		// search product by name and view its details
		System.out.println("Enter ID of product you want to search: ");
		String productName = sc.next();
		
		for(Entry<Integer, Product> productDetail : mapOfProducts.entrySet()) {
			Product product = productDetail.getValue();
			if(product.getProductName() == productName) {
				
			}
		}
	}
	
	public void searchProductByIdWithFilter() {
		System.out.println("Enter ID of product: ");
		int targetId = sc.nextInt();
		mapOfProducts.entrySet().stream().filter(prod -> prod.getValue().getProductId() == targetId)
			.forEach(e -> {
				System.out.println("Product details: ");
				System.out.println("ID: " + e.getValue().getProductId());
				System.out.println("Name: " + e.getValue().getProductName());
				System.out.println("Price: " + e.getValue().getSellingPrice());
				System.out.println("Quantity: " + e.getValue().getAvailableQuantity());
			});
	}
	
	public void searchProductByCategory() {
		
		String category = sc.next();
		
		mapOfProducts.entrySet().stream().filter(prod -> prod.getValue().getCategory() == category)
			.forEach(e -> {
				System.out.println("Product details: ");
				System.out.println("ID: " + e.getValue().getProductId());
				System.out.println("Name: " + e.getValue().getProductName());
				System.out.println("Price: " + e.getValue().getSellingPrice());
				System.out.println("Quantity: " + e.getValue().getAvailableQuantity());
			});
	}
	
	public void displayProfitByCategory() {
		// display profit by category of item
		String category = sc.next();
		
	}
	
	public void signUp() { // Insert new user details
		System.out.println("Enter user information: ");
		User newUser = new User(); 
		
		System.out.println("Enter username ");
		newUser.setUserName(sc.next());
		
		System.out.println("Enter email address ");
		newUser.setEmailId(sc.next());
		
		System.out.println("Enter password ");
		newUser.setPassword(sc.next());
		
		System.out.println("Enter amount of super coins\n *100 Bonus coins for new users*");
		newUser.setSuperCoins(sc.nextDouble() + 100);
	}
	
	public void logIn() { // FIX: Complete this method to login users already signed up
		System.out.println("Enter 'A' for Admin or 'C' for Customer: ");
		char input;
		boolean inputError = true;
		
		do {
			try {
				input = sc.next().charAt(0);
				
				// If administrator
				if(input == 'A') {
					if(currentUser.getAdminStatus() == true) {
						menuForAdmin();
					}
				}
				// else if customer
				else if (input == 'C') {
					menuForCustomer();
				}
				else {
					throw new InvalidInputException();
				}
				
				inputError = false;
			}
			catch(InvalidInputException e) {
				System.out.println("Please enter valid input.");
			} 
			
		} while(inputError);
	} 
	
	// Menu option for administrator
	public void menuForAdmin() {
		String choice = "y";
		int option;
		
		char input;
		boolean inputError = true;
		
		do {
			try {
				System.out.println("Select option: ");
				while(choice.equals("y")) {
					System.out.println("1. View list of products in store. ");
					System.out.println("2. Search a product by ID. ");
					System.out.println("3. View list of products by category. ");
					System.out.println("4. Search a product by name. ");
					System.out.println("5. ");
					
				}
								
			} catch (InvalidInputException e) {
				System.out.println("Please enter valid input.");
			}
		} while(inputError);
	}
	
	// Menu option for customers
	public void menuForCustomer() {
		String choice = "y";
		int option;
		
		char input;
		boolean inputError = true;
		
		do {
			try {
				System.out.println("");
				
			} catch (InvalidInputException e) {
				System.out.println("Please enter valid input.");
			}
		} while(inputError);
	}
	
	public static void main(String[] args) {
		
		User user = new User();
		
	}
	
}
