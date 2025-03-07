import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

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

        ShoppingCart sCart = new ShoppingCart();

    }

    @Test
    public void testAddItem() {
        fail("Not yet implemented");
    }

    @Test
    public void testRemoveItem() {
        fail("Not yet implemented");
    }

    @Test
    public void testCalculateTotal() {
        fail("Not yet implemented");
    }
}
