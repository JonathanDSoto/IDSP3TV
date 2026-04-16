package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Memorice {

	private JFrame frame;
	public Integer [] cartas = {1,1,2,2,3,3,4,4,5,5,6,6};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorice window = new Memorice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Memorice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//desordenar cartas 
		List<Integer> lista = Arrays.asList(cartas);
        Collections.shuffle(lista);
        
        lista.toArray(cartas);
        
        System.out.println(Arrays.toString(cartas));
        //desordenar cartas
        
        
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 188, 253));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(171, 250, 255));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 4, 0, 0));
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnNewButton_5.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/1.png")));
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_5);
		
		 
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/1.png")));
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flip(10,btnNewButton_6);
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flip(11,btnNewButton_2);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/placeholder.png")));
		panel_1.add(btnNewButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(247, 239, 127));
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pausa");
		panel_2.add(btnNewButton_1);
	}
	
	public void flip(Integer n,JButton b) {
	
		System.out.println(cartas[n]);
		
		b.setIcon(new ImageIcon(Memorice.class.getResource("/images/memorice/"+cartas[n]+".png")));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
