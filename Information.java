package EmployeeApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Information {

	public JFrame frmMotorPhEmployee;
	private JLabel lblProfilePic;
	private JTextField txtBasicSalary;
	private JTextField txtPhone;
	private JTextField txtClothing;
	private JTextField txtRice;
	private JTextField txtBonus;
	private JTextField txtInsurance;
	private JTextField txtName;
	private JTextField txtDepartment;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtContact;
	private JTextField txtBirthday;
	private JTextField txtTax;
	private JTextField txtNet;
	private JTextField txtGross;
	private JTextField txtSSS;
	private JTextField txtPhilhealth;
	private JTextField txtPagibig;
	private JTextField txtTIN;
	private JTextField txtNameUp;
	private JTextField txtDepartmentUp;
	private JTextField txtEmailUp;
	private JTextField txtAddressUp;
	private JTextField txtContactUp;
	private JTextField txtSick;
	private JTextField txtEmergency;
	private JTextField txtVacation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information window = new Information();
					window.frmMotorPhEmployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Information() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Composition of frame (Label, Button, Text field, etc.)
		frmMotorPhEmployee = new JFrame();
		frmMotorPhEmployee.setTitle("Motor PH: Employee App - Claricia, J. A.");
		frmMotorPhEmployee.setBounds(100, 100, 514, 414);
		frmMotorPhEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorPhEmployee.setLocationRelativeTo(null);
		frmMotorPhEmployee.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 59, 475, 256);
		frmMotorPhEmployee.getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Information", null, panel, null);
		panel.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 63, 14);
		panel.add(lblName);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 36, 81, 14);
		panel.add(lblDepartment);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 86, 81, 14);
		panel.add(lblAddress);

		lblProfilePic = new JLabel("Picture");
		lblProfilePic.setBounds(315, 11, 150, 150);
		panel.add(lblProfilePic);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 61, 46, 14);
		panel.add(lblEmail);

		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(10, 111, 63, 14);
		panel.add(lblContact);

		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(10, 136, 63, 14);
		panel.add(lblBirthday);

		txtName = new JTextField();
		txtName.setBounds(83, 8, 222, 20);
		panel.add(txtName);
		txtName.setColumns(10);

		txtDepartment = new JTextField();
		txtDepartment.setColumns(10);
		txtDepartment.setBounds(83, 33, 222, 20);
		panel.add(txtDepartment);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(83, 58, 222, 20);
		panel.add(txtEmail);

		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(83, 83, 222, 20);
		panel.add(txtAddress);

		txtContact = new JTextField();
		txtContact.setColumns(10);
		txtContact.setBounds(83, 108, 222, 20);
		panel.add(txtContact);

		txtBirthday = new JTextField();
		txtBirthday.setColumns(10);
		txtBirthday.setBounds(83, 133, 222, 20);
		panel.add(txtBirthday);

		JLabel lblSSS = new JLabel("SSS No.");
		lblSSS.setBounds(10, 178, 63, 14);
		panel.add(lblSSS);

		txtSSS = new JTextField();
		txtSSS.setColumns(10);
		txtSSS.setBounds(83, 175, 150, 20);
		panel.add(txtSSS);

		JLabel lblPhilhealth = new JLabel("Philhealth");
		lblPhilhealth.setBounds(10, 203, 81, 14);
		panel.add(lblPhilhealth);

		txtPhilhealth = new JTextField();
		txtPhilhealth.setColumns(10);
		txtPhilhealth.setBounds(83, 200, 150, 20);
		panel.add(txtPhilhealth);

		JLabel lblPagibig = new JLabel("Pagibig No.");
		lblPagibig.setBounds(242, 203, 63, 14);
		panel.add(lblPagibig);

		txtPagibig = new JTextField();
		txtPagibig.setColumns(10);
		txtPagibig.setBounds(315, 200, 150, 20);
		panel.add(txtPagibig);

		JLabel lblTIN = new JLabel("TIN No.");
		lblTIN.setBounds(243, 178, 63, 14);
		panel.add(lblTIN);

		txtTIN = new JTextField();
		txtTIN.setColumns(10);
		txtTIN.setBounds(315, 175, 150, 20);
		panel.add(txtTIN);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Payroll", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblBasic = new JLabel("Basic Salary");
		lblBasic.setBounds(10, 11, 91, 14);
		panel_1.add(lblBasic);

		JLabel lblAllowance = new JLabel("Allowances");
		lblAllowance.setBounds(10, 36, 72, 14);
		panel_1.add(lblAllowance);

		JLabel lblClothing = new JLabel("Clothing");
		lblClothing.setBounds(20, 61, 62, 14);
		panel_1.add(lblClothing);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(20, 86, 46, 14);
		panel_1.add(lblPhone);

		JLabel lblRice = new JLabel("Rice Subsidy");
		lblRice.setBounds(20, 111, 77, 14);
		panel_1.add(lblRice);

		JLabel lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(10, 136, 72, 14);
		panel_1.add(lblBonus);

		JLabel lblDeduction = new JLabel("Deductions");
		lblDeduction.setBounds(249, 11, 72, 14);
		panel_1.add(lblDeduction);

		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setBounds(259, 36, 62, 14);
		panel_1.add(lblInsurance);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(231, 61, 9, 3);
		panel_1.add(lblNewLabel_8);

		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(259, 61, 46, 14);
		panel_1.add(lblTax);

		JLabel lblNet = new JLabel("Salary (Net)");
		lblNet.setBounds(249, 86, 72, 14);
		panel_1.add(lblNet);

		JLabel lblGross = new JLabel("Salary (Gross)");
		lblGross.setBounds(246, 111, 91, 14);
		panel_1.add(lblGross);

		txtBasicSalary = new JTextField();
		txtBasicSalary.setBounds(111, 8, 118, 20);
		panel_1.add(txtBasicSalary);
		txtBasicSalary.setColumns(10);

		txtPhone = new JTextField();
		txtPhone.setBounds(111, 83, 118, 20);
		panel_1.add(txtPhone);
		txtPhone.setColumns(10);

		txtClothing = new JTextField();
		txtClothing.setBounds(111, 58, 118, 20);
		panel_1.add(txtClothing);
		txtClothing.setColumns(10);

		txtRice = new JTextField();
		txtRice.setBounds(111, 108, 118, 20);
		panel_1.add(txtRice);
		txtRice.setColumns(10);

		txtBonus = new JTextField();
		txtBonus.setBounds(111, 133, 118, 20);
		panel_1.add(txtBonus);
		txtBonus.setColumns(10);

		txtInsurance = new JTextField();
		txtInsurance.setBounds(347, 33, 118, 20);
		panel_1.add(txtInsurance);
		txtInsurance.setColumns(10);

		txtTax = new JTextField();
		txtTax.setColumns(10);
		txtTax.setBounds(347, 58, 118, 20);
		panel_1.add(txtTax);

		txtNet = new JTextField();
		txtNet.setColumns(10);
		txtNet.setBounds(347, 83, 118, 20);
		panel_1.add(txtNet);

		txtGross = new JTextField();
		txtGross.setColumns(10);
		txtGross.setBounds(347, 108, 118, 20);
		panel_1.add(txtGross);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Update Profile", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 475, 234);
		panel_3.add(panel_4);

		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(132, 40, 63, 14);
		panel_4.add(lblName_1);

		JLabel lblDepartment_1 = new JLabel("Department");
		lblDepartment_1.setBounds(132, 65, 81, 14);
		panel_4.add(lblDepartment_1);

		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setBounds(132, 115, 81, 14);
		panel_4.add(lblAddress_1);

		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(132, 90, 46, 14);
		panel_4.add(lblEmail_1);

		JLabel lblContact_1 = new JLabel("Contact");
		lblContact_1.setBounds(132, 141, 63, 14);
		panel_4.add(lblContact_1);

		txtNameUp = new JTextField();
		txtNameUp.setColumns(10);
		txtNameUp.setBounds(208, 37, 150, 20);
		panel_4.add(txtNameUp);

		txtDepartmentUp = new JTextField();
		txtDepartmentUp.setColumns(10);
		txtDepartmentUp.setBounds(208, 62, 150, 20);
		panel_4.add(txtDepartmentUp);

		txtEmailUp = new JTextField();
		txtEmailUp.setColumns(10);
		txtEmailUp.setBounds(208, 87, 150, 20);
		panel_4.add(txtEmailUp);

		txtAddressUp = new JTextField();
		txtAddressUp.setColumns(10);
		txtAddressUp.setBounds(208, 112, 150, 20);
		panel_4.add(txtAddressUp);

		txtContactUp = new JTextField();
		txtContactUp.setColumns(10);
		txtContactUp.setBounds(208, 138, 150, 20);
		panel_4.add(txtContactUp);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Request Leave", null, panel_2, null);
		panel_2.setLayout(null);

		JCalendar calendar = new JCalendar();
		calendar.setBounds(10, 11, 258, 212);
		panel_2.add(calendar);

		JComboBox cmbLeave = new JComboBox();
		cmbLeave.addItem("....");
		cmbLeave.addItem("Sick Leave");
		cmbLeave.addItem("Vacation Leave");
		cmbLeave.addItem("Emergency Leave");
		cmbLeave.setBounds(278, 158, 187, 22);
		panel_2.add(cmbLeave);

		JLabel lblSick = new JLabel("Sick");
		lblSick.setBounds(293, 55, 34, 14);
		panel_2.add(lblSick);

		txtSick = new JTextField();
		txtSick.setBounds(368, 52, 86, 20);
		panel_2.add(txtSick);
		txtSick.setColumns(10);

		JLabel lblVacation = new JLabel("Vacation");
		lblVacation.setBounds(293, 80, 65, 14);
		panel_2.add(lblVacation);

		txtEmergency = new JTextField();
		txtEmergency.setColumns(10);
		txtEmergency.setBounds(368, 102, 86, 20);
		panel_2.add(txtEmergency);

		JLabel lblEmergency = new JLabel("Emergency");
		lblEmergency.setBounds(293, 105, 93, 14);
		panel_2.add(lblEmergency);

		txtVacation = new JTextField();
		txtVacation.setColumns(10);
		txtVacation.setBounds(368, 77, 86, 20);
		panel_2.add(txtVacation);

		JLabel lblEmployeeName = new JLabel("Employee No.");
		lblEmployeeName.setBounds(10, 26, 101, 14);
		frmMotorPhEmployee.getContentPane().add(lblEmployeeName);

		// Methods & Event Handlers

		// Logout the Employee Window and brings back the Login Window
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginSystem login = new LoginSystem();
				frmMotorPhEmployee.setVisible(false);
				login.frmDfsf.setVisible(true);
			}
		});

		btnLogout.setBounds(376, 326, 109, 35);
		frmMotorPhEmployee.getContentPane().add(btnLogout);

		JComboBox<String> comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBox.getSelectedItem().equals("1111")) {
					try {
						// Reads the CSV file from local directory
						BufferedReader readerEmp = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee1111.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String lineEmp = readerEmp.readLine();
						String[] dataEmp = lineEmp.split(",");

						// Displays employee information from CSV file
						txtName.setText(dataEmp[1]);
						txtDepartment.setText(dataEmp[2]);
						txtEmail.setText(dataEmp[3]);
						txtAddress.setText(dataEmp[4]);
						txtContact.setText(dataEmp[5]);
						txtBirthday.setText(dataEmp[6]);
						txtSSS.setText(dataEmp[7]);
						txtPhilhealth.setText(dataEmp[8]);
						txtTIN.setText(dataEmp[9]);
						txtPagibig.setText(dataEmp[10]);

						readerEmp.close();

						// Payroll
						// Reads the CSV file from local directory
						BufferedReader readerPay = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\payroll1111.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String linePay = readerPay.readLine();
						String[] dataPay = linePay.split(",");

						// Displays payroll information from CSV file
						txtBasicSalary.setText(dataPay[0]);
						txtClothing.setText(dataPay[1]);
						txtPhone.setText(dataPay[2]);
						txtRice.setText(dataPay[3]);
						txtBonus.setText(dataPay[4]);
						txtInsurance.setText(dataPay[5]);
						txtTax.setText(dataPay[6]);
						txtNet.setText(dataPay[7]);
						txtGross.setText(dataPay[8]);

						// Leaves
						BufferedReader readerLeave = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));

						String lineLeave = readerLeave.readLine();
						String[] dataLeave = lineLeave.split(",");
						txtSick.setText(dataLeave[0]);
						txtVacation.setText(dataLeave[1]);
						txtEmergency.setText(dataLeave[2]);

						lblProfilePic.setIcon(new ImageIcon(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\male.png"));

					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "File not found");
					}

				} else if (comboBox.getSelectedItem().equals("2222")) {
					try {
						// Reads the CSV file from local directory
						BufferedReader readerEmp = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee2222.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String lineEmp = readerEmp.readLine();
						String[] dataEmp = lineEmp.split(",");

						// Display employee information from CSV file
						txtName.setText(dataEmp[1]);
						txtDepartment.setText(dataEmp[2]);
						txtEmail.setText(dataEmp[3]);
						txtAddress.setText(dataEmp[4]);
						txtContact.setText(dataEmp[5]);
						txtBirthday.setText(dataEmp[6]);
						txtSSS.setText(dataEmp[7]);
						txtPhilhealth.setText(dataEmp[8]);
						txtTIN.setText(dataEmp[9]);
						txtPagibig.setText(dataEmp[10]);

						readerEmp.close();

						// Payroll
						// Reads the CSV file from local directory
						BufferedReader readerPay = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\payroll2222.csv"));

						// Reads the CSV file data separated by "," and display the data to their
						// respective textfields
						String linePay = readerPay.readLine();
						String[] dataPay = linePay.split(",");

						// Displays payroll information from CSV file
						txtBasicSalary.setText(dataPay[0]);
						txtClothing.setText(dataPay[1]);
						txtPhone.setText(dataPay[2]);
						txtRice.setText(dataPay[3]);
						txtBonus.setText(dataPay[4]);
						txtInsurance.setText(dataPay[5]);
						txtTax.setText(dataPay[6]);
						txtNet.setText(dataPay[7]);
						txtGross.setText(dataPay[8]);

						// Leaves
						BufferedReader readerLeave = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
						String lineLeave = readerLeave.readLine();
						String[] dataLeave = lineLeave.split(",");
						txtSick.setText(dataLeave[0]);
						txtVacation.setText(dataLeave[1]);
						txtEmergency.setText(dataLeave[2]);

						lblProfilePic.setIcon(new ImageIcon(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\female.png"));

					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "File not found");
					}

				} else if (comboBox.getSelectedItem().equals("....")) {
					// Sets the textfields to empty
					txtName.setText("....");
					txtDepartment.setText("....");
					txtEmail.setText("....");
					txtAddress.setText("....");
					txtContact.setText("....");
					txtBirthday.setText(".....");
					txtSSS.setText(".....");
					txtPhilhealth.setText(".....");
					txtTIN.setText(".....");
					txtPagibig.setText(".....");

					txtBasicSalary.setText(".....");
					txtClothing.setText(".....");
					txtPhone.setText(".....");
					txtRice.setText(".....");
					txtBonus.setText(".....");
					txtInsurance.setText(".....");
					txtTax.setText(".....");
					txtNet.setText(".....");
					txtGross.setText(".....");

					txtSick.setText("....");
					txtVacation.setText("....");
					txtEmergency.setText("....");

					lblProfilePic.setIcon(
							new ImageIcon("C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Icons\\blank.png"));
				}
			}
		});

		comboBox.setToolTipText("");
		comboBox.setBounds(88, 22, 67, 22);
		comboBox.addItem("....");
		comboBox.addItem("1111");
		comboBox.addItem("2222");
		frmMotorPhEmployee.getContentPane().add(comboBox);

		// Payroll Print
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!comboBox.getSelectedItem().equals("....")) {
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\Payroll.txt", true));
						writer.write("Employee No.: " + comboBox.getSelectedItem() + "\n");
						writer.write("\n");
						writer.write("Basic Salary: " + txtBasicSalary.getText() + "\n");
						writer.write("Phone Allowance: " + txtPhone.getText() + "\n");
						writer.write("Clothing Allowance: " + txtClothing.getText() + "\n");
						writer.write("Rice Allowance: " + txtRice.getText() + "\n");
						writer.write("Bonus: " + txtBonus.getText() + "\n");
						writer.write("Insurance: " + txtInsurance.getText() + "\n");
						writer.write("Tax: " + txtTax.getText() + "\n");
						writer.write("Net: " + txtNet.getText() + "\n");
						writer.write("Gross: " + txtGross.getText() + "\n");
						writer.write("******************** \n");
						writer.close();

						JOptionPane.showMessageDialog(null, "Payroll Printed.");

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else
					JOptionPane.showMessageDialog(null, "Invalid Employee Number.");
			}
		});
		btnPrint.setBounds(185, 180, 102, 35);
		panel_1.add(btnPrint);

		// Update and Delete Data Method
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Declaring variables to shorten the code
				String nameUp = txtNameUp.getText();
				String departmentUp = txtDepartmentUp.getText();
				String emailUp = txtEmailUp.getText();
				String addressUp = txtAddressUp.getText();
				String contactUp = txtContactUp.getText();

				if (comboBox.getSelectedItem().equals("....")) {
					JOptionPane.showMessageDialog(null, "Invalid Employee Number.");

				} else if (comboBox.getSelectedItem().equals("1111")) {
					try {
						// Reads the CSV file from the local path
						BufferedReader reader = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee1111.csv"));
						String line = reader.readLine();
						StringBuilder dataUpdate = new StringBuilder();

						// Reads the data that separated by "," and updates there values from the
						// textfield
						while (line != null) {
							String[] data = line.split(",");
							// Setting the inputs as the new data
							data[1] = nameUp;
							data[2] = departmentUp;
							data[3] = emailUp;
							data[4] = addressUp;
							data[5] = contactUp;

							// Appending the inputs and separate it with "," to format it as CSV file
							dataUpdate.append(String.join(",", data)).append("\n");
							line = reader.readLine();
						}

						reader.close();

						// Updating the CSV file
						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee1111.csv"));
						// Writes the appended data to the CSV file
						writer.write(dataUpdate.toString());
						writer.flush();
						writer.close();

						JOptionPane.showMessageDialog(null, "Profile Updated.");

					} catch (Exception ex) {
						return;
					}

				} else if (comboBox.getSelectedItem().equals("2222")) {
					try {
						// Reads the CSV file from the local path
						BufferedReader reader = new BufferedReader(new FileReader(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee2222.csv"));
						String line = reader.readLine();
						StringBuilder dataUpdate = new StringBuilder();

						// Reads the data that separated by "," and updates there values from the
						// textfield
						while (line != null) {
							String[] data = line.split(",");
							// Setting the inputs as the new data
							data[1] = nameUp;
							data[2] = departmentUp;
							data[3] = emailUp;
							data[4] = addressUp;
							data[5] = contactUp;

							// Appending the inputs and separate it with "," to format it as CSV file
							dataUpdate.append(String.join(",", data)).append("\n");
							line = reader.readLine();
						}

						reader.close();

						// Updating the CSV file
						BufferedWriter writer = new BufferedWriter(new FileWriter(
								"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\employee2222.csv"));
						// Writes the appended data to the CSV file
						writer.write(dataUpdate.toString());
						writer.flush();
						writer.close();

						JOptionPane.showMessageDialog(null, "Profile Updated.");

					} catch (Exception ex) {
						return;
					}
				}
				// Clears the textfield after updating
				txtNameUp.setText("");
				txtDepartmentUp.setText("");
				txtEmailUp.setText("");
				txtAddressUp.setText("");
				txtContactUp.setText("");
			}
		});
		btnUpdate.setBounds(182, 180, 102, 35);
		panel_4.add(btnUpdate);

		// Request Leave Method & Event Handlers
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("....")) {
					JOptionPane.showMessageDialog(null, "Invalid Employee Number.");

					// Employee 1111 (Leave)
				} else if (comboBox.getSelectedItem().equals("1111")) {
					if (cmbLeave.getSelectedItem().equals("Sick Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[0]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[0] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough sick leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));

							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Vacation Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[1]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[1] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough vacation leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Emergency Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[2]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[2] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough emergency leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves1111.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					}

					// Employee 2222 (Leave)
				} else if (comboBox.getSelectedItem().equals("2222")) {
					if (cmbLeave.getSelectedItem().equals("Sick Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[0]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[0] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough sick leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));

							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Vacation Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[1]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[1] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough vacation leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					} else if (cmbLeave.getSelectedItem().equals("Emergency Leave")) {
						try {
							BufferedReader reader = new BufferedReader(new FileReader(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							String line = reader.readLine();
							StringBuilder leaveUpdate = new StringBuilder();

							while (line != null) {
								String[] data = line.split(",");
								int leaveCount = Integer.parseInt(data[2]);
								if (leaveCount > 0) {
									leaveCount = leaveCount - 1;
									data[2] = Integer.toString(leaveCount);

									Date selectedDate = calendar.getDate();
									SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
									String formattedDate = dateFormat.format(selectedDate);
									try {
										BufferedWriter writer = new BufferedWriter(new FileWriter(
												"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaveApplication.csv",
												true));
										writer.write(comboBox.getSelectedItem() + "," + formattedDate + ","
												+ cmbLeave.getSelectedItem() + "\n");
										writer.close();

										JOptionPane.showMessageDialog(null, "Application Successfully Sent");

									} catch (IOException e1) {
										e1.printStackTrace();
									}

								} else {
									JOptionPane.showMessageDialog(null, "Not enough emergency leave.");
								}
								leaveUpdate.append(String.join(",", data)).append("\n");
								line = reader.readLine();
							}

							reader.close();

							BufferedWriter writer = new BufferedWriter(new FileWriter(
									"C:\\Users\\clari\\eclipse-workspace\\EmployeeApp2\\src\\Files\\leaves2222.csv"));
							writer.write(leaveUpdate.toString());
							writer.flush();
							writer.close();

						} catch (IOException el) {
							el.printStackTrace();
						}
					}

				}
			}
		});

		btnSubmit.setBounds(278, 191, 187, 32);
		panel_2.add(btnSubmit);

		JLabel lblAvailable = new JLabel("Available Leaves");
		lblAvailable.setBounds(278, 11, 98, 14);
		panel_2.add(lblAvailable);

		JSeparator separator = new JSeparator();
		separator.setBounds(278, 145, 187, 2);
		panel_2.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(278, 36, 187, 2);
		panel_2.add(separator_1);
	}

	public void Date() {

	}

}