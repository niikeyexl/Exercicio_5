package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.ThreadPainel;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField [] textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		textField = new JTextField [3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField[0] = new JTextField();
		textField[0].setBackground(Color.LIGHT_GRAY);
		textField[0].setHorizontalAlignment(SwingConstants.CENTER);
		textField[0].setFont(new Font("Arial", Font.PLAIN, 50));
		textField[0].setEditable(false);
		textField[0].setBounds(44, 76, 102, 95);
		contentPane.add(textField[0]);
		textField[0].setColumns(10);
		
		textField[1] = new JTextField();
		textField[1].setHorizontalAlignment(SwingConstants.CENTER);
		textField[1].setFont(new Font("Arial", Font.PLAIN, 50));
		textField[1].setEditable(false);
		textField[1].setColumns(10);
		textField[1].setBackground(Color.LIGHT_GRAY);
		textField[1].setBounds(192, 74, 102, 95);
		contentPane.add(textField[1]);
		
		textField[2] = new JTextField();
		textField[2].setHorizontalAlignment(SwingConstants.CENTER);
		textField[2].setFont(new Font("Arial", Font.PLAIN, 50));
		textField[2].setEditable(false);
		textField[2].setColumns(10);
		textField[2].setBackground(Color.LIGHT_GRAY);
		textField[2].setBounds(348, 73, 102, 95);
		contentPane.add(textField[2]);
		
		JButton btnAction = new JButton("Jogar");
		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<3; i++) {
					Thread t = new ThreadPainel(textField[i]);
					t.start();
				}
			}
		});
		btnAction.setBounds(364, 247, 89, 23);
		contentPane.add(btnAction);
	}
}
