package servicosgerais_dto.ResponseUtil;

public class PacoteResposta {
	private PacoteEnvio pacote;
	private String hash;
	
	public PacoteResposta(PacoteEnvio pacote, String hash) {
		super();
		this.pacote = pacote;
		this.hash = hash;
	}
	public PacoteEnvio getPacote() {
		return pacote;
	}
	public String getHash() {
		return hash;
	}
	
}
