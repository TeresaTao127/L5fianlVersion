package L5task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 15})
    void shouldReturnTrueForIsFizz(int numberToCheck) {
        Assertions.assertTrue(FizzBuzzGame.isFizz(numberToCheck));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 10, 14, 16})
    void shouldReturnFalseForIsFizz(int numberToCheck) {
        Assertions.assertFalse(FizzBuzzGame.isFizz(numberToCheck));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 20, 25})
    void shouldReturnTrueForIsBuzz(int numberToCheck) {
        Assertions.assertTrue(FizzBuzzGame.isBuzz(numberToCheck));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 16, 32, 64})
    void shouldReturnFalseForIsBuzz(int numberToCheck) {
        Assertions.assertFalse(FizzBuzzGame.isBuzz(numberToCheck));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 90})
    void shouldReturnTrueForIsFizzBuzz(int numberToCheck) {
        Assertions.assertTrue(FizzBuzzGame.isFizzBuzz(numberToCheck));
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 40, 50, 70, 80})
    void shouldReturnFalseForIsFizzBuzz(int numberToCheck) {
        Assertions.assertFalse(FizzBuzzGame.isFizzBuzz(numberToCheck));
    }

}