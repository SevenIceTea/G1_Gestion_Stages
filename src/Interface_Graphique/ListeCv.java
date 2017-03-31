package Interface_Graphique;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JTextField;

import Action_Listener.AllerPage;
import Principal.Application;
import Principal.DemoJdbc;
import Principal.Offres;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ListeCv extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	Application a;
	String user;
	/**
	 * Create the panel.
	 */
	public ListeCv(Application a, String user) {
		this.a=a;
		this.user=user;
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Recherche d'offre de Stage :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Recherche");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Postuler");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new AllerPage(this.a,7,user));
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{75, 65, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		panel_2.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 128, 142, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 0;
		gbc_rdbtnNewRadioButton.gridy = 0;
		panel_4.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("Entreprise :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		panel_4.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		ArrayList<String> listE=DemoJdbc.liste();
		String[] liste = new String[listE.size()];
		for(int j=0;j<listE.size();j++)
		{
			liste[j]=listE.get(j);
		}
		JComboBox comboBox = new JComboBox(liste);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 0;
		panel_4.add(comboBox, gbc_comboBox);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 0;
		gbc_rdbtnNewRadioButton_1.gridy = 1;
		panel_4.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JLabel lblDure = new JLabel("Dur\u00E9e(min/max) :");
		GridBagConstraints gbc_lblDure = new GridBagConstraints();
		gbc_lblDure.insets = new Insets(0, 0, 5, 5);
		gbc_lblDure.gridx = 1;
		gbc_lblDure.gridy = 1;
		panel_4.add(lblDure, gbc_lblDure);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panel_4.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 1;
		panel_4.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 0;
		gbc_rdbtnNewRadioButton_2.gridy = 2;
		panel_4.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JLabel lblPoste = new JLabel("Poste:");
		GridBagConstraints gbc_lblPoste = new GridBagConstraints();
		gbc_lblPoste.insets = new Insets(0, 0, 0, 5);
		gbc_lblPoste.gridx = 1;
		gbc_lblPoste.gridy = 2;
		panel_4.add(lblPoste, gbc_lblPoste);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox_1.gridwidth = 2;
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 2;
		panel_4.add(comboBox_1, gbc_comboBox_1);
		
		JPanel Pane = new JPanel();
		GridBagLayout grille = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.insets=new Insets(10,10,10,10);
		Pane.setLayout(grille);
		gbc.gridy=0;
		
		
		ArrayList<Offres> list=ListeOffres();
		
		
		for(int i = 0;i<list.size();i++)
		{
			gbc.gridy=i;
			gbc.gridx=0;
			Offres o = list.get(i);
			JLabel z = new JLabel(o.AfficherS());
			z.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
			Pane.add(z,gbc);
			gbc.gridx++;
			Pane.add(new JRadioButton(""),gbc);
		}
		Pane.validate();
		Pane.repaint();
		
		gbc.gridy=1;
		gbc.gridx=0;
		JScrollPane scrollPane = new JScrollPane(Pane);
		panel_2.add(scrollPane, gbc);
		this.validate();
		this.repaint();
		
		
	}


	private ArrayList<Offres> ListeOffres() {
		// TODO Auto-generated method stub
		return DemoJdbc.listeO();
	}

	private ArrayList<String> ListeEntreprises() {
		// TODO Auto-generated method stub
		return DemoJdbc.liste();
	}


}