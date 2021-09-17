package com.shrikant;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

public class Calculator {

	private JFrame frmCalculatorbeff;
	private JTextField output;
	private JTextArea label;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculatorbeff.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Calculator() {
		initialize();
	}
	double num1=0;
	double num2=0;
	protected String operation;
	private void initialize() {
		frmCalculatorbeff = new JFrame();
		frmCalculatorbeff.setResizable(false);
		frmCalculatorbeff.setTitle("Calculator_BE19F05F008");
		frmCalculatorbeff.setBounds(100, 100, 450, 570);
		frmCalculatorbeff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatorbeff.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 457);
		frmCalculatorbeff.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 248, 416, 206);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(4,4, 0, 0));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"7");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"8");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"9");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(output.getText());
					
				}catch(NumberFormatException ex) {
				}
				label.setText(String.valueOf(num1)+"-");
				operation = "-";
				output.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"4");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"5");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"6");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("+");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(output.getText());
					
				}catch(NumberFormatException ex) {
					
				}
				label.setText(String.valueOf(num1)+"+");
				operation = "+";
				output.setText("");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"1");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"2");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"3");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("/");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(output.getText());
					
				}catch(NumberFormatException ex) {
				}
				label.setText(String.valueOf(num1)+"/");
				operation = "/";
				output.setText("");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+"0");
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prev = output.getText();
				output.setText(prev+".");
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("%");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(output.getText());
				}catch(NumberFormatException ex) {
				}
				label.setText(String.valueOf(num1)+"%");
				operation = "%";
				output.setText("");
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("*");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(output.getText());
					
				}catch(NumberFormatException ex) {
				}
				label.setText(String.valueOf(num1)+"*");
				operation = "*";
				output.setText("");
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(btnNewButton_15);
		
		output = new JTextField();
		output.setBackground(Color.WHITE);
		output.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		output.setHorizontalAlignment(SwingConstants.TRAILING);
		output.setFont(new Font("Tahoma", Font.PLAIN, 45));
		output.setEditable(false);
		output.setBounds(10, 21, 416, 78);
		panel.add(output);
		output.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 149, 416, 89);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 10, 0, 0));
		
		JButton btnNewButton_19 = new JButton("M+");
		btnNewButton_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("M-");
		btnNewButton_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("1/x");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(output.getText());
				double r = 1/num1;
				output.setText(String.valueOf(r));
			}
		});
		btnNewButton_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("Sqrt");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(output.getText());
				double r = Math.sqrt(num1);
				output.setText(String.valueOf(r));
			}
		});
		btnNewButton_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_22);
		
		JButton btnNewButton_27 = new JButton("x^y");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Double.parseDouble(output.getText());
					
				}catch(NumberFormatException ex) {
				}
				label.setText(String.valueOf(num1)+"^");
				operation = "^";
				output.setText("");
			}
		});
		btnNewButton_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_27);
		
		JButton btnNewButton_23 = new JButton("MC");
		btnNewButton_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("MS");
		btnNewButton_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Pi");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(String.valueOf(Math.PI));
			}
		});
		btnNewButton_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("n!");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(output.getText());
				long fact=1;
				for(int i=1;i<=n;i++) {
					fact = fact*i;
				}
				output.setText(String.valueOf(fact));
			}
		});
		btnNewButton_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_26);
		
		JButton btnNewButton_28 = new JButton("log");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = Double.parseDouble(output.getText());
				double res = Math.log(n);
				output.setText(String.valueOf(res));
			}
		});
		btnNewButton_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(btnNewButton_28);
		
		label = new JTextArea();
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setEditable(false);
		label.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		label.setBackground(SystemColor.control);
		label.setBounds(200, 109, 226, 30);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 457, 416, 71);
		frmCalculatorbeff.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_16 = new JButton("<-");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = output.getText();
				label.setText(null);
				output.setText(text.substring(0,text.length()-1));
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_16.setBounds(0, 0, 107, 71);
		panel_2.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("=");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble(output.getText());
				label.setText(label.getText() + String.valueOf(num2));
				double res=0;
				switch(operation) {

					case "-":	res = num1-num2;
								output.setText(String.valueOf(res));
							 	break;
					
					case "+":	res = num1+num2;
								output.setText(String.valueOf(res));
					 			break;
					
					case "*":	res = num1*num2;
								output.setText(String.valueOf(res));
		 						break;
		 			
					case "/":	res = num1/num2;
								output.setText(String.valueOf(res));
		 						break;
		 						
					case "%":	res = num1%num2;
								output.setText(String.valueOf(res));
		 						break;
					case "^":	res = Math.pow(num1,num2);
								output.setText(String.valueOf(res));
								break;
					 			
				}
				label.setText("");
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnNewButton_17.setBounds(209, 0, 207, 71);
		panel_2.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("C");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(null);
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_18.setBounds(107, 0, 101, 71);
		panel_2.add(btnNewButton_18);
	}
}
