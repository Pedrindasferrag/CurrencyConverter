package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		converter.price = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		converter.amount(sc.nextDouble());
		
		System.out.print("Amount to be paid in reais = "+  converter);
		
		sc.close();
	}

}
