package oop1;

//PascalCase (kelimenin ilk harfi büyük)
public class Product {
	// fieldlar (camelCase yazılır)
	private String name;
	private double unitPrice; // birim fiyat
	private double discount; // indirim fiyatı
	private String imageUrl;
	private int unitsInStock; // stokta kalan sayı

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
			this.unitsInStock = unitsInStock;
}
}