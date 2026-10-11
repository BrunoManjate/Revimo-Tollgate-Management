import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JanelaValorTotalRevimo  extends JFrame
{
	
	private Container cont;
	private JButton btvaltLS,btvalLC,btvalPST,btvalPCT,btVal,btMota,btvoltar;
	private JPanel painelValT;
	private JLabel labelimagem;
	private Tarefas tarefa;
	
	public JanelaValorTotalRevimo()
	{
		super("Valor Total Revimo");
		cont = getContentPane();
		cont.setBackground(Color.WHITE);
		
		 tarefa = new Tarefas();
		
		painelValT = new JPanel(new GridLayout(7,1));
		painelValT.setBackground(Color.WHITE);
		
		//valor total de L
		btvaltLS = new JButton ("Valor Total de Ligeiro sem Roboque");
		btvaltLS.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    tarefa.ValorTotalLigeiroSR();
			        }
				});
		painelValT.add(btvaltLS);
		btvaltLS.setBackground(Color.BLACK);
		btvaltLS.setForeground(Color.WHITE);
		
		///valor total de LCR
		btvalLC = new JButton ("Valor Total de Ligeiro com Roboque");
		btvalLC.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    JOptionPane.showMessageDialog(null,"Valor Total de Ligeiro com Roboque");
			        }
				});
		painelValT.add(btvalLC);
		btvalLC.setBackground(Color.BLACK);
		btvalLC.setForeground(Color.WHITE);
		
		//valor total de pST
		btvalPST = new JButton ("Valor Total de Pesado sem Atrelado");
		btvalPST.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    JOptionPane.showMessageDialog(null,"Valor Total de Pesado sem Atrelado");
			        }
				});
		painelValT.add(btvalPST);
		btvalPST.setBackground(Color.BLACK);
		btvalPST.setForeground(Color.WHITE);
		
		//val PCT
		btvalPCT = new JButton ("Valor Total de Pesado sem Atrelado");
		btvalPCT.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    JOptionPane.showMessageDialog(null,"Valor Total de Pesado com Atrelado");
			        }
				});
		painelValT.add(btvalPCT);
		btvalPCT.setBackground(Color.BLACK);
		btvalPCT.setForeground(Color.WHITE);
		//valor da mota
		btMota = new JButton ("Valor Total de Pesado sem Atrelado");
		btMota.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    JOptionPane.showMessageDialog(null,"Valor Total de Mota");
			        }
				});
		painelValT.add(btMota);
		btMota.setBackground(Color.BLACK);
		btMota.setForeground(Color.WHITE);
		
		//valor total 
		btVal = new JButton ("Valor Total ");
		btVal.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    JOptionPane.showMessageDialog(null,"Valor Total da portagem ");
			        }
				});
		painelValT.add(btVal);
		btVal.setBackground(Color.BLACK);
		btVal.setForeground(Color.WHITE);
		
		//valtar
		btvoltar = new JButton ("Voltar ");
		btvoltar.addActionListener(new ActionListener()
				{
			        public void actionPerformed(ActionEvent e)
			        {
			        	    
			        }
				});
		painelValT.add(btvoltar);
		btvoltar.setBackground(Color.RED);
		btvoltar.setForeground(Color.WHITE);
		
		
		ImageIcon icon = new ImageIcon("E:\\AVP2\\ImageIcon//Contabilidade.jpg");
		labelimagem = new JLabel(icon);
		
		
		cont.add(labelimagem,BorderLayout.EAST);
		cont.add(painelValT,BorderLayout.WEST);
		
		//desnho da janela
		setSize(1200,700);
		setVisible(true);
	}
	public static void main (String []args)
	{
		new JanelaValorTotalRevimo();
	}

}
