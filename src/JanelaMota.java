import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.*;
public class JanelaMota extends JFrame 
{
	
	private Container cont;
	private JLabel labelmarca,labelmodelo,labelmatricula,labelanoFabrico,labelcor,labeldata,labelTipoCombustivel,
	labelpesoBruto,labeltipoMota,labelcilindrada,temSedicar,labelImagem;
	private JTextField  tmarca,tmodelo,tanoFabrico,tdata,tcilindrada,tmatricula;
	private JRadioButton btgasolina,btEletrica,btdesportiva,btScooter,btNaKed,btTaill;
	private JComboBox boxcor;
	private String tipoMatricula [] = {"     Especial","Normal"};
	private String cor [] = {"     Roxo","Branco","Verde","Azul","Vermelho","Amarelho","Cinza","Preto"};
	private JButton btVoltar,btEmitir;
	private JPanel painelBotoes,painelMota,painelRadio,painelRadio1;
	private ButtonGroup btg;
	private JCheckBox temsidecar;
	
	public JanelaMota()
	{
		super("Mota");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		
		 aparencia();
		
		painelMota = new JPanel (new GridLayout(20,1));
		painelMota.setBackground(Color.WHITE);
		
		// marca do carro
		labelmarca = new JLabel ("     Marca de Mota");
		painelMota.add(labelmarca);
		tmarca = new JTextField();
		painelMota.add(tmarca);
		
		//modelo carro
		labelmodelo = new JLabel ("     Modelo de Mota");
		painelMota.add(labelmodelo);
		tmodelo = new JTextField();
		painelMota.add(tmodelo);
		
		labelmatricula = new JLabel ("     Tipo Matriccula de Mota");
		painelMota.add(labelmatricula);
		tmatricula = new JTextField();
		painelMota.add(tmatricula);		
		
		labelanoFabrico = new JLabel("     Ano de Fabrico do Mota");
		painelMota.add(labelanoFabrico);
		tanoFabrico = new JTextField();
		painelMota.add(tanoFabrico);
		
		// cor de carro 
		labelcor = new JLabel ("     Cor de Mota");
		painelMota.add(labelcor);
		boxcor = new JComboBox (cor);
		painelMota.add(boxcor);
		
		labeldata = new JLabel ("     Data de Mota");
		painelMota.add(labeldata);
		tdata = new JTextField();
		painelMota.add(tdata); 
		
		labelTipoCombustivel = new JLabel ("     Tipo de Combustivel de Automovel");
		painelMota.add(labelTipoCombustivel);
		 
		painelRadio = new JPanel (new FlowLayout());
		
		btgasolina = new JRadioButton ("Gasolina");
		painelRadio.add(btgasolina);
		
		btEletrica =new JRadioButton ("Eletrica");
		painelRadio.add(btEletrica);
		
		btg = new ButtonGroup();
		btg.add(btgasolina);
		btg.add(btEletrica);
		painelMota.add(painelRadio); 
		
	    labeltipoMota = new JLabel ("     Tipo de Mota");
	    painelMota.add(labeltipoMota);
	    // tipo de mota
        painelRadio1 = new JPanel (new FlowLayout());
		 
        btdesportiva = new JRadioButton ("Desportiva");
		painelRadio1.add(btdesportiva);
		
		btScooter = new JRadioButton ("Scooter");
		painelRadio1.add(btScooter);
		
		btNaKed= new JRadioButton("Naked");
		painelRadio1.add(btNaKed);
		
		btTaill = new JRadioButton ("Taill");
		painelRadio1.add(btTaill);
	    
		btg = new ButtonGroup();
		btg.add(btdesportiva);
		btg.add(btScooter);
		btg.add(btNaKed);
		btg.add(btTaill);
		painelMota.add(painelRadio1); 
		
		labelcilindrada = new JLabel ("     Cilindrada");
		painelMota.add(labelcilindrada);
		tcilindrada = new JTextField();
		painelMota.add(tcilindrada);
		
		temsidecar = new JCheckBox (" Tem Sidecar");
		painelMota.add(temsidecar);
		
	    painelBotoes = new JPanel (new GridLayout());
	    // sair e emitir
		btVoltar = new JButton ("Voltar");
		btVoltar.addActionListener(new ActionListener()
				{
			       public  void actionPerformed(ActionEvent e)
			       {
			    	   new JanelaEmitirDados();
			    	      dispose();
			       }
				});
		painelBotoes.add(btVoltar);
		btVoltar.setBackground(Color.RED);
		btVoltar.setForeground(Color.BLACK);
		
		btEmitir = new JButton ("Emitir");
	    btEmitir.addActionListener(new ActionListener()
				{
			       public  void actionPerformed(ActionEvent e)
			       {
			    	      
			       }
				});
	    painelBotoes.add(btEmitir);
		btEmitir.setBackground(Color.GREEN);
		btEmitir.setForeground(Color.BLACK);
		painelMota.add(painelBotoes);
		
		
		ImageIcon icon = new ImageIcon("E:\\AVP2\\ImageIcon//logo.jpg");
		labelImagem = new JLabel (icon);
	    
	    cont.add(labelImagem,BorderLayout.WEST);
	    cont.add(painelMota,BorderLayout.CENTER);
	    
	    
	    //desenho da jela
	    setSize(1200,700);
	    setVisible(true);
	   
	}
	public void aparencia(){
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		}catch (Exception e) {e.printStackTrace();}
	}
	
	public static void main (String [] args)
	{
		new JanelaMota();
	}

}
