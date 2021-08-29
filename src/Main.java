import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }
    @Test
    void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }


    private String toRoman(int number) {
        String romanNumber = "";
        if (number == 1) {
            romanNumber = "I";
        }
        System.out.println(romanNumber);
        return romanNumber;
    }

}
