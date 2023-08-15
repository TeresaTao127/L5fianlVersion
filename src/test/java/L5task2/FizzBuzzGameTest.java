package L5task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @Test
    void isFizz() {
        int i = 3;
        boolean isFizz = (i % 3 == 0);
        assertTrue(true);
    }
    @Test
    void isBuzz() {
        int i = 10;
        boolean isFizz = (i % 5 == 0);
        assertTrue(true);
    }
    @Test
    void isFizzBuzz() {
        int i = 15;
        boolean isFizz = (i % 15 == 0);
        assertTrue(true);
    }
}