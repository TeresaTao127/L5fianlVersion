package L5task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextContentTest {

    @Test
    void ShouldBeAPalindrome() {
        String text="radar";
        String reversedText = new StringBuilder(text).reverse().toString();
        Assertions.assertEquals(text,reversedText);

    }
}