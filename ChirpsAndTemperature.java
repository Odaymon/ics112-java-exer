/**
 * Author: Odaymon
 * Date: Feb 2016
 * Description:
 * It has been observed that crickets tend to chirp in
 * the summer at a rate that is related to temperature
 * by the formula T = (c+40.0)/10.0, where c the number of 
 * chirps per minute and T is the temperature in Fahrenheit degrees.
 * A program that inputs the number of chirps per minute
 * and outputs the temperature in decimal form.
 */
import java.io.*;
public class ChirpsAndTemperature{
	public static void main(String[] args) throws IOException{
		double c;
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of chirps: ");
		c = Double.parseDouble(x.readLine());

		System.out.println("The temperature is "+computeTemp(c));
	}

	public static double computeTemp(double c){
		return (c+40.0)/10.0;
	}
}