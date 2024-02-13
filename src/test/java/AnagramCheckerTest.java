import org.example.AnagramChecker;
import org.junit.*;

import java.util.List;

public class AnagramCheckerTest {
    private final AnagramChecker checker = new AnagramChecker();

    @Test
    public void firstExercise() {
        String text1 = "She Sells Sanctuary";
        String text2 = "Santa; shy, less cruel";
        String text3 = "Satan; cruel, less shy";
        boolean test1 = checker.isAnagram(text1, text2);
        boolean test2 = checker.isAnagram(text2, text3);
        boolean test3 = checker.isAnagram(text1, text3);

        Assert.assertTrue(test1);
        Assert.assertTrue(test2);
        Assert.assertTrue(test3);
    }

    @Test
    public void secondExercise() {
        String a = "She Sells Sanctuary";
        String b = "Santa; shy, less cruel";
        String d = "Satan; cruel, less shy";
        String c = "Santa; thick, less cruel";
        // f1(A,B)
        boolean testA1 = checker.isAnagram(a, b);
        // f1(A,C)
        boolean testA2 = checker.isAnagram(a, c);
        // f1(A,D)
        boolean testA3 = checker.isAnagram(a, d);
        // f1(B,C)
        boolean testB1 = checker.isAnagram(b, c);
        // f1(B,D)
        boolean testB2 = checker.isAnagram(b, d);
        // f1(C,D)
        boolean testC = checker.isAnagram(c, d);

        // A, B and D are anagrams.
        Assert.assertTrue(testA1);
        Assert.assertFalse(testA2);
        Assert.assertTrue(testA3);
        Assert.assertFalse(testB1);
        Assert.assertTrue(testB2);
        Assert.assertFalse(testC);

        List<String> anagramsForA = checker.getAllKnownAnagrams(a);
        List<String> anagramsForB = checker.getAllKnownAnagrams(b);
        List<String> anagramsForC = checker.getAllKnownAnagrams(c);
        List<String> anagramsForD = checker.getAllKnownAnagrams(d);

        // f2(A) = [B,D]
        Assert.assertTrue(anagramsForA.stream().anyMatch(e -> e.equals(b)));
        Assert.assertTrue(anagramsForA.stream().anyMatch(e -> e.equals(d)));
        // f2(B) = [A,D]
        Assert.assertTrue(anagramsForB.stream().anyMatch(e -> e.equals(a)));
        Assert.assertTrue(anagramsForB.stream().anyMatch(e -> e.equals(d)));
        // f2(C) = [A,B]
        Assert.assertTrue(anagramsForD.stream().anyMatch(e -> e.equals(a)));
        Assert.assertTrue(anagramsForD.stream().anyMatch(e -> e.equals(b)));
        // f2(C) = []
        Assert.assertTrue(anagramsForC.isEmpty());

    }
}
