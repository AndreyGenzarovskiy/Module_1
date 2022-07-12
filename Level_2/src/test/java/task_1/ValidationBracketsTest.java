package task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationBracketsTest {

    @Test
    void isValidBrackets() {
        String str = "Sdjjllf(){}[]sdkjk()";
        boolean expected = true;
        boolean actual = ValidationBrackets.isValidBrackets(str);
        assertEquals(expected, actual);
    }

    @Test
    void isValidBracketsNegative() {
        String str = "Sdjjllf(){]sdkjk()";
        boolean expected = false;
        boolean actual = ValidationBrackets.isValidBrackets(str);
        assertEquals(expected, actual);
    }
}