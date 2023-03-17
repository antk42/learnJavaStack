package org.example.example.generics;

public class MainApp {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);

        int sum = (Integer)intBox1.getObj() + (Integer) intBox2.getObj();

        System.out.println("sum: " + sum);


        GenBox<String> strBox = new GenBox<>("Java");
        GenBox<Integer> intBox111 = new GenBox<>(111);
        GenBox<Integer> intBox222 = new GenBox<>(222);
        int sumGenerics = intBox111.getObj() + intBox222.getObj();
        System.out.println(sumGenerics);
        int sumGenerics2 = intBox111.getObj() + intBox222.getObj();

        System.out.println("=== Exception String cannot be cast=== ");

        intBox1.setObj("Java");
        int sum2 = (Integer)intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println("sum2: " + sum2);
    }
}
