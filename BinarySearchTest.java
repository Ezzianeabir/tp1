import org.example.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        // Test avec un tableau null
        try {
            BinarySearch.binarySearch(null, 10);
            fail("NullPointerException should be thrown");
        } catch (NullPointerException e) {
            // On s'attend à une exception NullPointerException
        }

        // Test avec un tableau vide
        int[] arrayEmpty = {};
        assertEquals(-1, BinarySearch.binarySearch(arrayEmpty, 10));

        // Test avec un tableau contenant un seul élément
        int[] arraySingle = {5};
        assertEquals(0, BinarySearch.binarySearch(arraySingle, 5));
        assertEquals(-1, BinarySearch.binarySearch(arraySingle, 10));

        // Test avec un tableau contenant plusieurs éléments
        int[] arrayMultiple = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(arrayMultiple, 5));
        assertEquals(4, BinarySearch.binarySearch(arrayMultiple, 9));
        assertEquals(-1, BinarySearch.binarySearch(arrayMultiple, 10));
    }
}
