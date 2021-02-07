public class Savings{

    public static double tipid(double principalAmount, double interestRate, int compound){
        double total;
        total = 1 + interestRate/compound;
        total = Math.pow(total,compound);
        return principalAmount * total;
    }
}