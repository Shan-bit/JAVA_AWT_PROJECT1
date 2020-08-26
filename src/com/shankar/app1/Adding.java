package com.shankar.app1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adding {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAdd;
	private JTextField textField_2;
	private JLabel lblAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adding window = new Adding();
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
	public Adding() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBounds(new Rectangle(3, 21, 19, 15));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(46, 139, 87));
		textField.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(177, 80, 180, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblValue = new JLabel("Value1");
		lblValue.setFont(new Font("Verdana", Font.BOLD, 18));
		lblValue.setForeground(Color.WHITE);
		lblValue.setBackground(Color.RED);
		lblValue.setBounds(50, 70, 95, 54);
		frame.getContentPane().add(lblValue);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(46, 139, 87));
		textField_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(177, 165, 180, 43);
		frame.getContentPane().add(textField_1);
		
		JLabel lblValue_1 = new JLabel("Value2");
		lblValue_1.setForeground(Color.WHITE);
		lblValue_1.setFont(new Font("Verdana", Font.BOLD, 18));
		lblValue_1.setBackground(Color.RED);
		lblValue_1.setBounds(50, 154, 95, 54);
		frame.getContentPane().add(lblValue_1);
		
		btnAdd = new JButton("Add");
		btnAdd.setForeground(new Color(224, 255, 255));
		btnAdd.setActionCommand("Adding");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int value1 = 0, value2 = 0;
				//read text values (value1, value2)
				value1 = Integer.parseInt(textField.getText());
				value2 = Integer.parseInt(textField_1.getText());
				//perform addition operation
				int sum = value1 + value2;
				textField_2.setText(String.valueOf(sum));
			}
		});
		btnAdd.setFont(new Font("Script MT Bold", Font.BOLD, 18));
		btnAdd.setBackground(new Color(255, 0, 0));
		btnAdd.setBounds(183, 263, 89, 43);
		frame.getContentPane().add(btnAdd);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(32, 178, 170));
		textField_2.setForeground(new Color(255, 20, 147));
		textField_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(177, 343, 180, 43);
		textField_2.setEditable(false);
		frame.getContentPane().add(textField_2);
		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setForeground(Color.WHITE);
		lblAnswer.setFont(new Font("Verdana", Font.BOLD, 18));
		lblAnswer.setBackground(Color.RED);
		lblAnswer.setBounds(50, 333, 95, 54);
		frame.getContentPane().add(lblAnswer);
		frame.setBounds(100, 100, 497, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
