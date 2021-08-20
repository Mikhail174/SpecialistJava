import java.text.DateFormat;
import java.util.Calendar;

public class Singleton_main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s==s2) System.out.println("ok");

        //Примеры синглотна
        Calendar sys = Calendar.getInstance();
        DateFormat format = DateFormat.getDateInstance();

    }
}
