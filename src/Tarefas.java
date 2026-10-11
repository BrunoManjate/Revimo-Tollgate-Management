import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Tarefas {
	
	private Carro [] carros;
	private int contador;
	private Ligeiro L;
	private LigeiroSR LS;
	private LigeiroCR LR;
	private Pesado P;
	private PesadoST ST;
	private PesadoCT CT;
	private Mota M;
	private Calculos cal;
	
	
	// constuir ou istancia
	public Tarefas()
	{
		carros = new Carro[300];
		contador = 0;
		L = new Ligeiro();
		LS= new LigeiroSR();
		LR = new LigeiroCR();
		
		
		P = new Pesado();
		ST = new PesadoST();
		CT = new PesadoCT();
		M = new Mota();
		
		cal = new Calculos();
		
	}
	
	//ler do Ficheiro
	public void lerDoFicheiro()
	{
		String linha;
		try(BufferedReader br = new BufferedReader(new FileReader("ficheiro.txt")))
		{
			while((linha = br.readLine()) !=null)
			{
				StringTokenizer st = new StringTokenizer(linha,";");
				
				String marca = st.nextToken();
				String modelo = st.nextToken();
				String matricula = st.nextToken();
				String cor = st.nextToken();
				String data = st.nextToken();
				int anoFabrico = Integer.parseInt(st.nextToken());
				String tipoCombustivel = st.nextToken();
				String criterio = st.nextToken();

				if(criterio.equalsIgnoreCase("l"))
				{
					int n_passageiro = Integer.parseInt(st.nextToken());
					int numeroExio = Integer.parseInt(st.nextToken());
					double pesoBruto = Double.parseDouble(st.nextToken());
					carros[contador++] = new Ligeiro(marca,modelo,matricula,cor,data,anoFabrico,tipoCombustivel,n_passageiro,numeroExio,pesoBruto);
				    String criteriol = st.nextToken();
					
				       if(criteriol.equalsIgnoreCase("ls"))
					{
						double pesoBruto1 = Double.parseDouble(st.nextToken());
						carros[contador++] = new LigeiroSR(marca,modelo,matricula,cor,data,anoFabrico,tipoCombustivel, n_passageiro, numeroExio,pesoBruto,pesoBruto1);
					}else
					{
						if(criteriol.equalsIgnoreCase("lc"))
						{
							String tipoRoboque = st.nextToken();
							double pesoRoboque = Double.parseDouble(st.nextToken());
							carros[contador++] = new LigeiroCR(marca,modelo,matricula,cor,data,anoFabrico,tipoCombustivel,n_passageiro,numeroExio,pesoBruto,tipoRoboque,pesoRoboque);
						}

					}


				}else
				{
					if(criterio.equalsIgnoreCase("p"))
					{
						int numEixo = Integer.parseInt(st.nextToken());
						double pesoBruto2 = Double.parseDouble(st.nextToken());
						double cargaMaxima = Double.parseDouble(st.nextToken());
						String tipoCarga = st.nextToken();
						boolean cargaPerigosa = Boolean.parseBoolean(st.nextToken());
						carros[contador++] = new Pesado(marca,modelo,matricula,cor,data,anoFabrico,tipoCombustivel,numEixo,pesoBruto2,cargaMaxima,tipoCarga,cargaPerigosa);
					        
				                String criteriop = st.nextToken();
						if(criteriop.equalsIgnoreCase("pc"))
						{
							double pesoAtrelado = Double.parseDouble(st.nextToken());
						    double comprimentoTrelado = Double.parseDouble(st.nextToken());
							carros[contador++] = new PesadoCT(marca,modelo,matricula,cor,data,anoFabrico,tipoCombustivel,numEixo,pesoBruto2,cargaMaxima,tipoCarga,cargaPerigosa,pesoAtrelado,comprimentoTrelado);
						}else
						{
							if(criteriop.equalsIgnoreCase("ps"))
							{
								int carga = Integer.parseInt(st.nextToken());
								carros[contador++] = new PesadoST(marca,modelo,matricula,cor,data,anoFabrico,tipoCombustivel,numEixo,pesoBruto2,cargaMaxima,tipoCarga,cargaPerigosa,carga);
							}
						}
				        }else
					{
						if(criterio.equalsIgnoreCase("M"))
						{
							String tipoMota = st.nextToken();
							int cilindrada = Integer.parseInt(st.nextToken());
							boolean temSedicar = Boolean.parseBoolean(st.nextToken());
							carros[contador++] = new Mota (marca,modelo,matricula,cor,data,anoFabrico,tipoCombustivel,tipoMota,cilindrada,temSedicar);
						}
					}
				}
//===========================================lerDoFicheiro=========================================================	
			}
			br.close();
			
		}catch(FileNotFoundException fex)
		{
			System.out.println("O ficheiro nao encontrado");
		}
		catch(IOException e)
		{
			System.out.println("Erro: "+e.getMessage());
		}
		catch(NumberFormatException n)
		{
			System.out.println(n.getMessage());
		}
		
	}
	// quantidade de ligeiro
	public void quantidade_ligeiro()
	{
		JOptionPane.showMessageDialog(null,"A quantidade de carros ligeiro : " +L.contadorLigeiro);
	}
	//L sem roboque
	public void quantidade_ligeiroSR()
	{
		JOptionPane.showMessageDialog(null," A quantidade de carros de ligeiro sem roboque"+LS.contadorLigeiroSR);
	}
	// LCom roboque
	public void quantidade_ligeiroCR()
	{
		JOptionPane.showMessageDialog(null," A quantidade de carros de ligeiro sem roboque"+LR.contadorLigeiroCR);
	}
	
	// quantidade de pesado
	public void quantidade_Pesado()
	{
		JOptionPane.showMessageDialog(null,"A quantidade de carros Pesado: "+P.contadorpesado);
	}
	// quantidade de pesado st
	{
		JOptionPane.showMessageDialog(null,"A quantidade de carros Pesado: "+ST.contadorPesadoST);
	}
	    
	//quantidade de pesado ct
	{
		JOptionPane.showMessageDialog(null,"A quantidade de carros Pesado: "+CT.contadorPesadoCT);
	}
	
	//
	public void quantidade_Mota()
	{
		JOptionPane.showMessageDialog(null,"Quantidade de mota"+M.contadorMota);
	}
	
	// quantidade total ligeiro
	public void quantidadeTotal_Ligeiro()
	{
		JOptionPane.showMessageDialog(null,"quantidade Total de ligeiro"+(LS.contadorLigeiro+LS.contadorLigeiro));
	}
	// quantidade total de Pesado
	public void quantidadeTotal_Pesado()
	{
		JOptionPane.showMessageDialog(null,"quntidade Total de pesado"+(ST.contadorPesadoST+CT.contadorPesadoCT));
	}
	
	//visualizar CalculosS
	public void ValorTotalLigeiroSR()
	{
		JOptionPane.showMessageDialog(null,"O valor de Ligeiro sem Roboque: "+cal.total_LigeiroSR(carros, contador));
	}
	
	
	//tabela geral
	public void tabelaGeral()
	{
		new Visualizacoes( carros,contador); 	
	}
	
	//tabela ligeiro SR
	
	public void tabelaLigeiroSR()
	{
		new JanelaLGSRVisualzar(carros,contador);
	}
	
	// tabela ligeiro CR
	public void tabelaLigeiroCR()
	{
		new JanelaLGCRVisualizar(carros,contador);
	}
	
	//tabela de pesado st
	public void tabelaPesadoST()
	{
		new  JanelaPSVisualizar(carros,contador);
	}
	
	//tabela pesado sem ct
	public void tabelaPesadoCT()
	{
		new JanelaPCTVisualizar(carros,contador);
	}
	
	// mota
	public void tabelaMota()
	{
		new JenelaMotaVisualizar(carros,contador);
	}
	

}
