package equipamento.navegadorInternet;

public class Internet implements Navegador{

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
		
	}

	@Override
	public String exibirPagina(String url) {
		return "Exibindo página: " + url;
	}

}
