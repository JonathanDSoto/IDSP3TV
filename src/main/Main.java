package main;

import controllers.AuthController;

public class Main {

	public static void main(String[] args) {
		
		//Ventana miVentana = new Ventana();
		AuthController ac = new AuthController();
		
		ac.showLogin();
	}

}
