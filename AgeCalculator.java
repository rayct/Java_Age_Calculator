// Version: 1.0
// This Java version of the program uses LocalDate objects to represent dates,
// which makes it simpler and more concise than the C++ version.
// It also uses string formatting (%s and %d) to format strings, which makes the output code easier to read.
// The Scanner class is used to read user input, and the Period class is used to calculate the age and the days until the next birthday.

// import java.util.Scanner;
// import java.time.LocalDate;
// import java.time.Period;

// public class AgeCalculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your birthdate (MM/DD/YYYY): ");
//         String birthdateString = scanner.nextLine();
//         scanner.close();

//         LocalDate birthdate = LocalDate.parse(birthdateString, java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
//         LocalDate today = LocalDate.now();

//         Period period = Period.between(birthdate, today);
//         int age = period.getYears();
//         int daysUntilNextBirthday = Period.between(today, birthdate.plusYears(age + 1)).getDays();

//         System.out.printf("You were born on %s, which was a %s%n", birthdate, birthdate.getDayOfWeek());
//         System.out.printf("You are currently %d years old.%n", age);
//         System.out.printf("Your next birthday is in %d days.%n", daysUntilNextBirthday);
//     }
// }


// Version: 1.0.2
// This optimized version of the program is similar to the previous version, but it uses static imports to make the code more concise.
// The DateTimeFormatter and Period classes are imported statically, so their methods can be used without having to prefix them with the class name.
// The getYears() and getDays() methods are called directly on the Period object, which eliminates the need to assign the period to a variable. Finally,
// the scanner object is closed immediately after reading user input, which is good practice to avoid resource leaks.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (MM/DD/YYYY): ");
        String birthdateString = scanner.nextLine();
        scanner.close();

        LocalDate birthdate = LocalDate.parse(birthdateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        LocalDate today = LocalDate.now();

        int age = Period.between(birthdate, today).getYears();
        int daysUntilNextBirthday = Period.between(today, birthdate.plusYears(age + 1)).getDays();

        System.out.printf("You were born on %s, which was a %s%n", birthdate, birthdate.getDayOfWeek());
        System.out.printf("You are currently %d years old.%n", age);
        System.out.printf("Your next birthday is in %d days.%n", daysUntilNextBirthday);
    }
}
