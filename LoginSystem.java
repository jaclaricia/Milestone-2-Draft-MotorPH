package EmployeeApp;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.*;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginSystem {

	public JFrame frmDfsf;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frmDfsf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public void initialize() {

		// Frame Compositions (Label, Button, Text Fields, etc.)

		frmDfsf = new JFrame();
		frmDfsf.addWindowListener(new WindowAdapter() {
			@Override
			
			//Clicking the "x" button of the window will prompt the user to proceed or not in closing the window.
			public void windowClosing(WindowEvent e) {
				int option = JOptionPane.showConfirmDialog(frmDfsf, "Proceed closing the window?", "Close Window",
						JOptionPane.YES_NO_OPTION);
				//Choosing "Yes" will close the window
				if (option == JOptionPane.YES_OPTION) {
					frmDfsf.dispose();
				} else
					//Choosing "No" will close the prompt and return to the main window.
					frmDfsf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}

		});
		frmDfsf.setTitle("Motor PH: Employee App - Claricia, J. A.");
		frmDfsf.setBounds(200, 200, 500, 300);
		frmDfsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDfsf.setLocationRelativeTo(null);
		frmDfsf.getContentPane().setLayout(null);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(73, 98, 73, 14);
		frmDfsf.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(73, 129, 73, 14);
		frmDfsf.getContentPane().add(lblPassword);

		JLabel lblNewLabel_2 = new JLabel("Employee App");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(157, 22, 178, 50);
		frmDfsf.getContentPane().add(lblNewLabel_2);

		txtUsername = new JTextField();
		txtUsername.setBounds(156, 95, 266, 20);
		frmDfsf.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		JButton btnNewButton = new JButton("Login");

		// Read file from text upon click
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try (BufferedReader reader = new BufferedReader(
						new FileReader("C:\\Users\\clari\\Desktop\\computerProgramming2\\Login\\login.txt"))) {
					// Checks existing of login credentials from text
					if ((reader.readLine()).equals(txtUsername.getText())) {
						if (reader.readLine().equals(passwordField.getText())) {
							JOptionPane.showMessageDialog(null, "Login Successful!");
							frmDfsf.setVisible(false);
							Information info = new Information();
							info.frmMotorPhEmployee.setVisible(true);
							if (!(reader.readLine().equals(passwordField.getText()))) {
								JOptionPane.showMessageDialog(null, "Account not found.");
							}
						} else
							JOptionPane.showMessageDialog(null, "Account not found.");
					} else
						JOptionPane.showMessageDialog(null, "Account not found.");
				} catch (Exception ex) {
					return;
				}
			}
		});

		btnNewButton.setBounds(206, 183, 89, 38);
		frmDfsf.getContentPane().add(btnNewButton);

		// Resets the text fields
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				passwordField.setText(null);
			}
		});

		btnNewButton_1.setBounds(334, 183, 89, 38);
		frmDfsf.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Register");

		// Writes on textfile on a local directory to save login credentials
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtUsername.getText().equals("") || passwordField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Invalid Username/Password.");
				} else {
					try {
						BufferedWriter writer = new BufferedWriter(
								new FileWriter("C:\\Users\\clari\\Desktop\\computerProgramming2\\Login\\login.txt"));
						writer.write(txtUsername.getText() + "\n");
						writer.write(passwordField.getText() + "\n");
						writer.close();
					} catch (Exception ex) {
						return;
					}
					JOptionPane.showMessageDialog(null, "Registered");
				}
			}
		});

		btnNewButton_2.setBounds(73, 183, 89, 38);
		frmDfsf.getContentPane().add(btnNewButton_2);

		passwordField = new JPasswordField();
		passwordField.setBounds(156, 126, 267, 20);
		frmDfsf.getContentPane().add(passwordField);

		// Hide and unhide password toggle w/ checkbox
		JCheckBox showPass = new JCheckBox("Show");
		showPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (showPass.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else {
					passwordField.setEchoChar('•');
				}
			}
		});
		showPass.setBounds(372, 153, 73, 23);
		frmDfsf.getContentPane().add(showPass);
	}
}
