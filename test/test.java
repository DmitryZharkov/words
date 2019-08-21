/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zharkov
 */
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import words.StringSplitterSorter;

public class test extends TestCase {
    StringSplitterSorter splsort;
    ArrayList words;

    @Test
    public void testWords()
    {
        words= new ArrayList<String>(Arrays.asList("арбуз","биржа","бокс","болт","сапог","сарай"));
        splsort= new StringSplitterSorter("сапог сарай арбуз болт бокс биржа"); 
        assertEquals(words,splsort.SplitAndSort());
    }
}
