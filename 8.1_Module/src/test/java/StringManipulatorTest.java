import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import StringManipulator.StringManipulator;

public class StringManipulatorTest {
    private static StringManipulator strTest;
    private static int TESTNUMBER;
    
    @BeforeAll
    static void beforeAll() {
        TESTNUMBER = 0;
        System.out.println("**--- ALOITETAAN TESTAAMINEN --------**");
    }

    @BeforeEach
    void beforeEach() {
        TESTNUMBER += 1;
        System.out.println("**--- ALOITETAAN SEURAAVA TESTI "+ TESTNUMBER + " ---**");
        strTest = new StringManipulator();
    }

    @Test
    void concatenateTest() {
        assertEquals("Love Java", strTest.concatenate("Love", "Java"));
    }

    @Test
    void findLengthTest() {
        assertEquals(13, strTest.findLength("Puoskarointia"));
    }

    @Test
    void convertToUpperCaseTest() {
        assertEquals("KANKKUNEN", strTest.convertToUpperCase("kankkunen"));
    }

    @Test
    void convertToLowerCaseTest() {
        assertEquals("testaaja", strTest.convertToLowerCase("TESTAAJA"));
    }

    @Test
    void containsSubstringTest() {
        assertTrue(strTest.containsSubString("Hyvää päivää", "päivää"));
        assertFalse(strTest.containsSubString("hello world", "WORLD"));
    }
}
