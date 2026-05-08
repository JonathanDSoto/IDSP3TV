package views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.User;

public class UsersView {

	public UsersView() {
		
	}
	
	public void showUsers(ArrayList<User> usuarios)
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
		
		JPanel panel_users = new JPanel();
		panel_users.setSize(900, 500);
		panel_users.setLocation(50, 50);
		panel_users.setBackground(Color.decode("#DDDEA6"));
		panel_users.setLayout(null);
		ventana.add(panel_users);
		
		String [] table_head = {"ID","Nombre","Apellidos","Correo electrónico","Teléfono","Acciones"};
		
		/*Object [][] table_body = {
			    {"20231001","Carlos","Ramírez López","carlos.ramirez@correo.com","3","Ingeniería en Sistemas Computacionales","Editar"},
			    {"20231002","María","González Pérez","maria.gonzalez@correo.com","5","Ingeniería Industrial","Editar"},
			    {"20231003","Luis","Hernández Torres","luis.hernandez@correo.com","1","Licenciatura en Administración","Editar"},
			    {"20231004","Ana","Martínez Ruiz","ana.martinez@correo.com","7","Ingeniería Civil","Editar"},
			    {"20231005","Jorge","Sánchez Morales","jorge.sanchez@correo.com","4","Ingeniería Mecatrónica","Editar"},
			    {"20231006","Fernanda","Castillo Díaz","fernanda.castillo@correo.com","2","Licenciatura en Psicología","Editar"},
			    {"20231007","Diego","Vargas Romero","diego.vargas@correo.com","6","Ingeniería en Tecnologías de la Información","Editar"}
			};*/
		
		Object[][] data = new Object[usuarios.size()][6];
		
		for (int i = 0; i < usuarios.size(); i++) {
		    User u = usuarios.get(i);
		    data[i][0] = u.getId();
		    data[i][1] = u.getName();
		    data[i][2] = u.getLastname();
		    data[i][3] = u.getEmail();
		    data[i][4] = u.getPhone();
		    data[i][4] = "";
		} 
		
		JTable studens = new JTable(data,table_head);
		
		JScrollPane final_table = new JScrollPane(studens);
		final_table.setSize(700,150);
		final_table.setLocation(100, 100);
		
		panel_users.add(final_table);
		
		panel_users.repaint();
		ventana.setVisible(true);
	}

}
