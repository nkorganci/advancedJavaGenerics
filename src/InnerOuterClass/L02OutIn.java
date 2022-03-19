package InnerOuterClass;

public class L02OutIn {
    public int a=5;

    //Inner class
    class In{
        public int a =10;
        public void run(){
            int a = 1;
            System.out.println(a); // run() methods variable
            System.out.println(this.a); // This class variable

            L02OutIn.this.run(); // Outer class method
            System.out.println(L02OutIn.this.a); // Outer class variable


        }
    }
        public void run(){
        In in = new In();
        in.run();
        }
}
