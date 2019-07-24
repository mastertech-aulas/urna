package urna;

public class Sistema {

	public static void run() {
		Urna urna = new Urna();
		urna.adicionarCandidato(new Candidato("Vinicius", 13));

		boolean controle = true;

		while (controle == true) {
			
			int resposta = IO.menu();

			if (resposta == 1) {
				Candidato candidato = urna.procurarCandidato(IO.pegarVoto());
				if(candidato == null) {
					IO.print("Candidato não registrado");
				}else {
					candidato.adicionarVoto(1);
					IO.printCandidato(candidato);
				}
				
			}else if(resposta == 2) {
				
				controle = false;
			}

		}

	}
}
