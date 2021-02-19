import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", romanNumerals.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", romanNumerals.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", romanNumerals.solution(6));
    }
}
