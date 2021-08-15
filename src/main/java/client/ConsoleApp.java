package client;

import java.util.Scanner;

import common.pojo.User;
import manager.UserManager;

public class ConsoleApp {
	
	private UserManager userManager = new UserManager();
	
	User currentUser = new User();
	
	Scanner input = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("=======================");
		System.out.println(" MY BANK APP MAIN MENU ");
		System.out.println("=======================");
		System.out.println("Options:");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("Select option: ");
		
		String userInput = input.next();
		
		switch(userInput) {
			case "1":
				currentUser = register();
				break;
			case "2":
				currentUser = login();			
				break;
			default:
				System.out.println("Invalid option. Try again.");
				break;
		}
		
		if (currentUser == null) {
			System.out.println("Invalid option. Try again.");
			start();
		}  else {
		
		String type = checkType();	
		
		if (type.equals("customer")) {
			showCustomerAccounts();
		} else if (type.equals("employee")) {
			showEmployeeAccount();
		} else {
			System.out.println("Invalid option. Try again.");
		}
		
		input.close();
		
		}

	}
	
	private User register() {
		System.out.println("============================");
		System.out.println(" BANK APP REGISTRATION MENU ");
		System.out.println("============================");
		System.out.println("Enter first name: ");
		String firstName = input.next();
		System.out.println("Enter last name: ");
		String lastName = input.next();
		System.out.println("Enter customer or employee: ");
		String userType = input.next();
		System.out.println("Enter email address: ");
		String email = input.next();
		System.out.println("Enter password: ");
		String pword = input.next();
		
		userManager.registerUser(firstName, lastName, userType, email, pword);
		
		System.out.println("+++++ Registration complete. +++++");
		
		currentUser = login();
		
		return currentUser;
		
	}
	
	private User login() {
		System.out.println("=======================");
		System.out.println(" BANK APP LOGIN SCREEN ");
		System.out.println("=======================");
		System.out.println("Login with email and password");
		System.out.println("Enter email: ");
		String email = input.next();
		System.out.println("Enter password: ");
		String pword = input.next();
		
		User currentUser = userManager.checkCredentialsUser(email, pword);
		
		return currentUser;
		
	}
	
	private String checkType() {
		String type = "customer";
		if ((currentUser != null) & (currentUser.getUserType().equals("customer"))) {
			System.out.println("+++++ Welcome " + currentUser.getFirstName() + " " + currentUser.getLastName() +" +++++");			
			type = "customer";			
		} else if ((currentUser != null) && (currentUser.getUserType().equals("employee"))){
			System.out.println("Hello " + currentUser.getFirstName() + " " + currentUser.getLastName());		
			type = "employee";
		} else {
			System.out.println("Invalid option. Try again.");
		}
			return type;
	}
	
	
	private void showCustomerAccounts() {
		
		System.out.println("========================");
		System.out.println(" BANK APP CUSTOMER MENU ");
		System.out.println("========================");
		while(true) {
		
		System.out.println("Options:");
		System.out.println("1. Select account");
		System.out.println("2. View transactions");
		System.out.println("3. Create new account");
		System.out.println("4. Delete account");
		System.out.println("5. Exit");
		System.out.println("Select option:");
	
		
		String userInput = input.next();
		
	
		switch (userInput) {
			case "1":
				System.out.println("Account selected");
				myAccountSelected();
				break;
			case "2":
				System.out.println("View transactions selected");
				myTransactionsSelected();
				break;			
			case "3":
				System.out.println("Create new account selected");
				createNewAccount();
				break;
			case "4":
				System.out.println("Delete account selected");
				deleteAccount();
				break;
			case "5":
				System.out.println("Goodbye");
				break;
			default:
				break;
			}
		}		
	}
	
	private void myAccountSelected() {
		System.out.println("TODO: need to complete method");		
	}
	
	private void myTransactionsSelected() {
		System.out.println("TODO: need to complete method");		
	}
	
	private void createNewAccount() {
		System.out.println("TODO: need to complete method");		
	}
	
	private void deleteAccount() {
		System.out.println("TODO: need to complete method");		
	}	
	

	private void showEmployeeAccount() {
		
		System.out.println("========================");
		System.out.println(" BANK APP EMPLOYEE MENU ");
		System.out.println("========================");
		System.out.println("Select option");
		System.out.println("1. View transactions");
		System.out.println("2. Approve accounts");
		System.out.println("3. Exit");
		
		String userInput = input.next();
		
		switch (userInput) {
		case "1":
			System.out.println("View transactions selected");
			viewTransactions();
			break;
			
		case "2":
			System.out.println("Approve accounts selected");
			approveAccounts();
			break;
			
		case "3":
			System.out.println("Goodbye");
			break;
			
		default:
			break;
		}
	}
	
	
	private void viewTransactions() {
		System.out.println("TODO: need to complete method");	
	}
	
	private void approveAccounts() {
		System.out.println("TODO: need to complete method");
	}

}
