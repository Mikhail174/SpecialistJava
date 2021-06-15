
package javaapplication7;


public class Point2D {
    
    private int x,y;
    private double length; //длдина вектора
    private static int pointsCounter; //статическое поле, счетчик точек
    private final int pointId;
    
    static {
        
        //код будет выполняться только 1 раз при любом первом обращении к классу
        System.out.println(" Static block!");
        //используются для настрйоки классов, для чтения конфигов, для получения параметров данных
        //рефлексия - способ искусственно прогрузить класс в оперативную память, не обращаясь к классу и не создавая его объектов
    }
    
    

    public Point2D() {
        
        this (0,0);  //замыкаем конструктор умолчаний на более полный конструктор
    }
    
    

    public Point2D(int x, int y) {
        setX(x);
        setY(y);
        pointId = pointsCounter++;
        
    }
    
    

    public int getX() {
        return x;
    }

    public final void setX(int x) {
        this.x = x;
        length();
    } // final - не даёт  переопределить метод

    public int getY() {
        return y;
    }

    public final void setY(int y) {
        this.y = y;
        length();
    } // final - не даёт  переопределить метод

    public double getLength() {
        return length;
    }

    public int getId() { //переименуем геттер
        return pointId;
    }

    public static int getPointsCounter() { //статический метод. Ограничение на работу с методом. В нём можно обращаться только к статическим полям и вызывать только статические методы.
        return pointsCounter;              // когда мы вызываем что-то из main , main объявлен,как статический, поэтому и вызывать мы тоже должны статическое
        //статические поля не привязаны ни к каким объектам, они хранятся вне объектов вообще.
    }
    
    public double distanceTo (Point2D rValue){
        
       return Math.sqrt((this.x -rValue.x)*(this.x -rValue.x)+(this.y - rValue.y)*(this.y - rValue.y)); 
        
    }
    
    public Point2D addTo (Point2D rValue) {
        
    
      return new Point2D(x+rValue.x, y+rValue.y);
    }
    
    
    

    @Override
    public String toString() {
 //       return "Point2D{" + "x=" + x + ", y=" + y + '}';
        StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");
        return sb.toString();
    }
    
    private void length () {
        
        length = Math.sqrt (x*x+y*y);
        
    }
    
    
    
    
    
    
    

    
    
    
}
