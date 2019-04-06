package servicosgerais_dto.dto;

import java.util.List;

public class PessoaDTO implements DTOInterface{

	private int id;

	private String email;

	private String nome;

	private String telefone1;

	private String telefone2;

	private List<ClienteDTO> clientes;

	private List<EmpresaDTO> empresas;

	private UsuarioDTO usuario;

	private List<PrestadorDTO> prestadors;

	public PessoaDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone1() {
		return this.telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return this.telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public List<ClienteDTO> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<ClienteDTO> clientes) {
		this.clientes = clientes;
	}

	public ClienteDTO addCliente(ClienteDTO cliente) {
		getClientes().add(cliente);
		cliente.setPessoa(this);

		return cliente;
	}

	public ClienteDTO removeCliente(ClienteDTO cliente) {
		getClientes().remove(cliente);
		cliente.setPessoa(null);

		return cliente;
	}

	public List<EmpresaDTO> getEmpresas() {
		return this.empresas;
	}

	public void setEmpresas(List<EmpresaDTO> empresas) {
		this.empresas = empresas;
	}

	public EmpresaDTO addEmpresa(EmpresaDTO empresa) {
		getEmpresas().add(empresa);
		empresa.setPessoa(this);

		return empresa;
	}

	public EmpresaDTO removeEmpresa(EmpresaDTO empresa) {
		getEmpresas().remove(empresa);
		empresa.setPessoa(null);

		return empresa;
	}

	public UsuarioDTO getUsuario() {
		return this.usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public List<PrestadorDTO> getPrestadors() {
		return this.prestadors;
	}

	public void setPrestadors(List<PrestadorDTO> prestadors) {
		this.prestadors = prestadors;
	}

	public PrestadorDTO addPrestador(PrestadorDTO prestador) {
		getPrestadors().add(prestador);
		prestador.setPessoa(this);

		return prestador;
	}

	public PrestadorDTO removePrestador(PrestadorDTO prestador) {
		getPrestadors().remove(prestador);
		prestador.setPessoa(null);

		return prestador;
	}

}