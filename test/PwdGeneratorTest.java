import static org.junit.Assert.*;
import org.junit.Test;

public class PwdGeneratorTest {

    @Test
    public void testGeneratePassword() {
        // Test avec une longueur de mot de passe de 12
        String password = PwdGenerator.generatePassword(12);
        assertNotNull(password);
        assertEquals(12, password.length());
    }
}
