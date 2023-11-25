import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcheryGameTest {
    @Test
    public void testThatRandomNumberIsNotLesserThan0AndGreaterThanTen(){
        int number = 0;
        for(int index = 0; index < 10;index++) {
            number = ArcheryGame.generateScore();
            boolean checkNumber = number >= 0 && number <= 10;
            assertTrue(checkNumber);
        }
    }
    @Test
    public void testThatPlayerIdStartFromOneAndEndAtTheNumberOfPlayersAvaliable(){
        int [] playerId = ArcheryGame.playerId();
        int [] answer = {1,2,3,4};
        assertArrayEquals(answer,playerId);
    }


}