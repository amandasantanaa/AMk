package AmandaAmazon.AmandaAmazon.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Departamento {

	@Id
	@GeneratedValue
	private Integer id;


	private String eletronicos;
	private String papelaria;
	private String casa;
	private String livros;

	public String getLivros() {
		return livros;
	}
	public void setLivros(String livros) {
		this.livros = livros;
	}
	public String getEletronicos() {
		return eletronicos;
	}
	public void setEletronicos(String eletronicos) {
		this.eletronicos = eletronicos;
	}
	public String getPapelaria() {
		return papelaria;
	}
	public void setPapelaria(String papelaria) {
		this.papelaria = papelaria;
	}
	public String getCasa() {
		return casa;
	}
	public void setCasa(String casa) {
		this.casa = casa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((casa == null) ? 0 : casa.hashCode());
		result = prime * result + ((eletronicos == null) ? 0 : eletronicos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((livros == null) ? 0 : livros.hashCode());
		result = prime * result + ((papelaria == null) ? 0 : papelaria.hashCode());
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
		Departamento other = (Departamento) obj;
		if (casa == null) {
			if (other.casa != null)
				return false;
		} else if (!casa.equals(other.casa))
			return false;
		if (eletronicos == null) {
			if (other.eletronicos != null)
				return false;
		} else if (!eletronicos.equals(other.eletronicos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livros == null) {
			if (other.livros != null)
				return false;
		} else if (!livros.equals(other.livros))
			return false;
		if (papelaria == null) {
			if (other.papelaria != null)
				return false;
		} else if (!papelaria.equals(other.papelaria))
			return false;
		return true;
	}


}
