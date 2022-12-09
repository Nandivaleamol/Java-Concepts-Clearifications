package practice.inheritance;

class C {
    private int age;
    public static final String name="Amol";
    public static int id;
    public double salary = 10;


    public C(){
        System.out.println("Constructor of class A");
        System.out.println("salary value inside class A is "+salary);
    }

    public static void  m1(){
        System.out.println("public static method inside class A");
    }

    public final void m2(){
        System.out.println("public final method inside class A");
    }

    public void m3(){
        System.out.println("public concrete method inside class A");
    }
    private void m4(){
        System.out.println("private concrete method inside class A");
    }

}
class D extends  C{

//    age = 23; // can't access because age is private field inside parent class
//    name = "Suraj"; // can't access because name is static-final field inside parent class
//    id = 10; // can't access because id is static field inside parent class

    /*public final void m2(){  // child class can't override final methods of parent class

    }
    */

   /* public void m1(){  // child class can't be override static method of parent class

    }*/

//    @Override  // child class can't be override private methods of parent class
    private void m4(){
        System.out.println("m4() method inside child class D bt it works likes concrete class of class D");
    }

    @Override
    public void m3() {
        super.m3();
    }

    // child class can't override parent class constructor...

    public D(){
        super.salary=20;
        System.out.println(salary);

       /* A a = new A();
        a.m3()*/;
    }
}

public class OverridingExample {
    public static void main(String[] args) {
       C  a = new C();
       C.m1();
       a.m2();
       a.m3();
//       a.m4(); // we can't call private methods outside of original class

        D b = new D();
        D.m1();
        b.m2();
       b.m3();
    }
}
