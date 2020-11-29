import java.util.ArrayList;

public class Leilao {
	private String nome;
	private ArrayList<Lance> lances = new ArrayList<Lance>();
	
	public Leilao(String nome) {
		this.setNome(nome);
	}

	public void addLance(Lance lance) {
		lances.add(lance);
	}

	public ArrayList<Lance> getLances() {
		return lances;
	}

	public void setLances(ArrayList<Lance> lances) {
		this.lances = lances;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
