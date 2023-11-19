import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBonusTest {
    @Test
    public void testThatArrayAtIndexTenToTwentyOfTheArrayIsZero() {
        int[] holdElements = ArrayBonus.setArray();
        int count = 10;
        int checkNumber = 0;
        for (int index = count; index < holdElements.length; index++) {
            checkNumber = holdElements[count];
        }
        boolean isElementZero = checkNumber == 0;
        assertTrue(isElementZero);
    }

    @Test
    public void testThatAllElementAreMultipliedByArrayBonusExceptIndex10To20() {
        int[] holdElements = ArrayBonus.multiplyAllElementByArrayBonus();
        int count = 0;
        int checkNumber = 0;
        for (int index = count; index < 9; index++) {
            checkNumber = holdElements[count];
        }
        boolean isElementZero = checkNumber >= 2;
        assertTrue(isElementZero);
    }

    @Test
    public void testThatElementWouldOnlyRemainBestScoresITenElement() {
        int[] elements = ArrayBonus.showBestScore();
        int length = elements.length;
        assertEquals(10, length);
    }

    @Test
    public void testThatElementInIndexTenToTwentyIsNotZero() {
        int[] elementsOfArray = ArrayBonus.showBestScore();
        int element = 0;
        for (int i : elementsOfArray) {
            element = i;
        }
        boolean isElementNotZero = element > 0;
        assertTrue(isElementNotZero);

    }


}