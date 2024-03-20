import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testIsPalindrome_NullString() {
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
    }

   /* @Test
    public void testIsPalindrome_EmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testIsPalindrome_SingleCharacterString() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testIsPalindrome_PalindromeString() {
        assertTrue(Palindrome.isPalindrome("radar"));
    }

    @Test
    public void testIsPalindrome_NonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_StringWithSpaces() {
        assertTrue(Palindrome.isPalindrome("TP ligne couverage "));
    }*/
}
