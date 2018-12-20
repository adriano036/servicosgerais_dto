package servicosgerais_dto.dto;

public class DenunciaDTO{

	private int id;

	private String texto;

	private ClienteDTO cliente;

	private PrestadorDTO prestador;

	public DenunciaDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
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