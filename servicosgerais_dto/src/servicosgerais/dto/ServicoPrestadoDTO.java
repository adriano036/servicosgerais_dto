package servicosgerais.dto;

import java.math.BigDecimal;
import java.util.List;

public class ServicoPrestadoDTO{
	
	private int id;

	private int avaliacaoCliente;

	private int avaliacaoPrestador;

	private byte indConfirmacaoValor;

	private BigDecimal valorCliente;

	private BigDecimal valorDevido;

	private BigDecimal valorPrestador;

	private List<ComentarioDTO> comentarios;

	private List<HistoricoPagamentoDTO> historicoPagamentos;

	private ClienteDTO cliente;

	private PrestadorDTO prestador;

	private ServicoDTO servico;

	public ServicoPrestadoDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAvaliacaoCliente() {
		return this.avaliacaoCliente;
	}

	public void setAvaliacaoCliente(int avaliacaoCliente) {
		this.avaliacaoCliente = avaliacaoCliente;
	}

	public int getAvaliacaoPrestador() {
		return this.avaliacaoPrestador;
	}

	public void setAvaliacaoPrestador(int avaliacaoPrestador) {
		this.avaliacaoPrestador = avaliacaoPrestador;
	}

	public byte getIndConfirmacaoValor() {
		return this.indConfirmacaoValor;
	}

	public void setIndConfirmacaoValor(byte indConfirmacaoValor) {
		this.indConfirmacaoValor = indConfirmacaoValor;
	}

	public BigDecimal getValorCliente() {
		return this.valorCliente;
	}

	public void setValorCliente(BigDecimal valorCliente) {
		this.valorCliente = valorCliente;
	}

	public BigDecimal getValorDevido() {
		return this.valorDevido;
	}

	public void setValorDevido(BigDecimal valorDevido) {
		this.valorDevido = valorDevido;
	}

	public BigDecimal getValorPrestador() {
		return this.valorPrestador;
	}

	public void setValorPrestador(BigDecimal valorPrestador) {
		this.valorPrestador = valorPrestador;
	}

	public List<ComentarioDTO> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<ComentarioDTO> comentarios) {
		this.comentarios = comentarios;
	}

	public ComentarioDTO addComentario(ComentarioDTO comentario) {
		getComentarios().add(comentario);
		comentario.setServicoPrestado(this);

		return comentario;
	}

	public ComentarioDTO removeComentario(ComentarioDTO comentario) {
		getComentarios().remove(comentario);
		comentario.setServicoPrestado(null);

		return comentario;
	}

	public List<HistoricoPagamentoDTO> getHistoricoPagamentos() {
		return this.historicoPagamentos;
	}

	public void setHistoricoPagamentos(List<HistoricoPagamentoDTO> historicoPagamentos) {
		this.historicoPagamentos = historicoPagamentos;
	}

	public HistoricoPagamentoDTO addHistoricoPagamento(HistoricoPagamentoDTO historicoPagamento) {
		getHistoricoPagamentos().add(historicoPagamento);
		historicoPagamento.setServicoPrestado(this);

		return historicoPagamento;
	}

	public HistoricoPagamentoDTO removeHistoricoPagamento(HistoricoPagamentoDTO historicoPagamento) {
		getHistoricoPagamentos().remove(historicoPagamento);
		historicoPagamento.setServicoPrestado(null);

		return historicoPagamento;
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

	public ServicoDTO getServico() {
		return this.servico;
	}

	public void setServico(ServicoDTO servico) {
		this.servico = servico;
	}

}