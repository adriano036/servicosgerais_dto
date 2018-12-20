package servicosgerais_dto.dto;

import java.util.List;

public class ConversaChatDTO{

	private int id;

	private ClienteDTO cliente;

	private PrestadorDTO prestador;

	private List<MensagemConversaDTO> mensagemConversas;

	public ConversaChatDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClienteDTO getCliente() {
		return this.cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	public PrestadorDTO getPrestador() {
		return this.prestador;
	}

	public void setPrestador(PrestadorDTO prestador) {
		this.prestador = prestador;
	}

	public List<MensagemConversaDTO> getMensagemConversas() {
		return this.mensagemConversas;
	}

	public void setMensagemConversas(List<MensagemConversaDTO> mensagemConversas) {
		this.mensagemConversas = mensagemConversas;
	}

	public MensagemConversaDTO addMensagemConversa(MensagemConversaDTO mensagemConversa) {
		getMensagemConversas().add(mensagemConversa);
		mensagemConversa.setConversaChat(this);

		return mensagemConversa;
	}

	public MensagemConversaDTO removeMensagemConversa(MensagemConversaDTO mensagemConversa) {
		getMensagemConversas().remove(mensagemConversa);
		mensagemConversa.setConversaChat(null);

		return mensagemConversa;
	}

}