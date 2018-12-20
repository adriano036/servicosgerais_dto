package servicosgerais_dto.dto;

public class EnderecoDTO{
	
	private int id;

	private String cep;

	private String cidade;

	private String complemento;

	private String estado;

	private String logradouro;

	private ClienteDTO cliente;

	private PrestadorDTO prestador;

	public EnderecoDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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

}