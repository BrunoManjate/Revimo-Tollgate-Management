
public class Pesado extends Carro{
	
	protected int numEixo;
	protected double pesoBruto2;
	protected double cargaMaxima;
	protected String tipoCarga;
	protected boolean cargaPerigosa;
	
	public static int contadorpesado;
	
	// variaveis Estaticas
	public Pesado(String marca, String modelo, String matricula, String cor, String data,int anoFabrico,
			String tipoCombustivel, int numEixo, double pesoBruto2, double cargaMaxima, String tipoCarga,boolean cargaPerigosa) 
	{
		super(marca, modelo, matricula, cor, anoFabrico, data, tipoCombustivel);
		this.numEixo = numEixo;
		this.pesoBruto2 = pesoBruto2;
		this.cargaMaxima = cargaMaxima;
		this.tipoCarga = tipoCarga;
		this.cargaPerigosa=cargaPerigosa;
		contadorpesado++;
	} 
	
	public Pesado()
	{
		this("","","","","",0,"",0,0,0,"",false);
	}

	public int getNumEixo() {
		return numEixo;
	}

	public void setNumEixo(int numEixo) {
		this.numEixo = numEixo;
	}

	public double getPesoBruto2() {
		return pesoBruto2;
	}

	public void setPesoBruto2(double pesoBruto2) {
		this.pesoBruto2 = pesoBruto2;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	
	public boolean getCargaPerigosa() {
		return cargaPerigosa;
	}

	public void setCargaPerigosa(boolean cargaPerigosa) {
		this.cargaPerigosa = cargaPerigosa;
	}

	@Override
	public String toString() {
		return "Pesado [numEixo=" + numEixo + ", pesoBruto2=" + pesoBruto2 + ", cargaMaxima=" + cargaMaxima
				+ ", tipoCarga=" + tipoCarga + ", cargaPerigosa=" + cargaPerigosa + "]";
	}

	
	
}
