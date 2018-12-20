package servicosgerais_dto.dto;

import java.sql.Date;

public class MensagemConversaDTO{
	
	private int id;

	private Date data;

	private byte indCliente;

	private byte indPrestador;

	private String texto;

	private ConversaChatDTO conversaChat;

	public MensagemConversaDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public byte getIndCliente() {
		return this.indCliente;
	}

	public void setIndCliente(byte indCliente) {
		this.indCliente = indCliente;
	}

	public byte getIndPrestador() {
		return this.indPrestador;
	}

	public void setIndPrestador(byte indPrestador) {
		this.indPrestador = indPrestador;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ConversaChatDTO getConversaChat() {
		return this.conversaChat;
	}

	public void setConversaChat(ConversaChatDTO conversaChat) {
		this.conversaChat = conversaChat;
	}

}