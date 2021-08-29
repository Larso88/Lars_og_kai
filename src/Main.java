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
    @Test
    void shouldConvert100ToC(){
        assertEquals("C", toRoman(100));
    }
    @Test
    void shouldConvert400ToCD(){
        assertEquals("CD", toRoman(400));
    }
    @Test
    void shouldConvert500ToD(){
        assertEquals("D", toRoman(500));
    }
    @Test
    void shouldConvert900ToCM(){
        assertEquals("CM", toRoman(900));
    }



    private String toRoman(int number) {
        String romanNumber = "";
        while (number > 0) {
            if (number > 499 && number <900) {
                romanNumber += "D";
                number = number - 500;
            }
            if (number > 399 && number < 500){
                romanNumber += "CD";
                number = number -400;
            }
            if (number > 99 && number < 400) {
                romanNumber += "C";
                number = number - 100;
            }
            if (number > 89 && number  < 100) {
                romanNumber += "XC";
                number = number -90;
            }
            if (number > 49 && number < 90) {
                romanNumber += "L";
                number = number - 50;
            }
            if (number > 39 && number < 50) {
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
