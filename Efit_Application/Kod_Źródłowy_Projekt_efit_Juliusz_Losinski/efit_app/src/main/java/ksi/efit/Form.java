package ksi.efit;

public class Form 
{
	private String iloscTygodni;
	private String typTreningu;
	private String celTreningu;
	private String iloscDni;
	
	
	private boolean set=true, poniedzialek=true, wtorek=false, sroda=false, czwartek=false, piatek=false, sobota=false, niedziela=false;
	
	public boolean isPoniedzialek() {
		return poniedzialek;
	}

	public void setPoniedzialek(boolean poniedzialek) {
		this.poniedzialek = poniedzialek;
	}

	public boolean isWtorek() {
		return wtorek;
	}

	public void setWtorek(boolean wtorek) {
		this.wtorek = wtorek;
	}

	public boolean isSroda() {
		return sroda;
	}

	public void setSroda(boolean sroda) {
		this.sroda = sroda;
	}

	public boolean isCzwartek() {
		return czwartek;
	}

	public void setCzwartek(boolean czwartek) {
		this.czwartek = czwartek;
	}

	public boolean isPiatek() {
		return piatek;
	}

	public void setPiatek(boolean piatek) {
		this.piatek = piatek;
	}

	public boolean isSobota() {
		return sobota;
	}

	public void setSobota(boolean sobota) {
		this.sobota = sobota;
	}

	public boolean isNiedziela() {
		return niedziela;
	}

	public void setNiedziela(boolean niedziela) {
		this.niedziela = niedziela;
	}

	public boolean isSet() {
		return set;
	}

	public void setSet(boolean set) {
		this.set = set;
	}

	public Form()
	{
		
	}

	public String getIloscTygodni() {
		return iloscTygodni;
	}

	public void setIloscTygodni(String iloscTygodni) {
		this.iloscTygodni = iloscTygodni;
	}

	public String getTypTreningu() {
		return typTreningu;
	}

	public void setTypTreningu(String typTreningu) {
		this.typTreningu = typTreningu;
	}

	public String getCelTreningu() {
		return celTreningu;
	}

	public void setCelTreningu(String celTreningu) {
		this.celTreningu = celTreningu;
	}

	public String getIloscDni() {
		return iloscDni;
	}

	public void setIloscDni(String iloscDni) {
		this.iloscDni = iloscDni;
	}

	@Override
	public String toString() {
		return "Form [iloscTygodni=" + iloscTygodni + ", typTreningu=" + typTreningu + ", celTreningu=" + celTreningu
				+ ", iloscDni=" + iloscDni + "]";
	}	
}
