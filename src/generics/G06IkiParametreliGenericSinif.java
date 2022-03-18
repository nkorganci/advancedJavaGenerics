package generics;

public class G06IkiParametreliGenericSinif {
    public static void main(String[] args) {
        Kisi<Integer,String> k1 = new Kisi<>(101,"Cin Ali");
        Kisi <String,String> k2 = new Kisi<>("hi","bye");

        System.out.println(k1.getKey());
        k1.setKey(102);
        System.out.println(k1.getKey());


    }

}

//K key, V value
//K and V are generic but you can restrict them by EXTENDS (Example: K extends Number)
// Parameter bounding restrics the data types
class Kisi<K,V>{

    private K key;
    private V value;

    public Kisi(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
