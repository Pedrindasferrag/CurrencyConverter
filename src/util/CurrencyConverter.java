package util;

public class CurrencyConverter {

	public double iof = 1.06;
	
	public double price;
	public double amount;
	
	public void amount(double quantity) {
		amount += price * quantity * iof;
	}
	
	public String toString() {
		return String.format("%.2f", amount);
	}
	
}


