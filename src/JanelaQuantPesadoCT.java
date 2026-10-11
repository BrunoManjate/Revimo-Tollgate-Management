import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.*;
public class JanelaQuantPesadoCT  extends JFrame
{
	private Container cont;
	private JButton btQuantidade,btvalor,btvoltar;
	private JPanel painel;
	private JLabel labelimagem;
	
	public JanelaQuantPesadoCT() 
	{
		super("Quantidade Pesado com  Atrelado ");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		
		aparencia();
		
		
		painel = new JPanel (new GridLayout(3,1));
		painel.setBackground(Color.WHITE);
		
		 //quantidade
		btQuantidade = new JButton ("Quandidade Pesado");
		btQuantidade.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    JOptionPane.showMessageDialog(null,"Quantidade de carro Pesado com Atrelado: "+PesadoCT.contadorPesadoCT);
			        	
			        }
				});
		painel.add(btQuantidade);
		btQuantidade.setBackground(Color.BLACK);
		btQuantidade.setForeground(Color.WHITE);
		
		//valor
		btvalor = new JButton ("Valor de Pesado ");
		btvalor.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent e)
	        {
	        	    JOptionPane.showMessageDialog(null,"Valor de carro Pesado com Atrelado: ");
	        	
	        }
		});
		painel.add(btvalor);
		btvalor.setBackground(Color.BLACK);
		btvalor.setForeground(Color.WHITE);

		//valor
		btvoltar = new JButton ("Voltar");
		painel.add(btvoltar);
		btvoltar.setBackground(Color.RED);
		btvoltar.setForeground(Color.WHITE);
		
		ImageIcon icon = new ImageIcon("E:\\AVP2\\ImageIcon//Contabilidade.jpg");
		labelimagem = new JLabel(icon);
		
		
								
		
		cont.add(labelimagem,BorderLayout.EAST);
		cont.add(painel,BorderLayout.WEST);
		
		//desenho da janela
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
		new JanelaQuantPesadoCT();
	}

}
