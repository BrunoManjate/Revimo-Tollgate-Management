import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
public class SobrePrograma extends JFrame 
{
	private Container cont;
	
		public SobrePrograma()
		{
			super("Sobre Programa");
			cont= getContentPane();
			cont.setLayout(new BorderLayout());
			cont.setBackground(Color.WHITE);
			
			
			String texto ="   O Sistema de Portagem Revimo\n\n"+
				      "   O Presente sistema foi desenvolvida por Rosina HomeWork Solution\n"+
				      "   area de Engerinha Informatica,\n"+
				      "   com conhecimento em programacao na linguagem java e\n"+
				      "   desenvolvimento de interfaces graficos utilizado Swing.\n\n"+
				      
		              "   O Projecto apresenta o desenvolvimento da implementacao das\n"+
		              "   funcionalidades,criacao das interfaces grafica\n"+
		              "   organizacao da estrutura do Logica.\n\n"+
		              
		              "   1.Funcionamento\n"+
		              "   2.Login para registrar  usuario e senha\n"+
		              "   3.Calculos do valor da portagem Revimo\n"+
		              "   4.Quantidade Total de  Veiculo de Ligeiro e Pesado\n"+
		              "   5.Valor Total de cada veiculo \n"+
		              "   6.Quantidade de Ligeiro sem e com Roboque\n"+
		              "   7.Quantidade de Pesado com e sem Atrelado\n"+
		              "   8.Quantidade de Mota\n"+
		              "   e valor de cada Veiculo\n\n"+
		              
		              "   Organizacao de Ficheiro de texto\n"+
		              "   Estrutura correcta das informacoes\n"+
		              "   Visualização de dados em tabelas (JTable)\n"+
		              "   Organização das colunas\n"+
		              "   Apresentação clara das informações\n"+
		              "   Preparação da interface gráfica\n\n"+
		           
		             "   O Sistema, foi desenvolvido com muita pratica.\n"+
		             "   Caso tenha duvida entre em contacto.\n"+
		             "   Contacto : 820736107\n"+
		             "   Email :HomeWork@Solutionsgaiml.com.";
			
			// area de texto
			JTextArea area = new JTextArea(texto);
			area.setEditable(false);//nao pode edital/true pra escrever
			area.setLineWrap(true);//quebrar linha quando chega ao fim
			area.setWrapStyleWord(true);//quebrar linha
			area.setFont(new Font("Arial",Font.PLAIN,14)); //tipo de letra/Font.PLAIN = estilo normal
			//JTextPane (mais avançado)
			//scroll
			JScrollPane scroll = new JScrollPane(area);
			add(scroll);
			
			setSize(500,500);
			setVisible(true);
		             
		}
		public static void main (String 	[] rosina) 
		{
			new SobrePrograma();
		}
		 
}
