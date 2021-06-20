
package interf;

import java.util.Comparator;


public class Box implements Comparable<Box> {
    
    private int a,b,c;

    public Box (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//для пятого варианта - подстановки анонимного класса в вызов компаратора добавляем геттер только для поля (а):
    public int getA() {
        return a;
    }
    
    

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int volume () {
        return a*b*c;
    }

    // метод для интерфейса Comparable <Box> для сортировки по объёму:
    @Override
    public int compareTo(Box rValue) {

        return volume()- rValue.volume();
    }
    
    /*
    //1 вариант
    //делаем внутренний класс и реализуем интефейс с компаратором. Компаратор, это лазейка в "прошлое" 
    // чтобы дополнить метод для сортировки Arrays.sort не только по объёму, но и по стороне (a):
    public class CompareByA implements Comparator<Box> {

        @Override
        public int compare(Box b1, Box b2) {
           return b1.a -b2.a;
        }
        
        
    }
    */
    
    /*
    //2 вариант Static inner class
    public static class CompareByA implements Comparator<Box> {
        @Override
        public int compare(Box b1, Box b2) {
           return b1.a -b2.a;
        }

    }
    */
    
     //3й вариант
    /*
    public static Comparator<Box> compareByA(){
        //локальный класс внутри метода
        class CMP implements Comparator<Box>{

            @Override
            public int compare(Box b1, Box b2) {
               return b1.a -b2.a;
            }
            
        }
        return new CMP ();
    }
    */
    
    //4 вариант
    public static Comparator<Box> compareByA(){
        //локальный анонимный класс (может реализовывать только один интерфейс или наследовать (одному) абстрактному классу)
        return new Comparator<Box>() {
            {
                //... тут конструктор только один (инициализация экземлпяром)
            }
            @Override
            public int compare(Box b1, Box b2) {
                return b1.a -b2.a;
            } 
            
        }; 
        
    }
           

}
