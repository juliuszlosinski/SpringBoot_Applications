package ksi.efit.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="uzytkownik")
public class uzytkownik
{
	@Id
	public String iduzytkownika;
	public String haslo;
	public String email;
	
	public uzytkownik()
	{
		super();
	}

	public String getIduzytkownika() {
		return iduzytkownika;
	}

	public void setIduzytkownika(String iduzytkownika) {
		this.iduzytkownika = iduzytkownika;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
