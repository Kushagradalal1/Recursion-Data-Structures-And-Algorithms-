package Palindrome;

public class PalindromeExample {
    public static boolean isPalindrome(String s,int start, int end){
        if (start>=end){
            return true;
        }else {
            return (s.charAt(start)==s.charAt(end) && isPalindrome(s,start+1,end-1));
        }
    }
    public static void main(String[] args) {
         String s="greeks";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
