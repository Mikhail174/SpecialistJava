package singleton;

public class Singleton {

    private static volatile Singleton instance; //volatile - говорит, что instance гарантированно меняется

    private Singleton() { }

    //ленивая инициализация
    //synchronized- только один поток работает, другой не лезет
    public static synchronized Singleton getInstance() {
        if(instance==null) instance = new Singleton();
        return instance;
    }


}
