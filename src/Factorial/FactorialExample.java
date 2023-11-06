package Factorial;

public class FactorialExample {
    static int fac(int n){
        if (n==0){
            return 1;
        }
        return (n*(n-1));
    }
    public static void main(String[] args) {
        int result= fac(3);
        System.out.println(result);
    }
}
