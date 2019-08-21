/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;

import java.util.ArrayList;

/**
 *
 * @author zharkov
 */
public class Words {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Group> groups;
        String words="сапог сарай арбуз болт бокс биржа биржапоакпо";
        StringSplitterSorter splitsort= new StringSplitterSorter(words);
        splitsort.SplitAndSort();
        groups=splitsort.Group();

        for (Group group : groups)
        {
            if (group.words.size()>1)
            {
                System.out.print(group.words.get(0).charAt(0)+"=");
                System.out.print("[");
                for(String word :group.words)
                {
                System.out.print(word);
                if(group.words.indexOf(word)!=group.words.size()-1)
                System.out.print(",");
                }
                System.out.print("]");
                if(groups.indexOf(group)!=groups.size()-1)
                    System.out.print(",");
            }
        }
        // TODO code application logic here
    }
    
}
