package Scope.com.damian;

import java.util.Scanner;

public class lesson175 {
    public static void main(String[] args) {
        String varFour = "this is private to main()";

//                ScopeCheck scopeInstance = new ScopeCheck();
//                scopeInstance.useInner();
//ScopeCheck.InnerClass InnerClass = scopeInstance.new InnerClass();
//System.out.println("varThree is not accessible here "+ InnerClass.varThree);



//        System.out.println("scopeInstance varOne is " +scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//        System.out.println("***********************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//innerClass.timesTwo();
//
//        Scanner scanner = new Scanner(System.in);
//            int x = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println(x + " was entered at time: "+ X.x
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();



    }
}
