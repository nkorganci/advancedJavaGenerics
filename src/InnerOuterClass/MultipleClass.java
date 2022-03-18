package InnerOuterClass;

public class MultipleClass {
    public static void main(String[] args) {

        // Calling generic class
        VeriSakla<String> str = new VeriSakla<>("Hello");
        VeriSakla<Integer> it = new VeriSakla<>(2);

        //Calling generic method
        VeriYazdir.yazdir(2);
        VeriYazdir.yazdir("Hello");


    }
}

// Generic Class
 class VeriSakla<T> {
    private T veri;

    public T getVeri() {
        return veri;
    }
    public void setVeri(T veri) {
        this.veri = veri;
    }
    public VeriSakla(T veri) {
        this.veri = veri;
    }
}
// Generic olmayan bir class
class VeriYazdir{
    //Generic metod tanimlanmasi
    public static <T> void yazdir(T veri){
        System.out.println("Veri: " + veri);
    }
}
