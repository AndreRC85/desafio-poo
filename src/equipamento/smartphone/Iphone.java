package equipamento.smartphone;

import equipamento.navegadorInternet.Navegador;
import equipamento.reprodutorMusical.Reprodutor;
import equipamento.telefone.FazChamada;

public class Iphone implements Navegador, Reprodutor, FazChamada{

	@Override
	public void atender() {
		System.out.println("Atendendo - via Iphone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz - via Iphone");
	}

	@Override
	public String ligar(String numero) {
		return "Ligando: " + numero + " - via Iphone";
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica - via Iphone");
	}

	@Override
	public void pausar() {
		System.out.println("Pause musica - via Iphone");		
	}

	@Override
	public String selecionarMusica(String musica) {
		return "Selecionando Musica: " + musica + " - via Iphone";
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba navegador - via Iphone");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualiza pagina - via Iphone");
	}

	@Override
	public String exibirPagina(String url) {
		return "Pagina: " + url + " - via Iphone";
	}

}
