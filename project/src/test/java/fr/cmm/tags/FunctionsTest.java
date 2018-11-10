package fr.cmm.tags;
import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionsTest {
    @Test
    public void parse() {
        assertEquals("a", Functions.renvoyer("a"));
        assertEquals("a<br>", Functions.renvoyer("a\n"));
        assertEquals("&amp;a", Functions.renvoyer("&a"));
    }
}
// OK