package servicosgerais_dto.dto;

import java.util.List;

public class ServicoSistemaPrestadoDTO implements DTOInterface{
	
	private int id;

	private List<HistoricoPagamentoDTO> historicoPagamentos;

	private EmpresaDTO empresa;

	private PrestadorDTO prestador;

	private ServicoSistemaDTO servicoSistema;

	public ServicoSistemaPrestadoDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<HistoricoPagamentoDTO> getHistoricoPagamentos() {
		return this.historicoPagamentos;
	}

	public void setHistoricoPagamentos(List<HistoricoPagamentoDTO> historicoPagamentos) {
		this.historicoPagamentos = historicoPagamentos;
	}

	public HistoricoPagamentoDTO addHistoricoPagamento(HistoricoPagamentoDTO historicoPagamento) {
		getHistoricoPagamentos().add(historicoPagamento);
		historicoPagamento.setServicoSistemaPrestado(this);

		return historicoPagamento;
	}

	public HistoricoPagamentoDTO removeHistoricoPagamento(HistoricoPagamentoDTO historicoPagamento) {
		getHistoricoPagamentos().remove(historicoPagamento);
		historicoPagamento.setServicoSistemaPrestado(null);

		return historicoPagamento;
	}

	public EmpresaDTO getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(EmpresaDTO empresa) {
		this.empresa = empresa;
	}

	public PrestadorDTO getPrestador() {
		return this.prestador;
	}

	public void setPrestador(PrestadorDTO prestador) {
		this.prestador = prestador;
	}

	public ServicoSistemaDTO getServicoSistema() {
		return this.servicoSistema;
	}

	public void setServicoSistema(ServicoSistemaDTO servicoSistema) {
		this.servicoSistema = servicoSistema;
	}

}