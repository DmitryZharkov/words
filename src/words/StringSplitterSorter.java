/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import words.LengthFirstComparator;

/**
 *
 * @author zharkov
 */
public class StringSplitterSorter {
    String str;
    ArrayList<String> words;
    ArrayList<Group> groups;
    public StringSplitterSorter(String str)
    {
        this.str=str;
    }
    public ArrayList Group()
    {
        char StartLetter='7';
        groups= new ArrayList<Group>();
        Group group=new Group();
        
        for(String word : words)
        {
            if (word.charAt(0)!=StartLetter)
            {
                group=new Group();
                group.words.add(word);
                groups.add(group);
                StartLetter=word.charAt(0);
            }
            else
            {
                //System.out.println(groups.get(0));
               group=groups.get(groups.size()-1);
               group.words.add(word);
               groups.set(groups.size()-1, group);
            }
        }
        for (Group gr:groups)
            gr.words.sort(new LengthFirstComparator());
            
        return groups;
    }
    public ArrayList<String> SplitAndSort ()
    {
        words = new ArrayList<String>();
        StringTokenizer tokenizer=new StringTokenizer(str);
        
            while (tokenizer.hasMoreTokens())
            words.add(tokenizer.nextToken(" "));
        Collections.sort(words);
        return words;
    }
}
