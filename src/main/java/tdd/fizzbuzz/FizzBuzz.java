package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number) {
        String output = "";
        // Fizz
        if (number % 3 == 0) {
            output += "Fizz";
        }
        // Buzz
        if (number % 5 == 0) {
            output += "Buzz";
        }
        // Whiz
        if (number % 7 == 0) {
            output += "Whiz";
        }
        // normal case
        if (output.isEmpty()) {
            return String.valueOf(number);
        }
        return output;
    }

}
