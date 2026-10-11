import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.*;
public class JanelaPesadoST extends JFrame 
{
	
	private Container cont;
	private JLabel labelmarca,labelmodelo,labelmatricula,labelanoFabrico,labelcor,labeldata,labelTipoCombustivel,
	labelnumeroEixo,labelpesoBruto,labelCarga,labelImagem;
	private JTextField  tmarca,tmodelo,tmatricula,tanoFabrico,tdata,tpesoBruto,tNumeroEixo,tCarga;
	private JRadioButton btgasolina,btdiesel,btgas,btMercadoria,btCombustivel,btMadeira,btCarga;
	private JComboBox boxcor;
	//private String tipoMatricula [] = {"     Especial","Normal"};
	private String cor [] = {"     Roxo","Branco","Verde","Azul","Vermelho","Amarelho","Cinza","Preto"};
	private JButton btVoltar,btEmitir;
	private JPanel painelBotoes,painelPeasodoCT,painelRadio,painelRadio1;
	private ButtonGroup btg;
	
	public JanelaPesadoST()
	{
		super("Pesado sem Atrelado");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		
		aparencia();
		
		painelPeasodoCT = new JPanel (new GridLayout(21,1));
		painelPeasodoCT.setBackground(Color.WHITE);
		
		// marca do carro
		labelmarca = new JLabel ("     Marca de Automevel");
		painelPeasodoCT.add(labelmarca);
		tmarca = new JTextField();
		painelPeasodoCT.add(tmarca);
		
		//modelo carro
		labelmodelo = new JLabel ("     Modelo de Automevel");
		painelPeasodoCT.add(labelmodelo);
		tmodelo = new JTextField();
		painelPeasodoCT.add(tmodelo);
		
		labelmatricula = new JLabel ("     Tipo Matriccula de Automevel");
		painelPeasodoCT.add(labelmatricula);
		tmatricula = new JTextField();
		painelPeasodoCT.add(tmatricula);
		
		labelanoFabrico = new JLabel("     Ano de Fabrico do Automovel");
		painelPeasodoCT.add(labelanoFabrico);
		tanoFabrico = new JTextField();
		painelPeasodoCT.add(tanoFabrico);
		
		// cor de carro 
		labelcor = new JLabel ("     Cor de Automevel");
		painelPeasodoCT.add(labelcor);
		boxcor = new JComboBox (cor);
		painelPeasodoCT.add(boxcor);
		
		labeldata = new JLabel ("     Data de Automevel");
		painelPeasodoCT.add(labeldata);
		tdata = new JTextField();
		painelPeasodoCT.add(tdata); 
		
		labelTipoCombustivel = new JLabel ("     Tipo de Combustivel de Automovel");
		painelPeasodoCT.add(labelTipoCombustivel);
		 
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
		painelPeasodoCT.add(painelRadio); 
		
		labelnumeroEixo = new JLabel ("     Numero de Eixo de Automovel");
		painelPeasodoCT.add(labelnumeroEixo);
		tNumeroEixo = new JTextField();
		painelPeasodoCT.add(tNumeroEixo);
		
		//peso Bruto
	    labelpesoBruto = new JLabel ("     Peso Bruto de Automovel");
	    painelPeasodoCT.add(labelpesoBruto);
	    tpesoBruto = new JTextField();
	    painelPeasodoCT.add(tpesoBruto);
	    
	    labelCarga = new JLabel ("     Carga");
	    painelPeasodoCT.add(labelCarga);
	    
        painelRadio1 = new JPanel (new FlowLayout());
		 
		btMercadoria = new JRadioButton ("Mercadoria");
		painelRadio1.add(btMercadoria);
		
		btCombustivel =new JRadioButton ("Combustivel");
		painelRadio1.add(btCombustivel);
		
		btMadeira= new JRadioButton("Madeira");
		painelRadio1.add(btMadeira);
		
		btCarga = new JRadioButton ("Carga");
		painelRadio1.add(btCarga);
		
		btg = new ButtonGroup();
		btg.add(btMercadoria);
		btg.add(btCombustivel);
		btg.add(btMadeira);
		btg.add(btCarga);
		painelPeasodoCT.add(painelRadio1);
		
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
		painelPeasodoCT.add(painelBotoes);
		
		
		ImageIcon icon = new ImageIcon("E:\\AVP2\\ImageIcon//logo.jpg");
		labelImagem = new JLabel (icon);
	    
	    cont.add(labelImagem,BorderLayout.WEST);
	    cont.add(painelPeasodoCT,BorderLayout.CENTER);
	    
	    
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
		new JanelaPesadoST();
	}

}
