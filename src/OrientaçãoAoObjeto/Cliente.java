package OrientaçãoAoObjeto;

public class Cliente {

	private String nome;
	private int id;
	private int cpf;
	
	public Cliente (String nome,int cpf,int id) {
		
		this.nome=nome;
		this.cpf = cpf;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getcpf() {
		return getcpf();
	}

	public void setIdade(int cpf) {
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Cliente:\nNome: " + nome + ", CPF: " + cpf + ", ID: " + id;
	}
}
