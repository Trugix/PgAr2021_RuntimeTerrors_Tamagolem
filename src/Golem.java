import java.util.ArrayList;

public class Golem
{
	public final static int VITA_MAX = 30;

	private String nome;
	private int vita;
	//private ArrayList<Elementi> stones = new ArrayList<>();
	private int selectedStone = 0; // indice della pietra selezionata

	public Golem(String nome /*,arraylist stones*/) {
		this.nome = nome;
		this.vita = VITA_MAX;
		//this.stones=stones;
	}
	
	public boolean isMorto()
	{
		return isMorto;
	}
	
	public void setIsMorto(boolean isMorto)
	{
		this.isMorto = isMorto;
	}

	public String getNome() {
		return nome;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
