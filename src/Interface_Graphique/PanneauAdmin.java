package Interface_Graphique;
import javax.swing.JPanel;

import Action_Listener.AllerPage;
import Principal.Application;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanneauAdmin extends JPanel {

	
	Application a;
	
	public PanneauAdmin(Application a) {
		this.a=a;
		this.a.setPreferredSize(new Dimension(450, 300));
		this.a.pack();
		this.a.setLocationRelativeTo(null);
		this.a.setVisible(true);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{140, 25, 126, 25, 0, 0};
		gridBagLayout.rowHeights = new int[]{68, 0, 46, 0, 51, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Entreprises");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Offres");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new AllerPage(this.a,3));
		
		JLabel lblNewLabel_2 = new JLabel("Utilisateurs");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 0;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ajouter");

		btnNewButton_1.addActionListener(new AllerPage(this.a,4));
	
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("Ajouter");
		btnNewButton_5.addActionListener(new AllerPage(this.a,14));
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 4;
		gbc_btnNewButton_5.gridy = 2;
		add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("Consulter");
		btnNewButton_2.addActionListener(new AllerPage(this.a,21));
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 4;
		add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Consulter");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		btnNewButton_3.addActionListener(new AllerPage(this.a,20));
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 4;
		add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("Consulter");
		btnNewButton_6.addActionListener(new AllerPage(this.a,22));
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 4;
		gbc_btnNewButton_6.gridy = 4;
		add(btnNewButton_6, gbc_btnNewButton_6);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		
		JButton btnNewButton_4 = new JButton("Retour");
		
		btnNewButton_4.addActionListener(new AllerPage(this.a,1));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_4.gridx = 2;
		gbc_btnNewButton_4.gridy = 6;
		add(btnNewButton_4, gbc_btnNewButton_4);

	}

	public PanneauAdmin() {
		// TODO Auto-generated constructor stub
	}

}
