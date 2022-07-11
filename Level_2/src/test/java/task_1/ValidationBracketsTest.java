package task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationBracketsTest {

    @Test
    void isValidBrackets() {
        String Str = "Sdjjllf(){}[]sdkjk()";
        boolean expected = true;
        boolean actual = ValidationBrackets.isValidBrackets("Sdjjllf(){}[]sdkjk()");
        assertEquals(expected, actual);
    }
}