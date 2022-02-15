package ksi.efit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plan")
public class plan 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPlanu;
	private String idUzytkownika;
	private String data_zakupu;
	private String data_zakonczenia;
	
	public plan()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdPlanu()
	{
		return idPlanu;
	}
	
	public void setIdPlanu(int idPlanu)
	{
		this.idPlanu = idPlanu;
	}
	
	public String getIdUzytkownika()
	{
		return idUzytkownika;
	}
	
	public void setIdUzytkownika(String idUzytkownika) 
	{
		this.idUzytkownika = idUzytkownika;
	}
	
	public String getData_zakupu()
	{
		return data_zakupu;
	}
	
	public void setData_zakupu(String data_zakupu)
	{
		this.data_zakupu = data_zakupu;
	}
	
	public String getData_zakonczenia()
	{
		return data_zakonczenia;
	}
	
	public void setData_zakonczenia(String data_zakonczenia)
	{
		this.data_zakonczenia = data_zakonczenia;
	}
}
