
package dz_01_02;


public class DZ_01_02 {


    public static void main(String[] args) {
        
        int year = 2000;
        int dayNum = 309;
        int [] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
        String [] months = {"January", "February", "March", "April", "May","June", "July","August", "September", "October", "November", "December"};
        int monthnum =0;
        boolean isLeapYear = (year%4==0) && (year%100!=0 || year%400==0);
        
        for (int days: daysInMonths) {
           // System.out.println(days);
           if ((isLeapYear) && days ==28) days++;
           if (dayNum < days) break;
           dayNum-= days;
           monthnum++;
        }
        System.out.println("month = " + months[monthnum] + " and day: ="+dayNum);
        
        
        
        
        
        //System.out.println(year);
        
    }
    
}
