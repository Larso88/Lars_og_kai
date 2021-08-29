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
    @Test
    void shouldConvert7ToVII(){
        assertEquals("VII", toRoman(7));
    }
    @Test
    void shouldConvert10ToX(){
        assertEquals("X", toRoman(10));
    }
    @Test
    void shouldConvert11ToXI(){
        assertEquals("XI", toRoman(11));
    }
    @Test
    void shouldConvert40ToXL() {
        assertEquals("XL", toRoman(40));
    }
    @Test
    void shouldConvert50ToL(){
        assertEquals("L", toRoman(50));
    }
    @Test
    void shouldConvert90ToXC(){
        assertEquals("XC", toRoman(90));
    }

    private String toRoman(int number) {
        String romanNumber = "";
        while (number > 0) {
            if (number > 49 && number < 89) {
                romanNumber += "L";
                number = number - 50;
            }
            if (number > 39 && number < 49) {
                romanNumber += "XL";
                number = number -40;
            }
            if (number > 9 && number < 40) {
                romanNumber += "X";
                number = number -10;
            }
            if (number == 9) {
                romanNumber += "IX";
                number = number -9;
            }
            if (number > 4 && number < 9) {
                romanNumber += "V";
                number = number -5;
            }
            if (number == 4) {
                romanNumber += "IV";
                number = number -4;
            }
            if (number > 0 && number < 4) {
                romanNumber += "I";
                number = number -1;
            }

            System.out.println(romanNumber);
        }return romanNumber;
    }
}
