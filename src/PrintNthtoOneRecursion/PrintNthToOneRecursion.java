package PrintNthtoOneRecursion;

public class PrintNthToOneRecursion {
    static void NthtoOne(int n){
        if (n==0)
            return;
        System.out.print(n+" ");
        NthtoOne(n-1);
    }
    public static void main(String[] args) {
        NthtoOne(5);
    }
}
