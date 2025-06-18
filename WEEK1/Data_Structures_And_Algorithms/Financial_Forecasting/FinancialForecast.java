import java.util.Scanner;
public class FinancialForecast{
    public static double calculateFutureValue(double principal, double rate, int years){
        if(years == 0){
            return principal;
        }
        return calculateFutureValue(principal*(1+rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        sc.close();

        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("The future value after %d years is: Rs. %.2f \n", years, futureValue);
    }
}