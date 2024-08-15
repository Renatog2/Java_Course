package util;

public class currencyConverter {
	public static final double IOF = 6.00;
	
	public static double converter(double price, double quantity) {
		return (price * quantity) + (((price * quantity) * IOF) / 100.00);
	}
}
