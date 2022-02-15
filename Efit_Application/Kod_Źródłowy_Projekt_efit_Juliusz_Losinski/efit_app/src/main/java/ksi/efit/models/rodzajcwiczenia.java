package ksi.efit.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rodzajcwiczenia")
public class rodzajcwiczenia
{
	@Id
	public String idrodzajucwiczenia;

	public rodzajcwiczenia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdrodzajucwiczenia() {
		return idrodzajucwiczenia;
	}

	public void setIdrodzajucwiczenia(String idrodzajucwiczenia) {
		this.idrodzajucwiczenia = idrodzajucwiczenia;
	}

}
