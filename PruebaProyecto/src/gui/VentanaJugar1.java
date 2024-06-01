package gui;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class VentanaJugar1 {

	private JFrame frame;
	//Atributo para almacenar la ventana principal
	private JFrame ventanaPrincipal;	
	private JTextField textFieldNombre;
	private JTextField textFieldApuesta;

	/**
	 * Create the application.
	 */
	public VentanaJugar1(JFrame ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initialize();
	}
	public void mostrar() {
	    frame.setVisible(true);
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaJugar1.class.getResource("/imagenes/ICONO.png")));
		frame.getContentPane().setBackground(new Color(0, 119, 60));
		frame.setBounds(100, 100, 450, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hacer visible la ventana principal
		        ventanaPrincipal.setVisible(true);
		        
		        //Ocultar la ventana secundaria
		        frame.setVisible(false);
			}
		});
		btnRegresar.setIcon(new ImageIcon(VentanaJugar1.class.getResource("/imagenes/Regresar2.png")));
		btnRegresar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRegresar.setOpaque(false);
		btnRegresar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnRegresar.setContentAreaFilled(false);
		btnRegresar.setBorderPainted(false);
		btnRegresar.setBackground(Color.BLACK);
		btnRegresar.setBounds(769, 0, 115, 103);
		frame.getContentPane().add(btnRegresar);
		
		JLabel lblNombre = new JLabel("Ingresa tu nombre");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNombre.setBounds(42, 35, 115, 23);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblCantidadApuesta = new JLabel("<html><center>Ingresa la cantidad a apostar");
		lblCantidadApuesta.setForeground(new Color(255, 255, 255));
		lblCantidadApuesta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCantidadApuesta.setBounds(277, 24, 115, 34);
		frame.getContentPane().add(lblCantidadApuesta);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(42, 78, 115, 20);
		frame.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApuesta = new JTextField();
		textFieldApuesta.setColumns(10);
		textFieldApuesta.setBounds(277, 78, 115, 20);
		frame.getContentPane().add(textFieldApuesta);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Crear una instancia de la Ventana de Jugar1
		        VentanaJugar2 ventanaJugar2 = new VentanaJugar2(frame);
		        ventanaJugar2.mostrar(); // Método que hace visible la ventana de Jugar1

		        //Ocultar la ventana principal
		        frame.setVisible(false);
				
			}
		});
		btnJugar.setIcon(new ImageIcon(VentanaJugar1.class.getResource("/imagenes/Continuar.png")));
		btnJugar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnJugar.setOpaque(false);
		btnJugar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJugar.setForeground(Color.WHITE);
		btnJugar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnJugar.setContentAreaFilled(false);
		btnJugar.setBorderPainted(false);
		btnJugar.setBackground(Color.BLACK);
		btnJugar.setBounds(76, 135, 81, 94);
		frame.getContentPane().add(btnJugar);
		
		JButton btnRegresar_1 = new JButton("Regresar");
		btnRegresar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hacer visible la ventana principal
		        ventanaPrincipal.setVisible(true);
		        
		        //Ocultar la ventana secundaria
		        frame.setVisible(false);
			}
		});
		btnRegresar_1.setIcon(new ImageIcon(VentanaJugar1.class.getResource("/imagenes/Regresar2.png")));
		btnRegresar_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRegresar_1.setOpaque(false);
		btnRegresar_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegresar_1.setForeground(Color.WHITE);
		btnRegresar_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRegresar_1.setContentAreaFilled(false);
		btnRegresar_1.setBorderPainted(false);
		btnRegresar_1.setBackground(Color.BLACK);
		btnRegresar_1.setBounds(277, 135, 115, 94);
		frame.getContentPane().add(btnRegresar_1);
	}
}
