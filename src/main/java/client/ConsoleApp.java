package client;

import entity.User;
import java.util.Scanner;

public class ConsoleApp {
	
	public void start() {
		
		//show menu
		showMenu();

		System.out.println("Enter Action: ");
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		
		switch (choice) {
		case "Login":
			loginForm(input);
			break;
		case "Register":
			registerForm(input);
			break;
		default:
			break;
		}
		

		input.close();
//		searchView();
//		addView();
//		updateView();
//		deleteView();
	}

	public void showMenu() {
		System.out.println("1. Login");
		System.out.println("2. Register");
	}

	public void loginForm(Scanner input) {
		User newUser = new User();

		System.out.print("User Id: ");
		String id = input.next();


		System.out.print("Password: ");
		String password = input.next();


	}

	public void registerForm(Scanner input) {
		System.out.print("Enter first name: ");
		String firstName = input.next();

		System.out.print("Enter last name: ");
		String lastName = input.next();

		String usertype = "customer";

	}
	

}
