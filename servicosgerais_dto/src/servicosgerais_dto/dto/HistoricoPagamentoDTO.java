package servicosgerais_dto.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class HistoricoPagamentoDTO implements Serializable, DTOInterface{
	
	private static final long serialVersionUID = 1L;

	private int id;

	private int ano;

	private int mes;

	private BigDecimal valor;

	private ServicoPrestadoDTO servicoPrestado;

	private ServicoSistemaPrestadoDTO servicoSistemaPrestado;

	public HistoricoPagamentoDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public ServicoPrestadoDTO getServicoPrestado() {
		return this.servicoPrestado;
	}

	public void setServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}

	public ServicoSistemaPrestadoDTO getServicoSistemaPrestado() {
		return this.servicoSistemaPrestado;
	}

	public void setServicoSistemaPrestado(ServicoSistemaPrestadoDTO servicoSistemaPrestado) {
		this.servicoSistemaPrestado = servicoSistemaPrestado;
	}

}