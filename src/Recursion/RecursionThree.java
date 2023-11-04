package Recursion;

public class RecursionThree {
    static int fun(int n){
        if (n==1){
            return 0;
        }
        else{
            return 1+fun(n/2);
        }
    }
    public static void main(String[] args) {
        int res=fun(16);
        System.out.println(res);
    }
}
/*
Output : 4
 */