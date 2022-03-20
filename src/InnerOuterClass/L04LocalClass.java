package InnerOuterClass;

public class L04LocalClass {
    public static void main(String[] args) {
        localMethod();

    }

    public static void localMethod(){
        class LocalClass{ // Local class
            private int a;
            LocalClass(int a){
                this.a=a;
            }

        }

        LocalClass obj = new LocalClass(3);
        System.out.println(obj.a);
    }
}
