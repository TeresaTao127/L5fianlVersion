package L5task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextContentTest {

    @Test
    void ShouldBeAPalindrome() {

        Assertions.assertTrue(TextContent.isPalindrome("radar"));
    }

    @Test
    void ShouldNotBeAPalindrome() {

        Assertions.assertFalse(TextContent.isPalindrome("fish"));
    }
}