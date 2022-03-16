package generics;

import java.util.Arrays;

public class G01OverloadedMethods {
    public static void main(String[] args) {
        Integer[] integerDizi = {1, 2, 3, 4, 5, 6};
        Double[] doubleDizi = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charDizi = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Integer Dizi:");
        diziYazdır(integerDizi);
        System.out.println("Double Dizi:");
        diziYazdir(doubleDizi);
        System.out.println("Karakter Dizisi:");
        diziYazdir(charDizi);
        System.out.println("===================");
        System.out.println("Integer Dizi:");
        diziYazdır(integerDizi);
        System.out.println("Double Dizi:");
        diziYazdir(doubleDizi);
        System.out.println("Karakter Dizisi:");
        diziYazdir(charDizi);
        System.out.println("Object is used as generics");
        diziYazdirObject(doubleDizi);
        diziYazdirObject(charDizi);

    }

    // Overloaded diziYazdir methodlari
    public static void diziYazdır(Integer[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    public static void diziYazdir(Double[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    public static void diziYazdir(Character[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);
    }

    // SuperClass(Object) ile diziYazdir
    public static void diziYazdirObject(Object [] obj) {
        Arrays.stream(obj).forEach(System.out::println);
    }
}
