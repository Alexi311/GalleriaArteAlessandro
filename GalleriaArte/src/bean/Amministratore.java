package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@Entity
public class Amministratore 
{
	@GeneratedValue
	private String nome;
	private String cognome;
	private String matricola;
	private String username;
	private String password;
	private String erroreLogin;
	private String usernameRiferimento;
	
	public Amministratore() 
	{
		
	}
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getMatricola() {
		return matricola;
	}



	public void setMatricola(String matricola) {
		this.matricola = matricola;
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

	public String getErroreLogin() {
		return erroreLogin;
	}

	public void setErroreLogin(String erroreLogin) {
		this.erroreLogin = erroreLogin;
	}



	public String getUsernameRiferimento() {
		return usernameRiferimento;
	}



	public void setUsernameRiferimento(String usernameRiferimento) {
		this.usernameRiferimento = usernameRiferimento;
	}
	
	

	
	
	
	
	
}
