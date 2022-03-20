package nestedClass1;

public class ClassTester {
    public static void main(String[] args) {
/*
        //Non-static field(Instance-level)
        OuterClass outerClass1= new OuterClass();
        OuterClass outerClass2 = new OuterClass();
        //Static field
        System.out.println("static 0 " + outerClass1.staticField);
        OuterClass.staticField++;
        System.out.println("static 1 " + outerClass2.staticField);


        //instanceField
        System.out.println("non-static 0 "+ outerClass1.instanceField);
        outerClass1.instanceField++;
        System.out.println("non-static 1 "+ outerClass2.instanceField);

 */
        OuterClass outerClass1= new OuterClass();
        // Reaching to static inner class
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        //Reaching to non-static inner class
        OuterClass.InnerClass innerClass = outerClass1.new InnerClass();

    }
}
