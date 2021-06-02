/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Mikhail
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b ;
        a = sum(1,2);
        b = sum (a,1,2);
        System.out.println("a="+a+",b="+b);
    }

    private static int sum(int a, int b) {
     return a+b;
    }

    private static int sum(int a, int b, int c) {
        return a+b-c;
    }
    
}
