import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", romanNumerals.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", romanNumerals.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", romanNumerals.solution(6));
        assertEquals("solution(10) should equal to X", "X", romanNumerals.solution(10));
        assertEquals("solution(9) should equal to IX", "IX", romanNumerals.solution(9));
        assertEquals("solution(25) should equal to XXV", "XXV", romanNumerals.solution(25));
    }
}
