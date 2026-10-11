public class PesadoST extends Pesado {
	
	private int carga;
	
	public static int contadorPesadoST;

	public PesadoST(String marca, String modelo, String matricula, String cor, String data, int anoFabrico,
			String tipoCombustivel, int numEixo, double pesoBruto2, double cargaMaxima, String tipoCarga,boolean cargaPerigosa ,int carga)
	{
		super(marca, modelo, matricula, cor, data,anoFabrico, tipoCombustivel, numEixo, pesoBruto2, cargaMaxima,
				tipoCarga,cargaPerigosa);
		
		this.carga = carga;
		contadorPesadoST++;
	}
	
	public PesadoST()
	{
		this("","","","","",0,"",0,0,0,"",false,0);
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public static int getContadorPesadoST() {
		return contadorPesadoST;
	}

	public static void setContadorPesadoST(int contadorPesadoST) {
		PesadoST.contadorPesadoST = contadorPesadoST;
	}

	@Override
	public String toString() {
		return "PesadoST [carga=" + carga + "]";
	}
	
	
	
}