/**
 * Author: Odaymon
 * Date: Feb 2016
 * Description:
 * Convert Celsius to Farenheit
 */
import java.io.*;
public class CelsiusToFarenheit{
	public static void main(String[] args) throws IOException{
		double farenheit;
		double celsius;
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the celsius: ");
		celsius = Double.parseDouble(x.readLine());

		farenheit = convertCelsius(celsius);
		System.out.println("The farenheit equivalent is  "+farenheit);
	}

	public static double convertCelsius(double celsius){
		return celsius * 1.8 + 32;
	}
}