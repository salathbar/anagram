import org.example.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testAnagram() {
        char[] test1 = StringUtils.sortStringToCharArray("nag a ram");
        char[] test2 = StringUtils.sortStringToCharArray("anagram");
        char [] expectedResult = new char[] {'a', 'a', 'a', 'g', 'm', 'n', 'r'};
        Assert.assertArrayEquals( expectedResult, test1 );
        Assert.assertArrayEquals( expectedResult, test2 );
        Assert.assertArrayEquals( test1, test2 );
    }

    @Test
    public void testForLowerCase() {
        char[] test1 = StringUtils.sortStringToCharArray("New York Times");
        char[] test2 = StringUtils.sortStringToCharArray("monkeys write");
        char [] expectedResult = new char[] {'e', 'e', 'i', 'k', 'm', 'n', 'o', 'r', 's', 't', 'w', 'y'};
        Assert.assertArrayEquals( expectedResult, test1 );
        Assert.assertArrayEquals( expectedResult, test2 );
        Assert.assertArrayEquals( test1, test2 );
    }

    @Test
    public void testForMinusSign() {
        char[] test1 = StringUtils.sortStringToCharArray("Church of Scientology");
        char[] test2 = StringUtils.sortStringToCharArray("rich-chosen goofy cult");
        char [] expectedResult = new char[] {'c', 'c', 'c', 'e', 'f', 'g', 'h', 'h', 'i', 'l', 'n', 'o', 'o', 'o', 'r', 's', 't', 'u', 'y'};
        Assert.assertArrayEquals( expectedResult, test1 );
        Assert.assertArrayEquals( expectedResult, test2 );
        Assert.assertArrayEquals( test1, test2 );
    }

    @Test
    public void testForApostropheSign() {
        char[] test1 = StringUtils.sortStringToCharArray("McDonald's restaurants");
        char[] test2 = StringUtils.sortStringToCharArray("Uncle Sam's standard rot");
        char [] expectedResult = new char[] {'a', 'a', 'a', 'c', 'd', 'd', 'e', 'l', 'm', 'n', 'n', 'o', 'r', 'r', 's', 's', 's', 't', 't', 'u'};
        Assert.assertArrayEquals( expectedResult, test1 );
        Assert.assertArrayEquals( expectedResult, test2 );
        Assert.assertArrayEquals( test1, test2 );

    }

    @Test
    public void testDifferentCommaSigns() {
        char[] test1 = StringUtils.sortStringToCharArray("She Sells Sanctuary");
        char[] test2 = StringUtils.sortStringToCharArray("Santa; shy, less cruel");
        char[] test3 = StringUtils.sortStringToCharArray("Satan; cruel, less shy");
        char [] expectedResult = new char[] {'a', 'a',  'c', 'e', 'e', 'h', 'l', 'l', 'n', 'r', 's', 's', 's', 's', 't', 'u', 'y'};
        Assert.assertArrayEquals( expectedResult, test1 );
        Assert.assertArrayEquals( expectedResult, test2 );
        Assert.assertArrayEquals( expectedResult, test3 );
        Assert.assertArrayEquals( test1, test2 );
        Assert.assertArrayEquals( test2, test3 );
        Assert.assertArrayEquals( test1, test3 );
    }
}
