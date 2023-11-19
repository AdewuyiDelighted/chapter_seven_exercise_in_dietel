import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    @Test
    public void testThatAllElementInArrayAreEmptyIndicatingMinusOne(){
        int[] checkElement = DuplicateElimination.convertAllElementToMinusOne();
       int number = 0;
        for(int index = 0;index < checkElement.length;index++){
            number = checkElement[index];
        }
        boolean isElementMinusOne = number == -1;
        assertTrue(isElementMinusOne);
    }
}