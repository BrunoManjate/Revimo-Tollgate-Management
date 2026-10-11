public class PesadoCT extends Pesado
{
	
	private double pesoAtrelado;//
	private double comprimentoTrelado;
	
	public static int contadorPesadoCT;

	public PesadoCT(String marca, String modelo, String matricula, String cor, String data,int anoFabrico,
			String tipoCombustivel, int numEixo, double pesoBruto2, double cargaMaxima, String tipoCarga,boolean cargaPerigosa,
			double pesoAtrelado, double comprimentoTrelado)
	{
		super(marca, modelo, matricula, cor,data, anoFabrico, tipoCombustivel, numEixo, pesoBruto2, cargaMaxima,
				tipoCarga,cargaPerigosa);
		
		this.pesoAtrelado = pesoAtrelado;
		this.comprimentoTrelado = comprimentoTrelado;
		contadorPesadoCT++;
	}
	
	public PesadoCT()
	{
		this("","","","","",0,"",0,0,0,"",false,0,0);
	}

	public double getPesoAtrelado() {
		return pesoAtrelado;
	}

	public void setPesoAtrelado(double pesoAtrelado) {
		this.pesoAtrelado = pesoAtrelado;
	}

	public double getComprimentoTrelado() {
		return comprimentoTrelado;
	}

	public void setComprimentoTrelado(double comprimentoTrelado) {
		this.comprimentoTrelado = comprimentoTrelado;
	}

	public static int getContadorPesadoCT() {
		return contadorPesadoCT;
	}

	public static void setContadorPesadoCT(int contadorPesadoCT) {
		PesadoCT.contadorPesadoCT = contadorPesadoCT;
	}

	@Override
	public String toString() {
		return "PesadoCT [PesoAtrelado=" + pesoAtrelado + ", comprimentoTrelado=" + comprimentoTrelado + "]";
	}
	
	
}