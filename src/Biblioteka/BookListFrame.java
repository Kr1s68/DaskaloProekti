package Biblioteka;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookListFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookListFrame frame = new BookListFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookListFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 46, 46));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKniga = new JLabel("ID books");
		lblKniga.setForeground(Color.WHITE);
		lblKniga.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga.setBounds(235, 71, 253, 66);
		contentPane.add(lblKniga);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(353, 93, 158, 26);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Добави");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.controlDkShadow);
		btnNewButton.setBounds(582, 95, 158, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Актуализирай");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1.setBounds(582, 151, 158, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Изтрий");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.controlDkShadow);
		btnNewButton_2.setBounds(582, 209, 158, 23);
		contentPane.add(btnNewButton_2);
		
		JButton IzButton = new JButton("Издателства");
		IzButton.setForeground(Color.WHITE);
		IzButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		IzButton.setFocusable(false);
		IzButton.setBorder(null);
		IzButton.setBackground(SystemColor.controlDkShadow);
		IzButton.setBounds(582, 383, 194, 45);
		IzButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublisherFrame fr = new PublisherFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(IzButton);
		
		JButton KnButton = new JButton("Книги");
		KnButton.setForeground(Color.WHITE);
		KnButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		KnButton.setFocusable(false);
		KnButton.setBorder(null);
		KnButton.setBackground(SystemColor.controlDkShadow);
		KnButton.setBounds(355, 383, 194, 45);
		KnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookFrame fr = new BookFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(KnButton);
		
		JButton AvButton = new JButton("Автори");
		AvButton.setForeground(Color.WHITE);
		AvButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		AvButton.setFocusable(false);
		AvButton.setBorder(null);
		AvButton.setBackground(SystemColor.controlDkShadow);
		AvButton.setBounds(135, 383, 194, 45);
		AvButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuthorFrame fr = new AuthorFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(AvButton);
		
		JLabel lblKniga_1 = new JLabel("price");
		lblKniga_1.setForeground(Color.WHITE);
		lblKniga_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga_1.setBounds(235, 106, 253, 66);
		contentPane.add(lblKniga_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(353, 128, 158, 26);
		contentPane.add(textField_1);
		
		JLabel lblYear = new JLabel("year");
		lblYear.setForeground(Color.WHITE);
		lblYear.setFont(new Font("Arial", Font.BOLD, 16));
		lblYear.setBounds(235, 140, 253, 66);
		contentPane.add(lblYear);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(353, 162, 158, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(353, 197, 158, 26);
		contentPane.add(textField_3);
		
		JLabel lblKniga_1_1 = new JLabel("pages");
		lblKniga_1_1.setForeground(Color.WHITE);
		lblKniga_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga_1_1.setBounds(235, 175, 253, 66);
		contentPane.add(lblKniga_1_1);
		
		JLabel lblKniga_1_2 = new JLabel("ISBN");
		lblKniga_1_2.setForeground(Color.WHITE);
		lblKniga_1_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga_1_2.setBounds(235, 209, 253, 66);
		contentPane.add(lblKniga_1_2);
		
		JLabel lblKniga_2_1 = new JLabel("publisher");
		lblKniga_2_1.setForeground(Color.WHITE);
		lblKniga_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga_2_1.setBounds(235, 243, 253, 66);
		contentPane.add(lblKniga_2_1);
		
		JLabel lblKniga_1_1_1 = new JLabel("author");
		lblKniga_1_1_1.setForeground(Color.WHITE);
		lblKniga_1_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga_1_1_1.setBounds(235, 278, 253, 66);
		contentPane.add(lblKniga_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(353, 231, 158, 26);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(353, 265, 158, 26);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(353, 300, 158, 26);
		contentPane.add(textField_6);
		
		JButton btnNewButton_2_1 = new JButton("Търси");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFocusable(false);
		btnNewButton_2_1.setBorder(null);
		btnNewButton_2_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_2_1.setBounds(582, 267, 158, 23);
		contentPane.add(btnNewButton_2_1);
	}

}
