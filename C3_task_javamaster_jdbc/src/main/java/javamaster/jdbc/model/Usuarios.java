package javamaster.jdbc.model;

public class Usuarios {

	public Usuarios() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	@Override
	public String toString() {
		return "Usuarios: id=" + id + ", username=" + username + ", password=" + password + ", email=" + email;
	}



	private Long id;
	private String username;
	private String password;
	private String email;
}
