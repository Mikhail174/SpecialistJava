public class point2D_main {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Total points: " + Point2D.getPointsCounter()); //у ARRAYS тоже есть статические методы.

        Point2D p1 = new Point2D();
        p1.setX(1);
        p1.setY(1);
        System.out.println(p1.getId() + ": " + p1 + ", length = " + p1.getLength());

        Point2D p2 = new Point2D(3, 4);
        System.out.println(p2.getId() + ": " + p2 + ", length = " + p2.getLength());

        System.out.println("Total points: " + Point2D.getPointsCounter());
        System.out.println("Distance between = " + p1.distanceTo(p2));

        System.out.println("Distance between = " + p1.distanceTo(new Point2D(4, 5))); // анонимный объект,  у него нет имени, а слеодвательно нет ссылки, gc удаляет сразу, как они будут не нужны
        System.out.println("addTo =" + p1.addTo(p2));

//Class.forName("javaapplication7.Point2D"); //рефлексия - принудительная загрузка класса в память. static block выполнится. можно не зная ничего о классе повыывать методы, выводя предварительно список этих методов

    }
}
