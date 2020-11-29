
public class Usuario {
	private String nome, email, telefone;
	
	public Usuario(String nome, String email, String telefone) {
		this.setEmail(email);
		this.setNome(nome);
		this.setTelefone(telefone);
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
