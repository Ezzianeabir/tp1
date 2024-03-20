
import org.example.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class AnagramTest {

        @Test
        public void testIsAnagram_NullStrings() {
            assertThrows(NullPointerException.class, () -> {
                Anagram.isAnagram(null, null);
            });
        }

        @Test
        public void testIsAnagram_OneNullString() {
            assertThrows(NullPointerException.class, () -> {
                Anagram.isAnagram("hello", null);
            });
        }

        @Test
        public void testIsAnagram_EmptyStrings() {
            assertTrue(Anagram.isAnagram("", ""));
        }

        @Test
        public void testIsAnagram_SameLengthAnagram() {
            assertTrue(Anagram.isAnagram("listen", "silent"));
        }

        @Test
        public void testIsAnagram_SameLengthNotAnagram() {
            assertFalse(Anagram.isAnagram("hello", "world"));
        }

        @Test
        public void testIsAnagram_DifferentLengthNotAnagram() {
            assertFalse(Anagram.isAnagram("hello", "he"));
        }
    }


