package generics;

public class G04GenericSinif<T> {

    private T veri;

    G04GenericSinif(){

    }

    G04GenericSinif(T veri){
        this.veri=veri;
    }

    public T getVeri() {
        return veri;
    }

    public void setVeri(T veri) {
        this.veri = veri;
    }

    public static void main(String[] args) {
        // G04GenericSinif<Integer> intVeri = new G04GenericSinif<>(); // Giver error because default constructor should be created
        G04GenericSinif<Integer> intVeri = new G04GenericSinif<>(10);
        System.out.println("Integer in Generics " + intVeri.getVeri());

        G04GenericSinif<Double> doubleVeri = new G04GenericSinif<>();
        doubleVeri.setVeri(3.3);
        System.out.println("Double ile test " + doubleVeri.getVeri());

        //If you write a wrong data types it will give compile time error
        //G04GenericSinif<String> str = new G04GenericSinif<>(3);//
    }
}
