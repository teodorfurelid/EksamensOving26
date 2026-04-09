import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaerTest {



    @Test
    public void testDesimalTilBinaer() {
        assertEquals("0", desimalTilBinaer(0), "0 burder gi '0'");
        assertEquals("1", desimalTilBinaer(1), "1 burde gi '1'");
        assertEquals("10", desimalTilBinaer(2), "2 burde gi '0'");
        assertEquals("11", desimalTilBinaer(3), "3 burde gi '11'");
        assertEquals("1010", desimalTilBinaer(10), " burde gi '1010'");
    }
}