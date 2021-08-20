public class OverHead {
    public static void main(String[] args) {
        int a, b ;
        a = sum(1,2);
        b = sum (a,1,2);
        System.out.println("a="+a+",b="+b);
    }

    private static int sum(int a, int b) {
        return a+b;
    }

    private static int sum(int a, int b, int c) {
        return a+b-c;
    }
}
