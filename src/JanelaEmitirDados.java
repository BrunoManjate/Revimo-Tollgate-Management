import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JanelaEmitirDados extends JFrame {
	
	private Container cont;
	private JButton btLigeiroSR,btLigeiroCR,btPesadoST,btPesadoCT,btMota,btVoltar;
	private JPanel painelEmitirDados;
	private JLabel labelImagem;
	
	public JanelaEmitirDados ()
	{
		super("Emitir Dados Veiculo");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		
		aparencia();
		
		painelEmitirDados = new JPanel (new GridLayout(6,1));
		painelEmitirDados.setBackground(Color.WHITE);
		
		// Ligeiro sem roboque
		btLigeiroSR = new JButton ("Ligeiro sem Roboque");
		btLigeiroSR.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	     new janela_LigeiroSR();
			        	     dispose();
			        }
				});
		painelEmitirDados.add(btLigeiroSR);
		btLigeiroSR.setBackground(Color.BLACK);
		btLigeiroSR.setForeground(Color.WHITE);
		
		// Ligeiro com roboque
		btLigeiroCR = new JButton ("Ligeiro com Roboque");
		btLigeiroCR.addActionListener(new ActionListener()
				{
					 public void actionPerformed(ActionEvent e)
					 {
					        	new JanelaLigeiroCR();
					        	dispose();
					 }
			     });
		painelEmitirDados.add(btLigeiroCR);
		btLigeiroCR.setBackground(Color.BLACK);
		btLigeiroCR.setForeground(Color.WHITE);
		
		//Pesado sem Atrelado
		btPesadoST = new JButton ("Pesado sem Atrelado");
		btPesadoST.addActionListener(new ActionListener()
				{
					 public void actionPerformed(ActionEvent e)
					 {
						new JanelaPesadoST();
						dispose();
					 }
			     });
		painelEmitirDados.add(btPesadoST);
		btPesadoST.setBackground(Color.BLACK);
		btPesadoST.setForeground(Color.WHITE);
		
		//Pesadom com Atrelado
		btPesadoCT = new JButton ("Pesado com Atrelado");
		btPesadoCT.addActionListener(new ActionListener()
				{
					 public void actionPerformed(ActionEvent e)
					 {
						 new JanelaPesadoCT();
							dispose();
					 }
			     });
		painelEmitirDados.add(btPesadoCT);
		btPesadoCT.setBackground(Color.BLACK);
		btPesadoCT.setForeground(Color.WHITE);
		
		//mota
		//Pesadom com Atrelado
		btMota = new JButton ("Mota");
		btMota.addActionListener(new ActionListener()
						{
							 public void actionPerformed(ActionEvent e)
							 {
								 new  JanelaMota();  
							 }
					     });
		painelEmitirDados.add(btMota);
		btMota.setBackground(Color.BLACK);
		btMota.setForeground(Color.WHITE);
		
		// botao voltar
		btVoltar =new JButton (" Voltar");
		btVoltar.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
			      new Janela_Principal();  	
			 }
	     });
		painelEmitirDados.add(btVoltar);
		btVoltar.setBackground(Color.RED);
		btVoltar.setForeground(Color.WHITE);
		
		ImageIcon icon = new ImageIcon("E:\\AVP2\\ImageIcon//Ligeiro.jpeg");
		labelImagem = new JLabel(icon);
		
		cont.add(painelEmitirDados,BorderLayout.WEST);
		cont.add(labelImagem,BorderLayout.EAST);
		
		// desenho da janela
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
		new JanelaEmitirDados();
	}

}
