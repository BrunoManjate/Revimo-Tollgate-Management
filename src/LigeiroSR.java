
public class LigeiroSR  extends Ligeiro
{
	private double pesoBruto1;
	
	// variaveis Estatistica
	public static int contadorLigeiroSR;

	public LigeiroSR(String marca, String modelo, String matricula, String cor, String data, int anoFabrico,
			String tipoCombustivel, int n_passageiro, int numeroExio, double pesoBruto, double pesoBruto1)
	{
		super(marca, modelo, matricula, cor,data,anoFabrico, tipoCombustivel, n_passageiro, numeroExio, pesoBruto);
		this.pesoBruto1 = pesoBruto1;
		contadorLigeiroSR++;
	}
	
	public LigeiroSR()
	{
		this("","","","","",0,"",0,0,0,0);
		
	}

	public double getPesoBruto1() {
		return pesoBruto1;
	}

	public void setPesoBruto1(double pesoBruto1) {
		this.pesoBruto1 = pesoBruto1;
	}

	public static int getContadorLigeiroSR() {
		return contadorLigeiroSR;
	}

	public static void setContadorLigeiroSR(int contadorLigeiroSR) {
		LigeiroSR.contadorLigeiroSR = contadorLigeiroSR;
	}

	@Override
	public String toString() {
		return "LigeiroSR [pesoBruto1=" + pesoBruto1 + "]";
	}
	
}
