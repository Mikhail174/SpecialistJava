package dz_04_01;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

public class MyCounter {

    public static void main(String[] args) {
        SimpleParser sp=new SimpleParser();  
        sp.Parse(args);
        
        WordCount wc=new WordCount(null,null);
        //WordCounter wc=new WordCounter(sp.getInFile(), null);
        wc.countWords();
        
       Enumeration keys = wc.getWords().keys();
       while(keys.hasMoreElements()){
          String w=keys.nextElement().toString(); 
           int n= (int)wc.getWords().get(w);
           System.out.println(w+"   "+n);

        }    

    }
}
