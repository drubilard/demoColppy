package Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class googleTest extends BaseTest {

    String email = "cristian.medina@colppy.com";
    String pass = "a";

    @Test
    @DisplayName("prueba de búsqueda en google")
    public void searchTest() {
        assertTrue(page.searchGoogle(email, pass));
    }
}
