import java.util.Arrays;

class Types {
    //    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
    static boolean number; // defaults to false
    static int[] myArray = {3, 4, 5, 6, 76, 12, 2};
    static String movieA = "Harry and the Hendersons";
    static String movieB = "Star Wars";
    static char male = 'm';
    static char female = 'f';

    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables

    public static void main(String[] args) {
        System.out.println("There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");

        System.out.println("number: " + number);
        System.out.println("myArray: " + Arrays.toString(myArray));
        System.out.printf("Movie A: %s, Movie B: %s, male (char): %c, female (char): %c", movieA, movieB, male, female);
    }
}