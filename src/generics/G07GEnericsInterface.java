package generics;

public class G07GEnericsInterface {
    public static void main(String[] args) {
        usAlma<Float> floatUs = new usAlma<>();
        System.out.println(floatUs.usAl(4f,2f));
    }
}
interface Matematik<T extends Number> {
        double usAl(T t, T u);
}
class usAlma<T extends Number> implements Matematik<T> {

    @Override
    public double usAl(T t, T u) {
        return Math.pow(t.doubleValue(),u.doubleValue());
    }
}
