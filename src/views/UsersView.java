package views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.UsersController;
import models.User;

public class UsersView {
	
	private UsersController uc;

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
		
		JButton add = new JButton("Añadir");
		add.setBounds(100, 100, 200, 40);
		add.addActionListener(e ->{
			
			ventana.dispose();
			addUserForm();
			
		});
		panel_users.add(add);
		
		String [] table_head = {"ID","Nombre","Apellidos","Correo electrónico","Teléfono","Acciones"};
		
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
		final_table.setLocation(100, 200);
		
		panel_users.add(final_table);
		
		panel_users.repaint();
		ventana.setVisible(true);
	}

	public void addUserForm()
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
		
		JPanel panel = new JPanel();
	    panel.setBackground(Color.WHITE);
	    panel.setLayout(null);
	    panel.setBounds(0, 0, 1000, 600);
	    
	 // ---------- Campo Nombre ----------
	    JPanel nombrePanel = new JPanel(null);
	    nombrePanel.setBackground(Color.WHITE);
	    nombrePanel.setBorder(BorderFactory.createTitledBorder("Nombre completo"));
	    nombrePanel.setBounds(45, 145, 360, 75);

	    JTextField nombreField = new JTextField();
	    nombreField.setBounds(18, 28, 325, 35);
	    nombreField.setBackground(new Color(218, 230, 225));
	    nombreField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	    nombrePanel.add(nombreField);

	    panel.add(nombrePanel);

	    // ---------- Campo Correo ----------
	    JPanel correoPanel = new JPanel(null);
	    correoPanel.setBackground(Color.WHITE);
	    correoPanel.setBorder(BorderFactory.createTitledBorder("Correo electrónico"));
	    correoPanel.setBounds(45, 230, 360, 75);

	    JTextField correoField = new JTextField();
	    correoField.setBounds(18, 28, 325, 35);
	    correoField.setBackground(new Color(218, 230, 225));
	    correoField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	    correoPanel.add(correoField);

	    panel.add(correoPanel);

	    // ---------- Campo Contraseña ----------
	    JPanel passPanel = new JPanel(null);
	    passPanel.setBackground(Color.WHITE);
	    passPanel.setBorder(BorderFactory.createTitledBorder("Contraseña"));
	    passPanel.setBounds(45, 315, 360, 75);

	    JPasswordField passwordField = new JPasswordField();
	    passwordField.setBounds(18, 28, 290, 35);
	    passwordField.setBackground(new Color(218, 230, 225));
	    passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	    passPanel.add(passwordField);

	    JLabel iconoOjo = new JLabel();
	    iconoOjo.setBounds(318, 36, 20, 20);
	    try {
	        iconoOjo.setIcon(new ImageIcon(this.getClass().getResource("/img/hidden.png")));
	    } catch (Exception ex) {
	        iconoOjo.setText("👁");
	    }
	    passPanel.add(iconoOjo);

	    panel.add(passPanel); 
	    
	    JButton save = new JButton("Guardar");
	    save.setBounds(220, 450, 150, 40);
	    save.addActionListener(e ->{
	    	
	    	boolean valido = true;
	    	
	    	String nombre = nombreField.getText().trim();
	        String correo = correoField.getText().trim();
	        String password = new String(passwordField.getPassword()).trim();
	    	
	        if (nombre.isEmpty()) {
	            nombreField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	            valido = false;
	        } else {
	            nombreField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	        }

	        if (correo.isEmpty() || !correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
	            correoField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	            valido = false;
	        } else {
	            correoField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	        }

	        if (password.isEmpty() || password.length() < 5) {
	            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
	            valido = false;
	        } else {
	            passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
	        }
	        
	        if(valido)
	        {
	        	uc = new UsersController();
	        	
	        	boolean flag = uc.addUser(nombre, correo, password);
	        	
	        	if(flag)
	        	{
	        		JOptionPane.showMessageDialog(
		                null,
		                "Registro exitoso\n\n" +
		                "Nombre: " + nombre + "\n" +
		                "Correo: " + correo + "\n",
		                "Éxito",
		                JOptionPane.INFORMATION_MESSAGE
		            );
	        		
	        		ventana.dispose();

	        		uc.show();
	        		
	        	}else {
	        		JOptionPane.showMessageDialog(
    	                null,
    	                "No se pudo crear la cuenta.",
    	                "Aviso",
    	                JOptionPane.WARNING_MESSAGE
    	            );
	        	}
	        }
	        
	    });
	    panel.add(save);
	    
	    JButton cancel = new JButton("Cancelar");
	    cancel.setBounds(30, 450, 150, 40);
	    cancel.addActionListener(e ->{
	    	
	    	ventana.dispose();
	    	uc = new UsersController();
	    	uc.show();
	    	
	    });
	    panel.add(cancel);
	    
	    ventana.add(panel);
		
		ventana.setVisible(true);
	}
	
}








