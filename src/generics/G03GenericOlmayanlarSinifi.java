package generics;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class G03GenericOlmayanlarSinifi {
    public static void main(String[] args) {
        // Ancak List içerisindeki veri tiplerini alırken Cast işlemine çok dikkat etmek gerekir.
        // Yoksa Runtime hatası alınır.

        //1- If you dont use data type, it is called raw list.
        List list = new ArrayList(); // Data type will be Object
        list.add(1);
        list.add("Hello");

        String str = (String) list.get(1); // Provided Object, required String. So casting is necessary.
        Integer num = (Integer) list.get(0);// Casting from Object class to Integer class.

        //2- Object super class is used, it will cause runtime error
        List<Object> list1 = new ArrayList<>();
        list1.add("Object2");
        list1.add(2);


    }
}
