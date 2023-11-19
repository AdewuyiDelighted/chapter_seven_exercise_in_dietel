import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSeriesTest {
    @Test
    public void testThatFunctionReturnTheFibonacciNumberOfInput(){
        int input = 10;
        List<Integer> checkAnswer = FibonacciSeries.fibonacci(input);
        List<Integer> answer = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55);
        assertEquals(checkAnswer,answer);
    }
}