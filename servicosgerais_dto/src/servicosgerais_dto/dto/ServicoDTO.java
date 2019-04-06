package servicosgerais_dto.dto;

import java.util.List;

public class ServicoDTO implements DTOInterface{

	private int id;

	private String nome;

	private ServicoDTO servico;

	private List<ServicoDTO> servicos;

	private List<ServicoPrestadoDTO> servicoPrestados;

	private List<ServicoPrestadorDTO> servicoPrestadors;

	public ServicoDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ServicoDTO getServico() {
		return this.servico;
	}

	public void setServico(ServicoDTO servico) {
		this.servico = servico;
	}

	public List<ServicoDTO> getServicos() {
		return this.servicos;
	}

	public void setServicos(List<ServicoDTO> servicos) {
		this.servicos = servicos;
	}

	public ServicoDTO addServico(ServicoDTO servico) {
		getServicos().add(servico);
		servico.setServico(this);

		return servico;
	}

	public ServicoDTO removeServico(ServicoDTO servico) {
		getServicos().remove(servico);
		servico.setServico(null);

		return servico;
	}

	public List<ServicoPrestadoDTO> getServicoPrestados() {
		return this.servicoPrestados;
	}

	public void setServicoPrestados(List<ServicoPrestadoDTO> servicoPrestados) {
		this.servicoPrestados = servicoPrestados;
	}

	public ServicoPrestadoDTO addServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		getServicoPrestados().add(servicoPrestado);
		servicoPrestado.setServico(this);

		return servicoPrestado;
	}

	public ServicoPrestadoDTO removeServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		getServicoPrestados().remove(servicoPrestado);
		servicoPrestado.setServico(null);

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
		servicoPrestador.setServico(this);

		return servicoPrestador;
	}

	public ServicoPrestadorDTO removeServicoPrestador(ServicoPrestadorDTO servicoPrestador) {
		getServicoPrestadors().remove(servicoPrestador);
		servicoPrestador.setServico(null);

		return servicoPrestador;
	}

}