import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariableLengthTest {
    @Test
    public void testTheFunctionOfAverage(){
        double result =  VariableLength.averageOfSeries(1,2,3,4,5,6,7,8,9,10);
        double  answer = 5.5;
        assertEquals(answer,result);

    }
    @Test
    public void testTheFunctiomOfAverageTwo(){
        double result = VariableLength.averageOfSeries(2,5,7,8,3,1,6,9,4,10,3,7,8,4,6,2,5,9,1);
        double answer = 5.3;
        assertEquals(answer,result);
    }
}
