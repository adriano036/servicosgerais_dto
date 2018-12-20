package servicosgerais_dto.ResponseUtil;

public class PacoteEnvio {
	private int idToken;
	private Object object;
	private String hash;
	
	public PacoteEnvio(int idToken, Object object, String hash) {
		super();
		this.idToken = idToken;
		this.object = object;
		this.hash = hash;
	}
	public int getIdToken() {
		return idToken;
	}
	public Object getObject() {
		return object;
	}
	public String getHash() {
		return hash;
	}
	
}
