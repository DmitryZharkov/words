/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;

import java.util.Comparator;

/**
 *
 * @author zharkov
 */
public class LengthFirstComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {             
        if (o1.length()!=o2.length()) {
            return o2.length()-o1.length(); //overflow impossible since lengths are non-negative
        }
        return o1.compareTo(o2);
    }
}
