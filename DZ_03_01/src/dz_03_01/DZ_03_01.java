
package dz_03_01;


public class dz_03_01 {


    public static void main(String[] args) {
        

        
        
        SimpleParser p = new SimpleParser();
        p.Parse(args);
        System.out.println(p.getInFile()+" , "+p.getOutFile());
        


    }
    
}
