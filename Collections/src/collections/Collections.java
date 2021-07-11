package collections;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(2);
        list.add(3.6);
        // закоментили, потому что сделали параметризацию вместо object -> number
        // list.add("Hello!");
        // list.add (new Object());

        for (Number number:list) {
            System.out.println(number);
        }

        ArrayList<ArrayList<Number>> biglist = new ArrayList<>();
        biglist.add(list);
        biglist.get(0).add(10);
        biglist.add(new ArrayList<>());
        biglist.get(1).add(11);

        for (ArrayList<Number> arrayList:biglist) {
            System.out.print(arrayList+" ");
        }
        System.out.println();
        System.out.println();


        for (ArrayList<Number> arrayList:biglist) {
            for (Number number: arrayList) {

                System.out.println(number+" ");
            }
            System.out.println();

        }

        ArrayList<Comparable<Double>> cList = new ArrayList<>();
        cList.add(10.0);
        cList.add(2.5);
        if (cList.get(0).compareTo ((Double)cList.get(1)) >0) System.out.println("Ok");

    }

}
