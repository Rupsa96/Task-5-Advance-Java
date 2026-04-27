// Q4. Create an app which takes user's birthdate as input and calculates age
// in years, months, and days using ONLY java.time.LocalDate

import java.time.LocalDate;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        // Current date
        LocalDate currentDate = LocalDate.now();

        int years = currentDate.getYear() - birthDate.getYear();
        int months = currentDate.getMonthValue() - birthDate.getMonthValue();
        int days = currentDate.getDayOfMonth() - birthDate.getDayOfMonth();

        // If days are negative → borrow days from previous month
        if (days < 0) {
            months--; // reduce one month

            // Get previous month from current date
            LocalDate previousMonth = currentDate.minusMonths(1);

            // Add number of days in that month
            days += previousMonth.lengthOfMonth();
        }

        // If months are negative → borrow from year
        if (months < 0) {
            years--; // reduce one year
            months += 12;
        }

        // Final output
        System.out.println("Your age is: "
                + years + " years, "
                + months + " months, "
                + days + " days.");

    }
}