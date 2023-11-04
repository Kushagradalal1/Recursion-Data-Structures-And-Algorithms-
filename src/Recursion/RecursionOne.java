package Recursion;

public class RecursionOne {
    static void fun1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        fun1(3);
    }
}
/*
output :
3
2
1
1
2
3

 */