package gui;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class VentanaInstrucciones {

	private JFrame frame;
	//Atributo para almacenar la ventana principal	
	private JFrame ventanaPrincipal;


	/**
	 * Create the application.
	 */
	public VentanaInstrucciones(JFrame ventanaPrincipal) {
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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaInstrucciones.class.getResource("/imagenes/ICONO.png")));
		frame.getContentPane().setBackground(new Color(0, 119, 60));
		frame.setBounds(100, 100, 900, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTituloInstrucciones = new JLabel("INSTRUCCIONES");
		lblTituloInstrucciones.setForeground(Color.WHITE);
		lblTituloInstrucciones.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		lblTituloInstrucciones.setBounds(244, 53, 395, 42);
		frame.getContentPane().add(lblTituloInstrucciones);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hacer visible la ventana principal
		        ventanaPrincipal.setVisible(true);
		        
		        //Ocultar la ventana secundaria
		        frame.setVisible(false);
				
				
			}
		});
		btnRegresar.setIcon(new ImageIcon(VentanaInstrucciones.class.getResource("/imagenes/Regresar.png")));
		btnRegresar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRegresar.setOpaque(false);
		btnRegresar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRegresar.setForeground(Color.WHITE);
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnRegresar.setContentAreaFilled(false);
		btnRegresar.setBorderPainted(false);
		btnRegresar.setBackground(Color.BLACK);
		btnRegresar.setBounds(383, 553, 134, 145);
		frame.getContentPane().add(btnRegresar);
		
		JLabel lblFotoCartas = new JLabel("");
		lblFotoCartas.setIcon(new ImageIcon(VentanaInstrucciones.class.getResource("/imagenes/fotoCartas.png")));
		lblFotoCartas.setBounds(556, 126, 280, 395);
		frame.getContentPane().add(lblFotoCartas);
		
		JLabel lblObjetivo = new JLabel("Objetivo Del Juego");
		lblObjetivo.setForeground(new Color(255, 0, 0));
		lblObjetivo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblObjetivo.setBounds(28, 96, 203, 42);
		frame.getContentPane().add(lblObjetivo);
		
		JLabel lblInstrucciones = new JLabel("<html><center>El objetivo del juego de blackjack es acumular cartas con un valor total lo más cercano posible a 21 puntos, sin pasarse de este número. El jugador compite contra el crupier y debe superar el total de puntos del crupier para ganar. \r\nGana el jugador que tenga una mano con un valor más cercano a 21 sin pasarse.\r\nSi un jugador supera los 21 puntos, pierde automáticamente (se pasa).\r\nEn caso de empate en puntos con el crupier, se considera un \"push\" y la apuesta se devuelve.\r\n");
		lblInstrucciones.setForeground(new Color(255, 255, 255));
		lblInstrucciones.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInstrucciones.setBounds(28, 126, 495, 113);
		frame.getContentPane().add(lblInstrucciones);
		
		JLabel lblValorCartas = new JLabel("Valor De Las Cartas");
		lblValorCartas.setForeground(Color.RED);
		lblValorCartas.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblValorCartas.setBounds(28, 235, 223, 42);
		frame.getContentPane().add(lblValorCartas);
		
		JLabel lblcartasValorNormales = new JLabel("<html><center>- Cartas del 2 al 10:  Valen su valor nominal.");
		lblcartasValorNormales.setForeground(Color.WHITE);
		lblcartasValorNormales.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblcartasValorNormales.setBounds(28, 265, 268, 30);
		frame.getContentPane().add(lblcartasValorNormales);
		
		JLabel lblfigurasjFiguras = new JLabel("<html><center>- Figuras (J, Q, K): Valen 10 puntos cada una.");
		lblfigurasjFiguras.setForeground(Color.WHITE);
		lblfigurasjFiguras.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblfigurasjFiguras.setBounds(28, 288, 268, 24);
		frame.getContentPane().add(lblfigurasjFiguras);
		
		JLabel lblReparto = new JLabel("Reparto Inicial");
		lblReparto.setForeground(Color.RED);
		lblReparto.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblReparto.setBounds(28, 333, 223, 42);
		frame.getContentPane().add(lblReparto);
		
		JLabel lblJugadorReparto = new JLabel("- El jugador recibe dos cartas, ambas boca arriba.");
		lblJugadorReparto.setForeground(Color.WHITE);
		lblJugadorReparto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJugadorReparto.setBounds(28, 371, 294, 30);
		frame.getContentPane().add(lblJugadorReparto);
		
		JLabel lblElCrupierReparto = new JLabel("- El crupier recibe dos cartas, una boca arriba y otra boca abajo.");
		lblElCrupierReparto.setForeground(Color.WHITE);
		lblElCrupierReparto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblElCrupierReparto.setBounds(28, 397, 376, 30);
		frame.getContentPane().add(lblElCrupierReparto);
		
		JLabel lblTurnoDelJugador = new JLabel("Turno Del Jugador");
		lblTurnoDelJugador.setForeground(Color.RED);
		lblTurnoDelJugador.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTurnoDelJugador.setBounds(28, 427, 223, 42);
		frame.getContentPane().add(lblTurnoDelJugador);
		
		JLabel lblPedirhit = new JLabel("- Pedir (Hit): El jugador solicita otra carta.");
		lblPedirhit.setForeground(Color.WHITE);
		lblPedirhit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPedirhit.setBounds(28, 467, 294, 30);
		frame.getContentPane().add(lblPedirhit);
		
		JLabel lblPlantarsestand = new JLabel("- Plantarse (Stand): El jugador decide no recibir más cartas.");
		lblPlantarsestand.setForeground(Color.WHITE);
		lblPlantarsestand.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPlantarsestand.setBounds(28, 491, 341, 30);
		frame.getContentPane().add(lblPlantarsestand);
		
		JLabel lblTurnoDelCrupier = new JLabel("Turno Del Crupier");
		lblTurnoDelCrupier.setForeground(Color.RED);
		lblTurnoDelCrupier.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTurnoDelCrupier.setBounds(28, 516, 223, 42);
		frame.getContentPane().add(lblTurnoDelCrupier);
		
		JLabel lblElCrupierRevelar = new JLabel("- El crupier revela su carta oculta.");
		lblElCrupierRevelar.setForeground(Color.WHITE);
		lblElCrupierRevelar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblElCrupierRevelar.setBounds(28, 550, 294, 30);
		frame.getContentPane().add(lblElCrupierRevelar);
		
		JLabel lblDebePedirCrupier = new JLabel("- Debe pedir cartas hasta alcanzar un mínimo de 17 puntos.");
		lblDebePedirCrupier.setForeground(Color.WHITE);
		lblDebePedirCrupier.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDebePedirCrupier.setBounds(28, 587, 341, 30);
		frame.getContentPane().add(lblDebePedirCrupier);
		
		JLabel lblCrupierPierde = new JLabel("- Si el crupier supera los 21 puntos, pierde.");
		lblCrupierPierde.setForeground(Color.WHITE);
		lblCrupierPierde.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCrupierPierde.setBounds(28, 616, 294, 30);
		frame.getContentPane().add(lblCrupierPierde);
		
		JLabel lblValorAs = new JLabel("<html><center>- As: Puede valer 1 o 11 puntos, a elección del jugador.");
		lblValorAs.setForeground(Color.WHITE);
		lblValorAs.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblValorAs.setBounds(28, 310, 320, 24);
		frame.getContentPane().add(lblValorAs);
	}

}
