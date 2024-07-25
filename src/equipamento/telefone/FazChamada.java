package equipamento.telefone;

public interface FazChamada {
	public void atender();
	public void iniciarCorreioVoz();
	public String ligar(String numero);
}
