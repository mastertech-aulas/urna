package urna;

public class Candidato {

	private String nome;
	private int codigo;
	private int votos;

	public Candidato(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
		this.votos = 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getVotos() {
		return votos;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Candidato() {
		// TODO Auto-generated constructor stub
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	public void adicionarVoto(int voto) {
		this.votos += voto;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Nome: "+this.nome);
		modelo.append("\n");
		modelo.append("Codigo: "+this.codigo);
		modelo.append("\n");
		modelo.append("Votos: "+this.votos);
		return modelo.toString();
	}
}
