package Recursion;

public class RecursionExample {
    static void fun1(){
        System.out.println("GFG");
        fun1();
    }
    public static void main(String[] args) {
        fun1();         //stack over flow
    }
}
