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

public class PublisherFrame extends JFrame {

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
					PublisherFrame frame = new PublisherFrame();
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
	public PublisherFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 46, 46));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKniga = new JLabel("Код на издател");
		lblKniga.setForeground(Color.WHITE);
		lblKniga.setFont(new Font("Arial", Font.BOLD, 16));
		lblKniga.setBounds(156, 78, 253, 66);
		contentPane.add(lblKniga);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(348, 100, 158, 26);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Добави");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.controlDkShadow);
		btnNewButton.setBounds(568, 100, 158, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Актуализирай");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1.setBounds(568, 179, 158, 23);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(348, 177, 158, 26);
		contentPane.add(textField_1);
		
		JLabel BiblLabel_1 = new JLabel("Име на издател");
		BiblLabel_1.setForeground(Color.WHITE);
		BiblLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		BiblLabel_1.setBounds(156, 155, 253, 66);
		contentPane.add(BiblLabel_1);
		
		JButton btnNewButton_2 = new JButton("Изтрий");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.controlDkShadow);
		btnNewButton_2.setBounds(568, 256, 158, 23);
		contentPane.add(btnNewButton_2);
		
		JButton SKButton = new JButton("Списък с книги");
		SKButton.setForeground(Color.WHITE);
		SKButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		SKButton.setFocusable(false);
		SKButton.setBorder(null);
		SKButton.setBackground(SystemColor.controlDkShadow);
		SKButton.setBounds(568, 367, 194, 45);
		SKButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookListFrame fr = new BookListFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(SKButton);
		
		JButton KnButton = new JButton("Книги");
		KnButton.setForeground(Color.WHITE);
		KnButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		KnButton.setFocusable(false);
		KnButton.setBorder(null);
		KnButton.setBackground(SystemColor.controlDkShadow);
		KnButton.setBounds(341, 367, 194, 45);
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
		AvButton.setBounds(121, 367, 194, 45);
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
