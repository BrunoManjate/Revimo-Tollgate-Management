
public class Ligeiro extends Carro {
	
	protected int n_passageiro;
	protected int numeroExio;
	protected double pesoBruto;
	
	public static int contadorLigeiro;

	//constutor
	public Ligeiro(String marca, String modelo, String matricula, String cor, String data, int anoFabrico,
			String tipoCombustivel,int n_passageiro,int numeroExio, double pesoBruto) 
	{
		super(marca, modelo, matricula, cor, anoFabrico, data, tipoCombustivel);
		this.n_passageiro=n_passageiro;
		this.numeroExio=numeroExio;
		this.pesoBruto=pesoBruto;
		
	}
	public Ligeiro()
	{
		this("","","","","",0,"",0,0,0);
	}
	public int getN_passageiro() {
		return n_passageiro;
	}
	public void setN_passageiro(int n_passageiro) {
		this.n_passageiro = n_passageiro;
	}
	public int getNumeroExio() {
		return numeroExio;
	}
	public void setNumeroExio(int numeroExio) {
		this.numeroExio = numeroExio;
	}
	public double getPesoBruto() {
		return pesoBruto;
	}
	public void setPesoBruto(double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	public static int getContadorLigeiro() {
		return contadorLigeiro;
	}
	public static void setContadorLigeiro(int contadorLigeiro) {
		Ligeiro.contadorLigeiro = contadorLigeiro;
	}
	@Override
	public String toString() {
		return "Ligeiro [n_passageiro=" + n_passageiro + ", numeroExio=" + numeroExio + ", pesoBruto=" + pesoBruto
				+ "]";
	}
	
}
