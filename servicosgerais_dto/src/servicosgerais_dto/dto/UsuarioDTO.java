package servicosgerais_dto.dto;

import java.util.List;

public class UsuarioDTO implements DTOInterface{

	private int id;

	private String senha;

	private List<PessoaDTO> pessoas;

	public UsuarioDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<PessoaDTO> getPessoas() {
		return this.pessoas;
	}

	public void setPessoas(List<PessoaDTO> pessoas) {
		this.pessoas = pessoas;
	}

	public PessoaDTO addPessoa(PessoaDTO pessoa) {
		getPessoas().add(pessoa);
		pessoa.setUsuario(this);

		return pessoa;
	}

	public PessoaDTO removePessoa(PessoaDTO pessoa) {
		getPessoas().remove(pessoa);
		pessoa.setUsuario(null);

		return pessoa;
	}

}