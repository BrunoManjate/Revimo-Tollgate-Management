
public class Carro {
	
	protected String marca;
	protected String modelo;
	protected String matricula;
	protected String cor;
	protected String data;
	protected int anoFabrico;
	protected String tipoCombustivel;
	
	// variaveis estaticas
	public static int contadorCarro;

	//construtor
	public Carro(String marca, String modelo, String matricula, String cor, int anoFabrico, String data,
			String tipoCombustivel) 
	{
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.data = data;
		this.anoFabrico = anoFabrico;
		this.cor = cor;
		this.tipoCombustivel = tipoCombustivel;
		contadorCarro++;
	}
	
	public Carro()
	{
	   this("","","","",0,"","");	
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getAnoFabrico() {
		return anoFabrico;
	}

	public void setAnoFabrico(int anoFabrico) {
		this.anoFabrico = anoFabrico;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public static int getContadorCarro() {
		return contadorCarro;
	}

	public static void setContadorCarro(int contadorCarro) {
		Carro.contadorCarro = contadorCarro;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", cor=" + cor + ", data="
				+ data + ", anoFabrico=" + anoFabrico + ", tipoCombustivel=" + tipoCombustivel + "]";
	}
	
}
