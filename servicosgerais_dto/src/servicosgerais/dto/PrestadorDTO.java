package servicosgerais.dto;

import java.util.List;

public class PrestadorDTO{
	
	private int id;

	private int nrPontuacao;

	private int raioInteresse;

	private List<ConversaChatDTO> conversaChats;

	private List<DenunciaDTO> denuncias;

	private List<EnderecoDTO> enderecos;

	private EmpresaDTO empresa;

	private PessoaDTO pessoa;

	private List<ServicoPrestadoDTO> servicoPrestados;

	private List<ServicoPrestadorDTO> servicoPrestadors;

	private List<ServicoSistemaPrestadoDTO> servicoSistemaPrestados;

	public PrestadorDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNrPontuacao() {
		return this.nrPontuacao;
	}

	public void setNrPontuacao(int nrPontuacao) {
		this.nrPontuacao = nrPontuacao;
	}

	public int getRaioInteresse() {
		return this.raioInteresse;
	}

	public void setRaioInteresse(int raioInteresse) {
		this.raioInteresse = raioInteresse;
	}

	public List<ConversaChatDTO> getConversaChats() {
		return this.conversaChats;
	}

	public void setConversaChats(List<ConversaChatDTO> conversaChats) {
		this.conversaChats = conversaChats;
	}

	public ConversaChatDTO addConversaChat(ConversaChatDTO conversaChat) {
		getConversaChats().add(conversaChat);
		conversaChat.setPrestador(this);

		return conversaChat;
	}

	public ConversaChatDTO removeConversaChat(ConversaChatDTO conversaChat) {
		getConversaChats().remove(conversaChat);
		conversaChat.setPrestador(null);

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
		denuncia.setPrestador(this);

		return denuncia;
	}

	public DenunciaDTO removeDenuncia(DenunciaDTO denuncia) {
		getDenuncias().remove(denuncia);
		denuncia.setPrestador(null);

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
		endereco.setPrestador(this);

		return endereco;
	}

	public EnderecoDTO removeEndereco(EnderecoDTO endereco) {
		getEnderecos().remove(endereco);
		endereco.setPrestador(null);

		return endereco;
	}

	public EmpresaDTO getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(EmpresaDTO empresa) {
		this.empresa = empresa;
	}

	public PessoaDTO getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
	}

	public List<ServicoPrestadoDTO> getServicoPrestados() {
		return this.servicoPrestados;
	}

	public void setServicoPrestados(List<ServicoPrestadoDTO> servicoPrestados) {
		this.servicoPrestados = servicoPrestados;
	}

	public ServicoPrestadoDTO addServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		getServicoPrestados().add(servicoPrestado);
		servicoPrestado.setPrestador(this);

		return servicoPrestado;
	}

	public ServicoPrestadoDTO removeServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		getServicoPrestados().remove(servicoPrestado);
		servicoPrestado.setPrestador(null);

		return servicoPrestado;
	}

	public List<ServicoPrestadorDTO> getServicoPrestadors() {
		return this.servicoPrestadors;
	}

	public void setServicoPrestadors(List<ServicoPrestadorDTO> servicoPrestadors) {
		this.servicoPrestadors = servicoPrestadors;
	}

	public ServicoPrestadorDTO addServicoPrestador(ServicoPrestadorDTO servicoPrestador) {
		getServicoPrestadors().add(servicoPrestador);
		servicoPrestador.setPrestador(this);

		return servicoPrestador;
	}

	public ServicoPrestadorDTO removeServicoPrestador(ServicoPrestadorDTO servicoPrestador) {
		getServicoPrestadors().remove(servicoPrestador);
		servicoPrestador.setPrestador(null);

		return servicoPrestador;
	}

	public List<ServicoSistemaPrestadoDTO> getServicoSistemaPrestados() {
		return this.servicoSistemaPrestados;
	}

	public void setServicoSistemaPrestados(List<ServicoSistemaPrestadoDTO> servicoSistemaPrestados) {
		this.servicoSistemaPrestados = servicoSistemaPrestados;
	}

	public ServicoSistemaPrestadoDTO addServicoSistemaPrestado(ServicoSistemaPrestadoDTO servicoSistemaPrestado) {
		getServicoSistemaPrestados().add(servicoSistemaPrestado);
		servicoSistemaPrestado.setPrestador(this);

		return servicoSistemaPrestado;
	}

	public ServicoSistemaPrestadoDTO removeServicoSistemaPrestado(ServicoSistemaPrestadoDTO servicoSistemaPrestado) {
		getServicoSistemaPrestados().remove(servicoSistemaPrestado);
		servicoSistemaPrestado.setPrestador(null);

		return servicoSistemaPrestado;
	}

}