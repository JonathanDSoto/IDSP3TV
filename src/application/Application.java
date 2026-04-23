package application;

import constrollers.AuthController;

public class Application {

	public static void main(String[] args) {
		
		AuthController ac = new AuthController();
		ac.login();
	}

}
