package gui;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaJugar2 {

	private JFrame frame;
	//Atributo para almacenar la ventana principal
	private JFrame ventanaPrincipal;


	/**
	 * Create the application.
	 */
	public VentanaJugar2(JFrame ventanaPrincipal) {
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
		frame.getContentPane().setBackground(new Color(0, 119, 60));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaJugar2.class.getResource("/imagenes/ICONO.png")));
		frame.setBounds(100, 100, 900, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRegresar_1 = new JButton("Regresar");
		btnRegresar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hacer visible la ventana principal
		        ventanaPrincipal.setVisible(true);
		        
		        //Ocultar la ventana secundaria
		        frame.setVisible(false);
				
			}
		});
		btnRegresar_1.setIcon(new ImageIcon(VentanaJugar2.class.getResource("/imagenes/Regresar2.png")));
		btnRegresar_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRegresar_1.setOpaque(false);
		btnRegresar_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegresar_1.setForeground(Color.WHITE);
		btnRegresar_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnRegresar_1.setContentAreaFilled(false);
		btnRegresar_1.setBorderPainted(false);
		btnRegresar_1.setBackground(Color.BLACK);
		btnRegresar_1.setBounds(785, 0, 115, 94);
		frame.getContentPane().add(btnRegresar_1);
	}

}
