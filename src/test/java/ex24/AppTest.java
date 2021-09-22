/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Doyon
 */


package ex24;
import ex24.AnagramChecker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AppTest
{
    @Test
    public void is_one_word_anagram() throws Exception
    {
        AnagramChecker ac = new AnagramChecker();
        boolean result = ac.isAnagram("tone", "note");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void is_not_anagram() throws Exception
    {
        AnagramChecker ac = new AnagramChecker();
        boolean result = ac.isAnagram("happy", "learn");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void is_multi_words_anagram() throws Exception
    {
        AnagramChecker ac = new AnagramChecker();
        boolean result = ac.isAnagram("Statue of Liberty", "Built to stay free");
        Assertions.assertEquals(false, result);
    }
}