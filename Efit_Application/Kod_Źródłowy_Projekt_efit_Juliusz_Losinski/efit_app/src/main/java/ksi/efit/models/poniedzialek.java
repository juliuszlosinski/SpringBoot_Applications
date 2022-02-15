package ksi.efit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="poniedzialek")
public class poniedzialek
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idWpisu;
	private int idPlanu;
	private String idCwiczenia;
	
	public poniedzialek() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdWpisu() {
		return idWpisu;
	}

	public void setIdWpisu(int idWpisu) {
		this.idWpisu = idWpisu;
	}

	public int getIdPlanu() {
		return idPlanu;
	}

	public void setIdPlanu(int idPlanu) {
		this.idPlanu = idPlanu;
	}

	public String getIdCwiczenia() {
		return idCwiczenia;
	}

	public void setIdCwiczenia(String idCwiczenia) {
		this.idCwiczenia = idCwiczenia;
	}
}
