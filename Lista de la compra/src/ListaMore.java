import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class ListaMore extends JFrame {
 
    private JPanel contentPane;
    private JTextField txtMiguelMore;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ListaMore frame = new ListaMore();
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
    public ListaMore() {
       
        setForeground(new Color(204, 255, 255));
        setResizable(false);
        setTitle("Lista de la compra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 594, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(153, 204, 204));
        contentPane.setForeground(new Color(102, 204, 204));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        JLabel lblIdentificadorDelUsuario = new JLabel("Identificador del usuario");
        lblIdentificadorDelUsuario.setBounds(21, 23, 154, 16);
        contentPane.add(lblIdentificadorDelUsuario);
       
        txtMiguelMore = new JTextField();
        txtMiguelMore.setEnabled(false);
        txtMiguelMore.setEditable(false);
        txtMiguelMore.setText("Cliente");
        txtMiguelMore.setBounds(185, 18, 94, 26);
        contentPane.add(txtMiguelMore);
        txtMiguelMore.setColumns(10);
       
        JLabel lblTotalA = new JLabel("Total a pagar(€)");
        lblTotalA.setBounds(291, 23, 98, 16);
        contentPane.add(lblTotalA);
       
        textField = new JTextField();
        textField.setEditable(false);
        textField.setEnabled(false);
        textField.setText("0.0");
        textField.setBounds(411, 18, 71, 26);
        contentPane.add(textField);
        textField.setColumns(10);
       
        JLabel lblNewLabel = new JLabel("Producto");
        lblNewLabel.setBounds(21, 58, 61, 16);
        contentPane.add(lblNewLabel);
       
        textField_1 = new JTextField();
        textField_1.setBounds(94, 53, 130, 26);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
       
        JLabel lblNewLabel_1 = new JLabel("Cantidad y precio/unidad");
        lblNewLabel_1.setBounds(234, 58, 169, 16);
        contentPane.add(lblNewLabel_1);
       
        JList list = new JList();
        list.setBounds(438, 71, -82, 45);
        contentPane.add(list);
       
        JComboBox comboBox = new JComboBox();
        comboBox.setMaximumRowCount(11);
        comboBox.setEditable(true);
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        comboBox.setBounds(400, 53, 52, 27);
        contentPane.add(comboBox);
       
        textField_2 = new JTextField();
        textField_2.setBounds(464, 53, 124, 26);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
       
        JTextArea textArea = new JTextArea();
        textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
        textArea.setEditable(false);
        textArea.setBounds(21, 126, 357, 112);
        contentPane.add(textArea);
       
        JButton btnNewButton = new JButton("Añadir producto creado");
        btnNewButton.setBackground(new Color(153, 153, 153));
       
        btnNewButton.setBounds(400, 146, 183, 29);
        contentPane.add(btnNewButton);
       
        JButton btnNewButton_1 = new JButton("Finalizar compra");
        btnNewButton_1.setBackground(new Color(153, 153, 153));
        btnNewButton_1.setBounds(400, 182, 177, 29);
        contentPane.add(btnNewButton_1);
       
        //EVENTOS
       
        //Cambiamos el texArea a color verde dandole a finalizar compra
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color bg = new Color(0,255,0);
                textArea.setBackground(bg);
            }
        });
       
        //Jframe, con esta propiedad hacemos que un comboBox empiece en blanco en vez del primer numero
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                comboBox.setSelectedItem(null);
            }
        });
       
        //TextField
        textField_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (textField_1.getText().length()>=6);
                    System.out.println("Mayor que 6");
                //{
                    //textField_1.setText("");
                //}
               
            }
        });
       
        //comboBox, lo que hace es pone en en este caso en el textField_2 lo que seleccionemos en el comboBox
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String seleccionado = comboBox.getSelectedItem().toString();
                textField_2.setText(seleccionado);
            }
        });
       
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
       
   
       
    }
}