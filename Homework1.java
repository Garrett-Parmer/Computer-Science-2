import java.util.Scanner;

public class Homework1 {
  public static void main(String[] args) {

    algebraAPR();

    System.out.println();

    squareRoot();

    System.out.println();

    primeFunction();

  }

  public static void algebraAPR() {
    System.out.println("A simple interest calculation."
      + "\nThe principal value is $10,000, the interest rate is 3.875," +
      "\nand it will accrue for 30 years."
      + "\nA=P(1+rt_)");

    double p = 10000;
    double r = .03875;
    double t = 30;
    double answer = (p * (1 + r * t));
    System.out.println("equals " + answer);

  }

  public static void squareRoot() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number you'd like to find the square root of: ");

    double sqrt = input.nextDouble();

    System.out.println("The square root of " + sqrt + " is " + Math.sqrt(sqrt));

    input.close();

    System.out.println("\n Using the sqrt method returns the correctly rounded positive sqare root.");

  }

  public static void primeFunction() {

    int number = 0;
    String primeNumbers = " ";

    for (number = 1; number <= 1000; number++) {
      int factors = getFactorCount(number);
      if (factors == 2) {

        primeNumbers = primeNumbers + number + " ";

      }
    }
    System.out.println("Prime numbers from 1 to 100 are: " + primeNumbers);

  }

  public static int getFactorCount(int number) {

    int factorCount = 0;

    for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factorCount++;
			}
		}

    return factorCount;
  }
}
