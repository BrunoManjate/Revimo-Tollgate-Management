import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.*;
public class janela_LigeiroSR extends JFrame 
{
	
	private Container cont;
	private JLabel labelmarca,labelmodelo,labelmatricula,labelanoFabrico,labelcor,labeldata,labelTipoCombustivel,
	labeln_passageiro,labelNumeroEixo,labelpesoBruto,labelImagem;
	private JTextField tmarca,tmodelo,tanoFabrico,tdata,tn_passageiro,tpesoBruto,tNumeroEixo,tmatricula;
	private JRadioButton btgasolina,btdiesel,btgas;
	private JComboBox boxcor;
	private String tipoMatricula [] = {"     Especial","Normal"};
	private String cor [] = {"     Roxo","Branco","Verde","Azul","Vermelho","Amarelho","Cinza","Preto"};
	private JButton btVoltar,btEmitir;
	private JPanel painelBotoes,painelLigeiroSR,painelRadio;
	private ButtonGroup btg;
	
	public janela_LigeiroSR()
	{
		super("Ligerio sem Roboque");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		
		aparencia();
		
		painelLigeiroSR = new JPanel (new GridLayout(21,1));
		painelLigeiroSR.setBackground(Color.WHITE);
		
		// marca do carro
		labelmarca = new JLabel ("     Marca de Automevel");
		painelLigeiroSR.add(labelmarca);
		tmarca = new JTextField();
		painelLigeiroSR.add(tmarca);
		
		//modelo carro
		labelmodelo = new JLabel ("     Modelo de Automevel");
		painelLigeiroSR.add(labelmodelo);
		tmodelo = new JTextField();
		painelLigeiroSR.add(tmodelo);
		
		labelmatricula = new JLabel ("     Tipo Matriccula de Automevel");
		painelLigeiroSR.add(labelmatricula);
		tmatricula = new JTextField ();
		painelLigeiroSR.add(tmatricula);
		
		labelanoFabrico = new JLabel("     Ano de Fabrico do Automovel");
		painelLigeiroSR.add(labelanoFabrico);
		tanoFabrico = new JTextField();
		painelLigeiroSR.add(tanoFabrico);
		
		// cor de carro 
		labelcor = new JLabel ("     Cor de Automevel");
		painelLigeiroSR.add(labelcor);
		boxcor = new JComboBox (cor);
		painelLigeiroSR.add(boxcor);
		
		labeldata = new JLabel ("     Data de Automevel");
		painelLigeiroSR.add(labeldata);
		tdata = new JTextField();
		painelLigeiroSR.add(tdata); 
		
		labelTipoCombustivel = new JLabel ("     Tipo de Combustivel de Automovel");
		painelLigeiroSR.add(labelTipoCombustivel);
		 
		painelRadio = new JPanel (new FlowLayout());
		
		btgasolina = new JRadioButton ("Gasolina");
		painelRadio.add(btgasolina);
		
		btdiesel =new JRadioButton ("Diesel");
		painelRadio.add(btdiesel);
		
		btgas = new JRadioButton("Gas");
		painelRadio.add(btgas);
		
		btg = new ButtonGroup();
		btg.add(btgasolina);
		btg.add(btdiesel);
		btg.add(btgas);
		painelLigeiroSR.add(painelRadio); 
		
		labelNumeroEixo = new JLabel ("     Numero de Eixo de Automovel");
		painelLigeiroSR.add(labelNumeroEixo);
		tNumeroEixo = new JTextField();
		painelLigeiroSR.add(tNumeroEixo);
		
		
	    labeln_passageiro = new JLabel ("     Numero de Passageiro Automovel");
	    painelLigeiroSR.add(labeln_passageiro);
	    tn_passageiro = new JTextField();
	    painelLigeiroSR.add(tn_passageiro);
	    
	    labelpesoBruto = new JLabel ("     Peso Bruto de Automovel");
	    painelLigeiroSR.add(labelpesoBruto);
	    tpesoBruto = new JTextField();
	    painelLigeiroSR.add(tpesoBruto);
	    
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
			    	      System.exit(0);
			       }
				});
	    painelBotoes.add(btEmitir);
		btEmitir.setBackground(Color.GREEN);
		btEmitir.setForeground(Color.BLACK);
		
		
		painelLigeiroSR.add(painelBotoes);
		
		
		ImageIcon icon = new ImageIcon("E:\\AVP2\\ImageIcon//logo.jpg");
		labelImagem = new JLabel (icon);
	    
	    
	    cont.add(labelImagem,BorderLayout.WEST);
	    cont.add(painelLigeiroSR,BorderLayout.CENTER);
	    
	    //desenho da jela
	    setSize(1200,700);
	    setVisible(true);
	    
		
	}
	
	//metodo de aparencia
		public void aparencia()
		{
			try
			{
				for(LookAndFeelInfo info :UIManager.getInstalledLookAndFeels()) {
					
					if("Nimbus".equals(info.getName())){
						UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
				
			}catch(Exception e) {e.printStackTrace();}
			
		}

	
	public static void main (String [] args)
	{
		new janela_LigeiroSR();
	}

}
