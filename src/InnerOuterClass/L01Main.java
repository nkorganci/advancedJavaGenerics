package InnerOuterClass;

/*
    Nested Class
        Inner Class -> static and non-static class
        Local class
        Anonymous class
 */
public class L01Main {

    public static void main(String[] args) {

        L02OutInNonStatic obj = new L02OutInNonStatic();// Outer class
        obj.run(); //Outer class method

        L02OutInNonStatic.In inClass = obj.new In();  // To create an inner object instance.
        inClass.run();// Inner class run() method.

    }
}
