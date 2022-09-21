package oop1;

//Kurumsal Müşteri sınıfı
public class CorporateCustomer extends Customer{
	private String companyName; // şirket adı
	private String taxNumber; // vergi numarası

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}
