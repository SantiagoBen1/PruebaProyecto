package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
//Importamos del paquete kernel la clase MusicPlayer
import kernel.MusicPlayer;

public class VentanaInicial {

	private JFrame frame;
	//Atributo para el reproductor de música
	private MusicPlayer musicPlayer; 
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicial window = new VentanaInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaInicial() {
		initialize();
		// Iniciar la reproducción de música al crear la ventana
        musicPlayer = new MusicPlayer();
        musicPlayer.playMusic("/music/cancion.wav");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 119, 60));
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.setType(Type.POPUP);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaInicial.class.getResource("/imagenes/ICONO.png")));
		frame.setBounds(100, 100, 900, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIconoPrinci = new JLabel("");
		lblIconoPrinci.setIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/ICONO.png")));
		lblIconoPrinci.setBounds(308, 43, 268, 284);
		frame.getContentPane().add(lblIconoPrinci);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Crear una instancia de la Ventana de Jugar1
		        VentanaJugar1 ventanaJugar1 = new VentanaJugar1(frame);
		        ventanaJugar1.mostrar(); // Método que hace visible la ventana de Jugar1

		        //Ocultar la ventana principal
		        frame.setVisible(false);
			}
		});
		btnJugar.setRolloverSelectedIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Jugar.png")));
		btnJugar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnJugar.setRolloverIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Jugar.png")));
		btnJugar.setPressedIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Jugar.png")));
		btnJugar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnJugar.setContentAreaFilled(false);
		btnJugar.setOpaque(false);
		btnJugar.setBorderPainted(false);
		btnJugar.setIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Jugar.png")));
		btnJugar.setForeground(new Color(255, 255, 255));
		btnJugar.setBackground(new Color(0, 0, 0));
		btnJugar.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnJugar.setBounds(401, 383, 82, 104);
		frame.getContentPane().add(btnJugar);
		
		JLabel lblNewLabel = new JLabel("BLACKJACK");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		lblNewLabel.setBounds(293, 319, 297, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnInstrucciones = new JButton("instrucciones");
		btnInstrucciones.setContentAreaFilled(false);
		btnInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Crear una instancia de la Ventana de instrucciones
		        VentanaInstrucciones ventanaInstrucciones = new VentanaInstrucciones(frame);
		        ventanaInstrucciones.mostrar(); // Método que hace visible la ventana de instrucciones

		        //Ocultar la ventana principal
		        frame.setVisible(false);
				
			}
		});
		btnInstrucciones.setPressedIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Instrucciones.png")));
		btnInstrucciones.setIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Instrucciones.png")));
		btnInstrucciones.setRolloverIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Instrucciones.png")));
		btnInstrucciones.setRolloverSelectedIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Instrucciones.png")));
		btnInstrucciones.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnInstrucciones.setHorizontalTextPosition(SwingConstants.CENTER);
		btnInstrucciones.setForeground(Color.WHITE);
		btnInstrucciones.setContentAreaFilled(false);
		btnInstrucciones.setOpaque(false);
		btnInstrucciones.setBorderPainted(false);
		btnInstrucciones.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnInstrucciones.setBackground(new Color(0, 0, 0));
		btnInstrucciones.setBounds(73, 387, 165, 104);
		frame.getContentPane().add(btnInstrucciones);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setPressedIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Salir.png")));
		btnSalir.setRolloverSelectedIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Salir.png")));
		btnSalir.setRolloverIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Salir.png")));
		btnSalir.setIcon(new ImageIcon(VentanaInicial.class.getResource("/imagenes/Salir.png")));
		btnSalir.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSalir.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnSalir.setContentAreaFilled(false);
		btnSalir.setOpaque(false);
		btnSalir.setBorderPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setBounds(689, 384, 102, 110);
		frame.getContentPane().add(btnSalir);
	}
}
