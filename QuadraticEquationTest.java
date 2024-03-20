import org.example.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuadraticEquationTest {




    public void testSolve_aIsZero() {
        try {
            // Appel de la méthode qui doit lancer une exception
            QuadraticEquation.solve(0, 2, 3);
            // Si aucune exception n'est lancée, le test échoue
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // L'exception a été correctement levée, le test passe
        }
    }

        @Test
        public void testSolve_deltaLessThanZero() {
            assertNull(QuadraticEquation.solve(1, 2, 3));
        }

        @Test
        public void testSolve_deltaEqualsZero() {
            assertArrayEquals(new double[]{-1.0}, QuadraticEquation.solve(1, 2, 1), 0.001);
        }

        @Test
        public void testSolve_deltaGreaterThanZero() {
            assertArrayEquals(new double[]{-1.0, -2.0}, QuadraticEquation.solve(1, 3, 2), 0.001);
        }
    }


