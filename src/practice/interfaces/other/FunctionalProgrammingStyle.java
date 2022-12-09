package practice.interfaces.other;

interface Calc{
    int operation(int i, int j);
}

public class FunctionalProgrammingStyle {
    public static void main(String[] args) {

        //# OOPs - Objects are first citizens in OOPs programming.

        // # Functional-Programming - Functions are first citizens in Functional Programming.

        // 1st approach
        // it looks like functional programming bt it is not functional programming...
        var result = doSomething(20, 10, (i, j) -> i / j);
        System.out.println(result);

        // 2nd approach
        Calc result1 = (i, j)-> i/j;
        var result3 = doSomething(20, 10, result1);
        System.out.println(result3);

    }

    public static int doSomething(int n1, int n2, Calc calc){
        return calc.operation(n1,n2);
    }
}
