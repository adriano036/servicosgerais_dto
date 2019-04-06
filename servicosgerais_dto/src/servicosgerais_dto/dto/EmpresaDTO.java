package servicosgerais_dto.dto;

import java.util.List;

public class EmpresaDTO implements DTOInterface{

	private int id;

	private String cnpj;

	private PessoaDTO pessoa;

	private List<PrestadorDTO> prestadors;

	private List<ServicoSistemaPrestadoDTO> servicoSistemaPrestados;

	public EmpresaDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaDTO getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
	}

	public List<PrestadorDTO> getPrestadors() {
		return this.prestadors;
	}

	public void setPrestadors(List<PrestadorDTO> prestadors) {
		this.prestadors = prestadors;
	}

	public PrestadorDTO addPrestador(PrestadorDTO prestador) {
		getPrestadors().add(prestador);
		prestador.setEmpresa(this);

		return prestador;
	}

	public PrestadorDTO removePrestador(PrestadorDTO prestador) {
		getPrestadors().remove(prestador);
		prestador.setEmpresa(null);

		return prestador;
	}

	public List<ServicoSistemaPrestadoDTO> getServicoSistemaPrestados() {
		return this.servicoSistemaPrestados;
	}

	public void setServicoSistemaPrestados(List<ServicoSistemaPrestadoDTO> servicoSistemaPrestados) {
		this.servicoSistemaPrestados = servicoSistemaPrestados;
	}

	public ServicoSistemaPrestadoDTO addServicoSistemaPrestado(ServicoSistemaPrestadoDTO servicoSistemaPrestado) {
		getServicoSistemaPrestados().add(servicoSistemaPrestado);
		servicoSistemaPrestado.setEmpresa(this);

		return servicoSistemaPrestado;
	}

	public ServicoSistemaPrestadoDTO removeServicoSistemaPrestado(ServicoSistemaPrestadoDTO servicoSistemaPrestado) {
		getServicoSistemaPrestados().remove(servicoSistemaPrestado);
		servicoSistemaPrestado.setEmpresa(null);

		return servicoSistemaPrestado;
	}

}