package central;

import equipamento.navegadorInternet.Navegador;
import equipamento.reprodutorMusical.Reprodutor;
import equipamento.smartphone.Iphone;
import equipamento.telefone.FazChamada;

public class Central {
	public static void main(String[] args) {
		Iphone  iphoneX = new Iphone();
		Navegador navegador = iphoneX;
		Reprodutor reprodutor = iphoneX;
		FazChamada fazChamada = iphoneX;
		
		navegador.adicionarNovaAba();
		String paginaUrl = navegador.exibirPagina("www.google.com");
		System.out.println(paginaUrl);
		
		String Novamusica = reprodutor.selecionarMusica("Raimundos - A mais pedida");
		System.out.println(Novamusica);
		
		fazChamada.iniciarCorreioVoz();
		String chamada = fazChamada.ligar("33333333");
		System.out.println(chamada);
	}

}