package servicosgerais_dto.dto;

import java.util.List;

public class ClienteDTO{
	
	private Long id;

	private int nrPontuacao;

	private PessoaDTO pessoa;

	private List<ConversaChatDTO> conversaChats;

	private List<DenunciaDTO> denuncias;

	private List<EnderecoDTO> enderecos;

	private List<ServicoPrestadoDTO> servicoPrestados;

	public ClienteDTO() {
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public int getNrPontuacao() {
		return this.nrPontuacao;
	}

	public void setNrPontuacao(int nrPontuacao) {
		this.nrPontuacao = nrPontuacao;
	}

	public PessoaDTO getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
	}

	public List<ConversaChatDTO> getConversaChats() {
		return this.conversaChats;
	}

	public void setConversaChats(List<ConversaChatDTO> conversaChats) {
		this.conversaChats = conversaChats;
	}

	public ConversaChatDTO addConversaChat(ConversaChatDTO conversaChat) {
		getConversaChats().add(conversaChat);
		conversaChat.setCliente(this);

		return conversaChat;
	}

	public ConversaChatDTO removeConversaChat(ConversaChatDTO conversaChat) {
		getConversaChats().remove(conversaChat);
		conversaChat.setCliente(null);

		return conversaChat;
	}

	public List<DenunciaDTO> getDenuncias() {
		return this.denuncias;
	}

	public void setDenuncias(List<DenunciaDTO> denuncias) {
		this.denuncias = denuncias;
	}

	public DenunciaDTO addDenuncia(DenunciaDTO denuncia) {
		getDenuncias().add(denuncia);
		denuncia.setCliente(this);

		return denuncia;
	}

	public DenunciaDTO removeDenuncia(DenunciaDTO denuncia) {
		getDenuncias().remove(denuncia);
		denuncia.setCliente(null);

		return denuncia;
	}

	public List<EnderecoDTO> getEnderecos() {
		return this.enderecos;
	}

	public void setEnderecos(List<EnderecoDTO> enderecos) {
		this.enderecos = enderecos;
	}

	public EnderecoDTO addEndereco(EnderecoDTO endereco) {
		getEnderecos().add(endereco);
		endereco.setCliente(this);

		return endereco;
	}

	public EnderecoDTO removeEndereco(EnderecoDTO endereco) {
		getEnderecos().remove(endereco);
		endereco.setCliente(null);

		return endereco;
	}

	public List<ServicoPrestadoDTO> getServicoPrestados() {
		return this.servicoPrestados;
	}

	public void setServicoPrestados(List<ServicoPrestadoDTO> servicoPrestados) {
		this.servicoPrestados = servicoPrestados;
	}

	public ServicoPrestadoDTO addServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		getServicoPrestados().add(servicoPrestado);
		servicoPrestado.setCliente(this);

		return servicoPrestado;
	}

	public ServicoPrestadoDTO removeServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		getServicoPrestados().remove(servicoPrestado);
		servicoPrestado.setCliente(null);

		return servicoPrestado;
	}

}