package nodosConcatenados;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtdia;
	

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDiaDelMes = new JLabel("Dia Del Mes");
		lblDiaDelMes.setBounds(6, 102, 99, 31);
		contentPane.add(lblDiaDelMes);
		
		txtdia = new JTextField();
		txtdia.setBounds(117, 104, 158, 29);
		contentPane.add(txtdia);
		txtdia.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String auxDia =	txtdia.getText();
			Metodo m= new Metodo();
		
			
			System.out.println(m.DiadelMes(Integer.parseInt(auxDia)));
			
			
			
				
			}
		});
		btnOk.setBounds(297, 104, 117, 29);
		contentPane.add(btnOk);
	}
}
