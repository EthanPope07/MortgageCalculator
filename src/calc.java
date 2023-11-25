package src;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Loan Amount: $");
        double loanAmount = keyboard.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualInterestRate = keyboard.nextDouble();
        System.out.print("Enter Loan Term (in years): ");
        int loanTermInYears = keyboard.nextInt();
        double monthlyPayment = calculateMonthlyPayment(loanAmount, annualInterestRate, loanTermInYears);

        // Display the result
        System.out.printf("\nLoan Amount: $%,.2f\n", loanAmount);
        System.out.printf("Annual Interest Rate: %.2f%%\n", annualInterestRate);
        System.out.printf("Loan Term: %d years\n", loanTermInYears);
        System.out.printf("Monthly Payment: $%,.2f\n", monthlyPayment);

    }
    public static double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanTermInYears) {
        // Monthly interest rate
        double monthlyRate = annualInterestRate / 12 / 100;
        // Number of monthly payments
        int numberOfPayments = loanTermInYears * 12;
        // Calculate the monthly mortgage payment
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numberOfPayments));

        return monthlyPayment;
    }
}
