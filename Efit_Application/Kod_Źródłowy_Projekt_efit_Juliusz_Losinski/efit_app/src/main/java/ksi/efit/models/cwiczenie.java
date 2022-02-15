package ksi.efit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cwiczenie")
public class cwiczenie
{
	@Id
	@Column(length=500)
	public String idcwiczenia;
	
	@Column(length=2000)
	public String opis;
	
	public String idrodzajucwiczenia;

	@Column(length=2000)
	public String film;
	
	public cwiczenie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdcwiczenia() {
		return idcwiczenia;
	}

	public void setIdcwiczenia(String idcwiczenia) {
		this.idcwiczenia = idcwiczenia;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getIdrodzajucwiczenia() {
		return idrodzajucwiczenia;
	}

	public void setIdrodzajucwiczenia(String idrodzajucwiczenia) {
		this.idrodzajucwiczenia = idrodzajucwiczenia;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}
	
	

}
