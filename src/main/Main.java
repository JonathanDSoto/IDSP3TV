package main;

import controllers.AuthController;
import views.UsersView;

public class Main {

	public static void main(String[] args) {
		
		
		AuthController ac = new AuthController();
		
		ac.showLogin();
		
		//UsersView test = new UsersView();
		
		//test.addUserForm();
	}

}
