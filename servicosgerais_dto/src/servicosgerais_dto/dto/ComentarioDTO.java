package servicosgerais_dto.dto;

import java.sql.Date;

public class ComentarioDTO{

	private int id;

	private Date data;

	private String texto;

	private ServicoPrestadoDTO servicoPrestado;

	public ComentarioDTO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ServicoPrestadoDTO getServicoPrestado() {
		return this.servicoPrestado;
	}

	public void setServicoPrestado(ServicoPrestadoDTO servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}

}