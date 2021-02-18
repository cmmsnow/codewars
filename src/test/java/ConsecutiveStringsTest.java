import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsecutiveStringsTest {
    ConsecutiveStrings consecutiveStrings;
    String[] strarr1;

    @Before
    public void setup(){
        consecutiveStrings = new ConsecutiveStrings();
        strarr1 = new String[]{"cat", "blob", "manitoba", "lawrenceville"};
    }

    @Test
    public void testConcatLongest1(){
        String expected = "manitobalawrenceville";
        String actual = consecutiveStrings.concatLongest(strarr1, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConcatLongest2(){
        String expected = "blobmanitobalawrenceville";
        String actual = consecutiveStrings.concatLongest(strarr1, 3);
        Assert.assertEquals(expected, actual);
    }
}
