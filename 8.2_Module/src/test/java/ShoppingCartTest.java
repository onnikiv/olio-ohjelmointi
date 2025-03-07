import static org.junit.jupiter.api.Assertions.assertEquals;
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
    }

    @Test
    public void testAddItem() {
        ShoppingCart sCart = new ShoppingCart();
        sCart.addItem("peruna",1);
        assertEquals(1, sCart.getItemCount());


        sCart.addItem("omena",2);
        assertEquals(2, sCart.getItemCount());
        
    }   

    @Test
    public void testRemoveItem() {
        ShoppingCart sCart = new ShoppingCart();
        sCart.addItem("taateli",4);
        sCart.addItem("maito", 1);
        sCart.addItem("jauheliha", 5);

        sCart.removeItem("taateli");
        sCart.removeItem("maito");
        sCart.removeItem("jauheliha");

        assertEquals(0, sCart.getItemCount());

    }

    @Test
    public void testCalculateTotal() {
        fail("Not yet implemented");
    }
}
