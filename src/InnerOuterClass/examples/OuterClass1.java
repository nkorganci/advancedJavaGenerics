package InnerOuterClass.examples;

public class OuterClass1 {
    int x = 10;

    static class InnerClass1{
        int y =5;
    }
}

class Main1{
    public static void main(String[] args) {
        OuterClass1 outerClass1= new OuterClass1();
        System.out.println(outerClass1.x);

        OuterClass1.InnerClass1 obj = new OuterClass1.InnerClass1();
        System.out.println(obj.y);
    }
}
