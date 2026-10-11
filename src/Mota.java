
public class Mota extends Carro
{
	private String tipoMota;
	private int cilindrada;
	private  boolean temSedicar;
	
	public static int contadorMota;
	
	
	public Mota(String marca, String modelo, String matricula, String cor, String data, int anoFabrico,
			String tipoCombustivel, String tipoMota, int cilindrada, boolean temSedicar)
	{
		super(marca, modelo, matricula, cor, anoFabrico, data, tipoCombustivel);
		this.tipoMota = tipoMota;
		this.cilindrada = cilindrada;
		this.temSedicar = temSedicar;
		contadorMota++;
	}
	
	public Mota()
	{
		this("","","","","",0,"","",0,false);
	}

	public String getTipoMota() {
		return tipoMota;
	}

	public void setTipoMota(String tipoMota) {
		this.tipoMota = tipoMota;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public boolean isTemSedicar() {
		return temSedicar;
	}

	public void setTemSedicar(boolean temSedicar) {
		this.temSedicar = temSedicar;
	}

	public static int getContadorMota() {
		return contadorMota;
	}

	public static void setContadorMota(int contadorMota) {
		Mota.contadorMota = contadorMota;
	}

	@Override
	public String toString() {
		return "Mota [tipoMota=" + tipoMota + ", cilindrada=" + cilindrada + ", temSedicar=" + temSedicar + "]";
	}
	
	
	
	
	
	
	
}