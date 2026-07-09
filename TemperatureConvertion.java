package JavaOops;

import java.util.Scanner;

public class TemperatureConvertion {
	public static void main(String[] args) {
		System.out.print("Enter the temperature : ");
		Scanner nt = new Scanner(System.in);
		float temp = nt.nextFloat();
		float fahrenheit = ((temp * 9/5) + 32);
		System.out.println("Temperature in Farenheit is : " +fahrenheit);
	}
}
