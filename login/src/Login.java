import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Login {

	JFrame frmLogin;
	private JTextField textusuario;
	private JPasswordField textpassword;
	private JButton btnRegistro;
	private JLabel lblTraductor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		frmLogin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 37));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(75, 92, 80, 14);
		frmLogin.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(75, 135, 80, 14);
		frmLogin.getContentPane().add(lblContrasea);
		
		textusuario = new JTextField();
		textusuario.setBounds(187, 89, 86, 20);
		frmLogin.getContentPane().add(textusuario);
		textusuario.setColumns(10);
		
		textpassword = new JPasswordField();
		textpassword.setBounds(187, 132, 86, 20);
		frmLogin.getContentPane().add(textpassword);
		
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(271, 188, 89, 23);
		frmLogin.getContentPane().add(btnEntrar);
		
		btnRegistro = new JButton("Registro");
		btnRegistro.setBounds(66, 188, 89, 23);
		frmLogin.getContentPane().add(btnRegistro);
		
		lblTraductor = new JLabel("Traductor");
		lblTraductor.setHorizontalAlignment(SwingConstants.CENTER);
		lblTraductor.setBounds(120, 34, 153, 23);
		frmLogin.getContentPane().add(lblTraductor);
	
		//Eventos

		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] password = textpassword.getPassword();
				String claveFinal = new String(password);
				
				//if(textusuario.getText().equals("jose") && claveFinal.equals("jose")){
				if(!textusuario.getText().isEmpty() && !textpassword.getText().isEmpty() && textusuario.getText().equals(textpassword.getText())){
					//dispose();
					JOptionPane.showMessageDialog(null, "Te has logueado","Enhorabuena", JOptionPane.INFORMATION_MESSAGE);
					Principal p = new Principal();
					p.frmTraduccion.setVisible(true);
					frmLogin.dispose();
				}else{
					JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
					
				}
			}

		});
		
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro r = new Registro();
				r.frmRegistro.setVisible(true);
				frmLogin.dispose();
			}
		});
	
	}
}
