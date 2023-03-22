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

public class BookFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookFrame frame = new BookFrame();
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
	public BookFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 46, 46));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKniga = new JLabel("Номер на Книга");
		lblKniga.setForeground(Color.WHITE);
		lblKniga.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga.setBounds(153, 90, 253, 66);
		contentPane.add(lblKniga);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(345, 112, 158, 26);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Добави");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.controlDkShadow);
		btnNewButton.setBounds(565, 112, 158, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Актуализирай");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1.setBounds(565, 191, 158, 23);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(345, 189, 158, 26);
		contentPane.add(textField_1);
		
		JLabel BiblLabel_1 = new JLabel("Име на Книга");
		BiblLabel_1.setForeground(Color.WHITE);
		BiblLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		BiblLabel_1.setBounds(153, 167, 253, 66);
		contentPane.add(BiblLabel_1);
		
		JButton btnNewButton_2 = new JButton("Изтрий");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.controlDkShadow);
		btnNewButton_2.setBounds(565, 268, 158, 23);
		contentPane.add(btnNewButton_2);
		
		JButton SKButton = new JButton("Списък с книги");
		SKButton.setForeground(Color.WHITE);
		SKButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		SKButton.setFocusable(false);
		SKButton.setBorder(null);
		SKButton.setBackground(SystemColor.controlDkShadow);
		SKButton.setBounds(565, 379, 194, 45);
		SKButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookListFrame fr = new BookListFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(SKButton);
		
		JButton IzButton = new JButton("Издателства");
		IzButton.setForeground(Color.WHITE);
		IzButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		IzButton.setFocusable(false);
		IzButton.setBorder(null);
		IzButton.setBackground(SystemColor.controlDkShadow);
		IzButton.setBounds(338, 379, 194, 45);
		IzButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublisherFrame fr = new PublisherFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(IzButton);
		
		JButton AvButton = new JButton("Автори");
		AvButton.setForeground(Color.WHITE);
		AvButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		AvButton.setFocusable(false);
		AvButton.setBorder(null);
		AvButton.setBackground(SystemColor.controlDkShadow);
		AvButton.setBounds(118, 379, 194, 45);
		AvButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuthorFrame fr = new AuthorFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(AvButton);
	}

}
