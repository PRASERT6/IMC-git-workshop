package dminer.service;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void getTokenNumberOneShouldSayOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "1";

        String actualResult = fizzBuzz.say(1);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getTokenNumberOneShouldSayFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";

        String actualResult = fizzBuzz.say(15);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getTokenNumberThreeShouldSayFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";

        String actualResult = fizzBuzz.say(3);

        assertEquals(expectedResult, actualResult);
    }
}
