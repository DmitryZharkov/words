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
public class Group {
   public ArrayList<String> words;
   public Group ()
   {
       words= new ArrayList<String>();
   }
   public Group (ArrayList<String> words)
   {
       this.words= words;
   }
}
