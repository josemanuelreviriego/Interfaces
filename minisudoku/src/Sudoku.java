import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sudoku {

	private JFrame frmSudoku;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku window = new Sudoku();
					window.frmSudoku.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	static int N = 4;

	public static int getN() {
		return N;
	}

	public static void setN(int n) {
		N = n;
	}

	// sample input
	static int grid[][] = { { 2, 0, 0, 0}, //
							{ 0, 3, 0, 4}, //
							{ 3, 0, 0, 1}, //
							{ 4, 0, 3, 0} };
	private JButton btnNewButton_1;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton_2;

	public static int[][] getGrid() {
		return grid;
	}

	public static void setGrid(int[][] grid) {
		Sudoku.grid = grid;
	}

	/**
	 * Utility function to check whether @param value is valid for @param cell
	 */

	static boolean isValid(Cell cell, int value) {

		if (grid[cell.row][cell.col] != 0) {
			throw new RuntimeException("Cannot call for cell which already has a value");
		}

		// if v present row, return false
		for (int c = 0; c < 4; c++) {
			if (grid[cell.row][c] == value)
				return false;
		}

		// if v present in col, return false
		for (int r = 0; r < 4; r++) {
			if (grid[r][cell.col] == value)
				return false;
		}

		// if v present in grid, return false

		// to get the grid we should calculate (x1,y1) (x2,y2)
		int x1 = 2 * (cell.row / 2);
		int y1 = 2 * (cell.col / 2);
		int x2 = x1 + 1;
		int y2 = y1 + 1;

		for (int x = x1; x <= x2; x++)
			for (int y = y1; y <= y2; y++)
				if (grid[x][y] == value)
					return false;

		// if value not present in row, col and bounding box, return true
		return true;
	}

	// simple function to get the next cell
	// read for yourself, very simple and straight forward
	static Cell getNextCell(Cell cur) {

		int row = cur.row;
		int col = cur.col;

		// next cell => col++
		col++;

		// if col > 8, then col = 0, row++
		// reached end of row, got to next row
		if (col > 3) {
			// goto next line
			col = 0;
			row++;
		}

		// reached end of matrix, return null
		if (row > 3)
			return null; // reached end

		Cell next = new Cell(row, col);
		return next;
	}

	// everything is put together here
	// very simple solution
	// must return true, if the soduku is solved, return false otherwise
	public boolean solve(Cell cur) {

		// if the cell is null, we have reached the end
		if (cur == null)
			return true;

		// if grid[cur] already has a value, there is nothing to solve here,
		// continue on to next cell
		if (grid[cur.row][cur.col] != 0) {
			// return whatever is being returned by solve(next)
			// i.e the state of soduku's solution is not being determined by
			// this cell, but by other cells
			return solve(getNextCell(cur));
		}

		// this is where each possible value is being assigned to the cell, and
		// checked if a solutions could be arrived at.

		// if grid[cur] doesn't have a value
		// try each possible value
		for (int i = 1; i <= 4; i++) {
			// check if valid, if valid, then update
			boolean valid = isValid(cur, i);

			if (!valid) // i not valid for this cell, try other values
				continue;

			// assign here
			grid[cur.row][cur.col] = i;

			// continue with next cell
			boolean solved = solve(getNextCell(cur));
			// if solved, return, else try other values
			if (solved)
				return true;
			else
				grid[cur.row][cur.col] = 0; // reset
			// continue with other possible values
		}

		// if you reach here, then no value from 1 - 9 for this cell can solve
		// return false
		return false;
	}
	/**
	 * Create the application.
	 */
	public Sudoku() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSudoku = new JFrame();
		frmSudoku.setTitle("Sudoku");
		frmSudoku.setBounds(100, 100, 663, 489);
		frmSudoku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSudoku.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel izquierda = new JPanel();
		frmSudoku.getContentPane().add(izquierda, BorderLayout.WEST);
		izquierda.setLayout(new GridLayout(2, 1, 0, 0));
		
		btnNewButton_1 = new JButton("Automatico");
		izquierda.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Comprobar");
		izquierda.add(btnNewButton_2);
		
		JPanel derecha = new JPanel();
		frmSudoku.getContentPane().add(derecha, BorderLayout.EAST);
		
		JPanel arriba = new JPanel();
		frmSudoku.getContentPane().add(arriba, BorderLayout.NORTH);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Redimensionar");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		arriba.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No redimensionar");
		buttonGroup.add(rdbtnNewRadioButton_1);
		arriba.add(rdbtnNewRadioButton_1);
		
		JPanel abajo = new JPanel();
		frmSudoku.getContentPane().add(abajo, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		abajo.add(btnNewButton);
		
		JButton btnSalirDelJuego = new JButton("Salir del juego");
		abajo.add(btnSalirDelJuego);
		
		chckbxNewCheckBox = new JCheckBox("\u00BFSombreado?");
		chckbxNewCheckBox.setSelected(true);
		abajo.add(chckbxNewCheckBox);
		
		JPanel centro = new JPanel();
		frmSudoku.getContentPane().add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		centro.add(panel);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField.setText("2");
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setText("3");
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_7.setEditable(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("4");
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setText("3");
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBackground(Color.LIGHT_GRAY);
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_11.setEditable(false);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("1");
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBackground(Color.LIGHT_GRAY);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_12.setText("4");
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBackground(Color.LIGHT_GRAY);
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 40));
		textField_14.setEditable(false);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("3");
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField_15);
		textField_15.setColumns(10);
		
		//Eventos
		
		//Para salir del juego
		btnSalirDelJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// Para redimensionar
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSudoku.setResizable(true);
			}
		});
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSudoku.setResizable(false);
			}
		});
		
		// reiniciar todo
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_6.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_13.setText("");
				textField_15.setText("");
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(true);
				textField_6.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(true);
				textField_13.setEditable(true);
				textField_15.setEditable(true);
				
			}
		});
		
		//Sombreado
		
			chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(chckbxNewCheckBox.isSelected()){
				textField_12.setBackground(SystemColor.lightGray);
				textField.setBackground(SystemColor.lightGray);
				textField_5.setBackground(SystemColor.lightGray);
				textField_7.setBackground(SystemColor.lightGray);
				textField_8.setBackground(SystemColor.lightGray);
				textField_11.setBackground(SystemColor.lightGray);
				textField_12.setBackground(SystemColor.lightGray);
				textField_14.setBackground(SystemColor.lightGray);
			}
		else{
			textField_12.setBackground(SystemColor.white);
			textField.setBackground(SystemColor.white);
			textField_5.setBackground(SystemColor.white);
			textField_7.setBackground(SystemColor.white);
			textField_8.setBackground(SystemColor.white);
			textField_11.setBackground(SystemColor.white);
			textField_12.setBackground(SystemColor.white);
			textField_14.setBackground(SystemColor.white);
		}
				}
				});
		
			// Sudoku automatico
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Sudoku prueba = new Sudoku();

					boolean solved = prueba.solve(new Cell(0, 0));
					if (!solved) {
						System.out.println("SUDOKU cannot be solved.");
						return;
					}

					int posicion = grid[0][0];
					int posicion1 = grid[0][1];
					int posicion2 = grid[0][2];
					int posicion3 = grid[0][3];
					int posicion4 = grid[1][0];
					int posicion5 = grid[1][1];
					int posicion6 = grid[1][2];
					int posicion7 = grid[1][3];
					int posicion8 = grid[2][0];
					int posicion9 = grid[2][1];
					int posicion10 = grid[2][2];
					int posicion11 = grid[2][3];
					int posicion12 = grid[3][0];
					int posicion13 = grid[3][1];
					int posicion14 = grid[3][2];
					int posicion15 = grid[3][3];

					textField.setText(String.valueOf(posicion));
					textField_1.setText(String.valueOf(posicion1));
					textField_2.setText(String.valueOf(posicion2));
					textField_3.setText(String.valueOf(posicion3));
					textField_4.setText(String.valueOf(posicion4));
					textField_5.setText(String.valueOf(posicion5));
					textField_6.setText(String.valueOf(posicion6));
					textField_7.setText(String.valueOf(posicion7));
					textField_8.setText(String.valueOf(posicion8));
					textField_9.setText(String.valueOf(posicion9));
					textField_10.setText(String.valueOf(posicion10));
					textField_11.setText(String.valueOf(posicion11));
					textField_12.setText(String.valueOf(posicion12));
					textField_13.setText(String.valueOf(posicion13));
					textField_14.setText(String.valueOf(posicion14));
					textField_15.setText(String.valueOf(posicion15));
					
					textField_1.setEditable(false);
					textField_2.setEditable(false);
					textField_3.setEditable(false);
					textField_4.setEditable(false);
					textField_6.setEditable(false);
					textField_9.setEditable(false);
					textField_10.setEditable(false);
					textField_13.setEditable(false);
					textField_15.setEditable(false);
						}
			});
			
			// Comprobar sudoku
			
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Sudoku prueba = new Sudoku();

					boolean solved = prueba.solve(new Cell(0, 0));
					if (!solved) {
						System.out.println("SUDOKU cannot be solved.");
						return;
					}

					int posicion1 = grid[0][1];
					int posicion2 = grid[0][2];
					int posicion3 = grid[0][3];
					int posicion4 = grid[1][0];
					int posicion6 = grid[1][2];
					int posicion9 = grid[2][1];
					int posicion10 = grid[2][2];
					int posicion13 = grid[3][1];
					int posicion15 = grid[3][3];
					
					if(textField_1.getText().equals(String.valueOf(posicion1)) && textField_2.getText().equals(String.valueOf(posicion2)) && textField_3.getText().equals(String.valueOf(posicion3))
							&& textField_4.getText().equals(String.valueOf(posicion4)) && textField_6.getText().equals(String.valueOf(posicion6)) && textField_9.getText().equals(String.valueOf(posicion9))
							&& textField_10.getText().equals(String.valueOf(posicion10)) && textField_13.getText().equals(String.valueOf(posicion13)) && textField_15.getText().equals(String.valueOf(posicion15)))
							{
						JOptionPane.showMessageDialog(null, "Enhorabuena lo tienes perfecto","Lo has conseguido", JOptionPane.INFORMATION_MESSAGE);
					}else{
						JOptionPane.showMessageDialog(null, "Revisa que algo tienes mal", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			
			
		
	}

}
