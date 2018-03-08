package br.com.rafaelvicio.model;

@XmlRootElement
public class Pipeline {
	
	private String identificador;
	private String nome;
	private String sistema;
	private String desenvolvedor;
	
	public Pipeline() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pipeline(String identificador, String nome, String sistema, String desenvolvedor) {
		super();
		this.identificador = identificador;
		this.nome = nome;
		this.sistema = sistema;
		this.desenvolvedor = desenvolvedor;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getDesenvolvedor() {
		return desenvolvedor;
	}
	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desenvolvedor == null) ? 0 : desenvolvedor.hashCode());
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sistema == null) ? 0 : sistema.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pipeline other = (Pipeline) obj;
		if (desenvolvedor == null) {
			if (other.desenvolvedor != null)
				return false;
		} else if (!desenvolvedor.equals(other.desenvolvedor))
			return false;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sistema == null) {
			if (other.sistema != null)
				return false;
		} else if (!sistema.equals(other.sistema))
			return false;
		return true;
	}

}
