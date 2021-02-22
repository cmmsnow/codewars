import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveStringsTest {
    ConsecutiveStrings consecutiveStrings;
    String[] strarr1;

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Before
    public void setup(){
        consecutiveStrings = new ConsecutiveStrings();
        strarr1 = new String[]{"cat", "blob", "manitoba", "lawrenceville"};
    }

    @Test
    public void testConcatLongest1(){
        String expected = "manitobalawrenceville";
        String actual = consecutiveStrings.concatLongest(strarr1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testConcatLongest2(){
        String expected = "blobmanitobalawrenceville";
        String actual = consecutiveStrings.concatLongest(strarr1, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        testing(consecutiveStrings.concatLongest(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
        testing(consecutiveStrings.concatLongest(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        testing(consecutiveStrings.concatLongest(new String[] {}, 3), "");
        testing(consecutiveStrings.concatLongest(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        testing(consecutiveStrings.concatLongest(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        testing(consecutiveStrings.concatLongest(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
        testing(consecutiveStrings.concatLongest(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
        testing(consecutiveStrings.concatLongest(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
        testing(consecutiveStrings.concatLongest(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
    }
}
