public class ClassOne {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(' ');
        sb.append("world");
        sb.append('!');
        System.out.println(sb);
        Test test = new Test();
        test.x = 101;
        System.out.println(test); //показывает полный путь к файлу и его хеш после @
        System.out.println(test.x);
    }
}

class Test {
    int x;
}



