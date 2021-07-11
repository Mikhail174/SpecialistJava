
package dz_04_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WordCount {
    
    private String inFile,outFile;
    public static  String testString = " fhfghgf  hello   o wtryh\\n  hello o o ";
    Hashtable words = new Hashtable();
    public Hashtable getWords() {
        return words;
    }

    public WordCount(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }
    
    public void countWords() {
        int num=0;
        
        try {
            Reader reader =  inFile == null ? new StringReader (testString) : new FileReader(inFile) ;
            BufferedReader br=new BufferedReader(reader);
            
            for (String line = br.readLine(); line != null; line = br.readLine()) {
               
                StringTokenizer st = new StringTokenizer(line," \t\n\r\f.,;:\""); 
                while (st.hasMoreTokens()) {
                    
                    String token = st.nextToken();
                    if (!words.containsKey(token)) { 
                    words.put(token, 1);
                    num++;
                    }
                    else{ 
                        Object val = words.get(token);
                        int n=(int)val;
                        n++;
                        words.put(token,n);
                    }

                       
                }


            }
            br.close();
            System.out.println("num="+num);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }

    

    
    
    
}
