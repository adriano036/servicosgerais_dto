package servicosgerais_dto.dto;

import java.io.Serializable;

public class ServicoPrestadorDTO implements Serializable, DTOInterface {
	
	private static final long serialVersionUID = 1L;

	private int id;

	private PrestadorDTO prestador;

	private ServicoDTO servico;

	public ServicoPrestadorDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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