import java.awt.Checkbox;
import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Registro {

	JFrame frmRegistro;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textCorreo;
	private final ButtonGroup buttonGroup = new ButtonGroup();



	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
		frmRegistro.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.setResizable(false);
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 494, 300);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setBounds(41, 61, 65, 14);
		frmRegistro.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(116, 58, 86, 20);
		frmRegistro.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Apellidos*");
		lblNewLabel.setBounds(212, 61, 76, 14);
		frmRegistro.getContentPane().add(lblNewLabel);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(343, 58, 95, 20);
		frmRegistro.getContentPane().add(textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(41, 106, 65, 14);
		frmRegistro.getContentPane().add(lblCorreo);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(116, 103, 86, 20);
		frmRegistro.getContentPane().add(textCorreo);
		textCorreo.setColumns(10);
		
		JLabel lblFechaDeAcimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeAcimiento.setBounds(212, 106, 136, 14);
		frmRegistro.getContentPane().add(lblFechaDeAcimiento);
		
		JLabel lblMayorDeEdad = new JLabel("Mayor de edad:");
		lblMayorDeEdad.setBounds(41, 186, 92, 14);
		frmRegistro.getContentPane().add(lblMayorDeEdad);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		buttonGroup.add(rdbtnSi);
		rdbtnSi.setSelected(true);
		rdbtnSi.setBounds(175, 182, 46, 23);
		frmRegistro.getContentPane().add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(223, 182, 46, 23);
		frmRegistro.getContentPane().add(rdbtnNo);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(343, 100, 95, 20);
		frmRegistro.getContentPane().add(dateChooser);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(41, 146, 46, 14);
		frmRegistro.getContentPane().add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"H", "M"}));
		comboBox.setBounds(116, 143, 46, 20);
		frmRegistro.getContentPane().add(comboBox);
		comboBox.setSelectedItem(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(318, 216, 89, 23);
		frmRegistro.getContentPane().add(btnAceptar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u00BFAcepta los t\u00E9rminos?*");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(212, 142, 165, 23);
		frmRegistro.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(41, 216, 89, 23);
		frmRegistro.getContentPane().add(btnAtras);
		
		//Evento
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textNombre.getText().toString().isEmpty() && textApellidos.getText().toString().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Complete los campos requeridos","Error", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Enhorabuena estas registrado","Registrado",JOptionPane.INFORMATION_MESSAGE);
				Login l = new Login();
				frmRegistro.dispose();
				}
			}
		});
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				frmRegistro.dispose();
			}
		});
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
