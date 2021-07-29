package tn.esprit.payload.request;



import javax.validation.constraints.NotBlank;

public class LoginRequest {

	@NotBlank
	private String username;
	
	@NotBlank
	private String password;

	public LoginRequest() {
		super();
	}

	public LoginRequest(@NotBlank String userName, @NotBlank String password) {
		super();
		this.username = userName;
		this.password = password;
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

}
