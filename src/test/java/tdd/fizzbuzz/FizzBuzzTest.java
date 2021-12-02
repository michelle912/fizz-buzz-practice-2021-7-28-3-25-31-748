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

}
