package ejemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_git extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_git frame = new GUI_git();
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
	public GUI_git() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		setBounds(100, 100, 485, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Mensaje");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola git");
			}
		});
		btnNewButton.setBounds(137, 121, 142, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mensaje Jimena");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola Soy Jimena");
			}
		});
		btnNewButton_1.setBounds(137, 81, 142, 23);
		contentPane.add(btnNewButton_1);
		

		JButton btnNewButton_2 = new JButton("Hazel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde la rama de Haz");
			}
		});

		btnNewButton_2.setBounds(137, 197, 142, 21);
		contentPane.add(btnNewButton_2);


		JButton btnNewButton_3 = new JButton("Rama Jimena");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde mi rama");
			}
		});
		btnNewButton_3.setBounds(137, 158, 142, 23);
		contentPane.add(btnNewButton_3);
		

		JButton btnNewButton_4 = new JButton("Eclipse Hazel");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola desde mi rama Hazel en eclipse");
			}
		});
		btnNewButton_4.setBounds(137, 265, 142, 23);
		contentPane.add(btnNewButton_4);
		JButton btnNewButton_5 = new JButton("Jimena boton 5 ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola de mi rama, desde eclipse");
			}
			
		});
		btnNewButton_5.setBounds(137, 229, 142, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("boton jimena 2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola boton 2 jimena, desde eclipse");
			}
		});
		btnNewButton_6.setBounds(137, 302, 142, 23);
		contentPane.add(btnNewButton_6);
		

	}
}
