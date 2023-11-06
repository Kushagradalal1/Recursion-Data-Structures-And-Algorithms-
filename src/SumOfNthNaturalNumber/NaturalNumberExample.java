package SumOfNthNaturalNumber;

public class NaturalNumberExample {
    public static int sumOfNaturalNumber(int n){
        int sum=0;
        sum=(n*(n+1)/2);
        return sum;
    }
    public static void main(String[] args) {
        int n=4;
        int res=sumOfNaturalNumber(n);
        System.out.println(res);
    }
}
