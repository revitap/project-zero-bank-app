package client;

import java.util.Scanner;

public class ConsoleApp {
	
	public void start() {
		
		//show menu
		showMenu();
		
		System.out.println("Enter Action: ");
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		
		switch (choice) {
		case 1:
			
			break;
			
		default:
			break;
		}
		
		listView();
		
		input.close();
//		searchView();
//		addView();
//		updateView();
//		deleteView();
	}
	
	private void showMenu() {
		//show menu
		System.out.println("1.List");
		System.out.println("2.Search");
		System.out.println("3.Add");
		System.out.println("4.Update");
		System.out.println("5.Delete");		
	}
	
	private void listView() {
		
		ProductService service = new ProductService();
		List<Product> products = service.findAll();		
		//header
		for(Product p : products) {
			System.out.println(p.getId() + " | "+p.getTitle());
		}
		//data
	}

}
