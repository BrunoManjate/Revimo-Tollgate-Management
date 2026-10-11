import javax.swing.JOptionPane;
public class Calculos {
	
	// quantidade total do ligeiro sem roboque
	public static float total_LigeiroSR(Carro[]carros,int contador)
	{
		float total =0;
		
		for(int i = 0;i<contador;i++)
		{
			if(carros[i] instanceof LigeiroSR)
			{
			   LigeiroSR s = (LigeiroSR)carros[i];
			   total += 100 +(0.05*s.getPesoBruto1());
			}
		}
		
		return total;
		
	}
	// quantidade e total de Ligeiro sem reboque;
	public void total_LigeirosSR( float totalLS)
	{
		JOptionPane.showMessageDialog(null,"O valor total de Ligeiro sem Roboque :"+totalLS);
		
	}
	
	public static float total_LigeiroCR(Carro[]carros,int contador)
	{
		float  total = 0;
		
		for(int i =0;i<contador;i++)
		{
			if(carros[i]instanceof LigeiroCR)
			{
				LigeiroCR c = (LigeiroCR)carros[i];
				total += 150+(0.07*c.getPesoRoboque());
			}
		}
		
		return total;
	}
	
	// quantidade e total de Ligeiro com reboque;
	public void total_LigeirosCR(float totalR)
	{
		JOptionPane.showMessageDialog(null,"O valor total de Ligeiro com Roboque :"+totalR);
			
	}

	//quantidade total de pesado
	public static float total_PesadoCT(Carro [] carros,int contador)
	{
		float total =0;
		
		for(int i = 0; i<contador;i++)
		{
			if(carros[i]instanceof PesadoCT)
			{
				PesadoCT c = (PesadoCT)carros[i];
				total +=300+(0.5*c.getPesoAtrelado());
				
			}
		}
		
		return total;
	}
	//visualizar a quantidade
	public void total_PesadoCT(float totalct)
	{
		JOptionPane.showMessageDialog(null, "Valor total de pesado com Atrelado: "+totalct);
	}
	public static float total_PesadoST(Carro[]carros,int contador)
	{
		float total =0;
		
		for(int i =0;i<contador;i++)
		{
			if(carros[i] instanceof PesadoST)
			{
				PesadoST s = (PesadoST)carros[i];
				total +=500+(0.1*s.getCarga());
						
			}
		}
		
		return total;
	}
	
	//visualizar a total peasado sem atrelado
	public void total_PesadoST(float totalPS)
	{
		JOptionPane.showMessageDialog(null, "Valor total de pesado com Atrelado: "+totalPS);
	}
	
	public static float total_Mota(Carro[]carros,int contador)
	{
		float total = 0;
		
		for(int i =0;i<contador;i++)
		{
			if(carros[i]instanceof Mota)
			{
				Mota m = (Mota)carros[i];
				
				if(m.getCilindrada()==125)
				{
					total +=50;
				}
				else
				{
					if(m.getCilindrada()==151)
					{
						total +=75;	
					}
					else {
						total +=500;
					}
					
				}
			}
			
			
			
		}
		
		return total;
	}
	
	public  void total_Mota (float totalM)
	{
		JOptionPane.showMessageDialog(null, "O valor total de Mota"+totalM);
	}
	
	public static float  ValorTotalVeiculo(float totalLS,float totalR, float totalct,float totalPS, float totalM )
	{
		return totalLS +totalR+totalct+totalPS+totalM;
		
	}
	
	
	
}
