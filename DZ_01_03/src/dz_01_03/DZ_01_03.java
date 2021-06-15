
package dz_01_03;


public class DZ_01_03 {

 
    public static void main(String[] args) {

        getBinary(20);

    }
    
    
   /* мой вариант */
//    public static String getBinary (int num) {
//                
//        String var="";
//        int a;
//        while (num !=1){
//            a= num%2;
//            var +=a;
//            num/=2;
//        }
//        var+=1;
//        StringBuilder sb = new StringBuilder();
//        sb.append(var);
//        System.out.println((sb.reverse()).toString());
//     return var;
//    }
    
   /*Вариант Седых*/ 
    
    
     public static String getBinary(int num) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<32; i++){
            sb.append(((num&1)==1)?1:0);
            num>>=1;
            if (i==7 || i==15 || i==23) sb.append(' ');
        }
        sb.reverse();
        System.out.println((sb.reverse()).toString());
        return sb.toString();
    } 
    
    //Мой вариант после варианта седых:
    
//        public static String getBinary (int num) {
//                
//        String var="";
//        StringBuilder sb = new StringBuilder();
//        int a;
//            for (int i = 0; i<32; i++) {
//            a= num%2;
//            //var +=a;
//            sb.append(a);
//            num/=2;
//            if (i==7 || i==15 || i==23) sb.append(' ');
//        }
//   
//        //sb.append(var);
//        System.out.println((sb.reverse()).toString());
//     return var;
//    }
    
    
    
}
