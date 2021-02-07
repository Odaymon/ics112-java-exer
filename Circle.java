/**
 * Author: Odaymon
 * Date: 2016
 * Description:
 * Circle class containing methods to compute
 * the area and circumference of a circle.
 */
public class Circle{
    public static final double PI_VAL = 3.1415;
    
    public static double areaD(double radius){ 
        return PI_VAL * (Math.pow(radius,2));
    }

    public static double circumference(double radius){
        return 2 * PI_VAL * radius;
    }
}