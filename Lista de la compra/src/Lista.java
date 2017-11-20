import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lista extends JFrame {

	private JPanel contentPane;
	private JTextField txtCliente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private double precioTotal = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista frame = new Lista();
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
	public Lista() {
		
		setResizable(false);
		setTitle("Lista de la compra");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdentificacionDeUsuarios = new JLabel("Identificacion de usuarios");
		lblIdentificacionDeUsuarios.setBounds(10, 22, 161, 14);
		contentPane.add(lblIdentificacionDeUsuarios);
		
		txtCliente = new JTextField();
		txtCliente.setEditable(false);
		
		txtCliente.setBounds(165, 19, 86, 20);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		JLabel lblAPagar = new JLabel("A pagar (\u20AC)");
		lblAPagar.setBounds(261, 22, 67, 14);
		contentPane.add(lblAPagar);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("0.0");
		textField.setBounds(338, 19, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 58, 67, 14);
		contentPane.add(lblProducto);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 55, 111, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad");
		lblCantidadYPreciounidad.setBounds(191, 58, 137, 14);
		contentPane.add(lblCantidadYPreciounidad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(348, 55, 39, 20);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(392, 55, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setEditable(false);
		textArea.setBounds(10, 99, 276, 161);
		contentPane.add(textArea);
		
		JButton btnAadirProductoCreado = new JButton("A\u00F1adir producto creado");
		
		btnAadirProductoCreado.setBounds(307, 133, 171, 23);
		contentPane.add(btnAadirProductoCreado);
		
		JButton btnNewButton = new JButton("Finalizar compra");
		btnNewButton.setBounds(307, 199, 171, 23);
		contentPane.add(btnNewButton);
		
		//eventos
		
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color bg = new Color(0,255,0);
				textArea.setBackground(bg);
			}
		});
		*/
		
		// Evento de inicio de Jframe
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				comboBox.setSelectedItem(null);
				txtCliente.setText("Cliente");
			}
		});
		
		
		textField_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (textField_1.getText().length()>=6) {
                    System.out.println("Mayor que 6");
                }
            }
        });
		
		// evento del comboBox
		comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String seleccionado = comboBox.getSelectedItem().toString();
                textField_2.setText(seleccionado);
            }
        });
		
		
		//Evento del añadir producto
		
		btnAadirProductoCreado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String producto = textField_1.getText().toString();
				String cantidad = comboBox.getSelectedItem().toString(); 
				String precio = textField_2.getText().toString();
				
				double cantidadD = Double.parseDouble(cantidad);
				double precioD = Double.parseDouble(precio);
				
			double calculo = cantidadD * precioD;
			
			precioTotal = precioTotal + calculo;
			textField.setText(String.valueOf(precioTotal));
			
			textArea.setText(textArea.getText()+producto + " ("+cantidad+") "+"-->"+ calculo+"\n");
			
			textField_1.setText("");
			textField_2.setText("");
			comboBox.setSelectedItem(null);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Hasta luego señores, debe pagar " +precioTotal, "Hasta luego Maricarmen", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		
	}
}
