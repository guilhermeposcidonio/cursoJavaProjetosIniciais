package entities;

public class Product {

	// atributos da classef
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		// o this referencia ao atributo da classe
		// seria a mesma coisa que this.quantity = quantity + 1;
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		// seria a mesma coisa que this.quantity = quantity - 1;
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}

}
