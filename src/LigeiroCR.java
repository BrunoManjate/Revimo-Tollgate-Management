
public class LigeiroCR extends Ligeiro {
	
	private String tipoRoboque;
	private double pesoRoboque;
	
	// variaveis Estatistica
	public static int contadorLigeiroCR;

	public LigeiroCR(String marca, String modelo, String matricula, String cor, String data, int anoFabrico,
			String tipoCombustivel, int n_passageiro, int numeroExio, double pesoBruto, String tipoRoboque,
			double pesoRoboque) 
	{
		super(marca, modelo, matricula, cor,data ,anoFabrico, tipoCombustivel, n_passageiro, numeroExio, pesoBruto);
		this.tipoRoboque = tipoRoboque;
		this.pesoRoboque = pesoRoboque;
		contadorLigeiroCR++;
	}
	
	public LigeiroCR()
	{
		this("","","","","",0,"",0,0,0,"",0);
		
	}
	
	// get e set

	public String getTipoRoboque() {
		return tipoRoboque;
	}

	public void setTipoRoboque(String tipoRoboque) {
		this.tipoRoboque = tipoRoboque;
	}

	public double getPesoRoboque() {
		return pesoRoboque;
	}

	public void setPesoRoque(double pesoRoque) {
		this.pesoRoboque = pesoRoboque;
	}

	public static int getContadorLigeiroCR() {
		return contadorLigeiroCR;
	}

	public static void setContadorLigeiroCR(int contadorLigeiroCR) {
		LigeiroCR.contadorLigeiroCR = contadorLigeiroCR;
	}

	@Override
	public String toString() {
		return "LigeiroCR [tipoRoboque=" + tipoRoboque + ", pesoRoque=" + pesoRoboque + "]";
	}
	
}
