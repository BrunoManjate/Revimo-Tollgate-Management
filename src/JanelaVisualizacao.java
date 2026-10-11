import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.*;
import java.awt.event.*;
public class JanelaVisualizacao extends JFrame {
	
	private Container cont;
	private JButton btTodDados,btLigeiroSR,btLigeiroCR,btpesadosT,btpesadoCT,btMota,btvoltar;
	private JPanel painel;
	private JLabel labelImagem;
	private   Tarefas tarefa;
	
	
	public JanelaVisualizacao()
	{
		
		super ("Tabela-Visualizacao");
		cont = getContentPane();
		tarefa = new Tarefas();
		 
         aparencia();
         
        
		
		painel = new JPanel (new GridLayout(6,1));
		painel.setBackground(Color.WHITE);
		 
		 //todos tabela
		btTodDados = new JButton ("Todos dados");
		btTodDados.addActionListener(new ActionListener()
					{
				        public void actionPerformed(ActionEvent e)
				        {
				        	    tarefa.lerDoFicheiro();
				        	    
				        }
					});
		painel.add(btTodDados);
		btTodDados.setBackground(Color.BLACK);
		btTodDados.setForeground(Color.WHITE);
		
		//ligeirosR
		btLigeiroSR = new JButton ("Ligeiros sem Roboque");
		btLigeiroSR.addActionListener(new ActionListener()
					{
				        public void actionPerformed(ActionEvent e)
				        {
				          	tarefa.tabelaLigeiroSR();
				          	//new JanelaLGSRVisualzar();
				        }
					});
		painel.add(btLigeiroSR);
		btLigeiroSR.setBackground(Color.BLACK);
		btLigeiroSR.setForeground(Color.WHITE);
		
		//ligeiro CR
		btLigeiroCR = new JButton ("Ligeiros com Roboque");
		btLigeiroCR.addActionListener(new ActionListener()
					{
				        public void actionPerformed(ActionEvent e)
				        {
				        	    tarefa.tabelaLigeiroCR();
				        }
					});
		painel.add(btLigeiroSR);
		btLigeiroCR.setBackground(Color.BLACK);
		btLigeiroCR.setForeground(Color.WHITE);
		
		//pesado ST
		btpesadosT = new JButton ("Pesado sem Atrelado");
		btpesadosT.addActionListener(new ActionListener()
					{
				        public void actionPerformed(ActionEvent e)
				        {
				        	    tarefa.tabelaPesadoST();
				        }
					});
		painel.add(btpesadosT);
		btpesadosT.setBackground(Color.BLACK);
		btpesadosT.setForeground(Color.WHITE);
		
		//pesado ct
		btpesadoCT = new JButton ("Pesado com Atrelado");
		btpesadoCT.addActionListener(new ActionListener()
					{
				        public void actionPerformed(ActionEvent e)
				        {
				        	    tarefa.tabelaPesadoCT();
				        }
					});
		painel.add(btpesadoCT);
		btpesadoCT.setBackground(Color.BLACK);
		btpesadoCT.setForeground(Color.WHITE);
		
		//mota
		btMota = new JButton ("Mota");
		btMota.addActionListener(new ActionListener()
					{
				        public void actionPerformed(ActionEvent e)
				        {
				        	    tarefa.tabelaMota();
				        }
					});
		painel.add(btMota);
		btMota.setBackground(Color.BLACK);
		btMota.setForeground(Color.WHITE);
		
		//
		btvoltar = new JButton ("Voltar");
		btvoltar.addActionListener(new ActionListener()
					{
				        public void actionPerformed(ActionEvent e)
				        {
				        	    System.exit(0);
				        	    dispose();
				        	    
				        }
					});
		painel.add(btvoltar);
		btvoltar.setBackground(Color.RED);
		btvoltar.setForeground(Color.WHITE);
		
		
		ImageIcon icon = new  ImageIcon();
		labelImagem = new JLabel(icon);
		
		cont.add(painel,BorderLayout.WEST);
		cont.add(labelImagem,BorderLayout.EAST);
		
		
		// desenho da jenela
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
		new JanelaVisualizacao();
	}

}
