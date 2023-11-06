package PrintOnetoNthRecursion;

public class TailRecursionWayForSolvingThis {
    static void fun(int n, int k){
        if (n==0)
            return;

        System.out.print(k+" ");
        fun(n-1,k+1); //tail recursion :
    }
    public static void main(String[] args) {
        fun(4,1);
    }
}
