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
    @Test
    void shouldConvert3ToIII(){
        assertEquals("III", toRoman(3));
    }
    @Test
    void shouldConvert4ToIV(){
        assertEquals("IV", toRoman(4));
    }
    @Test
    void shouldConvert5ToV(){
        assertEquals("V", toRoman(5));
    }
    @Test
    void shouldConvert6ToVI(){
        assertEquals("VI", toRoman(6));
    }




    private String toRoman(int number) {
        String romanNumber = "";

        while (number > 0) {
            if (number < 4) {
                romanNumber += "I";
                number = number -1;
            } else if (number == 4) {
                romanNumber += "IV";
                number = number -4;
            } else if (number == 5) {
                romanNumber += "V";
                number = number -5;
            }
            System.out.println(romanNumber);
        }return romanNumber;
    }
}
