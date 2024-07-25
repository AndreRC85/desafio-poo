package equipamento.reprodutorMusical;

public class Ipod implements Reprodutor{

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		}

	@Override
	public void pausar() {
		System.out.println("Pausando Música");
	}

	@Override
	public String selecionarMusica(String musica) {
		return "Selecionando: " + musica;
	}

}
