import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PasswordUtilsTest {

    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange
        String password = "hello";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert
        assertEquals("short", actual);
    }
    @Test
void testAlphanumericPassword() {
    String password = "Hello123";
    boolean actual = PasswordUtils.isAlphanumeric(password);
    assertTrue(actual);
}

@Test
void testPasswordWithSpecialCharacter() {
    String password = "Hello123!";
    boolean actual = PasswordUtils.isAlphanumeric(password);
    assertFalse(actual);
}

@Test
void testPasswordOnlySpecialCharacter() {
    String password = "!";
    boolean actual = PasswordUtils.isAlphanumeric(password);
    assertFalse(actual);
}
}