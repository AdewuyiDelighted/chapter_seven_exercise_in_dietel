import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveOfEratosthenesTest {
    @Test
    public void testThatAllElementInTheArrayAreTrue() {
        int count = 0;
        boolean check = false;
        boolean[] answer = SieveOfEratosthenes.convertAllElementTTrue();
        for (int index = 0; index < answer.length; index++) {
            if (answer[index]) {
                count++;
            }
            check = count == answer.length;
        }
        assertTrue(check);
    }

    @Test
    public void testThatNumberThatAreNotPrimeAreFalse() {
        boolean[] answer = SieveOfEratosthenes.sieve();
        int check = 4;
        boolean result = false;
        for (int index = 0; index < answer.length; index++) {
            result = answer[check];
        }
        assertFalse(result);
    }

    @Test
    public void testThatNumberThatAreNotPrimeAreFalseEvenIfDigitISGreaterThanTen() {
        boolean[] answer = SieveOfEratosthenes.sieve();
        int check = 15;
        boolean result = false;
        result = answer[check];
        assertFalse(result);
    }
    @Test
    public void testThatNumberThatAreNotPrimeAreFalseEvenIfDigitISGreaterThan100() {
        boolean[] answer = SieveOfEratosthenes.sieve();
        int check = 105;
        boolean result = false;
        result = answer[check];
        assertFalse(result);
    }
    @Test
    public void testThatNumberThatAreNotPrimeAreFalseEvenIfDigitISGreaterThan500() {
        boolean[] answer = SieveOfEratosthenes.sieve();
        int check = 684;
        boolean result = false;
        result = answer[check];
        assertFalse(result);
    }
    @Test
    public void testThatNumberThatAreNotPrimeAreFalseEvenIfDigitISGreaterThan800() {
        boolean[] answer = SieveOfEratosthenes.sieve();
        int check = 890;
        boolean result = false;
        result = answer[check];
        assertFalse(result);
    }




}