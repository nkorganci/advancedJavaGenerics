package nestedClass1;
/*
   Outer class can be public or package-private but not others
   Nested classes are member of the enclosing class like field, constructor, method
           Static nested classes can access static members of the enclosing class.
   Static nested classes ARE NOT ASSOCIATED WITH AN INSTANC OF THE ENCLOSING CLASS
   No this reference for StaticNestedCalss and no this refererence for OuterClass
   */
public class OuterClass {
    //Fields
    static int staticField=0;// Static, class level... one static variable shared amongst all instances of OuterClass
    int instanceField; // non-static, instance level.. each instance of Outerlass gets its own instance field

    // Constructor outer class
    public OuterClass(){
        instanceField=1;
        System.out.println("Hello from OuterClass constructor");


    }
    // 1. static inner class
    public static class StaticNestedClass{

        // Constructor
        public StaticNestedClass(){
            System.out.println("Hello from Inner static");
            System.out.println(staticField); // Outer class statif field can be reachable
        }
    }

    // 2. inner class non static
    public class InnerClass{
        // Inner classes ARE ASSOCIATED WITH AN INSTANCE OF THE ENCLOSING CLASS
        // Inner classes can access static and non-static members of the enclosing class

        //Instance level field
        int instanceField;

        // Constructor
        public InnerClass(){
            instanceField=100;
            System.out.println("Hello from innerClass constructor- Non static");
            System.out.println("staticField " + staticField);
            System.out.println("InstanceField " + this.instanceField);
            //this refers to this instance of innerClass
            //OuterClass.this refers to this instance of Outers
            System.out.println("OuterClass instanceField " + OuterClass.this.instanceField);
        }
    }

    // 3. Local method
    public void instanceOfMethod(){
        final int localVar = 200;

        //3. Local class
        class LocalClass{
            //Constructor
            public LocalClass(){
                System.out.println("Hello from local constructor ");
                System.out.println("Local var " + localVar);
                System.out.println("Intancefield of outerclas " + instanceField);
            }
        }
        //Instantiate a LocalClass object
        LocalClass localClass = new LocalClass();
        //Only if the local variables are final or "effectively final" can be reachable.

        //4 Anonymous class
    }

}
