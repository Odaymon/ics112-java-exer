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
		String s1 = x.readLine();

		celsius = Double.parseDouble(s1);
		farenheit = (celsius * 1.8 + 32);
		System.out.println("The farenheit equivalent is  "+farenheit);
	}
}