package beans;

public class Ficha {

	public Ficha(String usuario, Integer edad, String email) {
		this.usuario = usuario;
		this.edad = edad;
		this.email = email;
	}
	
	private String usuario;
	private Integer edad;
	private String email;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
