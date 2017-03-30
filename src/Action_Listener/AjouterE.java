package Action_Listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Interface_Graphique.AjouterEntreprise;
import Principal.Application;
import Principal.DemoJdbc;

public class AjouterE implements ActionListener {

	Application a ;
	String chef ;
	String tel ;
	String adr ;
	String com ;
	String nom;
		int z ;
	AjouterEntreprise b;
	
	public AjouterE(Application a , AjouterEntreprise b)
	{
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		this.nom=b.getTextField().getText();
		this.chef=b.getTextField_1().getText();
		this.tel=b.getTextField_3().getText();
		this.adr=b.getTextField_2().getText();
		this.com=b.getTextArea().getText();
		if(!DemoJdbc.verifE(nom))
		{
			DemoJdbc.ajouterE(nom,chef,tel,adr,com);
		}
		else
		{
			System.out.println("fal");
		}
		
		a.setContentPane(new AjouterEntreprise(this.a));
		a.repaint();
		a.revalidate();
		}
	

}