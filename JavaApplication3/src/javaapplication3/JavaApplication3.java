/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Mikhail
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int [] x = {1,2,3};
        System.out.println(sum(x));
        System.out.println(foreachsum(x));
    }
    //вычислить сумму элекментов массива
    private static int sum (int ... x){
        int s=0, i=0;
        for (i = 0; i < x.length; i++) {
        s+=x[i];
        }
        return s;
    }
    private static int foreachsum (int ... x){
        int s=0;
        for (int xi:x) s+=xi;  //xi - временное значение, аналог счётчика i
        return s;
    }
    
    StringBuilder sb = new StringBuilder();
    
    
    
}
