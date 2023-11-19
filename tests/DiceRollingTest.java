import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollingTest {
    @Test
    public void testThatRandomReturnNumberBetweenOneAndSeven(){
        int number = 0;
        for(int index = 0; index < 7;index++) {
             number = DiceRolling.randomDiceRolling();
        }
        boolean checkNumber = number >= 1 && number < 7;
        assertTrue(checkNumber);
    }

}