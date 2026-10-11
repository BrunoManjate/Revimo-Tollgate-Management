import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.*;
public class JanelaLigeiroCR extends JFrame 
{
	
	private Container cont;
	private JLabel labelmarca,labelmodelo,labelmatricula,labelanoFabrico,labelcor,labeldata,labelTipoCombustivel,
	labeln_passageiro,labelNumeroEixo,labelpesoBruto,labelTipoRoboque,labelPesoR,labelImagem;
	private JTextField tmarca,tmodelo,tanoFabrico,tdata,tn_passageiro,tpesoBruto,tNumeroEixo,tpesoR,tmatricula;
	private JRadioButton btgasolina,btdiesel,btgas,btSimples,btSemiR,btFechado,btAberto,btEspecial,btCaravanas;
	private JComboBox boxcor;
	private String tipoMatricula [] = {"     Especial","Normal"};
	private String cor [] = {"     Roxo","Branco","Verde","Azul","Vermelho","Amarelho","Cinza","Preto"};
	private JButton btVoltar,btEmitir;
	private JPanel painelBotoes,painelLigeiroCR,painelRadio,painelRadio1;
	private ButtonGroup btg;
	
	public JanelaLigeiroCR()
	{
		super("Ligerio com Roboque");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		
		aparencia();
		
		painelLigeiroCR = new JPanel (new GridLayout(25,1));
		painelLigeiroCR.setBackground(Color.WHITE);
		
		// marca do carro
		labelmarca = new JLabel ("     Marca de Automevel");
		painelLigeiroCR.add(labelmarca);
		tmarca = new JTextField();
		painelLigeiroCR.add(tmarca);
		
		//modelo carro
		labelmodelo = new JLabel ("     Modelo de Automevel");
		painelLigeiroCR.add(labelmodelo);
		tmodelo = new JTextField();
		painelLigeiroCR.add(tmodelo);
		
		labelmatricula = new JLabel ("     Tipo Matriccula de Automevel");
		painelLigeiroCR.add(labelmatricula);
		tmatricula = new JTextField ();
		painelLigeiroCR.add(tmatricula);
		
		labelanoFabrico = new JLabel("     Ano de Fabrico do Automovel");
		painelLigeiroCR.add(labelanoFabrico);
		tanoFabrico = new JTextField();
		painelLigeiroCR.add(tanoFabrico);
		
		// cor de carro 
		labelcor = new JLabel ("     Cor de Automevel");
		painelLigeiroCR.add(labelcor);
		boxcor = new JComboBox (cor);
		painelLigeiroCR.add(boxcor);
		
		labeldata = new JLabel ("     Data de Automevel");
		painelLigeiroCR.add(labeldata);
		tdata = new JTextField();
		painelLigeiroCR.add(tdata); 
		
		labelTipoCombustivel = new JLabel ("     Tipo de Combustivel de Automovel");
		painelLigeiroCR.add(labelTipoCombustivel);
		 
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
		painelLigeiroCR.add(painelRadio); 
		
		labelNumeroEixo = new JLabel ("     Numero de Eixo de Automovel");
		painelLigeiroCR.add(labelNumeroEixo);
		tNumeroEixo = new JTextField();
		painelLigeiroCR.add(tNumeroEixo);
		
		
	    labeln_passageiro = new JLabel ("     Numero de Passageiro Automovel");
	    painelLigeiroCR.add(labeln_passageiro);
	    tn_passageiro = new JTextField();
	    painelLigeiroCR.add(tn_passageiro);
	    
	    labelpesoBruto = new JLabel ("     Peso Bruto de Automovel");
	    painelLigeiroCR.add(labelpesoBruto);
	    tpesoBruto = new JTextField();
	    painelLigeiroCR.add(tpesoBruto);
	    
	    // tipo roboque
	    labelTipoRoboque = new JLabel ("Tipo de Roboque");
	    painelLigeiroCR.add(labelTipoRoboque);
	    
        painelRadio1 = new JPanel (new FlowLayout());
		 
		btSimples = new JRadioButton ("Simples");
		painelRadio1.add(btSimples);
		
		btSemiR =new JRadioButton ("Semi - Roboque");
		painelRadio1.add(btSemiR);
		
		btFechado= new JRadioButton("Fechado");
		painelRadio1.add(btFechado);
		
		btAberto = new JRadioButton ("Aberto");
		painelRadio1.add(btAberto);
		
		btEspecial = new JRadioButton ("Especial");
		painelRadio1.add(btEspecial);
		
		btCaravanas = new JRadioButton ("Caravanas");
		painelRadio1.add(btCaravanas);
		
		btg = new ButtonGroup();
		btg.add(btSimples);
		btg.add(btSemiR);
		btg.add(btFechado);
		btg.add(btAberto);
		btg.add(btEspecial);
		btg.add(btCaravanas);
		
		painelLigeiroCR.add(painelRadio1); 
		
		labelPesoR = new JLabel ("Peso de Roboque de Automovel");
		painelLigeiroCR.add(labelPesoR);
		tpesoR = new JTextField();
		painelLigeiroCR.add(tpesoR);//
		
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
		painelLigeiroCR.add(painelBotoes);
		
		
		ImageIcon icon = new ImageIcon("E:\\AVP2\\ImageIcon//logo.jpg");
		labelImagem = new JLabel (icon);
	    
	    cont.add(labelImagem,BorderLayout.WEST);
	    cont.add(painelLigeiroCR,BorderLayout.CENTER);
	    
	    
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
		new JanelaLigeiroCR();
	}

}
