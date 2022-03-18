package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class G1OverloadedMethods {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"a", "b"};
        Character[] ch = {'c', 'b', 'd'};

        methodOverloading(ch); // I used 3rd methodoverloading method, did not give error
        genericMethod(ch); // I used the 4th one which is generic best practice , no need to use other methods.

        System.out.println(findMaxGeneric("ga", "b", "c"));


    }

    // 1 I can print only a data type(Integer)
    public static void methodOverloading(Integer[] x) {
        Arrays.stream(x).forEach(System.out::println);
    }

    // 2 in order to print 2nd data type I need to write new method, or method overloading
    public static void methodOverloading(String[] x) {
        Arrays.stream(x).forEach(System.out::println);
    }

    // 3 I can write both in Object super parent class as a data type, but when we need to read data,
    // we need to cast the data types, also in runtime it may give error.
    public static void methodOverloading(Object[] x) {
        Arrays.stream(x).forEach(System.out::print);
        System.out.println();
    }

    // 4 BEST PRACTICE is to use GENERIC
    public static <T> void genericMethod(T[] x) {
        Arrays.stream(x).forEach(System.out::print);
    }

    // 4 If there are more than one GENERIC data types
    public static <T extends Comparable<T>> T findMaxGeneric(T a, T b, T c) {
        T max = a;
        if (a.compareTo(b) > 0) {
            max = b;
        } else if (a.compareTo(c) > 0) {
            max = c;
        } else {
            max = a;
        }
        return max;

    }

    // 5 RAW class which uses Object as a super will work but causes error in runtime or need casting
    public static void rawList() {
        List list = new ArrayList();
        list.add(1);
        list.add("Hello");
        // String str = list.get(0); //ERROR: Required type:String, Provided:Object
        String str1 = (String) list.get(0); // Need to be casted.




    }
}
