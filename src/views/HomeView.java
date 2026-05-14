package views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

import controllers.UsersController;

public class HomeView {
	
	private UsersController uc;
	
	public HomeView() {
		
		uc = new UsersController();
	}
	
	public void showHome()
	{
		JFrame ventana = new JFrame();
		ventana.setSize(1000, 620); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1000,800));
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Hola");
		ventana.setLayout(null); 
		ventana.getContentPane().setBackground(Color.gray);

		
		JButton goToUsers = new JButton("Ir a usuarios");
		goToUsers.setBounds(100, 100, 200, 100);
		goToUsers.addActionListener(e->{
			
			uc.show();
			ventana.dispose();
			
		});
		ventana.add(goToUsers);
		
		ventana.setVisible(true);
	}

}






