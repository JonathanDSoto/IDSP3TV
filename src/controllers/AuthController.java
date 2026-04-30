package controllers;

import views.AuthView;

public class AuthController {

	private AuthView vista;
	
	public AuthController() {
		
		vista = new AuthView();
	}
	
	public void showLogin()
	{
		vista.login();
	}

}
