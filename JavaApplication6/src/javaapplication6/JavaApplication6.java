
package javaapplication6;


public class JavaApplication6 {


    public static void main(String[] args) {
        
        Test test = new Test ();
        test.setX(-101);;
        System.out.println(test.getX()); 
        
        String str1 = "Hello";
        String str2 = new String("Hello"); //"Hello";
        //java экономит место, если ввидит , что константы одинаковые. в Случае выше мы заставили java создать новую строку.
        //if (str1==str2) System.out.println("Ok");
        if (str1.equals(str2)) System.out.println("Ok"); 

    }
    
}

class Test {
  private  int x;
  
  public void setX(int x) {
      if (x<0) x=-x;
      this.x=x; // поля класса - типы глобальных перменных для наших методов.
      //this - автоматически генеррируемая ссылка на объект, вызывающий метод,в котором этот this указан
  }
  
  public int getX(){
      return x;
  }
    
}

