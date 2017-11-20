import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Principal extends Login {

	JFrame frmTraduccion;
	private JTextField txtPalabra;
	private JTextField txtTraduccion;
	private static String getStringFromInputStream(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {

			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return sb.toString();

	}

	
	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
		frmTraduccion.setVisible(true);
		frmLogin.dispose();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTraduccion = new JFrame();
		frmTraduccion.setResizable(false);
		frmTraduccion.setTitle("Traduccion");
		frmTraduccion.setBounds(100, 100, 450, 300);
		frmTraduccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTraduccion.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel abajo = new JPanel();
		frmTraduccion.getContentPane().add(abajo, BorderLayout.SOUTH);
		abajo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Ingles");
		abajo.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Frances");
		abajo.add(btnNewButton_1);
		
		JPanel arriba = new JPanel();
		frmTraduccion.getContentPane().add(arriba, BorderLayout.NORTH);
		
		JButton btnAtras = new JButton("Atras");
		arriba.add(btnAtras);
		
		JPanel centro = new JPanel();
		frmTraduccion.getContentPane().add(centro, BorderLayout.CENTER);
		centro.setLayout(null);
		
		JLabel lblPalabra = new JLabel("Palabra");
		lblPalabra.setBounds(74, 60, 88, 14);
		centro.add(lblPalabra);
		
		txtPalabra = new JTextField();
		txtPalabra.setBounds(172, 57, 115, 20);
		centro.add(txtPalabra);
		txtPalabra.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Traduccion");
		lblNewLabel.setBounds(74, 107, 88, 14);
		centro.add(lblNewLabel);
		
		txtTraduccion = new JTextField();
		txtTraduccion.setEditable(false);
		txtTraduccion.setBounds(172, 104, 115, 20);
		centro.add(txtTraduccion);
		txtTraduccion.setColumns(10);
	
	
	//eventos
	
	btnAtras.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Login l = new Login();
			frmTraduccion.dispose();
		}
	});
	
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(txtPalabra.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Esta vacio","Error",JOptionPane.ERROR_MESSAGE);
			}else {
			String palabra = txtPalabra.getText().toString();
			URL web = null;
			InputStream contenido = null;
			String pagWeb = "";
			String igual = "<td class='ToWrd' >";
			int aux = 0;
			
			try {
				web = new URL("http://www.wordreference.com/es/en/translation.asp?spen="+palabra);
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
			
		
			try {
				contenido = web.openStream();
			} catch (IOException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
			
			pagWeb = getStringFromInputStream(contenido);
			pagWeb = pagWeb.substring(pagWeb.indexOf(igual) + igual.length());
			while(pagWeb.charAt(aux) != '<')
				aux++;
			pagWeb = pagWeb.substring(0, aux -1);
			txtTraduccion.setText(pagWeb);
			}
		}
	});
	
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(txtPalabra.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Esta vacio","Error",JOptionPane.ERROR_MESSAGE);
			}else {
			String palabra = txtPalabra.getText().toString();
			URL web = null;
			InputStream contenido = null;
			String pagWeb = "";
			String igual = "<td class='ToWrd' >";
			int aux = 0;
			
			try {
				web = new URL("http://www.wordreference.com/esfr/"+palabra);
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
			
		
			try {
				contenido = web.openStream();
			} catch (IOException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
			
			pagWeb = getStringFromInputStream(contenido);
			pagWeb = pagWeb.substring(pagWeb.indexOf(igual) + igual.length());
			while(pagWeb.charAt(aux) != '<')
				aux++;
			pagWeb = pagWeb.substring(0, aux -1);
			txtTraduccion.setText(pagWeb);
		}
		}
	});
	
	
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
