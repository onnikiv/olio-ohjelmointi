import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
    private static PalindromeChecker pl;

    @BeforeEach
    void beforeEach() {
        pl = new PalindromeChecker();
        System.out.println("**--- ALOITETAAN SEURAAVA TESTI ---**");
    }

    @Test
    void testtest() {
        assertTrue(pl.testIsPalindrome("1"));
        assertTrue(pl.testIsPalindrome("a"));
        assertTrue(pl.testIsPalindrome("aAa"));
    }

    @Test
    void testtesttest() {
        assertFalse(pl.testIsPalindrome("Eipä ollu palindröömi"));
        
        assertTrue(pl.testIsPalindrome("123321"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(pl.testIsPalindrome("radar"));
        assertTrue(pl.testIsPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(pl.testIsPalindrome("hello"));
        assertFalse(pl.testIsPalindrome("openai"));

        // lisää kivaa
        assertTrue(pl.testIsPalindrome("Do geese see God."));
        assertTrue(pl.testIsPalindrome("Rats live on no evil star"));
    }
}
