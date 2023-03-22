package domain;

public class Estado {

	private int id;

	private String nome;

	private String sigla;

	public Estado() {
	}

	public Estado(int id, String nome, String sigla) {
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
	}

	public int getId() {
		return id;
	}

	public Estado setId(int id) {
		this.id = id;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Estado setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getSigla() {
		return sigla;
	}

	public Estado setSigla(String sigla) {
		this.sigla = sigla;
		return this;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Estado{");
		sb.append("id=").append(id);
		sb.append(", nome='").append(nome).append('\'');
		sb.append(", sigla='").append(sigla).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
