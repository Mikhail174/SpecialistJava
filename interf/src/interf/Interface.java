
package interf;
import java.util.Arrays;
import java.util.Comparator;

public class Interface {


    public static void main(String[] args) {
        
        Box [] boxes = {new Box(10,1,1), new Box(1,10,10),new Box(2,2,2)};
        
        Arrays.sort (boxes); //volume()
        
        System.out.println("Через Comparable сортируем по объёму :");
        for (Box box:boxes) {
        System.out.println(box);
        }
        
        /*
        //1  вариант
        Box.CompareByA cmp = new Box(0, 0, 0).new CompareByA();
        Arrays.sort(boxes,cmp);
        
        System.out.println("1.вариант Через Comparator сортируем по стороне (a) :");
        for (Box box:boxes) {
        System.out.println(box);
        */
        
        /*
        //2вариант Static inner class
        Arrays.sort (boxes,new Box.CompareByA());
        System.out.println("2.вариант Через Static inner class сортируем по стороне (a) :");
        for (Box box:boxes) {
        System.out.println(box);
        */
        
        /*
        // 3,4 вариант через локальный и  локальный-анонимный класс
        Arrays.sort (boxes,Box.compareByA());
        System.out.println("3,4 вариант Через локальный class внутри метода сортируем по стороне (a) :");
        for (Box box:boxes) {
        System.out.println(box);
        */
        
        /*
        //5й вариант анонимный класс       
        Arrays.sort (boxes, new Comparator<Box>(){
            @Override
            public int compare(Box b1, Box b2) {
                return b1.getA() -b2.getA();
            }
        });
        System.out.println("5 вариант Через вызов анонимного класса в самом компораторе. сортируем по стороне (a) :");
        for (Box box:boxes) {
        System.out.println(box);
        */
        
        //6й вариант - лямбда выражения
        //Arrays.sort (boxes, (Box b1, Box b2) -> b1.getA() -b2.getA());
        //или 
        Arrays.sort (boxes, (b1, b2) -> b1.getA() -b2.getA());
        System.out.println("6 вариант Через лямбда выражения. сортируем по стороне (a) :");
        for (Box box:boxes) {
        System.out.println(box);
        
        /*
        как работает лямбда:
        
        (x)->x+1
        
        new Foo() {
        @Override
        public some_datatype foo (another_somedatatype x) {
                
                return x+1;
            }
        }
        
        (x)-> {
        int y;
        y=x+1;
        return y;
        }
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    
    
}
}
