package servicosgerais.dto;

import java.math.BigDecimal;
import java.util.List;

public class ServicoSistemaDTO{
	
	private int id;

	private BigDecimal custoFixo;

	private String nome;

	private int porcentagem;

	private List<ServicoSistemaPrestadoDTO> servicoSistemaPrestados;

	public ServicoSistemaDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getCustoFixo() {
		return this.custoFixo;
	}

	public void setCustoFixo(BigDecimal custoFixo) {
		this.custoFixo = custoFixo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPorcentagem() {
		return this.porcentagem;
	}

	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}

	public List<ServicoSistemaPrestadoDTO> getServicoSistemaPrestados() {
		return this.servicoSistemaPrestados;
	}

	public void setServicoSistemaPrestados(List<ServicoSistemaPrestadoDTO> servicoSistemaPrestados) {
		this.servicoSistemaPrestados = servicoSistemaPrestados;
	}

	public ServicoSistemaPrestadoDTO addServicoSistemaPrestado(ServicoSistemaPrestadoDTO servicoSistemaPrestado) {
		getServicoSistemaPrestados().add(servicoSistemaPrestado);
		servicoSistemaPrestado.setServicoSistema(this);

		return servicoSistemaPrestado;
	}

	public ServicoSistemaPrestadoDTO removeServicoSistemaPrestado(ServicoSistemaPrestadoDTO servicoSistemaPrestado) {
		getServicoSistemaPrestados().remove(servicoSistemaPrestado);
		servicoSistemaPrestado.setServicoSistema(null);

		return servicoSistemaPrestado;
	}

}