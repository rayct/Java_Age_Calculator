# This program will prompt the user for their date of birth, and then it will calculate current age, the day of the week you were born on, and the number of days until your next birthday.

## To use the program, simply run it in a Java environment and follow the prompts.

## Version: 1.0.2
## This optimized version of the program is similar to the previous version, but it uses static imports to make the code more concise. The DateTimeFormatter and Period classes are imported statically, so their methods can be used without having to prefix them with the class name. The getYears() and getDays() methods are called directly on the Period object, which eliminates the need to assign the period to a variable. Finally, the scanner object is closed immediately after reading user input, which is good practice to avoid resource leaks.


## Version: 1.0
## This Java version of the program uses LocalDate objects to represent dates, which makes it simpler and more concise than the C++ version. It also uses string formatting (%s and %d) to format strings, which makes the output code easier to read. The Scanner class is used to read user input, and the Period class is used to calculate the age and the days until the next birthday.

## Ray C. Turner