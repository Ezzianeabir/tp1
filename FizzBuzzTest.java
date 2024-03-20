import org.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {

    @Test
    public void testFizzBuzz_negativeNumber() {
        try {
            FizzBuzz.fizzBuzz(-1);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // L'exception a été correctement levée, le test passe
        }
    }

    @Test
    public void testFizzBuzz_divisibleBy3() {
        // Teste si "Fizz" est retourné lorsque le nombre est divisible par 3
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzz_divisibleBy5() {
        // Teste si "Buzz" est retourné lorsque le nombre est divisible par 5
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));
    }

    @Test
    public void testFizzBuzz_divisibleBy3And5() {
        // Teste si "FizzBuzz" est retourné lorsque le nombre est divisible par 3 et par 5
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
    }

    @Test
    public void testFizzBuzz_notDivisibleBy3Or5() {
        // Teste si le nombre est retourné sous forme de chaîne de caractères
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}
