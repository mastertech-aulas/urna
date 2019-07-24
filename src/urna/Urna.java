package urna;

import java.util.ArrayList;
import java.util.List;

public class Urna {
	
	private List<Candidato> candidatos = new ArrayList<Candidato>();

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
	public String adicionarCandidato(Candidato candidato) {
		this.candidatos.add(candidato);
		return "Candidato adicionado";
	}
	
	public Candidato procurarCandidato(int codigo) {
		Candidato candidato = null;
		
		for (Candidato c : candidatos) {
			if(c.getCodigo() == codigo) {
				candidato = c;
			}
		}
		return candidato;
	}
}
