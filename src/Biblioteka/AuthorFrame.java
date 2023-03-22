package Biblioteka;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthorFrame frame = new AuthorFrame();
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
	public AuthorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 46, 46));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel BiblLabel = new JLabel("Номер на Автор");
		BiblLabel.setForeground(Color.WHITE);
		BiblLabel.setFont(new Font("Arial", Font.BOLD, 16));
		BiblLabel.setBounds(152, 117, 253, 66);
		contentPane.add(BiblLabel);
		
		JLabel BiblLabel_1 = new JLabel("Име");
		BiblLabel_1.setForeground(Color.WHITE);
		BiblLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		BiblLabel_1.setBounds(152, 194, 253, 66);
		contentPane.add(BiblLabel_1);
		
		JLabel BiblLabel_2 = new JLabel("Фамилия");
		BiblLabel_2.setForeground(Color.WHITE);
		BiblLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		BiblLabel_2.setBounds(152, 271, 253, 66);
		contentPane.add(BiblLabel_2);
		
		textField = new JTextField();
		textField.setBounds(344, 139, 158, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(344, 216, 158, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(344, 293, 158, 26);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Добави");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.controlDkShadow);
		btnNewButton.setBounds(564, 139, 158, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Актуализирай");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.controlDkShadow);
		btnNewButton_1.setBounds(564, 139, 158, 23);
		btnNewButton_1.setBounds(564, 218, 158, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Изтрий");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.controlDkShadow);
		btnNewButton_2.setBounds(564, 139, 158, 23);
		btnNewButton_2.setBounds(564, 295, 158, 23);
		contentPane.add(btnNewButton_2);
		
		JButton KnButton = new JButton("Книги");
		KnButton.setForeground(Color.WHITE);
		KnButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		KnButton.setFocusable(false);
		KnButton.setBorder(null);
		KnButton.setBackground(SystemColor.controlDkShadow);
		KnButton.setBounds(117, 406, 194, 45);
		KnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookFrame fr = new BookFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(KnButton);
		
		JButton IzButton = new JButton("Издателства");
		IzButton.setForeground(Color.WHITE);
		IzButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		IzButton.setFocusable(false);
		IzButton.setBorder(null);
		IzButton.setBackground(SystemColor.controlDkShadow);
		IzButton.setBounds(337, 406, 194, 45);
		IzButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublisherFrame fr = new PublisherFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(IzButton);
		
		JButton SKButton = new JButton("Списък с книги");
		SKButton.setForeground(Color.WHITE);
		SKButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		SKButton.setFocusable(false);
		SKButton.setBorder(null);
		SKButton.setBackground(SystemColor.controlDkShadow);
		SKButton.setBounds(564, 406, 194, 45);
		SKButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookListFrame fr = new BookListFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(SKButton);
	}
}
