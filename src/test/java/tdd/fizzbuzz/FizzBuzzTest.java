package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_number_when_countOff_given_normal_number() {
        // given
        int number = 1;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);

        // then
        assertEquals("1", result);
    }

    @Test
    public void should_return_Fizz_when_countOff_given_multiple_of_3() {
        // given
        int number = 3;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOff(number);

        // then
        assertEquals("Fizz", result);
    }

}
