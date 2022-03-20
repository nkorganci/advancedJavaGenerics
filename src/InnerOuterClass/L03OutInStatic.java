package InnerOuterClass;

public class L03OutInStatic {
    public int a=5;

    //Inner class
    public static class  In{
        public int a =10;
        public void run(){
            int a = 1;
            System.out.println(a); // run() methods variable
            System.out.println(this.a); // This class variable

            //L03OutInStatic.this.run(); // Outer class method
            //System.out.println(L03OutInStatic.this.a); // Outer class variable


        }
    }
        public void run(){
        run();  // Inner class is static so no need to create object of class
        }
}
