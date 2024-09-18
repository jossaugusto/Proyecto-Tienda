package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Cliente;

import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class M_Clientes extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCodigoC;
	private JLabel lblNombreC;
	private JLabel lblApellidosC;
	private JLabel lblDireccionC;
	private JLabel lblTelefonoC;
	private JLabel lblDniC;
	private JTextField txtCodigoC;
	private JTextField txtNombreC;
	private JTextField txtApellidosC;
	private JTextField txtDireccionC;
	private JTextField txtTelefonoC;
	private JTextField txtDniC;
	private JButton btnOk;
	private JComboBox cboCodigos;
	private JComboBox cboOpciones;
	private JLabel lblCboCodigos;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			M_Clientes dialog = new M_Clientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public M_Clientes() {
		setMinimumSize(new Dimension(700, 550));
		setTitle("Mantenimiento Clientes");
		setBounds(100, 100, 652, 454);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCodigoC = new JLabel("Código Cliente");
		lblCodigoC.setBounds(10, 27, 90, 14);
		contentPanel.add(lblCodigoC);
		
		lblNombreC = new JLabel("Nombre");
		lblNombreC.setBounds(10, 52, 46, 14);
		contentPanel.add(lblNombreC);
		
		lblApellidosC = new JLabel("Apellidos");
		lblApellidosC.setBounds(10, 77, 46, 14);
		contentPanel.add(lblApellidosC);
		
		lblDireccionC = new JLabel("Dirección");
		lblDireccionC.setBounds(10, 104, 46, 14);
		contentPanel.add(lblDireccionC);
		
		lblTelefonoC = new JLabel("Teléfono");
		lblTelefonoC.setBounds(10, 129, 46, 14);
		contentPanel.add(lblTelefonoC);
		
		lblDniC = new JLabel("DNI");
		lblDniC.setBounds(10, 154, 46, 14);
		contentPanel.add(lblDniC);
		
		txtCodigoC = new JTextField();
		txtCodigoC.setBounds(93, 24, 86, 20);
		contentPanel.add(txtCodigoC);
		txtCodigoC.setColumns(10);
		
		txtNombreC = new JTextField();
		txtNombreC.setColumns(10);
		txtNombreC.setBounds(93, 49, 86, 20);
		contentPanel.add(txtNombreC);
		
		txtApellidosC = new JTextField();
		txtApellidosC.setColumns(10);
		txtApellidosC.setBounds(93, 74, 86, 20);
		contentPanel.add(txtApellidosC);
		
		txtDireccionC = new JTextField();
		txtDireccionC.setColumns(10);
		txtDireccionC.setBounds(93, 101, 86, 20);
		contentPanel.add(txtDireccionC);
		
		txtTelefonoC = new JTextField();
		txtTelefonoC.setColumns(10);
		txtTelefonoC.setBounds(93, 126, 86, 20);
		contentPanel.add(txtTelefonoC);
		
		txtDniC = new JTextField();
		txtDniC.setColumns(10);
		txtDniC.setBounds(93, 151, 86, 20);
		contentPanel.add(txtDniC);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setBounds(239, 23, 89, 23);
		contentPanel.add(btnOk);
		
		cboCodigos = new JComboBox();
		cboCodigos.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar"}));
		cboCodigos.setName("");
		cboCodigos.setToolTipText("");
		cboCodigos.setBounds(433, 23, 102, 22);
		contentPanel.add(cboCodigos);
		
		cboOpciones = new JComboBox();
		cboOpciones.setModel(new DefaultComboBoxModel(new String[] {"Agregar", "Modificar", "Consultar", "Eliminar", "Listar"}));
		cboOpciones.setBounds(584, 23, 90, 22);
		contentPanel.add(cboOpciones);
		
		lblCboCodigos = new JLabel("Código");
		lblCboCodigos.setBounds(377, 27, 46, 14);
		contentPanel.add(lblCboCodigos);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 193, 664, 307);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		int codigoC = Integer.parseInt(txtCodigoC.getText());
		String nombreC = txtNombreC.getText();
		String apellidosC = txtApellidosC.getText();
		String direccionC = txtDireccionC.getText();
		String telefonoC = txtTelefonoC.getText();
		String dniC = txtDniC.getText();

		Cliente c = new Cliente(codigoC, nombreC, apellidosC, direccionC, telefonoC, dniC);
		

	}
}//Fin
