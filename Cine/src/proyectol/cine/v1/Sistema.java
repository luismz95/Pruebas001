package proyectol.cine.v1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sistema {

	JFrame fr_sistema = new JFrame("Sistema Cine");
	JPanel pn_principal = new JPanel();
	JPanel pn_navegador = new JPanel();
	JPanel pn_procesos = new JPanel();
	
	JLabel lb_logo;
	JLabel lb_tventas = new JLabel("Ventas");
	JLabel lb_tfunciones = new JLabel("Funciones");
	JLabel lb_tpeliculas = new JLabel("Peliculas");
	JLabel lb_tsalas = new JLabel("Salas");
	JLabel lb_tuser = new JLabel("Personal");
	JLabel lb_tajustes = new JLabel("Ajustes");
	JLabel lb_tlout = new JLabel("Salir");
	
	//Colores
	Color bgcolor = Color.decode("#c23616");
	Color bgnavcolor = Color.decode("#2d3436");
	Color frcolor = Color.decode("#2980b9");
	Color btncolor = Color.decode("#273c75");
	
	//Fuente
	Font font1 = new Font("SansSerif", Font.BOLD, 20);
	
	ImageIcon img1 = new ImageIcon("C:\\Users\\LuisA\\Desktop\\Cine\\Cine\\src\\shop.png");
	JButton lb_ventas;
	ImageIcon img2 = new ImageIcon("C:\\Users\\LuisA\\Desktop\\Cine\\Cine\\src\\funciones.png");
	JButton lb_funciones;
	ImageIcon img3 = new ImageIcon("C:\\Users\\LuisA\\Desktop\\Cine\\Cine\\src\\peliculas.png");
	JButton lb_peliculas;
	ImageIcon img4 = new ImageIcon("C:\\Users\\LuisA\\Desktop\\Cine\\Cine\\src\\salas.png");
	JButton lb_salas;
	ImageIcon img5 = new ImageIcon("C:\\Users\\LuisA\\Desktop\\Cine\\Cine\\src\\user.png");
	JButton lb_user;
	ImageIcon img6 = new ImageIcon("C:\\Users\\LuisA\\Desktop\\Cine\\Cine\\src\\ajustes.png");
	JButton lb_ajustes;
	ImageIcon img7 = new ImageIcon("C:\\Users\\LuisA\\Desktop\\Cine\\Cine\\src\\lout.png");
	JButton lb_lout;
	
	
	// Metodo para crear la ventana principal
	public void crear_sistema () {
		fr_sistema.setSize(1050, 700);
		fr_sistema.setVisible(true);
		fr_sistema.setResizable(false);
		
		fr_sistema.add(pn_principal);
		
		pn_principal.setBackground(bgnavcolor);
		pn_navegador.setBackground(bgcolor);
		
		pn_principal.add(pn_navegador);
		pn_principal.setLayout(null);
		pn_navegador.setBounds(0, 0, 1050, 100);
		
		pn_navegador.setLayout(null);
		
		lb_logo = new JLabel("Cinemex");
		lb_logo.setBounds(20, 2, 250, 100);
		lb_logo.setFont(new Font("SansSerif", Font.BOLD, 50));
		
		
		lb_ventas = new JButton("", img1);
		lb_ventas.setBounds(360, 12, 64, 64);
		lb_tventas.setBounds(372, 61, 100, 50);
		lb_funciones = new JButton("", img2);
		lb_funciones.setBounds(460, 12, 64, 64);
		lb_tfunciones.setBounds(462, 61, 100, 50);
		lb_peliculas = new JButton("",img3);
		lb_peliculas.setBounds(560, 12, 64, 64);
		lb_tpeliculas.setBounds(568, 61, 100, 50);
		lb_salas = new JButton("",img4);
		lb_salas.setBounds(660, 12, 64, 64);
		lb_tsalas.setBounds(672, 61, 100, 50);
		lb_user = new JButton("",img5);
		lb_user.setBounds(760, 12, 64, 64);
		lb_tuser.setBounds(769, 61, 100, 50);
		lb_ajustes = new JButton("",img6);
		lb_ajustes.setBounds(860, 12, 64, 64);
		lb_tajustes.setBounds(870, 61, 100, 50);
		lb_lout = new JButton("",img7);
		lb_lout.setBounds(975, 12, 64, 64);
		lb_tlout.setBounds(992, 61, 100, 50);
		
		lb_logo.setForeground(Color.WHITE);
		lb_tventas.setForeground(Color.WHITE);
		lb_tfunciones.setForeground(Color.WHITE);
		lb_tpeliculas.setForeground(Color.WHITE);
		lb_tsalas.setForeground(Color.WHITE);
		lb_tajustes.setForeground(Color.WHITE);
		lb_tuser.setForeground(Color.WHITE);
		lb_tlout.setForeground(Color.WHITE);
		
		pn_navegador.add(lb_logo);
		pn_navegador.add(lb_ventas);
		pn_navegador.add(lb_tventas);
		pn_navegador.add(lb_funciones);
		pn_navegador.add(lb_tfunciones);
		pn_navegador.add(lb_peliculas);
		pn_navegador.add(lb_tpeliculas);
		pn_navegador.add(lb_salas);
		pn_navegador.add(lb_tsalas);
		pn_navegador.add(lb_user);
		pn_navegador.add(lb_tuser);
		pn_navegador.add(lb_ajustes);
		pn_navegador.add(lb_tajustes);
		pn_navegador.add(lb_lout);
		pn_navegador.add(lb_tlout);
	}

	public void acciones_sistema() {
		
	}
}
