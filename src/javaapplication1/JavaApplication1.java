/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author class
 */
public class JavaApplication1 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> stringlist = new ArrayList<String>();
        
        stringlist.add("Moe");
        stringlist.add("Larry");
        stringlist.add("Curly");
        
        System.out.println(stringlist.size());
        System.out.println(stringlist.get(0));
        System.out.println(stringlist.get(1));
        
        stringlist.set(0, "John");
        stringlist.remove(1);
        
        for (int i = 0; i < stringlist.size();i++)
        {System.out.println(stringlist.get(i));
        }
        for (String name : stringlist) {
            System.out.println(name);
        }
    }
    
}
