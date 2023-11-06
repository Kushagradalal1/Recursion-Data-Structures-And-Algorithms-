package SumOfNthNaturalNumber;

public class RecursiveSolutionNaturalNumber {
    static int getSum(int n){
        if (n==0)
            return 0;
        return n + getSum(n-1);
    }
    public static void main(String[] args) {
        int res=getSum(4);
        System.out.println(res);
    }
}
