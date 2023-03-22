package Biblioteka;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 46, 46));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton AvButton = new JButton("Автори");
		AvButton.setBorder(null);
		AvButton.setFocusable(false);
		AvButton.setForeground(new Color(255, 255, 255));
		AvButton.setBackground(new Color(105, 105, 105));
		AvButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		AvButton.setBounds(10, 435, 194, 45);
		AvButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AuthorFrame fr = new AuthorFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(AvButton);
		
		JButton KnButton = new JButton("Книги");
		KnButton.setBorder(null);
		KnButton.setFocusable(false);
		KnButton.setForeground(new Color(255, 255, 255));
		KnButton.setBackground(new Color(105, 105, 105));
		KnButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		KnButton.setBounds(233, 435, 194, 45);
		KnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookFrame fr = new BookFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(AvButton);
		contentPane.add(KnButton);
		
		JButton IzButton = new JButton("Издателства");
		IzButton.setBorder(null);
		IzButton.setFocusable(false);
		IzButton.setForeground(new Color(255, 255, 255));
		IzButton.setBackground(new Color(105, 105, 105));
		IzButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		IzButton.setBounds(453, 435, 194, 45);
		IzButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublisherFrame fr = new PublisherFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		contentPane.add(IzButton);
		
		JButton SKButton = new JButton("Списък с книги");
		SKButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookListFrame fr = new BookListFrame();
				fr.setVisible(true);
				dispose();
			}
		});
		SKButton.setBorder(null);
		SKButton.setFocusable(false);
		SKButton.setForeground(new Color(255, 255, 255));
		SKButton.setBackground(new Color(105, 105, 105));
		SKButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		SKButton.setBounds(680, 435, 194, 45);
		contentPane.add(SKButton);
		
		JLabel BiblLabel = new JLabel("БИБЛИОТЕКА");
		BiblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BiblLabel.setForeground(new Color(255, 255, 255));
		BiblLabel.setFont(new Font("Arial", Font.BOLD, 37));
		BiblLabel.setBounds(177, 86, 565, 232);
		contentPane.add(BiblLabel);
	}
}
