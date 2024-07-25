package equipamento.telefone;

public class Phone implements FazChamada{

	@Override
	public void atender() {
		System.out.println("Atender chamada");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz");
	}

	@Override
	public String ligar(String numero) {
		return "Ligando: " + numero;
	}

}
