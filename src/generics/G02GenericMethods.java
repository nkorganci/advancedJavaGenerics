package generics;

import java.util.Arrays;

public class G02GenericMethods {
    public static void main(String[] args) {

        Integer[] integerDizi = {1, 2, 3, 4, 5, 6};
        Double[] doubleDizi = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charDizi = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Integer Dizi:");
        diziYazdir(integerDizi);
        System.out.println("Double Dizi:");
        diziYazdir(doubleDizi);
        System.out.println("Karakter Dizisi:");
        diziYazdir(charDizi);
    }

    public static <T>void diziYazdir(T[] dizi){
        Arrays.stream(dizi).forEach(System.out::println);
    }

    // Generic metot tanımlamasi
    public static <T> void diziYazdır(T[] dizi){
        Arrays.stream(dizi).forEach(System.out::println);
    }

    // Aşağıda, 3 adet int parametreniyi alan ve en büyüğünü bularak döndüren bir metot bulunmaktdır.
    // Bu metotu farklı veri tipleri ile çalışacak şekilde Generic olarak yazalım.
    public static int maksBulKlasik(int x, int y,int z) {
        int maks = x;
        if (y > maks){
            maks = y;
        }
        if(z > maks) {
            maks = z;
        }
        return maks;
    }

}
